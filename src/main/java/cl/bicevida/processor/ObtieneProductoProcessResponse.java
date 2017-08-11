package cl.bicevida.processor;

import javax.ws.rs.WebApplicationException;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.bice.vida.sam.vista.ws.BuscarDetalleProductosResponse;
import cl.bice.vida.sam.vista.ws.ServicioSAM;
import cl.bicevida.object.InObtieneProducto;
import cl.bicevida.util.CreateCxfClient;

public class ObtieneProductoProcessResponse implements Processor {

	Logger logger = LoggerFactory.getLogger(AutorizacionProcessResponse.class);

	@Override
	public void process(Exchange ex) throws Exception {

		try {
			if (ex != null) {
				String url = ex.getContext().resolvePropertyPlaceholders("{{url.sam}}");
				InObtieneProducto in = ex.getIn().getBody(InObtieneProducto.class);
				Integer rutCliente = in.getRutCliente();

				BuscarDetalleProductosResponse outD = new BuscarDetalleProductosResponse();

				ServicioSAM cliente = CreateCxfClient.createCXFClient(url);

				outD.setReturn(cliente.buscarDetalleProductos(rutCliente));

				ex.getOut().setBody(outD);
			}
		} catch (Exception e) {
			throw new WebApplicationException(e);
		}
	}

}
