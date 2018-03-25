package org.mvpigs.kataNumerosRomanos;



import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestRomanNumbers {
	
	public String[] test = {"I","V","L","C","D","M"};

	@BeforeClass
	public static void RomanNumbersSetUp() {
		String[] numbers = new String[8];
		int numbersAdd = 0;
		for (RomanNumbers iterator : RomanNumbers.values()) {
			numbers[iterator.ordinal()] = iterator.name();
			numbersAdd += 1;
		}
		assertThat(numbersAdd).isEqualTo(RomanNumbers.values().length);
	}
	
	@Test
	public void RomanNumberDecimal() {
		assertEquals(RomanNumbers.I.decimal, 1);
		assertEquals(RomanNumbers.V.decimal, 5);
		assertEquals(RomanNumbers.X.decimal, 10);
		assertEquals(RomanNumbers.C.decimal, 100);
		assertEquals(RomanNumbers.D.decimal, 500);
		assertEquals(RomanNumbers.M.decimal, 1000);
	}
	
	
	@Test
	public void testRomanNumbers() {
		String regex = "(?<!C)[MD] ";
		String source = "MDIV";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(source);
		m.find();
		assertEquals("M", m.group());
		m.find();
		assertEquals("D", m.group());
		// System.out.println(RomanNumbers.valueOf("MDIV").getDecimal());
	}
	
}
