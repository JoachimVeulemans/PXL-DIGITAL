package oefening8;

import java.util.Scanner;

public class Oefening8 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		StringBuilder punt = new StringBuilder(". ");

		System.out.println("Geef de familienaam in:");
		StringBuilder familienaam = new StringBuilder(keyboard.nextLine());

		while (!familienaam.toString().equals("/")) {
			// Om de invoer te laten stoppen door een \ wordt de bovenstaande regel vervangen door:
			// while (!familienaam.toString().equals("\\")) {
			System.out.println("Geef de voornaam in:");
			StringBuilder voornaam = new StringBuilder(keyboard.nextLine());

			System.out.println("Geef de geboortedag (als cijfer) in:");
			int dag = keyboard.nextInt();

			System.out.println("Geef de geboortemaand (als cijfer) in:");
			int maand = keyboard.nextInt();
			keyboard.nextLine();

			String sterrenbeeld = berekeningSterrenbeeld(dag, maand);

			// **Berekening naam**

			String voornaamString = voornaam.substring(0, 1);
			punt.append(familienaam).append(" ");
			voornaamString = voornaamString.concat(punt.toString()).toUpperCase();

			// **Berekening naam**

			System.out.println(voornaamString + sterrenbeeld);

			System.out.println("Geef de familienaam in:");
			familienaam = new StringBuilder(keyboard.nextLine());
		}

		keyboard.close();
	}

	public static String berekeningSterrenbeeld(int dag, int maand) {
		String sterrenbeeld = "";

		String[] sterrenbeelden = { "waterman", "vissen", "ram", "stier", "tweelingen", "kreeft", "leeuw", "maagd",
				"weegschaal", "schorpioen", "boogschutter", "steenbok" };

		if (dag < 21) {
			maand = maand - 2;
		} else {
			maand = maand - 1;
		}

		if (maand < 0) {
			maand = 11;
		}

		sterrenbeeld = sterrenbeelden[maand];

		return sterrenbeeld;
	}

}
