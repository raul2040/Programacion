package org.mvpigs.Cotxox;

import java.util.ArrayList;

public class PoolConductores {
	private ArrayList<Conductor> poolConductores = new ArrayList<Conductor>();
	
	public PoolConductores(ArrayList<Conductor> poolConductores) {
		this.poolConductores = poolConductores;
	}
	
	public ArrayList<Conductor> getPoolConductores() {
		return this.poolConductores;
	}
	
	public Conductor asignarConductor() {
		Conductor conductor = new Conductor();
		return conductor;
	}
}