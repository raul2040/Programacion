package org.mvpigs.PesoPlanetario;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Tu peso en los planetas Terrestres");
		for(Planeta planeta:Planeta.getPlanetasTerrestres()) {
			System.out.println("En este planeta " + planeta.name() + " Pesas --> " + planeta.pesoSuperficie(175.00));
		}
		System.out.println("\n");
		System.out.println("Tu peso en los planetas Gaseosos");
		for(Planeta planeta: Planeta.getGigantesGaseosos()) {
			System.out.println("En este planeta " + planeta.name() + " Pesas --> " + planeta.pesoSuperficie(175.00));
		}
	}

}
