package oefening1;

import java.util.Scanner;

public class MuntenApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een getal in euro in:");
		double getal = keyboard.nextDouble();
		int[] gebruikteMunten = new int[Munt.values().length];
		
		while (getal <= 0 || getal >= 10) {
			System.out.println("Ingegeven getal moet tussen 0 en 10 liggen.");
			System.out.println("Geef een ander getal in euro in:");
			getal = keyboard.nextDouble();
		}
		
		getal =((int) (((getal + 0.005) * 100))) / 100.0;
		getal = getal * 100;
		
		while (getal != 0) {
			for (Munt munt : Munt.values()) {
				while (munt.getWaarde() <= getal) {
					getal = getal - munt.getWaarde();
					gebruikteMunten[munt.ordinal()]++;
				}
			}
		}
		
		for (Munt munt : Munt.values()) {
			if (gebruikteMunten[munt.ordinal()] != 0) {
				System.out.println("Munt van " + munt.name().substring(1) + ": " + gebruikteMunten[munt.ordinal()] + " keer");
			}
			
		}
		
		keyboard.close();
	}
}
