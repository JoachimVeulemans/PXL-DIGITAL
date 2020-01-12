package examen1;

import java.util.Scanner;

public class Vraag3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een tekst in:");
		String tekst = keyboard.nextLine();

		System.out.println("Geef het aantal karakter per lijn");
		int aantalKarakters = keyboard.nextInt();

		while (aantalKarakters > 0) {

			// STREEPJES*****
			StringBuilder streepjes = new StringBuilder("");
			for (int i = 0; i < aantalKarakters; i++) {
				streepjes.append("-");
			}
			System.out.println(streepjes);
			// STREEPJES*****

			// TEKST

			String[] woorden = tekst.split(" ");
			String uitprint = "";
			for (int i = 0; i < woorden.length;) {
				
				if (uitprint.concat(" ").concat(woorden[i]).length() - 1 <= aantalKarakters) {
					uitprint = uitprint.concat(woorden[i]).concat(" ");
					i++;
				} else {
					if (uitprint.equals("")) {
						uitprint = woorden[i];
						i++;
						for (int j = uitprint.length(); j < aantalKarakters; j++) {
							uitprint = " ".concat(uitprint);
						}
						System.out.println(uitprint);
						uitprint = "";
					} else {
						for (int j = uitprint.length(); j <= aantalKarakters; j++) {
							uitprint = " ".concat(uitprint);
						}
						System.out.println(uitprint);
						uitprint = "";
					}

				}

			}
			for (int j = uitprint.length(); j < aantalKarakters; j++) {
				uitprint = " ".concat(uitprint);
			}
			System.out.println(uitprint);

			// TEKST

			System.out.println("Geef het aantal karakters per lijn");
			aantalKarakters = keyboard.nextInt();
		}

		keyboard.close();
	}

}
