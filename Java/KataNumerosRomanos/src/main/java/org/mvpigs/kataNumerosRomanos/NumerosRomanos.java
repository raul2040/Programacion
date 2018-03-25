package org.mvpigs.kataNumerosRomanos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumerosRomanos {
	
	private String numeroRomano;
	private int valorDecimal;
	
	public NumerosRomanos(String valor) {
		this.numeroRomano = valor;
	}
	
	public int conversor(String regex) {
		Matcher matcher = createMatcher(RegexNumerosRomanos.getRegexValue("total"));
		return valorDecimal;
		
	}
	
	public void initArrayRegex() {
		RegexNumerosRomanos.addRegex("total","");
	}

	private Matcher createMatcher(String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(this.numeroRomano);
		
		return matcher;
	}
	
	private int grupoTotalaDecimal() {
		
		return valorDecimal;
		
	}
}
