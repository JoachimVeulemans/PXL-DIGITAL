package oefening7;

public class Oefening7 {

	public static void main(String[] args) {
		int[][] voorraad = { { 45, 102, 19, 55, 0 }, { 79, 47, 58, 22, 46 }, { 109, 33, 112, 0, 0 } };
		int totaal = 0;

		String[] kleuren = { "rode", "witte", "blauwe", "oranje", "zwarte" };
		String[] maten = { "smalls", "mediums", "larges" };

		for (int rij = 0; rij < 3; rij++) {
			for (int kolomTotaal = 0; kolomTotaal < 5; kolomTotaal++) {
				totaal = totaal + voorraad[rij][kolomTotaal];
			}
			for (int kolomControle = 0; kolomControle < 5; kolomControle++) {

				if (voorraad[rij][kolomControle] < (1 / (double) 3 * totaal)) {
					System.out.println("Er moeten " + kleuren[kolomControle] + " " + maten[rij] + " bijbesteld worden.");
				}
			}
			totaal = 0;
		}
	}
}
