package org.mvpigs.Cotxox;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTarifa {
	@Test
	public void testCosteEsperado() {
		double distancia = 7.75;
		int minutos  = 15;
		double costeDistancia = distancia * Tarifa.costeMilla;
		double costeMin = minutos *  Tarifa.costeMinuto; 
		double delta = 0.001;
		assertEquals(costeDistancia + costeMin, Tarifa.getCosteTotalEsperado(distancia, minutos), delta);
	}
	@Test
	public void testCosteDistancia() {
		double distancia = 5.50;
		double costeDistancia = distancia * Tarifa.costeMilla;
		double delta = 0.001;
		assertEquals(costeDistancia, Tarifa.getCosteDistancia(distancia), delta);
	}
	@Test
	public void testCosteTiempo() {
		int minutos = 10;
		double costeMin = minutos * Tarifa.costeMinuto;
		double delta = 0.001;
		assertEquals(costeMin, Tarifa.getCosteTiempo(minutos),delta);
	}
	@Test
	public void costeMinimo() {
		int minutos = 1;
		double distancia = 1.20;
		int expected = 5;
		double delta = 0.001;
		assertEquals(expected,Tarifa.getCosteTotalEsperado(distancia, minutos), delta);
	}
}
