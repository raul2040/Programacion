package org.mvpigs.dni;

public class TablaAsignacion {
	
	char[] tabla= {'T','R','W','A','G','M','Y','F','G','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	
	public int getModulo() {
		return tabla.length;
	}
	
	public char getLetra(int posicion) {
		return this.tabla[posicion];
	}

	/*public int conversor(String dni) {
		int numeroDni = 0;
		for(int x = 0; x <= 8; x++) {
		numeroDni = Integer.parseInt(dni);	
	}
	return numeroDni;

	
	public double obtenerLetra(int numeroDni) {
		int resultado = numeroDni % getModulo();
		
		return getLetra(resultado);
}
	*/
	
	public char calcularLetra(String dni) {
		int numeroDni = 0;
		for(int x = 0; x <= 8; x++) {
			numeroDni = Integer.parseInt(dni);
		}
		int posicion = numeroDni % getModulo();
		return getLetra(posicion);
	}
}