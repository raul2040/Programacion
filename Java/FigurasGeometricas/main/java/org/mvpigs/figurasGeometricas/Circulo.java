package org.mvpigs.figurasGeometricas;
public class Circulo extends FigurasGeometricas {
	private double radio = 0;
	
public Circulo() {
	super();
}
public Circulo(double radio) {
	super();
	this.radio = radio;
}
public Circulo(String nombre, double radio) {
	super(nombre);
	this.radio = radio;
}
	@Override
	public double area() {
	return Math.PI * Math.pow(this.radio,2);
}
	
}