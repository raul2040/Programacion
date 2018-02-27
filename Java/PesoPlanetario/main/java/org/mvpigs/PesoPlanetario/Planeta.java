package org.mvpigs.PesoPlanetario;

import java.util.ArrayList;

public enum Planeta {
	
	MERCURY(3.303e+23, 2.4397e6),
	VENUS(4.869e+24, 6.0518e6),
	EARTH(5.976e+24, 6.37814e6),
	MARS(6.421e+23, 3.3972e6),
	JUPITER(1.9e+27, 7.1492e7),
	SATURN(5.688e+26, 6.0268e7),
	URANUS(8.686e+25, 2.5559e7),
	NEPTUNE(1.024e+26, 2.4746e7);

// ----- ATRIBUTOS ------

	private double masaDelPlaneta = 0d;
	private double masaPropia = 0d;
	private double G = 6.67300E-11;
	private double radioPlanetario = 0;
	private static ArrayList<Planeta> planetasGaseosos = new ArrayList<>();
	private static ArrayList<Planeta> planetasTerrestres = new ArrayList<>();
	
// ----- CONSTRUCTOR ------
	
	private Planeta(double masaDelPlaneta, double radioPlanetario) {
		this.masaDelPlaneta = masaDelPlaneta;
		this.radioPlanetario = radioPlanetario;
	}
	
// ------ MÉTODOS DE ACCESO ------
	
	public double getMasaPropia() {
		return this.masaPropia;
	}
	public double getMasa() {
		return this.masaDelPlaneta;
	}
	
	public double getRadio() {
		return this.radioPlanetario;
	}
	public double getGravedadEnSuperficie() {
		return  (G * getMasa()) / Math.pow(getRadio(), 2);
	}
	public static ArrayList<Planeta> getPlanetasTerrestres() {
		planetasTerrestres.add(EARTH);
		planetasTerrestres.add(MARS);
		planetasTerrestres.add(VENUS);
		planetasTerrestres.add(MERCURY);
		return planetasTerrestres;
	}
	public static ArrayList<Planeta> getGigantesGaseosos() {
		planetasGaseosos.add(JUPITER);
		planetasGaseosos.add(SATURN);
		planetasGaseosos.add(URANUS);
		planetasGaseosos.add(NEPTUNE);
		return planetasGaseosos;
	}
// ------ LÓGICA ------
	
	public double pesoSuperficie(double pesoHumano) {
		calcularMasaPropia(pesoHumano);
		return getMasaPropia() * getGravedadEnSuperficie();
	}
	
	public void calcularMasaPropia(double pesoHumano) {
		masaPropia = pesoHumano / EARTH.getGravedadEnSuperficie();
	}
}


