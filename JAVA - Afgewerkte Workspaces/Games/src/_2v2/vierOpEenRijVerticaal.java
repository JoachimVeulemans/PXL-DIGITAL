package _2v2;

import java.util.Scanner;

public class vierOpEenRijVerticaal {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String[][] plaatsen = new String[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				plaatsen[i][j] = " ";
			}
		}
		char scheiding = '|';
		char einde = 'k';
		boolean gewonnen = false;
		boolean speler1 = true;
		int speler = 1;
		String teken;
		int nieuwKolom = 0;
		int nieuwRij = 0;

		while (!gewonnen) {
			// TEKENEN
			System.out.println();
			for (int i = 0; i < 8; i++) {
				System.out.print("    " + scheiding);
				for (int j = 0; j < 8; j++) {
					System.out.print((plaatsen[i][j]).charAt(0) + "" + scheiding);
				}
				System.out.println();
			}
			System.out.print("     ");
			for (int i = 0; i < 8; i++) {
				System.out.print(einde + "  ");
			}
			System.out.println();
			// TEKENEN

			if (speler1) {
				speler = 1;
				teken = "x";

			} else {
				speler = 2;
				teken = "o";
			}

			System.out.println("Speler " + speler + ": geef een kolom in:");
			int kolom = keyboard.nextInt();
			while (kolom < 1 || kolom > 8) {
				System.out.println("Kolom is ongeldig!");
				System.out.println("Speler " + speler + ": geef een kolom in:");
				kolom = keyboard.nextInt();
			}
			speler1 = !speler1;

			int i = 0;
			for (i = 7; i >= 0; i--) {
				if (plaatsen[i][kolom - 1].charAt(0) == ' ') {
					plaatsen[i][kolom - 1] = teken;
					nieuwKolom = kolom - 1;
					nieuwRij = i;
					i = -5;
				}
			}

			if (i == -1) {
				System.out.println("De kolom is vol! Kies een andere aub!");
				speler1 = !speler1;
			}

			// CONTROLE WINST HOR
			for (int j = 0; j < 5; j++) {
				if ((plaatsen[nieuwRij][(j + 1)].equals(plaatsen[nieuwRij][(j + 2)])
						&& plaatsen[nieuwRij][(j + 1)].equals(plaatsen[nieuwRij][(j + 3)])
						&& plaatsen[nieuwRij][(j + 1)].equals(plaatsen[nieuwRij][j]))
						&& !(plaatsen[nieuwRij][j].equals(" "))) {
					gewonnen = true;
				}
			}
			// CONTROLE WINST VER
			for (int j = 0; j < 5; j++) {
				if ((plaatsen[(j + 1)][nieuwKolom].equals(plaatsen[(j + 2)][nieuwKolom])
						&& plaatsen[(j + 1)][nieuwKolom].equals(plaatsen[(j + 3)][nieuwKolom])
						&& plaatsen[(j + 1)][nieuwKolom].equals(plaatsen[(j)][nieuwKolom]))
						&& !(plaatsen[(j)][nieuwKolom].equals(" "))) {
					gewonnen = true;
				}
			}

			// CONTROLE WINST DIA
			for (int z = 0; (z < 5); z++) {
				switch (nieuwKolom) {
				case 0:
					if (nieuwRij > 2) {
						// CONTROLE
					}
					break;
				case 1:
					if (nieuwRij > 1) {
						
					}
					break;
				case 2:
					if (nieuwRij > 0) {
						
					}
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				case 6:
					
					break;
				case 7:
					
					break;

				}
			}

		}
		System.out.println("Speler " + speler + " heeft gewonnen!");
		// TEKENEN
		System.out.println();
		for (int i = 0; i < 8; i++) {
			System.out.print("    " + scheiding);
			for (int j = 0; j < 8; j++) {
				System.out.print((plaatsen[i][j]).charAt(0) + "" + scheiding);
			}
			System.out.println();
		}
		System.out.print("     ");
		for (int i = 0; i < 8; i++) {
			System.out.print(einde + "  ");
		}
		System.out.println();
		// TEKENEN
		keyboard.close();
	}

}
