package oefening6;

public class Oefening6 {

	public static void main(String[] args) {
		int[][] punten = { { 12, 4, 12, 9 }, { 14, 5, 9, 11 }, { 8, 9, 7, 12 }, { 7, 12, 11, 10 }, { 11, 18, 10, 14 } };
		int[] laagstePunt = { 20, 20, 20, 20 };
		int[] gemiddelde = new int[4];
		int[] naam = new int[4];

		for (int kolom = 0; kolom < 4; kolom++) {
			for (int rij = 0; rij < 5; rij++) {
				if (punten[rij][kolom] < laagstePunt[kolom]) {
					laagstePunt[kolom] = punten[rij][kolom];
					naam[kolom] = rij;
				}
				gemiddelde[kolom] = gemiddelde[kolom] + punten[rij][kolom];
			}
			gemiddelde[kolom] = gemiddelde[kolom] / 5;
		}

		for (int j = 0; j < 4; j++) {
			int vakNaam = j + 1;
			System.out.println("Het laagste punt voor vak " + vakNaam + " is " + laagstePunt[j]
					+ " behaalt door stud" + (naam[j] + 1) + " met een gemiddelde van " + gemiddelde[j] + ".");
		}
	}
}