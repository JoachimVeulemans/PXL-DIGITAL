package oefening1;

import java.util.Arrays;
import java.util.Collections;

public class Oefening1 {

	public static void main(String[] args) {
		char karakter = 'a';
		int intGetal = 125;
		long longGetal = 1456L;
		float floatGetal = 12.56F;
		double doubleGetal = 1598.636;

		Character karakterWrap = karakter;
		Integer intGetalWrap = intGetal;
		Long longGetalWrap = longGetal;
		Float floatGetalWrap = floatGetal;
		Double doubleGetalWrap = doubleGetal;

		Object[] test = new Object[5];
		test[0] = karakterWrap;
		test[1] = intGetalWrap;
		test[2] = longGetalWrap;
		test[3] = floatGetalWrap;
		test[4] = doubleGetalWrap;

		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i].toString());
		}
		Collections.shuffle(Arrays.asList(test));

		for (int i = 0; i < test.length; i++) {
			if (test[i] instanceof Character) {
				if (Character.getNumericValue((Character) test[i]) >= 10 && Character.getNumericValue((Character) test[i]) <= 35) {
					if (((Character) test[i]).toString().equals(((Character) test[i]).toString().toUpperCase())) {
						System.out.println((Character) test[i] + " is een hoofdletter");
					} else {
						System.out.println((Character) test[i] + " is een kleine letter");
					}
				} else {
					if (Character.getNumericValue((Character) test[i]) <= 9 && Character.getNumericValue((Character) test[i]) >= 0) {
						System.out.println("Het is een cijfer");
					} else {
						System.out.println("Het is iets anders");
					}
				}
			} else {
				if (test[i] instanceof Integer) {
					if ((Integer) test[i] < 0) {
						System.out.println(test[i].toString() + " is een integer en de afstand tot het grootste is " + ((Integer) (test[i]) - Integer.MIN_VALUE));
					} else {
						System.out.println(test[i].toString() + " is een integer en de afstand tot het grootste is " + (Integer.MAX_VALUE - (Integer) (test[i])));
					}
				} else {
					if (test[i] instanceof Long) {
						if ((Long) test[i] < 0) {
							System.out.println(test[i].toString() + " is een long en de afstand tot het grootste is " + ((Long) (test[i]) - Long.MIN_VALUE));
						} else {
							System.out.println(test[i].toString() + " is een long en de afstand tot het grootste is " + (Long.MAX_VALUE - (Long) (test[i])));
						}
					} else {
						if (test[i] instanceof Double) {
							int positie = Double.toString((Double) test[i]).indexOf('.');
							System.out.println(test[i].toString() + " is een double het aantal cijfers voor de komma " + positie + " en het aantal cijfers na de komma " + (Double.toString((Double) test[i]).length() - positie - 1));
						} else {
							if (test[i] instanceof Float) {
								int positie = Float.toString((Float) test[i]).indexOf('.');
								System.out.println(test[i].toString() + " is een float het aantal cijfers voor de komma " + positie + " en het aantal cijfers na de komma " + (Float.toString((Float) test[i]).length() - positie - 1));
							}
						}
					}
				}
			}
		}

	}

}
