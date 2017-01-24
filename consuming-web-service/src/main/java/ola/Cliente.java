package ola;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import hello.wsdl.GetQuote;
import hello.wsdl.GetQuoteResponse;

public class Cliente extends WebServiceGatewaySupport {
	
	private final Logger LOG = LoggerFactory.getLogger(Cliente.class);
	
	public GetQuoteResponse obterCota(String mensagem) {
		
		GetQuote request = new GetQuote();
		request.setSymbol(mensagem);
		
		LOG.info("Obtendo citação : " + mensagem);
		
		GetQuoteResponse response = (GetQuoteResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.webservicex.com/stockquote.asmx",
				request,
				new SoapActionCallback("http://www.webserviceX.NET/GetQuote"));
		return response;
	}

}
