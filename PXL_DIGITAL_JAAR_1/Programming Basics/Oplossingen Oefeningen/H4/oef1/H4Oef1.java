package be.pxl.h4.oef1;

/*Oefening 1
 * 
 * Schrijf een programma dat de totale inkomprijs berekent
 * voor een gezin voor een pretpark. Via het toetsenbord
 * wordt het aantal volwassenen en het aantal kinderen 
 * ingevoerd. Voor een volwassene is de inkomprijs 28
 * euro, voor een kind 15 euro. Druk het te betalen bedrag af*/

import java.util.Scanner;

public class H4Oef1 {

	public static void main(String[] args) {
		
		//Prijsvariabelen
		int prijs_volwassene = 28;
		int prijs_kind = 15;
		
		//Creatie van de scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Input vragen en opslaan
		System.out.println("Welkom in ons pretpark");
		
		System.out.println("Aantal -16 jarigen:");
		int aantal_kinderen = keyboard.nextInt();
		
		System.out.println("Aantal 16+ jarigen:");
		int aantal_volwassenen = keyboard.nextInt();
		
		//totaalprijs berekenen en uitprinten
		int kostprijs = (aantal_kinderen * prijs_kind) + (aantal_volwassenen * prijs_volwassene);
		
		System.out.println("De kostprijs bedraagt €"+ kostprijs + ".");
		
		//keyboard sluiten
		keyboard.close();
	}
}
