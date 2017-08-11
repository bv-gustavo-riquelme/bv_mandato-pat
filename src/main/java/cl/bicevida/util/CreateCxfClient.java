package cl.bicevida.util;

import java.io.IOException;
import java.util.Properties;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import cl.bice.vida.sam.vista.ws.ServicioSAM;

public class CreateCxfClient {
	

	
	
	public static ServicioSAM createCXFClient(String url) throws IOException{
		
//		obtengo el endpoint correspondiente al servicio del sam desde el archivo properties
		//String url2 = GetProperties.obtieneValorProperties("url.sam");	
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(ServicioSAM.class);
		factory.setAddress(url);
		return (ServicioSAM)factory.create();		
	} 
	

}
