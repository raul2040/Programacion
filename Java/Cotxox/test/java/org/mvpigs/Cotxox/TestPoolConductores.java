package org.mvpigs.Cotxox;

import java.util.ArrayList;

import org.junit.Test;

public class TestPoolConductores {
	
	@Test
	public void ConstructorTest() {
		ArrayList<Conductor> poolConductores = new ArrayList<Conductor>();
		Conductor conductor = null;
		
		String[] nombres = {"Paco","Jose","Jaume","Eusebio"};
		for(String nombre:nombres) {
			conductor = new Conductor(nombre);
			poolConductores.add(conductor);
		}
		
		String[] matricula = {"4AB213","5213AS","7456BHL","4321bh"};
		String[] modelos = {"Chevrolet aveo", "dacia sandero","Nissan Qashqai","Nissan yuke"};
		int[] valoraciones = {5,6,4,3};
		
		int x = 0;
		for(Conductor conductora:poolConductores) {
				conductora.setMatricula(matricula[x]);
				conductora.setModelo(modelos[x]);
				conductora.setValoracion(valoraciones[x]);
				x++;
			}
		
		PoolConductores conductores = new PoolConductores(poolConductores);
		
		for(Conductor conductora: conductores.getPoolConductores()) {
			System.out.println(conductora.getNombre());
			System.out.println(conductora.getMatricula());
			System.out.println(conductora.getModelo());
			System.out.println(conductora.getValoracion());
		}
	}

}
