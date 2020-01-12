package oefening19;

import java.util.Scanner;

public class Oefening19 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int aantalRegels;

		System.out.println("Geef de grootte van de driehoek in:");
		aantalRegels = keyboard.nextInt();

		for (; aantalRegels > 0; aantalRegels--) {

			for (int aantalTekens = aantalRegels; aantalTekens > 0; aantalTekens--) {
				System.out.print("@ ");
			}
			System.out.println("");
		}

		keyboard.close();
	}
}
