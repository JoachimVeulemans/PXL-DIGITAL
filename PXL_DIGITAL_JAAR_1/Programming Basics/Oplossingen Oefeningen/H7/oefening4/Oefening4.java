package oefening4;

import java.util.Scanner;

public class Oefening4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int[] stemmenKandidaten = new int[4];
		int keuze;
		int totaalStemmen = 0;
		double procent;

		System.out.println("Geef het nummer van jouw gekozen kandidaat in:");
		keuze = keyboard.nextInt();

		while (keuze != 0) {
			
			keuze = keuze - 1;
			stemmenKandidaten[keuze] = stemmenKandidaten[keuze] + 1;

			totaalStemmen++;

			System.out.println("Geef het nummer van jouw gekozen kandidaat in:");
			keuze = keyboard.nextInt();
		}

		procent = (double) ((int) ((stemmenKandidaten[0] / (double) totaalStemmen) * 1000) / 10);
		System.out.println("Er waren " + stemmenKandidaten[0] + " stemmen voor An Janssen, dit is goed voor " + procent + "% van de stemmen.");
		procent = (double) ((int) ((stemmenKandidaten[1] / (double) totaalStemmen) * 1000) / 10);
		System.out.println("Er waren " + stemmenKandidaten[1] + " stemmen voor Bart Vriends, dit is goed voor " + procent + "% van de stemmen.");
		procent = (double) ((int) ((stemmenKandidaten[2] / (double) totaalStemmen) * 1000) / 10);
		System.out.println("Er waren " + stemmenKandidaten[2] + " stemmen voor Andries Michels, dit is goed voor " + procent + "% van de stemmen.");
		procent = (double) ((int) ((stemmenKandidaten[3] / (double) totaalStemmen) * 1000) / 10);
		System.out.println("Er waren " + stemmenKandidaten[3] + " stemmen voor Inge Kaas, dit is goed voor " + procent + "% van de stemmen.");

		keyboard.close();
	}

}
