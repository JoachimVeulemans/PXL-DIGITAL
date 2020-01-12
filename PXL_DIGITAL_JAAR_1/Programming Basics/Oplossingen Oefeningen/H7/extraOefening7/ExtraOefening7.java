package extraOefening7;

import java.util.Scanner;

public class ExtraOefening7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String[] oplossing = new String[5];
		int tijd;
		int opsomming = -1;
		int[][] voorAfdruk = new int[100][4];
		int[] deelnemersEnScoreTeruggeef = new int[5];

		// OPLOSSINGEN
		for (int i = 0; i < oplossing.length; i++) {
			System.out.println("Geef de juiste oplossing van vraag " + (i + 1));
			oplossing[i] = keyboard.nextLine();
		}

		// INGAVE NUMMER
		System.out.println("Geef het deelnemersnummer in:");
		int nummer = keyboard.nextInt();
		keyboard.nextLine();

		// CONTROLE NUMMER
		while (nummer != 0) {

			// INGAVE TIJD
			System.out.println("Geef de tijd waarin de vragen zijn beantwoord in:");
			tijd = keyboard.nextInt();
			keyboard.nextLine();

			// INGAVE EN BEREKENING SCORE
			int[] deelnemersEnScore = berekeningScore(oplossing, tijd, deelnemersEnScoreTeruggeef);
			deelnemersEnScoreTeruggeef = deelnemersEnScore;

			// BEREKENING TIJD
			int[] minutenEnSeconden = berekeningMinutenEnSeconden(tijd);
			int minuten = minutenEnSeconden[0];
			int seconden = minutenEnSeconden[1];

			// OPSLAAN VAN GEGEVENS VOOR AFDRUK LATER
			opsomming++;
			voorAfdruk[opsomming][0] = nummer;
			voorAfdruk[opsomming][1] = deelnemersEnScore[0];
			voorAfdruk[opsomming][2] = minuten;
			voorAfdruk[opsomming][3] = seconden;

			// INGAVE NUMMER
			System.out.println("Geef het deelnemersnummer in:");
			nummer = keyboard.nextInt();
			keyboard.nextLine();
		}

		String lijstNummer;
		String ptn;
		// AFDRUKKEN VAN ARRAY VAN GEGEVENS DEELNEMERS
		for (int i = 0; i <= opsomming; i++) {
			lijstNummer = Integer.toString(i + 1).concat(".");
			ptn = Integer.toString(voorAfdruk[i][1]).concat(" ptn");
			System.out.printf("%-10s %-10d %2d m %2d sec    %-10s\n", lijstNummer, voorAfdruk[i][0], voorAfdruk[i][2],
					voorAfdruk[i][3], ptn);
		}

		// AFDRUKKEN DEELNEMERS
		double totaalBeantwoord = 0;
		for (int k = 1; k < 5; k++) {
			totaalBeantwoord = totaalBeantwoord + deelnemersEnScoreTeruggeef[k];
		}

		for (int j = 1; j < 5; j++) {
			System.out.print("Het aantal deelnemers bij cat" + j + " was " + deelnemersEnScoreTeruggeef[j] + ".");
			double procent = (deelnemersEnScoreTeruggeef[j] / totaalBeantwoord) * 100;
			System.out.printf(" Dit is goed voor %2.2f%s\n", procent, "%.");
		}

		keyboard.close();
	}

	public static int[] berekeningScore(String[] oplossing, int tijd, int[] deelnemers) {
		Scanner keyboard = new Scanner(System.in);
		int score = 10;

		// INGAVE ANTWOORDEN
		for (int i = 0; i < 5; i++) {
			System.out.println("Geef het antwoord op vraag " + (i + 1) + " in:");
			String temp = keyboard.nextLine();
			// PUNTEN GEVEN
			if (!temp.equals("E")) {
				if (temp.equals(oplossing[i])) {
					score = score + 3;
				} else {
					score = score - 1;
				}
			}
		}

		// PUNTEN GEVEN OP BASIS VAN TIJD
		if (tijd < 100) {
			score = score + 5;
			deelnemers[1]++;
		} else {
			if (tijd < 200) {
				score = score + 2;
				deelnemers[2]++;
			} else {
				if (tijd < 300) {
					deelnemers[3]++;
				} else {
					deelnemers[4]++;
					score = score - 5;
				}
			}
		}

		deelnemers[0] = score;
		return deelnemers;
	}

	public static int[] berekeningMinutenEnSeconden(int totaal) {
		int[] tijd = new int[2];

		tijd[0] = (totaal / 60);
		tijd[1] = totaal - (tijd[0] * 60);

		return tijd;
	}

}
