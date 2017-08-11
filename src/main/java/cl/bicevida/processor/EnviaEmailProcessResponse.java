package cl.bicevida.processor;

import javax.ws.rs.WebApplicationException;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import cl.bice.vida.sam.vista.ws.EnviarMandatoActionResponse;
import cl.bice.vida.sam.vista.ws.ServicioSAM;
import cl.bicevida.object.InEnvioCorreo;
import cl.bicevida.util.CreateCxfClient;

public class EnviaEmailProcessResponse implements Processor {

	@Override
	public void process(Exchange ex) throws Exception {

		try {
			if (ex != null) {
				String url = ex.getContext().resolvePropertyPlaceholders("{{url.sam}}");
				InEnvioCorreo in = ex.getIn().getBody(InEnvioCorreo.class);

				String correo = in.getCorreo();
				String nombreCliente = in.getNombreCliente();
				String apellidoP = in.getApellidoP();
				String apellidoM = in.getApellidoM();
				String urlPDF = in.getUrlPDF();

				EnviarMandatoActionResponse out = new EnviarMandatoActionResponse();
				ServicioSAM cliente = CreateCxfClient.createCXFClient(url);
				out.setReturn(cliente.enviarMandatoAction(correo, nombreCliente, apellidoP, apellidoM, urlPDF));

				ex.getOut().setBody(out);
			}
		} catch (Exception e) {
			throw new WebApplicationException(e);
		}
	}

}
