package ola;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class Configuracao {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		
		marshaller.setContextPath("hello.wsdl");
		return marshaller;
	}
	
	@Bean
	public Cliente cliente(Jaxb2Marshaller marshaller) {
		Cliente cliente = new Cliente();
		cliente.setDefaultUri("http://www.webservicex.com/stockquote.asmx");
		cliente.setMarshaller(marshaller);
		cliente.setUnmarshaller(marshaller);
		return cliente;
	}

}
