package oefening3;

import java.util.Scanner;

public class Oefening3 {

	public static void main(String[] args) {
		int aantal, eenheidsprijs, totaal, korting, tebetalen;
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef het aantal in:");
		aantal = keyboard.nextInt();
		
		System.out.println("Geef de eenheidsprijs in:");
		eenheidsprijs = keyboard.nextInt();
		
		totaal = (aantal * eenheidsprijs);
		
		if (totaal > 1000) {
			korting = 22;
			tebetalen = (totaal - korting);
		} else {
			if (totaal > 500) {
				korting = 10;
				tebetalen = (totaal - korting);
			} else {
			tebetalen = totaal;
			korting = 0;
		}
		}
		
		System.out.println("De totaalprijs is " + totaal + ".");
		System.out.println("De korting is " + korting + ".");
		System.out.println("Het te betalen bedrag is " + tebetalen + ".");
		
		keyboard.close();	
	}
}