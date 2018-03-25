package org.mvpigs.kataNumerosRomanos;

import java.util.ArrayList;

public enum RomanNumbers {
//---- Enum Numbers ----
	
	I(1), V(5), X(10), L(50), C(100), D(500), M(1000), 
	IV(4),IX(9),XL(40),XC(90),CD(400),CM(900);
	
//---- Properties ----
	
	int decimal = 0;
	private static ArrayList<RomanNumbers> numbers = new ArrayList<RomanNumbers>();
	
//---- Constructor ----	
	
	private RomanNumbers(int decimal) {
		this.decimal = decimal;
	}
	
//---- Getters ----

	public static ArrayList<RomanNumbers> getNumbers(){
		return numbers;
	}
	
	public int getDecimal() {
		return this.decimal;
	}

//---- Methods ----
	
	

}

	
