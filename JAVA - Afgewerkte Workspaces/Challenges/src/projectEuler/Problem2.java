package projectEuler;

public class Problem2 {

	public static void main(String[] args) {
		int getal1 = 1;
		int getal2 = 1;
		int totaal = 0;
		while (getal1 < 4000000 && getal2 < 4000000) {
			if (getal1 < 4000000) {
				getal1 = getal1 + getal2;
				if (getal1 % 2 == 0) {
					totaal += getal1;
				}
			}
			if (getal2 < 4000000) {
				getal2 = getal1 + getal2;
				if (getal2 % 2 == 0) {
					totaal += getal2;
				}
			}
		}
		System.out.println(totaal);

	}

}
