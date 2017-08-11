package cl.bicevida.object;

import java.util.List;


public class InMandato {

	protected Integer anioVencimiento;
    protected String apellidoClienteM;
    protected String apellidoClienteP;
    protected String dvRutCliente;
    protected String emailCliente;
    protected String idBanco;
    protected Integer idTipoTarjeta;
    protected Integer idTipoViaPago;
    protected Integer mesVencimiento;
    protected String nombreCliente;
    protected Long numeroTarjeta;
    protected List<InDatosPoliza> polizas;
    protected Long rutCliente;
	
    public InMandato() {
		// TODO Auto-generated constructor stub
	}
	public Integer getAnioVencimiento() {
		return anioVencimiento;
	}
	public void setAnioVencimiento(Integer anioVencimiento) {
		this.anioVencimiento = anioVencimiento;
	}
	public String getApellidoClienteM() {
		return apellidoClienteM;
	}
	public void setApellidoClienteM(String apellidoClienteM) {
		this.apellidoClienteM = apellidoClienteM;
	}
	public String getApellidoClienteP() {
		return apellidoClienteP;
	}
	public void setApellidoClienteP(String apellidoClienteP) {
		this.apellidoClienteP = apellidoClienteP;
	}
	public String getDvRutCliente() {
		return dvRutCliente;
	}
	public void setDvRutCliente(String dvRutCliente) {
		this.dvRutCliente = dvRutCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getIdBanco() {
		return idBanco;
	}
	public void setIdBanco(String idBanco) {
		this.idBanco = idBanco;
	}
	public Integer getIdTipoTarjeta() {
		return idTipoTarjeta;
	}
	public void setIdTipoTarjeta(Integer idTipoTarjeta) {
		this.idTipoTarjeta = idTipoTarjeta;
	}
	public Integer getIdTipoViaPago() {
		return idTipoViaPago;
	}
	public void setIdTipoViaPago(Integer idTipoViaPago) {
		this.idTipoViaPago = idTipoViaPago;
	}
	public Integer getMesVencimiento() {
		return mesVencimiento;
	}
	public void setMesVencimiento(Integer mesVencimiento) {
		this.mesVencimiento = mesVencimiento;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public Long getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(Long numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public List<InDatosPoliza> getPolizas() {
		return polizas;
	}
	public void setPolizas(List<InDatosPoliza> polizas) {
		this.polizas = polizas;
	}
	public Long getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(Long rutCliente) {
		this.rutCliente = rutCliente;
	}
	

}
