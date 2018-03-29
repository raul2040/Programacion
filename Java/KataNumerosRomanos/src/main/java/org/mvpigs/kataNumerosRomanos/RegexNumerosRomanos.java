package org.mvpigs.kataNumerosRomanos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class RegexNumerosRomanos {

  private HashMap<String,String > regexDiccionario = new HashMap<String,String>();

// ---- Getters y Setters
  

	public void addRegex(String key, String value) {
		this.regexDiccionario.put(key, value);
	}

	public Map<String, String> getRegex() {
		return this.regexDiccionario;
	}

	public String getRegexValue(String key) {
		return this.regexDiccionario.get(key);
	}

	public Collection<String> getValues() {
		return this.regexDiccionario.values();
	}

	public long longitud() {
		return this.regexDiccionario.size();
	}
}
