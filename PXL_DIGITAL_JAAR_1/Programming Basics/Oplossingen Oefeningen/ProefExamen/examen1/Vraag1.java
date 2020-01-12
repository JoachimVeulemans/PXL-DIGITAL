package examen1;

import java.util.Scanner;

public class Vraag1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int[] arrayTemperatuur = new int[7];
		String[] arrayNeerslag = { "", "", "", "", "", "", "", "" };
		int laagsteT = 1000;
		int gemiddelde = 0;
		int dagenVeel = 0;

		for (int dag = 0; dag < 7; dag++) {
			System.out.println("Geef de hoeveelheid neerslag in:");
			String neerslag = keyboard.nextLine();

			if (!neerslag.equals("overvloed")) {

				System.out.println("Geef de temperatuur in:");
				int temperatuur = keyboard.nextInt();
				keyboard.nextLine();

				arrayNeerslag[dag] = neerslag;
				arrayTemperatuur[dag] = temperatuur;

				if (temperatuur < laagsteT) {
					laagsteT = temperatuur;
				}

				if (neerslag.equals("veel")) {
					dagenVeel++;
				}

				gemiddelde = gemiddelde + temperatuur;

			} else {
				dag = 20;
			}

		}

		String activiteit = berekeningActiviteit(arrayNeerslag, arrayTemperatuur, laagsteT, dagenVeel, gemiddelde);

		if (!arrayNeerslag[0].equals("")) {
			System.out.printf("%5s %20s %20s\n", "dag", "temperatuur", "neerslag");
			for (int i = 0; i < arrayNeerslag.length; i++) {
				System.out.printf("%5d %20d %20s\n", (i + 1), arrayTemperatuur[i], arrayNeerslag[i]);

				if (arrayNeerslag[i + 1].equals("")) {
					i = 20;
				}
			}
		}
		System.out.println(activiteit);

		keyboard.close();
	}

	public static String berekeningActiviteit(String[] neerslag, int[] temperatuur, int laagsteT, int dagenVeel,
			int gemiddelde) {
		String activiteit;

		if (neerslag[6].equals("")) {
			return activiteit = "We blijven thuis.";
		} else {
			if ((laagsteT <= 15) && (dagenVeel == 0) && (laagsteT > (0.2 * gemiddelde))) {
				return activiteit = "We gaan op tweedaagse.";
			} else {
				return activiteit = "We gaan op daguitstap.";
			}
		}
	}

}
