package org.mvpigs.figurasGeometricas;

import java.util.ArrayList;

public class MainFiguras {

	public static void main(String[] args) {
		
		ArrayList<FigurasGeometricas> figuras = new ArrayList<FigurasGeometricas>();
		
		// test constructores 
		
		Rectangulo rectangulo = new Rectangulo(4, 5);
		Rectangulo rectangulo1 = new Rectangulo("rectángulo", 4, 5);
		
		Circulo circulo = new Circulo(5);
		Circulo circulo1 = new Circulo("círculo", 5);
		
		Cuadrado cuadrado = new Cuadrado("cuadrado",5);
		Cuadrado cuadrado1 = new Cuadrado("cuadrado", 10);
		
		Elipse elipse = new Elipse("probando",5,5);
		Elipse elipse1 = new Elipse(10,12);
		
		
		// test herencia y polimorfismo 
		
		figuras.add(circulo);
		figuras.add(rectangulo);
		figuras.add(circulo1);
		figuras.add(rectangulo1);
		figuras.add(cuadrado);
		figuras.add(cuadrado1);
		figuras.add(elipse);
		figuras.add(elipse1);
	
				
		for (FigurasGeometricas figura : figuras){
			System.out.println("Area del " + figura.getNombre() + " = " + figura.area());
		}

	}

}