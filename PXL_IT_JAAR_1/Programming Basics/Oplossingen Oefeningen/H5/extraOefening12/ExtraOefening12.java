package extraOefening12;

import java.util.Scanner;

public class ExtraOefening12 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int nummer, hoogsteNummer;
		double uurloon, uren, loon, hoogsteLoon;
		hoogsteLoon = 0;
		hoogsteNummer = 0;

		System.out.println("Geef het arbeidersnummer in:");
		nummer = keyboard.nextInt();

		while (nummer != 0) {

			System.out.println("Geef het uurloon in:");
			uurloon = keyboard.nextDouble();

			System.out.println("Geef het aantal gewerkte uren per week in:");
			uren = keyboard.nextDouble();

			loon = (uurloon * uren);

			if (uren > 38) {
				loon = (loon * 1.5);
			}

			if (loon > hoogsteLoon) {
				hoogsteLoon = loon;
				hoogsteNummer = nummer;
			}

			System.out.println("Geef het arbeidersnummer in:");
			nummer = keyboard.nextInt();

		}

		System.out.println("De arbeider met nummer " + hoogsteNummer + " heeft de meeste uren gewerkt.");

		keyboard.close();
	}

}
