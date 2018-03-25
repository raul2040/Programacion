package org.mvpigs.kataNumerosRomanos;

import java.util.HashMap;

public class RegexNumerosRomanos {

  private static HashMap<String,String > regex = new HashMap<String,String>();

// ---- Getters y Setters
  
  		public static void addRegex(String key, String value) {
            regex.put(key, value);
        }

        public static HashMap<String, String> getRegex() {
           return regex;
        }

        public static String getRegexValue(String key) {
            return regex.get(key);
        }
}

