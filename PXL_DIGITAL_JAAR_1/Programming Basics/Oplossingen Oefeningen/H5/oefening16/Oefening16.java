package oefening16;

import java.util.Scanner;

public class Oefening16 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int nummer, tijd, snelsteNummer, snelsteTijd, totaalRenners;
		double langerDanUur;
		snelsteTijd = 1000000000;
		snelsteNummer = 0;
		langerDanUur = 0;
		totaalRenners = 0;

		System.out.println("Geef het inschrijvingsnummer van de renner in:");
		nummer = keyboard.nextInt();

		while (nummer > 0) {
			System.out.println("Geef de tijd in seconden van de renner in:");
			tijd = keyboard.nextInt();

			if (tijd < snelsteTijd) {
				snelsteTijd = tijd;
				snelsteNummer = nummer;
			}

			if (tijd > 3600) {
				langerDanUur++;
			}

			totaalRenners++;

			System.out.println("Geef het inschrijvingsnummer van de renner in:");
			nummer = keyboard.nextInt();
		}

		langerDanUur = ((langerDanUur / totaalRenners) * 100);

		int uren, minuten;

		uren = (snelsteTijd / 3600);
		snelsteTijd = snelsteTijd - (uren * 3600);
		minuten = (snelsteTijd / 60);
		snelsteTijd = snelsteTijd - (minuten * 60);

		System.out.println("De snelste renner is de renner met inschrijvingsnummer " + snelsteNummer + ".");
		System.out.println("Het percentage van de renners dat er langer dan 1 uur over doet is " + langerDanUur + "%.");

		System.out.print("De tijd van de snelste renner is " + uren);
		if (uren == 0 || uren == 1) {
			System.out.print(" uur, " + minuten);
		} else {
			System.out.print(" uren, " + minuten);
		}

		if (minuten == 1) {
			System.out.print(" minuut en " + snelsteTijd);
		} else {
			System.out.print(" minuten en " + snelsteTijd);
		}

		if (snelsteTijd == 1) {
			System.out.print(" seconde.");
		} else {
			System.out.print(" seconden.");
		}

		keyboard.close();
	}
}
