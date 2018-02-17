package org.mvpigs.Cotxox;

import org.mvpigs.Cotxox.Carrera;
import org.mvpigs.Cotxox.Conductor;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCarrera {
	Carrera carrera;
	@Before 
	public void ConstructorTest() {
		
		String[] tarjetasVisa = {"4556179014558326",
								 "4916084407349447",
								 "4486191794949893",
								 "4929206252689040",
								 "4024007189633596",
								 "4532991489063270",
								 "4532803467475576",
								 "4148825154244763",
							     "4716997658361559",
								 "4556383563564269"};
		for (String tarjetavisa: tarjetasVisa) {
			carrera = new Carrera(tarjetavisa);
			assertEquals(tarjetavisa, carrera.getTarjetaCredito());
		}
	}
	
	@Test
	public void setOrigenTest() {
		 String origen = "Magaluf";
		 carrera.setOrigen(origen);
		 assertEquals(origen, carrera.getOrigen());
	 }
	
	@Test
	public void setDestinoTest() {
		 String destino = "Aeropuerto Sant Joan";
		 carrera.setDestino(destino);
		 assertEquals(destino, carrera.getDestino());
	 }
	
	@Test
	public void setDistanciaTest() {
		double distancia = 7.75;
		double delta = 0.001;
		carrera.setDistancia(distancia);
		assertEquals(distancia, carrera.getDistancia(), delta);
	}
	
	@Test
	public void setTiempoEsperadoTest() {
		int tiempoEsperado = 50;
		carrera.setTiempoEsperado(tiempoEsperado);
		assertEquals(tiempoEsperado, carrera.getTiempoEsperado());
	}
	
	@Test
	public void setCosteEsperadoTest() {
		double costeEsperado = 12.21;
		double delta = 0.001;
		double distancia = 7.75;
		int tiempoEsperado = 5;
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperado);
		carrera.setCosteTotal(costeEsperado);
		assertEquals(distancia * 1.35 + tiempoEsperado * 0.35 , carrera.getCosteEsperado(), delta);
	}
	
	@Test
	public void setConductorTest() {
		Conductor conductor = new Conductor("Pepe");
		carrera.setConductor(conductor);
		assertEquals(conductor, carrera.getConductor());
	}
	
}
