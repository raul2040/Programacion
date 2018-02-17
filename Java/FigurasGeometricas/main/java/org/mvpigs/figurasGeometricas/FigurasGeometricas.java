package org.mvpigs.figurasGeometricas;

public abstract class FigurasGeometricas {
	private String nombre;
	
	public FigurasGeometricas() {
		this.nombre = "desconocido";
	}
	
	public FigurasGeometricas(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double area();

}
