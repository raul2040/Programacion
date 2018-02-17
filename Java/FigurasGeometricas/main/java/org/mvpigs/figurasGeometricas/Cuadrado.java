package org.mvpigs.figurasGeometricas;

public class Cuadrado extends FigurasGeometricas {
	private double lado = 0d;

	public Cuadrado() {
		super();
	}
	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}
	public Cuadrado(String nombre, double lado) {
		super(nombre);
		this.lado = lado;
	}
	public double getLado(double lado) {
		return this.lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public double area() {
		return Math.pow(this.lado, 2);
	}
}

