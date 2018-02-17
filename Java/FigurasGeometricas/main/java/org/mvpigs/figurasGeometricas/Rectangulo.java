package org.mvpigs.figurasGeometricas;

public class Rectangulo extends FigurasGeometricas{
	private double anchura = 0;
	private double altura = 0;

public Rectangulo() {
	super();
}
public Rectangulo(double altura, double anchura) {
	super();
	this.altura = altura;
	this.anchura = anchura;
}

public Rectangulo(String nombre, double altura, double anchura) {
	super(nombre);
	this.altura = altura;
	this.anchura = anchura;
}

public double getAltura() {
	return this.altura;
}

public void setAltura(double altura) {
	this.altura = altura;
}

public double getAnchura() {
	return this.anchura;
}

public void setAnchura(double anchura) {
	this.anchura = anchura;
}

@Override
public double area() {
	return getAnchura() * getAltura(); //logramos encapsulación, accediendo a las propiedades mediante get
}
}
