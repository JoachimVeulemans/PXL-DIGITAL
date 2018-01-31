package oefening6;

import java.util.Scanner;

public class Oefening6 {

	public static void main(String[] args) {
		int aantal;
		float prijs;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hoeveel artikel wilt u bestellen?");
		aantal = keyboard.nextInt();

		prijs = (float)((0.21 * (11.5 * aantal)) + (11.5 * aantal));

		if (prijs > 1000) {
			prijs = (prijs - (prijs / 10));
		}

		System.out.println("De prijs bedraagt €" + prijs);

		keyboard.close();
	}
}