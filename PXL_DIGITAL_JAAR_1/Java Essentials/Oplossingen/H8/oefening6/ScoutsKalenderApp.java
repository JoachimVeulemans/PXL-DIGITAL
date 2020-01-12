package oefening6;

import java.util.Scanner;

public class ScoutsKalenderApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		Datum datum = new Datum();
		System.out.println("geef een maandnr in");
		datum.setMaand(keyboard.nextInt());
		System.out.println("geef een jaar in");
		datum.setJaar(keyboard.nextInt());

		System.out.println("geef een dag in");
		int dag = keyboard.nextInt();
		keyboard.nextLine();
		int[] actDag = new int[10];
		String[] actNaam = new String[10];
		int count = 0;
		while (dag != 0) {
			System.out.println("geef de activiteit in");
			String activiteit = keyboard.nextLine();

			actDag[count] = dag;
			actNaam[count] = activiteit;

			count++;

			System.out.println("geef een dag in");
			dag = keyboard.nextInt();
			keyboard.nextLine();
		}

		datum.drukKalender(actDag, actNaam);

		keyboard.close();
	}

}
