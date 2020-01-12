package extraOefening21;

import java.util.Scanner;

public class ExtraOefening21 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int rrNummer, wagen, lidMut;
		double afstand;
		int aantalSlachtoffers = 0;
		double aantalMut = 0;

		System.out.println("Geef het rijksregisternummer in:");
		rrNummer = keyboard.nextInt();

		while (rrNummer != 9999) {
			System.out.println("Geef in reanimatie (0) of ziekenwagen (1):");
			wagen = keyboard.nextInt();

			System.out.println("Geef de afstand in km in:");
			afstand = keyboard.nextDouble();

			System.out.println("Geef in lid (1) of geen lid (0) van Mut:");
			lidMut = keyboard.nextInt();

			double teBetalen = berekenen(wagen, lidMut, afstand);
			System.out.println(
					"De rijksregisternummer is " + rrNummer + " en het bedrag te betalen is €" + teBetalen + ".");
			aantalSlachtoffers++;

			if (lidMut == 1) {
				aantalMut++;
			}
			
			System.out.println("Geef het rijksregisternummer in:");
			rrNummer = keyboard.nextInt();
			
		}

		System.out.println("Het aantal vervoerde slachtoffers is " + aantalSlachtoffers + ".");
		if (aantalMut == 0) {
			System.out.println("Het percentage dat lid is van de Mut is 0%.");
		} else {
			aantalMut = (aantalMut / aantalSlachtoffers) * 100;
			System.out.println("Het percentage dat lid is van de Mut is " + aantalMut + "%.");
		}

		keyboard.close();

	}

	public static double berekenen(int wagen, int lidMut, double afstand) {
		double teBetalen;

		if (lidMut == 0) {
			if (wagen == 0) {
				if (afstand < 11) {
					teBetalen = 25;
				} else {
					if (afstand >= 11 && afstand < 20) {
						teBetalen = 25 + (afstand - 11) * 2.25;
					} else {
						teBetalen = 25 + (10 * 2.25) + (afstand - 20) * 1.75;
					}
				}
			} else {
				if (afstand < 11) {
					teBetalen = 20;
				} else {
					if (afstand >= 11 && afstand < 20) {
						teBetalen = 20 + (afstand - 11) * 1.75;
					} else {
						teBetalen = 20 + (10 * 1.75) + (afstand - 20) * 1.15;
					}
				}
			}
		} else {
			if (wagen == 0) {
				if (afstand < 11) {
					teBetalen = 10;
				} else {
					if (afstand >= 11 && afstand < 20) {
						teBetalen = 10 + (afstand - 11) * 0.75;
					} else {
						teBetalen = 10 + (10 * 0.75) + (afstand - 20) * 0.25;
					}
				}
			} else {
				if (afstand < 11) {
					teBetalen = 10;
				} else {
					if (afstand >= 11 && afstand < 20) {
						teBetalen = 10 + (afstand - 11) * 0.75;
					} else {
						teBetalen = 10 + (10 * 0.75) + (afstand - 20) * 0.15;
					}
				}
			}
		}

		return teBetalen;
	}
}