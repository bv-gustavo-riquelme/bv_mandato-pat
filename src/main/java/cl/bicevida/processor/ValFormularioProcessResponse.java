package cl.bicevida.processor;

import javax.ws.rs.WebApplicationException;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.bice.vida.sam.vista.ws.ServicioSAM;
import cl.bice.vida.sam.vista.ws.ValidaFormularioResponse;
import cl.bicevida.object.InValFormulario;
import cl.bicevida.util.CreateCxfClient;

public class ValFormularioProcessResponse implements Processor {

	Logger logger = LoggerFactory.getLogger(ValFormularioProcessResponse.class);

	@Override
	public void process(Exchange ex) throws Exception {

		try {
			if (ex != null) {
				String url = ex.getContext().resolvePropertyPlaceholders("{{url.sam}}");
				logger.info("prueba1");
				InValFormulario valF = ex.getIn().getBody(InValFormulario.class);

				String numeroTarjeta = valF.getNumeroTarjeta();
				String codBanco = valF.getCodBanco();
				Integer mesVencimiento = valF.getMesVencimiento();
				Integer anioVencimiento = valF.getAnioVencimiento();
				Integer tipoTarjeta = valF.getTipoTarjeta();

				ValidaFormularioResponse out = new ValidaFormularioResponse();
				ServicioSAM cliente = CreateCxfClient.createCXFClient(url);

				out.setReturn(cliente.validaFormulario(numeroTarjeta, codBanco, mesVencimiento, anioVencimiento,
						tipoTarjeta));

				ex.getOut().setBody(out);
			}
		} catch (Exception e) {
			throw new WebApplicationException(e);
		}
	}

}
