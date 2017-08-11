package cl.bicevida.processor;

import javax.ws.rs.WebApplicationException;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.bice.vida.sam.vista.ws.MandatoDtoIn;
import cl.bice.vida.sam.vista.ws.OutDetalleProductoDto;
import cl.bice.vida.sam.vista.ws.ServicioSAM;
import cl.bicevida.util.CreateCxfClient;

public class AutorizacionProcessResponse implements Processor {

	Logger logger = LoggerFactory.getLogger(AutorizacionProcessResponse.class);

	@Override
	public void process(Exchange ex) throws Exception {
		try {
			if (ex != null) {
				String url = ex.getContext().resolvePropertyPlaceholders("{{url.sam}}");
				MandatoDtoIn mandato = ex.getIn().getBody(MandatoDtoIn.class);

				ServicioSAM client = CreateCxfClient.createCXFClient(url);
				OutDetalleProductoDto out = client.validaAutorizacion(mandato);

				ex.getOut().setBody(out);
			}
		} catch (Exception e) {
			throw new WebApplicationException(e);
		}

	}

}
