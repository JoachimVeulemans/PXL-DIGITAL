package oefening7;

import java.util.Scanner;

public class Oefening7 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int afstand;
		byte klasse;
		double prijs;
		int prijsshow;

		System.out.println("Geef het aantal km van de vlucht in:");
		afstand = keyboard.nextInt();

		System.out.println("Geef de klasse van uw vlucht in:");
		klasse = keyboard.nextByte();

		if (afstand < 1000) {
			prijs = (afstand * 0.25);
		} else if (afstand > 2999) {
			prijs = (afstand * 0.12);
		} else {
			prijs = (afstand * 0.20);
		}

		if (klasse == 2) {
			prijs = (prijs - (prijs * 0.2));
		}

		else {
			if (klasse == 3) {
				prijs = (prijs + (prijs * 0.3));
			}
		}

		prijsshow = (int) prijs;
		System.out.println("De totaalprijs van uw vlucht is €" + prijsshow + ".");

		keyboard.close();
	}

}
