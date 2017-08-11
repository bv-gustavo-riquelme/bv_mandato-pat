//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.07.10 a las 06:27:24 PM CLT 
//


package cl.bicevida.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.bicevida.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResponseMandato_QNAME = new QName("", "responseMandato");
    private final static QName _ResponseTarjeta_QNAME = new QName("", "responseTarjeta");
    private final static QName _Bancos_QNAME = new QName("", "bancos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.bicevida.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseTiposTarjeta }
     * 
     */
    public ResponseTiposTarjeta createResponseTiposTarjeta() {
        return new ResponseTiposTarjeta();
    }

    /**
     * Create an instance of {@link ResponseMandato }
     * 
     */
    public ResponseMandato createResponseMandato() {
        return new ResponseMandato();
    }

    /**
     * Create an instance of {@link ResponseBancosTarjeta }
     * 
     */
    public ResponseBancosTarjeta createResponseBancosTarjeta() {
        return new ResponseBancosTarjeta();
    }

    /**
     * Create an instance of {@link TipoTarjeta }
     * 
     */
    public TipoTarjeta createTipoTarjeta() {
        return new TipoTarjeta();
    }

    /**
     * Create an instance of {@link Banco }
     * 
     */
    public Banco createBanco() {
        return new Banco();
    }

    /**
     * Create an instance of {@link ResponseTiposTarjeta.TiposTarjeta }
     * 
     */
    public ResponseTiposTarjeta.TiposTarjeta createResponseTiposTarjetaTiposTarjeta() {
        return new ResponseTiposTarjeta.TiposTarjeta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseMandato }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "responseMandato")
    public JAXBElement<ResponseMandato> createResponseMandato(ResponseMandato value) {
        return new JAXBElement<ResponseMandato>(_ResponseMandato_QNAME, ResponseMandato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseTiposTarjeta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "responseTarjeta")
    public JAXBElement<ResponseTiposTarjeta> createResponseTarjeta(ResponseTiposTarjeta value) {
        return new JAXBElement<ResponseTiposTarjeta>(_ResponseTarjeta_QNAME, ResponseTiposTarjeta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseBancosTarjeta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "bancos")
    public JAXBElement<ResponseBancosTarjeta> createBancos(ResponseBancosTarjeta value) {
        return new JAXBElement<ResponseBancosTarjeta>(_Bancos_QNAME, ResponseBancosTarjeta.class, null, value);
    }

}
