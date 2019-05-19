package oefening2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class KaartApp {

	public static void main(String[] args) {
		Kaart[] kaarten = new Kaart[52];
		int kaart = 0;

		while (kaart < 51) {
			for (Soort soorten : Soort.values()) {
				for (Ranking rankings : Ranking.values()) {
					kaarten[kaart] = new Kaart(rankings, soorten);
					kaart++;
				}
			}
		}

		Collections.shuffle(Arrays.asList(kaarten));

		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);
		int kaart1;
		int kaart2;
		int count = 0;

		while (count == 0) {

			kaart1 = rand.nextInt(52);
			System.out.println("Geef een kaartnummer in: (1-52)");
			kaart2 = keyboard.nextInt();

			while (kaart1 == kaart2) {
				System.out.println("Geef een ander kaartnummer in: (1-52)");
				kaart2 = keyboard.nextInt();
			}

			keyboard.close();

			if (kaarten[kaart1].getRanking().ordinal() == kaarten[kaart2].getRanking().ordinal()) {
				System.out.println("Geen winnaar!!");
			} else {
				StringBuilder output = new StringBuilder("winnaar ");
				if (kaarten[kaart1].getRanking().ordinal() > kaarten[kaart2].getRanking().ordinal()) {
					output.append("computer ");
					output.append(kaarten[kaart1].getSoort().name().substring(0, 1).toUpperCase())
							.append(kaarten[kaart1].getSoort().name().substring(1).toLowerCase());
					output.append(" ").append(kaarten[kaart1].getRanking().name().toLowerCase()).append("\n");
					output.append("verliezer speler ");
					output.append(kaarten[kaart2].getSoort().name().substring(0, 1).toUpperCase())
							.append(kaarten[kaart2].getSoort().name().substring(1).toLowerCase());
					output.append(" ").append(kaarten[kaart2].getRanking().name().toLowerCase()).append("\n");
				} else {
					output.append("speler ");
					output.append(kaarten[kaart2].getSoort().name().substring(0, 1).toUpperCase())
							.append(kaarten[kaart2].getSoort().name().substring(1).toLowerCase());
					output.append(" ").append(kaarten[kaart2].getRanking().name().toLowerCase()).append("\n");
					output.append("verliezer computer ");
					output.append(kaarten[kaart1].getSoort().name().substring(0, 1).toUpperCase())
							.append(kaarten[kaart1].getSoort().name().substring(1).toLowerCase());
					output.append(" ").append(kaarten[kaart1].getRanking().name().toLowerCase()).append("\n");

				}
				count++;
				System.out.println(output.toString());
			}
		}
	}
}
