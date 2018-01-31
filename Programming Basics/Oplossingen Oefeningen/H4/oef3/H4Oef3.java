package be.pxl.h4.oef3;

/*Oefening 3
 * 
 * Maak een programma om he tte betalen bedrag te berekenen van aangekochten goederen.
 * Geef via het toetsenbord een aantal en een eenheidsprijs in. Bereken vervolgens:
 * 	- De totaalprijs van de goederen
 * 	- Een mogelijke korting= bij een totaalprijs van meer dan 500 wordt een korting
 * 	  van 10 euro toegekend.
 * 	- te betalen bedrag
 * 
 * Druk deze bedragen af met bijhorende tekst
 * 
 * Uitbreiding:
 * 	- vanaf een  totaalprijs van 1000 euro wordt een korting van 22 euro toegekend.*/

import java.util.Scanner;

public class H4Oef3 {
	public static void main(String[] args) {
		//aanmaken variabelen
		int aantal_producten, eenheidsprijs, totaalprijs;
		
		//Scanner aanmaken
		Scanner keyboard = new Scanner(System.in);
		
		//Gegevens opvragen en opslagen
		System.out.println("Aantal producten: ");
		aantal_producten = keyboard.nextInt();
		
		System.out.println("Eenheidsprijs: ");
		eenheidsprijs = keyboard.nextInt();
		
		totaalprijs = aantal_producten * eenheidsprijs;
		
		//if testen die controleren of de prijs hoger is dan 1000, zoniet dan kijken we voor 500, zoniet handelen we al de rest af in de else.
		if(totaalprijs > 1000) {
			totaalprijs -= 22;
			System.out.println("U krijgt een korting van €22 toegekend.");
			System.out.println("Te betalen bedrag: €" + totaalprijs);
			
		} else if(totaalprijs > 500) {
			totaalprijs -= 10;
			System.out.println("U krijgt een korting van €10 toegekend.");
			System.out.println("Te betalen bedrag: €" + totaalprijs);
			
		} else {
			System.out.println("Te betalen bedrag: €" + totaalprijs);
		}
		
		keyboard.close();
	}

}
