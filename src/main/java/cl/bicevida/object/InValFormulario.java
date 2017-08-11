package cl.bicevida.object;

public class InValFormulario {
	
	private String numeroTarjeta;
	private String codBanco;
	private Integer mesVencimiento;
	private Integer anioVencimiento;
	private Integer tipoTarjeta;
	
	public InValFormulario(){
		
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getCodBanco() {
		return codBanco;
	}

	public void setCodBanco(String codBanco) {
		this.codBanco = codBanco;
	}

	public Integer getMesVencimiento() {
		return mesVencimiento;
	}

	public void setMesVencimiento(Integer mesVencimiento) {
		this.mesVencimiento = mesVencimiento;
	}

	public Integer getAnioVencimiento() {
		return anioVencimiento;
	}

	public void setAnioVencimiento(Integer anioVencimiento) {
		this.anioVencimiento = anioVencimiento;
	}

	public Integer getTipoTarjeta() {
		return tipoTarjeta;
	}

	public void setTipoTarjeta(Integer tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}
	
}
