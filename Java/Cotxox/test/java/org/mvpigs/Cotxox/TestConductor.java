package org.mvpigs.Cotxox;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestConductor {
	Conductor conductor;
	
	@Before
	public void constructorTest() {
		String nombre = "Lucia";
		Conductor conductor = new Conductor("Lucia");
		assertEquals(nombre, conductor.getNombre());
	}
	@Test
	public void valoracionMediaTest() {
		String nombre = "Paco";
		Conductor conductor = new Conductor(nombre);
		double contador = 0;
		int[] valoraciones = {5,6,7,3,2,5,6,8};
		double delta = 0.001;
		for(int media: valoraciones) {
			conductor.setValoracion(media);
		}
		for(double x = 0; x < valoraciones.length;x++) {
			contador += x;
		}
		assertEquals(contador/conductor.getNumeroValoraciones(), conductor.calcularValoracionMedia(),delta);
	}
}