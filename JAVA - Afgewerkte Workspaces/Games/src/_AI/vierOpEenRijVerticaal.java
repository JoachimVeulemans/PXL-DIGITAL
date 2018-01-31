package _AI;

import java.util.Random;
import java.util.Scanner;

public class vierOpEenRijVerticaal {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		String[][] plaatsen = new String[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				plaatsen[i][j] = " ";
			}
		}
		char scheiding = '|';
		char einde = 'k';
		String teken;
		int nieuwKolom = 0;
		int nieuwRij = 0;
		int speler = 0;
		int teller = 0;

		for (int oneindig = 0; oneindig < 999; oneindig++) {
			if (teller == 100) {
				oneindig = 1000;
			}
			
			
			if (oneindig % 2 == 0) {
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

				teken = "x";
				speler = 1;

				System.out.println("Speler: geef een kolom in:");
				int kolom = keyboard.nextInt();
				while (kolom < 1 || kolom > 8) {
					System.out.println("Kolom is ongeldig!");
					System.out.println("Speler: geef een kolom in:");
					kolom = keyboard.nextInt();
				}

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
					oneindig = 333;
				}

				// CONTROLE WINST HOR
				for (int j = 0; j < 5; j++) {
					if ((plaatsen[nieuwRij][(j + 1)].equals(plaatsen[nieuwRij][(j + 2)])
							&& plaatsen[nieuwRij][(j + 1)].equals(plaatsen[nieuwRij][(j + 3)])
							&& plaatsen[nieuwRij][(j + 1)].equals(plaatsen[nieuwRij][j]))
							&& !(plaatsen[nieuwRij][j].equals(" "))) {
						oneindig = 1000;
					}
				}
				// CONTROLE WINST VER
				for (int j = 0; j < 5; j++) {
					if ((plaatsen[(j + 1)][nieuwKolom].equals(plaatsen[(j + 2)][nieuwKolom])
							&& plaatsen[(j + 1)][nieuwKolom].equals(plaatsen[(j + 3)][nieuwKolom])
							&& plaatsen[(j + 1)][nieuwKolom].equals(plaatsen[(j)][nieuwKolom]))
							&& !(plaatsen[(j)][nieuwKolom].equals(" "))) {
						oneindig = 1000;
					}
				}
			}
			if (!(oneindig % 2 == 0) && oneindig != 333) {
				int kolom = 0;
				teken = "o";
				speler = 2;
				boolean drieOpRij = false;

				// CONTROLE WINST HOR
				int gevaarRij = 20;
				for (int j = 0; j < 5; j++) {
					if ((plaatsen[nieuwRij][(j + 1)].equals(plaatsen[nieuwRij][(j + 2)])
							&& plaatsen[nieuwRij][(j + 1)].equals(plaatsen[nieuwRij][j]))
							&& !(plaatsen[nieuwRij][j].equals(" "))) {
						drieOpRij = true;
						gevaarRij = j;
					}
				}

				// CONTROLE WINST VER
				int gevaarKolom = 20;
				for (int k = 0; k < 5; k++) {
					if ((plaatsen[(k + 2)][nieuwKolom].equals(plaatsen[(k + 3)][nieuwKolom])
							&& plaatsen[(k + 2)][nieuwKolom].equals(plaatsen[(k + 1)][nieuwKolom]))
							&& !(plaatsen[(k + 1)][nieuwKolom].equals(" "))) {
						if ((plaatsen[0] [nieuwKolom].equals(" "))) {
							drieOpRij = true;
							gevaarKolom = nieuwKolom;
						}

					}
				}

				if (drieOpRij == true) {
					if (gevaarRij != 20) {
						kolom = gevaarRij + 3;
					} else {
						kolom = gevaarKolom;
					}
				} else {
					kolom = rand.nextInt(8);
				}

				int i = 0;
				for (i = 7; i >= 0; i--) {
					if (plaatsen[i][kolom].charAt(0) == ' ') {
						plaatsen[i][kolom] = teken;
						nieuwKolom = kolom;
						nieuwRij = i;
						i = -5;
					}
				}

				if (i == -1) {
					oneindig--;
					teller++;
				}

				// CONTROLE WINST HOR
				for (int j = 0; j < 5; j++) {
					if ((plaatsen[nieuwRij][(j + 1)].equals(plaatsen[nieuwRij][(j + 2)])
							&& plaatsen[nieuwRij][(j + 1)].equals(plaatsen[nieuwRij][(j + 3)])
							&& plaatsen[nieuwRij][(j + 1)].equals(plaatsen[nieuwRij][j]))
							&& !(plaatsen[nieuwRij][j].equals(" "))) {
						oneindig = 1000;
					}
				}
				// CONTROLE WINST VER
				for (int j = 0; j < 5; j++) {
					if ((plaatsen[(j + 1)][nieuwKolom].equals(plaatsen[(j + 2)][nieuwKolom])
							&& plaatsen[(j + 1)][nieuwKolom].equals(plaatsen[(j + 3)][nieuwKolom])
							&& plaatsen[(j + 1)][nieuwKolom].equals(plaatsen[(j)][nieuwKolom]))
							&& !(plaatsen[(j)][nieuwKolom].equals(" "))) {
						oneindig = 1000;
					}
				}
			}

		}
		if (speler == 1) {
			System.out.println("U heeft gewonnen!");
		} else {
			System.out.println("De computer heeft gewonnen!");
		}

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
