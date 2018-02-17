package org.mvpigs.figurasGeometricas;

public class Elipse extends FigurasGeometricas {
	private double semiejeMayor = 0;
	private double semiejeMenor = 0;
	private double PI = Math.PI;
	
	public Elipse() {
		super();
	}
	public Elipse(double semiejeMayor, double semiejeMenor) {
		super();
		this.semiejeMayor = semiejeMayor;
		this.semiejeMenor = semiejeMenor;
	}
	public Elipse(String nombre, double semiejeMayor, double semiejeMenor) {
		super(nombre);
		this.semiejeMayor = semiejeMayor;
		this.semiejeMenor = semiejeMenor;
	}
	public double getSemiejeMenor() {
		return semiejeMenor;
	}
	public double getSemiejeMayor() {
		return semiejeMayor;
	}
	public void setSemiejeMayor(double semiejeMayor) {
		this.semiejeMayor = semiejeMayor;
	}
	public void setSemiejeMenor(double semiejeMenor) {
		this.semiejeMenor = semiejeMenor;
	}
@Override
	public double area() {
	return PI * getSemiejeMayor() * getSemiejeMenor();
}
}
