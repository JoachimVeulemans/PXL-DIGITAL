package _2v2;

import java.util.Scanner;

public class vierOpEenRijBovenaanzicht {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String[][] plaatsen = new String[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
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
		String[] naam = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

		while (!gewonnen) {
			// TEKENEN
			System.out.print("       ");
			for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			}
			System.out.println();
			System.out.print("       ");
			for (int i = 0; i < 10; i++) {
			System.out.print("_ ");
			}
			System.out.println();
			for (int i = 0; i < 10; i++) {
				System.out.print("    " + naam[i] + " " + scheiding);
				for (int j = 0; j < 10; j++) {
					System.out.print((plaatsen[i][j]).charAt(0) + "" + scheiding);
				}
				System.out.println();
			}
			System.out.print("                     ");
			for (int i = 0; i < 9; i++) {
			System.out.print(einde + "   ");
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

			System.out.println("Speler " + speler + ": geef een combinatie in (vb A1):");
			String combinatie = keyboard.nextLine().toUpperCase();
			
			while (!((combinatie.charAt(0) < 75 && combinatie.charAt(0) > 64) && (Integer.parseInt(combinatie.substring(1)) > 0 && Integer.parseInt(combinatie.substring(1)) < 11))) {
				System.out.println("Combinatie is ongeldig!");
				System.out.println("Speler " + speler + ": geef een combinatie in (vb A1):");
				combinatie = keyboard.nextLine().toUpperCase();
			}
			
			int kolom = Integer.parseInt(combinatie.substring(1));
			int rij = 20;
			char rijLetter = combinatie.charAt(0);
			char[] opties = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
			for (int i = 0; i < opties.length; i++) {
				if (rijLetter == opties[i]) {
					rij = i;
				}
			}
			speler1 = !speler1;
			
			if (!plaatsen[rij][kolom - 1].equals(" ")) {
				System.out.println("De positie is al ingevuld! Kies een andere aub!");
				speler1 = !speler1;
			} else {
				plaatsen[rij][kolom - 1] = teken;
			}
			nieuwRij = rij;
			nieuwKolom = kolom - 1;

			// CONTROLE WINST HOR
			for (int j = 0; j < 7; j++) {
				if ((plaatsen[nieuwRij][(j + 1)].equals(plaatsen[nieuwRij][(j + 2)])
						&& plaatsen[nieuwRij][(j + 1)].equals(plaatsen[nieuwRij][(j + 3)])
						&& plaatsen[nieuwRij][(j + 1)].equals(plaatsen[nieuwRij][j]))
						&& !(plaatsen[nieuwRij][j].equals(" "))) {
					gewonnen = true;
				}
			}
			// CONTROLE WINST VER
			for (int j = 0; j < 7; j++) {
				if ((plaatsen[(j + 1)][nieuwKolom].equals(plaatsen[(j + 2)][nieuwKolom])
						&& plaatsen[(j + 1)][nieuwKolom].equals(plaatsen[(j + 3)][nieuwKolom])
						&& plaatsen[(j + 1)][nieuwKolom].equals(plaatsen[(j)][nieuwKolom]))
						&& !(plaatsen[(j)][nieuwKolom].equals(" "))) {
					gewonnen = true;
				}
			}
			
		
		}
		System.out.println("Speler " + speler + " heeft gewonnen!");
		// TEKENEN
		System.out.print("       ");
		for (int i = 1; i < 11; i++) {
		System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("       ");
		for (int i = 0; i < 10; i++) {
		System.out.print("_ ");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print("    " + naam[i] + " " + scheiding);
			for (int j = 0; j < 10; j++) {
				System.out.print((plaatsen[i][j]).charAt(0) + "" + scheiding);
			}
			System.out.println();
		}
		System.out.print("                     ");
		for (int i = 0; i < 9; i++) {
		System.out.print(einde + "   ");
		}
		System.out.println();
		// TEKENEN

		keyboard.close();
	}

}
