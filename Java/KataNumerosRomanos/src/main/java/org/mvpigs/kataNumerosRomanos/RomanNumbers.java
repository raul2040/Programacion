package org.mvpigs.kataNumerosRomanos;


public enum RomanNumbers {
//---- Enum Numbers ----
	
	I(1), V(5), X(10), L(50), C(100), D(500), M(1000), 
	IV(4),IX(9),XL(40),XC(90),CD(400),CM(900);
	
//---- Properties ----
	
	private int decimal = 0;

	
//---- Constructor ----	
	
	private RomanNumbers(int decimal) {
		this.decimal = decimal;
	}
	
//---- Getters ----


	public int getDecimal() {
		return this.decimal;
	}

}

	
