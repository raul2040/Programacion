package org.mvpigs.dni;

public class DniCif {
	//Atributos
	private String dni = null;
	private TablaAsignacion tabla = new TablaAsignacion();
	
	// Constructores
	public DniCif() {
		this.dni = "introduce dni";
	}
	
	public DniCif(String dni) {
		this.dni = dni;
	}
	
	//Getters y setters
	public String getDni() {
		return this.dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	//Métodos
	
	public boolean comprobarLongitud() {
		return getDni().length() == 9;
	}
	
	
	/*public int calcularLetra(String dni) {
		int numeroDni = tabla.conversor(dni);
		int resultado  = tabla.obtenerLetra(numeroDni);
		char letraDni = tabla.getLetra(resultado);
		return numeroDni + letraDni;
	}*/
	
	public String obtenerLetra() {
		char letraDni = tabla.calcularLetra(this.dni);
		return this.dni + letraDni;
	}
}

