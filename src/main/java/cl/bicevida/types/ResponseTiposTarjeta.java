//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.07.10 a las 06:27:24 PM CLT 
//


package cl.bicevida.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para responseTiposTarjeta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="responseTiposTarjeta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tiposTarjeta" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tipoTarjeta" type="{}tipoTarjeta" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="respuestaServicio" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseTiposTarjeta", propOrder = {
    "tiposTarjeta",
    "descripcion",
    "respuestaServicio"
})
public class ResponseTiposTarjeta {

    protected ResponseTiposTarjeta.TiposTarjeta tiposTarjeta;
    protected String descripcion;
    protected boolean respuestaServicio;

    /**
     * Obtiene el valor de la propiedad tiposTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link ResponseTiposTarjeta.TiposTarjeta }
     *     
     */
    public ResponseTiposTarjeta.TiposTarjeta getTiposTarjeta() {
        return tiposTarjeta;
    }

    /**
     * Define el valor de la propiedad tiposTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseTiposTarjeta.TiposTarjeta }
     *     
     */
    public void setTiposTarjeta(ResponseTiposTarjeta.TiposTarjeta value) {
        this.tiposTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad respuestaServicio.
     * 
     */
    public boolean isRespuestaServicio() {
        return respuestaServicio;
    }

    /**
     * Define el valor de la propiedad respuestaServicio.
     * 
     */
    public void setRespuestaServicio(boolean value) {
        this.respuestaServicio = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="tipoTarjeta" type="{}tipoTarjeta" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tipoTarjeta"
    })
    public static class TiposTarjeta {

        protected List<TipoTarjeta> tipoTarjeta;

        /**
         * Gets the value of the tipoTarjeta property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tipoTarjeta property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTipoTarjeta().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TipoTarjeta }
         * 
         * 
         */
        public List<TipoTarjeta> getTipoTarjeta() {
            if (tipoTarjeta == null) {
                tipoTarjeta = new ArrayList<TipoTarjeta>();
            }
            return this.tipoTarjeta;
        }

    }

}
