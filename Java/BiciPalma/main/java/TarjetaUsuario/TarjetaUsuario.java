package TarjetaUsuario;


public class TarjetaUsuario {
//Atributos
		private String id = null;
		private boolean activada;
//Constructores
	public TarjetaUsuario() {
		System.out.print("Inserta Tarjeta Usuario");
	}
public TarjetaUsuario(String id, boolean activada) {
		this.id = id;
		this.activada = activada;
	}
//Getters y Setters, métodos de acceso
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isActivada() {
		return activada;
	}
	public void setActivada(boolean activada) {
		this.activada = activada;
	}
	
}
