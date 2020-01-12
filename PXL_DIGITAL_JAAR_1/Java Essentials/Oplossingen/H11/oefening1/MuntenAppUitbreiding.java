package oefening1;

import java.util.Random;

public class MuntenAppUitbreiding {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] gebruikteMunten = new int[Munt.values().length];
		
		double getal = rand.nextDouble()*10;
		while (getal <= 0 || getal >= 10) {
			System.out.println("Ingegeven getal moet tussen 0 en 10 liggen.");
			System.out.println("Geef een ander getal in euro in:");
			getal = rand.nextDouble();
		}
		
		getal =((int) (((getal + 0.005) * 100))) / 100.0;
		System.out.println("Getal: " + getal);
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
		
		
	}
}
