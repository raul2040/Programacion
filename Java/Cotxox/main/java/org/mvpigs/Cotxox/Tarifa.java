package org.mvpigs.Cotxox;

public abstract class Tarifa {
	//Atributos
	final static double costeMilla = 1.35; 
	final static double costeMinuto = 0.35;
	final static int costeMinimo = 5;
	final int porcetajeComision = 20;
	
	//Métodos de acceso Getters y Setters
	
	public static double getCosteMilla() {
		return costeMilla;
	}
	public static double getCosteMinuto() {
		return costeMinuto;
	}
	public int getCosteMinimo() {
		return costeMinimo;
	}
	public int getPorcetajeComision() {
		return porcetajeComision;
	}
	public static double getCosteDistancia(double distancia) {
		return costeDistancia(distancia);
	}
	public static double getCosteTiempo(int minutos) {
		return costeTiempo(minutos);
	}
	public static double getCosteTotalEsperado(double distancia, int minutos) {
		return costeTotal(distancia, minutos);
	}
	
	//Lógica
	
	public static double costeDistancia(double distancia) {
		return distancia * getCosteMilla();
	}
	public static double costeTiempo(int minutos) {
		return minutos * getCosteMinuto();
	}
	public static double costeTotal(double distancia, int minutos) {
		double costeTotal = getCosteDistancia(distancia) + getCosteTiempo(minutos);
		double resultado = 0;
		if (costeTotal < costeMinimo) {
			resultado +=5;
		}
		else {
			resultado = costeTotal;
		}
		return resultado;
	}
	
}
