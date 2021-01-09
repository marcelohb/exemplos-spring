package main.java.ola;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    JdbcTemplate jdbc;

    @Override
    public void run(String... strings) throws Exception {

        log.info("Criando tabelas");

        jdbc.execute("DROP TABLE cliente IF EXISTS");
        jdbc.execute("CREATE TABLE cliente(" +
                "id SERIAL, primeiro_nome VARCHAR(255), ultimo_nome VARCHAR(255))");

        List<Integer> l = Arrays.asList(1,2,3,4,5);
        log.info("Tamanho " + l.size());
        
        List<Object[]> splitUpNames = Arrays.asList("Joao Watson", "Jeferson Sonho", "Jose Bloco", "Jose Cumprido").stream()
                .map(name -> name.split(" "))
                .collect(Collectors.toList());

        splitUpNames.forEach(name -> log.info(String.format("Inserindo cliente %s %s", name[0], name[1])));

        jdbc.batchUpdate("INSERT INTO cliente(primeiro_nome, ultimo_nome) VALUES (?,?)", splitUpNames);

        log.info("Obtendo cliente com primeiro nome Jose = 'Jose':");
        jdbc.query(
                "SELECT id, primeiro_nome, ultimo_nome FROM cliente WHERE primeiro_nome = ?", new Object[] { "Jose" },
                (rs, rowNum) -> new Cliente(rs.getLong("id"), rs.getString("primeiro_nome"), rs.getString("ultimo_nome"))
        ).forEach(customer -> log.info(customer.toString()));
    }
}