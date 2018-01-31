package ProefExamen;

import java.util.Random;
import java.util.Scanner;

public class Opdracht1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int inzet = 10;
		String kleur;
		int ronde = 100;
		int totaal = 0;

		for (int i = 1; i < 37; i++) {
			kleur = afdrukkenGetallenEnKleuren(i);
			System.out.printf("%-3d %-8s", i, kleur);

			if (i % 3 == 0) {
				System.out.println();
			}
		}

		System.out.println("Geef een kleur in:");
		String inputKleur = keyboard.nextLine();
		inputKleur = inputKleur.toUpperCase();

		while (!(inputKleur.equals("ROOD") || inputKleur.equals("ZWART"))) {
			System.out.println("Geef een kleur in:");
			inputKleur = keyboard.nextLine();
			inputKleur = inputKleur.toUpperCase();
		}

		int[] aantalRondesNodig = new int[10];
		for (int spellen = 0; spellen < 100; spellen++) {

			inzet = 10;
			int willekeurig = rand.nextInt(36) + 1;
			kleur = afdrukkenGetallenEnKleuren(willekeurig);
			kleur = kleur.toUpperCase();

			for (int i = 0; i < 100; i++) {

				ronde = 100;
				System.out.println("Inzet ronde " + (i + 1) + ": " + inzet);

				System.out.println(willekeurig + " " + kleur);

				if (kleur.equals(inputKleur)) {
					ronde = i + 1;
					i = 100;
					System.out.println("Gewonnen " + inzet);
					totaal = totaal + 10;
				} else {
					System.out.println("Helaas, probeer nog een keer.");

				}

				inzet = inzet * 2;

				willekeurig = rand.nextInt(36) + 1;
				kleur = afdrukkenGetallenEnKleuren(willekeurig);
				kleur = kleur.toUpperCase();
			}
			if (ronde < 10) {
				aantalRondesNodig[ronde - 1]++;
			} else {
				aantalRondesNodig[9]++;
			}

		}

		for (int aantal = 0; aantal < 10; aantal++) {
			if (aantal == 0) {
				System.out.println("De speler had " + aantalRondesNodig[aantal] + " keer nodig om in " + (aantal + 1)
						+ " ronde te winnen.");
			} else {
				System.out.println("De speler had " + aantalRondesNodig[aantal] + " keer nodig om in " + (aantal + 1)
						+ " rondes te winnen.");
			}
		}
		
		System.out.println("Totaal ingezette bedrag na 100 spelletjes is €" + totaal);

		keyboard.close();
	}

	public static String afdrukkenGetallenEnKleuren(int i) {

		String kleur = "";
		if (i <= 10 || (i > 18 && i < 29)) {
			if (i % 2 == 0) {
				return kleur = "Zwart";
			} else {
				return kleur = "Rood";
			}
		} else {
			if (i % 2 == 0) {
				return kleur = "Rood";
			} else {
				return kleur = "Zwart";
			}
		}

	}

}
