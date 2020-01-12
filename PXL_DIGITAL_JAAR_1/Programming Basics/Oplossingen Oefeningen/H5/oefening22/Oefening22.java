package oefening22;

import java.util.Scanner;

public class Oefening22 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double lengte, breedte;
		int literPerPot;

		System.out.println("Geef de lengte van het plafond in:");
		lengte = keyboard.nextDouble();

		System.out.println("Geef de breedte van het plafond in:");
		breedte = keyboard.nextDouble();

		double aantalLiter = berekeningAantalLiter(breedte, lengte);
		System.out.println("Je hebt " + aantalLiter + "L nodig om het plafond te verven.");

		System.out.println("Per hoeveel liter worden de potten verf verkocht?");
		literPerPot = keyboard.nextInt();

		int aantalPotten = berekeningLiterPerPot(aantalLiter, literPerPot);
		if (aantalPotten == 1) {
			System.out.println("Je hebt " + aantalPotten + " pot nodig.");
		} else {
			System.out.println("Je hebt " + aantalPotten + " potten nodig.");
		}

		keyboard.close();
	}

	public static double berekeningAantalLiter(double breedte, double lengte) {
		double aantalLiter = (breedte * lengte / 7);
		return aantalLiter;
	}

	public static int berekeningLiterPerPot(double aantalLiter, int literPerPot) {
		int aantalPotten = (((int) aantalLiter / literPerPot) + 1);
		return aantalPotten;
	}

}
