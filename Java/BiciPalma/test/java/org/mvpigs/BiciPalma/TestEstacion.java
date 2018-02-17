package org.mvpigs.BiciPalma;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Estacion.Estacion;
import Bicicleta.Bicicleta;

public class TestEstacion {
Bicicleta bicicleta;
Estacion estacion;
	@Before
	public void constructorTest() {
	String[] ciudades = {"Palma","Inca","New york","Miami","Berlin","Napoles"};
	for(int x = 0; x < 20; x++) {
		 bicicleta = new Bicicleta(x);
	}
	for(int x = 0; x < 20; x++) {
		for(String ciudad:ciudades) {
			estacion = new Estacion(x,ciudad,7);
		}
	}
}
	
	@Test
	public void getDireccionTest() {
		String actual = estacion.getDireccion();
		String expected = "Napoles";
		assertEquals(actual, expected);
	}
	
	@Test
	public void getNumeroAnclajesTest() {
		int actual = estacion.getNumeroAnclajes();
		int expected = 7;
		assertEquals(expected, actual);
	}
	
	@Test
	public void setNumeroAnclajesTest() {
		int numeroAnclajes = 7;
		estacion.setNumeroAnclajes(7);
		assertEquals(numeroAnclajes, estacion.getNumeroAnclajes());
	}
	
	@Test
	public void generarAnclajesTest() {
		int actual = 1;
		estacion.anclarBicicleta(bicicleta);
		assertEquals(actual, estacion.getNumeroAnclajes());
		int expected = 0;
		estacion.generarAnclaje();
		assertEquals(expected, estacion.getNumeroAnclajes());
		
	}
	
}




