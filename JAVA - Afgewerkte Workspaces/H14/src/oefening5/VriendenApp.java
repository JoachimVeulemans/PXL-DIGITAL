package oefening5;

import java.util.Scanner;

public class VriendenApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Vriendengroep vrienden = new Vriendengroep();

		System.out.println("Geef de naam van je vriend in:");
		String naam = keyboard.nextLine();

		while (!naam.equals("stop")) {
			System.out.println("Geef de geboortedatum in dag maand jaar:");
			String datumString = keyboard.nextLine();

			int dag = 0;
			int maand = 0;

			if (datumString.charAt(1) == ' ') {
				dag = Integer.parseInt(datumString.substring(0, 1));
				if (datumString.charAt(3) == ' ') {
					maand = Integer.parseInt(datumString.substring(2, 3));
				} else {
					maand = Integer.parseInt(datumString.substring(2, 4));
				}
			} else {
				dag = Integer.parseInt(datumString.substring(0, 2));
				if (datumString.charAt(4) == ' ') {
					maand = Integer.parseInt(datumString.substring(3, 4));
				} else {
					maand = Integer.parseInt(datumString.substring(3, 5));
				}
			}
			int jaar = Integer.parseInt(datumString.substring(datumString.length() - 4, datumString.length()));

			Persoon persoon = new Persoon(naam, dag, maand, jaar);
			vrienden.voegVriendToe(persoon);

			System.out.println("Geef de naam van je vriend in:");
			naam = keyboard.nextLine();
		}

		System.out.print(vrienden.toString());

		System.out.println("Wil je vrienden verwijderen j/n:");
		char keuze = keyboard.nextLine().charAt(0);

		while (keuze == 'j') {
			if (vrienden.toString().equals("")) {
				System.out.println("Er zijn geen vrienden meer over");
				keuze = 'n';
			} else {
				System.out.println("Geef de naam van de vriend die je wil verwijderen:");
				String input = keyboard.nextLine();

				vrienden.verwijderVriend(input);

				System.out.println("Wil je vrienden verwijderen j/n:");
				keuze = keyboard.nextLine().charAt(0);
			}

		}

		System.out.print(vrienden.toString());

		keyboard.close();
	}

}
