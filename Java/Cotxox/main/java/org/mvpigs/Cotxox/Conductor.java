package org.mvpigs.Cotxox;

import java.util.ArrayList;
import java.util.Iterator;

public class Conductor {
	private String nombre = null;
	private String modelo = null;
	private String matricula = null;
	private double valoracionMedia = 0;
	private ArrayList<Integer> valoraciones = new ArrayList<Integer>();
	private boolean ocupado = false;
	public int valoracion = 0;
	

	public Conductor(String nombre) {
		this.nombre = nombre;
	}
	
	public Conductor() {
		
	}
	
	public int getNumeroValoraciones() {
		return valoraciones.size();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getValoracionMedia() {
		return valoracionMedia;
	}

	public void setValoracionMedia(double valoracionMedia) {
		this.valoracionMedia = valoracionMedia;
	}

	public ArrayList<Integer> getValoraciones() {
		return valoraciones;
	}

	public void setValoraciones(ArrayList<Integer> valoraciones) {
		this.valoraciones = valoraciones;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	public int getValoracion() {
		return valoracion;
	}

	//Lógica 
	
	public void setValoracion(int valoracion){
		this.valoracion = valoracion;
		valoraciones.add(valoracion);
		calcularValoracionMedia();
	}
	
	public double calcularValoracionMedia() {
		double resultado = 0;
		Iterator<Integer> nombreIterator = valoraciones.iterator();
	    while(nombreIterator.hasNext()){
	       resultado = nombreIterator.next();
	       return resultado/getNumeroValoraciones();
}
	return resultado;
}
}