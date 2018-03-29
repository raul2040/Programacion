package org.mvpigs.kataNumerosRomanos;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumerosRomanos {
	
// ---- Atributos ----
	
	private String numeroRomano;
	private int valorDecimal;
	
	private RegexNumerosRomanos regexDiccionario = new RegexNumerosRomanos();
	
// ---- Getters y Setters ----
	
	public RegexNumerosRomanos getRegexDiccionario() {
		return this.regexDiccionario;
	}
	
	public int getValorDecimal() {
		return this.valorDecimal;
	}
	
	public String getNumeroRomano() {
		return this.numeroRomano;
	}
	
	public void addRegex(String descripcion, String regex) {
		getRegexDiccionario().addRegex(descripcion, regex);
}
	
// ---- Constructor ----
	
	public NumerosRomanos() {
		System.out.println("Introduce un número Romano");
	}
	
	public NumerosRomanos(String numeroRomano) {
		this.numeroRomano = numeroRomano;
	}
	
// ---- Lógica ----
	
	public int toDecimal() {
		for(String regex : getRegexDiccionario().getValues()) {
			Matcher matcher = createMatcher(regex);
			groupSumatoryToDecimal(matcher);
		}		
		return this.getValorDecimal();
}
	
	private void groupSumatoryToDecimal(Matcher matcher) {
		while (matcher.find()) {
				this.valorDecimal += grupoTotalaDecimal(matcher.group());
		}
}
	
	public List<String> getExpresionesRegulares() {
		List<String> listaRegex = new ArrayList<String>(getRegexDiccionario().getRegex().values());
		return listaRegex;
	}


	public void initArrayRegex() {
		getRegexDiccionario().addRegex("grupoSumatorio", "(?<!C)[DM]|(?<!X)[LC](?![DM])|(?<!I)[VX](?![LC])|I(?![VX])");
		getRegexDiccionario().addRegex("grupoSustractivo", "(C[DM])|(X[LC])|(I[VX])");
	}

	public Matcher createMatcher(String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(this.numeroRomano);
		
		return matcher;
	}
	
	public int grupoTotalaDecimal(String numeroRomano) {
		RomanNumbers numero = Enum.valueOf(RomanNumbers.class, String.valueOf(numeroRomano));
		return (int) numero.getDecimal();
	}
}
