package oefening3;

import java.util.Scanner;

public class Oefening3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float afgKm, verbruik, prijsL, totaal, perKm;
		
		System.out.println("Geef het aantal afgelegde km per jaar in:");
		afgKm = keyboard.nextFloat();
		
		System.out.println("Geef het verbruik in L per 100 km in:");
		verbruik = keyboard.nextFloat();
		
		System.out.println("Geef de prijs van 1L brandstof in:");
		prijsL = keyboard.nextFloat();
		
		totaal = ((afgKm * (verbruik / 100)) * prijsL);
		perKm = (totaal / afgKm);
		
		System.out.println("De totale verbruikskosten zijn €" + totaal);
		System.out.println("De kostprijs per kilometer is €" + perKm);
		
		keyboard.close();
	}
}
