package cl.bicevida.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import cl.bice.vida.sam.vista.ws.GetTarjetasResponse;
import cl.bice.vida.sam.vista.ws.ServicioSAM;
import cl.bicevida.util.CreateCxfClient;

public class TarjetaProcessResponse implements Processor{

	public TarjetaProcessResponse() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process(Exchange ex) throws Exception {
		
		if(ex != null){
			
			String url = ex.getContext().resolvePropertyPlaceholders("{{url.sam}}");
			GetTarjetasResponse out = new GetTarjetasResponse();
			ServicioSAM cliente = CreateCxfClient.createCXFClient(url);
			out.setReturn(cliente.getTarjetas());
			
			ex.getOut().setBody(out);
		}
		
	}

}
