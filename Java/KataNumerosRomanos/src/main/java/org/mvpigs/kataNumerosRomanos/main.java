package org.mvpigs.kataNumerosRomanos;

import static org.junit.Assert.assertThat;

public class main {
	public static void main(String[] args) {

		String test = "MMMDCCCLXXXVIII"; // 3888
		test = "MMDCCLXXVII";  // 2777
		test = "CDXLIV"; // 444
		test = "CDXXXIX"; // 439

		NumerosRomanos numeroRomano = new NumerosRomanos(test);
		numeroRomano.addRegex("grupoSumatorio", "(?<!C)[DM]|(?<!X)[LC](?![DM])|(?<!I)[VX](?![LC])|I(?![VX])");
		numeroRomano.addRegex("grupoSustractivo", "(C[DM])|(X[LC])|(I[VX])");

		System.out.println(numeroRomano.getNumeroRomano() + " = " + numeroRomano.getValorDecimal());
		
	}
}
