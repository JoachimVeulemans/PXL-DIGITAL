package oefening24;

import java.util.Scanner;

public class Oefening24 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int aantalFilms, genreNummer, aantalSterren, jaar, speeltijd;
		double totaal = 0;
		double gemiddelde = 0;

		System.out.println("Geef het aantal gehuurde films in:");
		aantalFilms = keyboard.nextInt();

		for (int count = 1; count < aantalFilms + 1; count++) {
			System.out.println("Geef het genrenummer in:");
			genreNummer = keyboard.nextInt();

			System.out.println("Geef het aantal sterren in:");
			aantalSterren = keyboard.nextInt();

			System.out.println("Geef het jaar in:");
			jaar = keyboard.nextInt();

			System.out.println("Geef de speeltijd in:");
			speeltijd = keyboard.nextInt();

			double huurPrijs = berekeningHuurPrijs(genreNummer, aantalSterren, jaar, speeltijd);
			int huurTijd = berekeningHuurTijd(genreNummer, aantalSterren, jaar);
			System.out.print("Film" + count + " €" + huurPrijs + " " + huurTijd + " ");
			if (huurTijd == 1) {
				System.out.println("dag");
			} else {
				System.out.println("dagen");
			}
			totaal = totaal + huurPrijs;
		}
		gemiddelde = (int)((totaal / aantalFilms) * 100) / 100;
		System.out.println("Te betalen: €" + totaal);
		System.out.println("Gemiddelde kostprijs per film: €" + gemiddelde);
		keyboard.close();
	}

	public static double berekeningHuurPrijs(int genreNummer, int aantalSterren, int jaar, int speeltijd) {
		double huurPrijs;

		if ((int) (genreNummer / 10000) == 1) {
			huurPrijs = (0.005 * speeltijd);
		} else {
			switch (aantalSterren) {
			case 5:
			case 4:
				huurPrijs = 4.5;
				break;
			case 3:
			case 2:
				huurPrijs = 3.75;
				break;
			default:
				huurPrijs = 3;
			}
			if ((2017 - jaar) > 10) {
				huurPrijs = huurPrijs - 0.5;
			}
		}

		return huurPrijs;
	}

	public static int berekeningHuurTijd(int genreNummer, int aantalSterren, int jaar) {
		int huurTijd;

		if ((2017 - jaar) < 3 && (aantalSterren == 5 || ((int) (genreNummer / 10000) == 5))) {
			huurTijd = 1;
		} else {
			huurTijd = 2;
		}

		return huurTijd;
	}

}
