package entidades;

public class postalLinkDTO {
	private String sRolOrigen;
	private String sAreaOrigen;
	private String sRolDestino;
	private String sAreaDestino;
	private String sAnalEdesur;
	
	public postalLinkDTO(String sRolOrigen, String sAreaOrigen, String sRolDestino, String sAreaDestino, String sAnalEdesur) {
		this.sRolOrigen = sRolOrigen;
		this.sAreaOrigen = sAreaOrigen;
		this.sRolDestino = sRolDestino;
		this.sAreaDestino = sAreaDestino;
		this.sAnalEdesur = sAnalEdesur;
	}
	
	public String getRolOrigen() {
		return sRolOrigen;
	}
	public String getAreaOrigen() {
		return sAreaOrigen;
	}
	public String getRolDestino() {
		return sRolDestino;
	}
	public String getAreaDestino() {
		return sAreaDestino;
	}
	public String getAnalEdesur() {
		return sAnalEdesur;
	}
	
}
