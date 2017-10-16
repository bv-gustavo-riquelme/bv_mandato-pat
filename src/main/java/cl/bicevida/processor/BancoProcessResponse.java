package cl.bicevida.processor;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import cl.bice.vida.sam.vista.ws.GetBancosResponse;
import cl.bice.vida.sam.vista.ws.ServicioSAM;

import cl.bicevida.util.CreateCxfClient;

public class BancoProcessResponse implements Processor	{

	public BancoProcessResponse() {	
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process(Exchange ex) throws Exception {
		
		
		if(ex != null){
			
			String url = ex.getContext().resolvePropertyPlaceholders("{{url.sam}}");
			GetBancosResponse out = new GetBancosResponse();
			ServicioSAM cliente = CreateCxfClient.createCXFClient(url);
			out.setReturn(cliente.getBancos());
			
			ex.getOut().setBody(out);
		}
		
	}

}
