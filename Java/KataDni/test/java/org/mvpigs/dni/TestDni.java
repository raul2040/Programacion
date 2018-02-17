package org.mvpigs.dni;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TestDni{
	
	public static ArrayList<DniCif> setUp(){
		String[] numerosDnis = {"55145282","06437955","22214300","13053091","52581146","62493543","47314877"};
		ArrayList<DniCif> dni = new ArrayList<DniCif>();
		for(String  numero: numerosDnis) {
			dni.add(new DniCif(numero));
			
		}
		return dni;
	}
	
	@Test
	public void dniTest() {
		int contador = 0;
		String[] comprobador =  {"55145282E","06437955W","22214300A","13053091Q","52581146H","62493543J","47314877J"};
		for(DniCif dni : setUp()) {
			assertEquals(dni.obtenerLetra(), comprobador[contador]);
			contador++;
		}
		
}
}
