package extraOefening7;

import java.util.Scanner;

public class _2de_oplossing {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int totaal = 0;
		int[] categorie = new int[5];
		
		// OPLOSSINGEN
		String[] oplossingen = new String[5];
		for (int i = 0; i < oplossingen.length; i++) {
			System.out.println("Geef de oplossing voor vraag " + (i + 1));
			oplossingen[i] = keyboard.nextLine();
		}

		// DEELNEMERS
		int[][] deelnemers = new int[100][4];
		System.out.println("Geef de deelnemersnummer in:");
		int deelnemersnummer = keyboard.nextInt();
		for (int i = 0; i < 101; i++) {
		while (deelnemersnummer != 0) {

				deelnemers[i][0] = deelnemersnummer;

				System.out.println("Geef de tijd in waarin de vragen zijn beantwoord:");
				int tijd = keyboard.nextInt();
				keyboard.nextLine();
				
				String[] antwoordenDeelnemer = new String[5];
				for (int j = 0; j < 5; j++) {
					System.out.println("Geef het antwoord van deelnemer " + deelnemersnummer + " op vraag " + (j + 1) + " in:");
					antwoordenDeelnemer[j] = keyboard.nextLine();
				}

				deelnemers[i] = berekeningTijd(tijd, deelnemers[i]);
				
				deelnemers[i] = berekeningScore(oplossingen, antwoordenDeelnemer, tijd, categorie);
				categorie[0] = deelnemers[i][4];
				totaal++;

				System.out.println("Geef de deelnemersnummer in:");
				deelnemersnummer = keyboard.nextInt();
			}
		}

		for (int i = 0; i < totaal; i++) {
			String ptn = Integer.toString(deelnemers[i][4]).concat(" ptn");
			String rij = Integer.toString(i + 1).concat(".");
			System.out.printf("%-5s %-10d %2d m %2d sec   %-10s", rij, deelnemers[i][0], deelnemers[i][2], deelnemers[i][3], ptn);
		}
		System.out.println();
		for (int i = 0; i < 4; i++) {
			double procent = categorie[i + 1] / (double)totaal * 100;
			System.out.print("Aantal deelnemers bij cat" + (i + 1) + " :" + categorie[i + 1] + " dit is goed voor ");
			System.out.printf("%3.2f%% van het totaal.\n", procent);
		}
		
		keyboard.close();
	}

	public static int[] berekeningScore(String[] oplossingen, String[] antwoordenDeelnemer, int tijd, int[] categorie) {
		int score = 0;
		

		for (int i = 0; i < 5; i++) {
			if (antwoordenDeelnemer[i].equals(oplossingen[i])) {
				score += 3;
			} else {
				if (!antwoordenDeelnemer[i].equals("E")) {
					score--;
				}
			}
		}
		
		if (tijd < 100) {
			score += 5;
			categorie[1]++;
		} else {
			if(tijd < 200) {
				score += 2;
				categorie[2]++;
			} else {
				if (tijd < 300) {
					categorie[3]++;
				} else {
					score -= 5;
					categorie[4]++;
				}
			}
		}
		
		categorie[0] = score;
		return categorie;
	}

	public static int[] berekeningTijd(int tijd, int[] deelnemers) {
		deelnemers[2] = tijd / 60;
		deelnemers[3] = tijd - (tijd / 60) * 60;
		return deelnemers;
	}

}
