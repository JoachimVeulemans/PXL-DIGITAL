package oefening6;

import java.util.Scanner;

public class Oefening6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef uw volledige naam in:");
		String naam = keyboard.nextLine();
	
		double hoogte = controlerenHoogte();
		double breedte = controlerenBreedte();
		
		System.out.println("Is de kleur 'standaard' of 'anders'?");
		String kleur = keyboard.nextLine();
		
		double oppervlakte = berekeningOppervlakte(hoogte, breedte);
		double gewicht = berekeningGewicht(oppervlakte);
		
		String motornaam;
		if (gewicht < 150) {
			motornaam = "A101";
		} else {
			if (gewicht <= 300) {
				motornaam = "A105";
			} else {
				motornaam = "X300";
			}
		}
		
		double motorPrijs = berekeningMotorPrijs(motornaam);
		double totaalPrijs = berekeningTotaalPrijs(oppervlakte, motorPrijs, kleur);
		String offerteNummer = berekeningOfferteNummer(naam, totaalPrijs);
		
		System.out.println("De offertenummer is " + offerteNummer);
		System.out.println("De oppervlakte is " + oppervlakte);
		System.out.println("Het gewicht is " + gewicht);
		System.out.println("Het type motor is " + motornaam);
		System.out.println("De totaalprijs is €" + totaalPrijs);
		
		keyboard.close();
	}
	
	public static double controlerenHoogte() {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef de hoogte van de poort in m in:");
		double hoogte = keyboard.nextDouble();
		
		while (hoogte < 2 || hoogte > 6.5) {
			System.out.println("De hoogte is niet correct!");
			System.out.println("Geef de hoogte van de poort in m in:");
			hoogte = keyboard.nextDouble();
		}
		
		return hoogte;
	}
	
	public static double controlerenBreedte() {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef de breedte van de poort in m in:");
		double breedte = keyboard.nextDouble();
		
		while (breedte < 2 || breedte > 8) {
			System.out.println("De hoogte is niet correct!");
			System.out.println("Geef de breedte van de poort in m in:");
			breedte = keyboard.nextDouble();
		}
		
		return breedte;
	}
	
	public static double berekeningOppervlakte(double hoogte, double breedte) {
		double oppervlakte = hoogte * breedte;
		return oppervlakte;
	}
	
	public static double berekeningGewicht(double oppervlakte) {
		double gewicht = 11 * oppervlakte;
		return gewicht;
	}
	
	public static double berekeningMotorPrijs(String motornaam) {
		double motorPrijs;
		if (motornaam.equals("A101")) {
			motorPrijs = 120;
		} else {
			if (motornaam.equals("A105")) {
				motorPrijs = 220.5;
			} else {
				motorPrijs = 250.5;
			}
		}
		return motorPrijs;
	}
	
	public static double berekeningTotaalPrijs(double oppervlakte, double motorPrijs, String kleur) {
		double totaalPrijs = (oppervlakte * 113.5) + motorPrijs;
		
		if (kleur.equals("anders")) {
			totaalPrijs = totaalPrijs * 1.1;
		}
		
		return totaalPrijs;
	}
	
	public static String berekeningOfferteNummer(String naam, double totaalPrijs) {
		String prijsString= String.valueOf(totaalPrijs);
		StringBuilder prijsStringBuilder = new StringBuilder(prijsString);
		prijsStringBuilder.reverse();
		String prijs = prijsStringBuilder.toString();
		String offerteNummer = "2016_".concat(naam.toUpperCase()).concat("_").concat(prijs);
	
		return offerteNummer;
	}

}
