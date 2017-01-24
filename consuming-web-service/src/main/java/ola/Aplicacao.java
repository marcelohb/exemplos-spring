package ola;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hello.wsdl.GetQuoteResponse;

@SpringBootApplication
public class Aplicacao {
	
	public static void main(String[] args) {
		SpringApplication.run(Aplicacao.class);
	}

	@Bean
	CommandLineRunner lookup(Cliente cliente) {
		return args -> {
			String mensagem = "MSTF";
			
			if (args.length > 0) {
				mensagem = args[0];
			}
			
			GetQuoteResponse response = cliente.obterCota(mensagem);
			System.err.println(response.getGetQuoteResult());
		};
	}

}
