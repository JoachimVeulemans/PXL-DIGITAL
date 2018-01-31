package be.pxl.h4.oef4;

/*Oefening 4
 * 
 * Maak een programma om de aankoopprijs van een DVD te berekenen.
 * Geef via het toetsenbord in van welk jaar de film is en welke rating (getal 1 - 5)
 * De basisprijs is steeds 5 euro
 * Voor een filmp die minder dan 2 jaar oud is, wordt een euro extra betaald
 * Voor films met een rating 4 of 5 betaal je 2 euro meer
 * Druk de prijs van de film af
 * 
 * Uitbreiding:
 *  - Voor films met een rating 3 of 2 betaal je 1 euro meer
 *  - Let erop dat een film nooit meer kost dan 7 euro.*/

import java.util.Scanner;

public class H4Oef4 {
	public static void main(String[] args) {
		//aanmaken van scanner en variabelen
		Scanner keyboard = new Scanner(System.in);
		int prijs = 5, jaar, rating;
		
		//Input vragen van de gebruiker
		System.out.println("Jaar film: ");
		jaar = keyboard.nextInt();
		
		System.out.println("Rating: ");
		rating = keyboard.nextInt();
		
		//Bewerkingen
		if ((2017 - jaar) < 2) {
			prijs += 1;
		}
		
		if (rating >= 4) {
			prijs += 2;
		} else if (rating >= 2) {
			prijs += 1;
		}
		
		if (prijs > 7) {
			prijs = 7;
		}
		
		System.out.println("Prijs film: " + prijs);
		
		keyboard.close();
	}
}
