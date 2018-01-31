package extraOefening6;

import java.util.Scanner;

public class ExtraOefening6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double gewicht, bedrag;

		System.out.println("Geef het gewicht van de brief in:");
		gewicht = keyboard.nextDouble();

		if (gewicht <= 20) {
			bedrag = 0.3;
		} else {
			if (gewicht <= 50) {
				bedrag = 0.5;
			} else {
				if (gewicht <= 150) {
					bedrag = 0.7;
				} else {
					if (gewicht <= 250) {
						bedrag = 1.0;
					} else {
						bedrag = 1.9;
					}
				}
			}
		}

		System.out.println("Het bedragt te betalen is €" + bedrag + ".");

		keyboard.close();
	}

}
