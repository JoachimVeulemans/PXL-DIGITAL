package oefening23;

import java.util.Scanner;

public class Oefening23 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int aantalRegels;

		System.out.println("Geef de grootte van de driehoek in:");
		aantalRegels = keyboard.nextInt();

		driehoekTekenen(aantalRegels);

		keyboard.close();
	}

	public static void driehoekTekenen(int aantalRegels) {
		for (; aantalRegels > 0; aantalRegels--) {

			for (int aantalTekens = aantalRegels; aantalTekens > 0; aantalTekens--) {
				System.out.print("@ ");
			}
			System.out.println("");
		}
	}
}
