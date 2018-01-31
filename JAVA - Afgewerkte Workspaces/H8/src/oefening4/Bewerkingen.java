package oefening4;

import java.util.Scanner;

public class Bewerkingen {

	public void trekAf(double getal1, double getal2) {
		double uitkomst = getal2 - getal1;
		if (getal2 < 0) {
			System.out.printf("%.2f + %.2f = %.2f\n", getal2, getal1, uitkomst);
		} else {
			System.out.printf("%.2f - %.2f = %.2f\n", getal2, getal1, uitkomst);
		}

	}

	public void trekAf(int getal1, int getal2) {
		int uitkomst = getal2 - getal1;
		if (getal2 < 0) {
			System.out.printf("%d + %d = %d\n", getal2, getal1, uitkomst);
		} else {
			System.out.printf("%d - %d = %d\n", getal2, getal1, uitkomst);
		}

	}

	public void telOp(double getal1, double getal2) {
		double uitkomst = getal1 + getal2;

		if (getal2 < 0) {
			System.out.printf("%.2f - %.2f = %.2f\n", getal2, getal1, uitkomst);
		} else {
			System.out.printf("%.2f + %.2f = %.2f\n", getal2, getal1, uitkomst);
		}
	}

	public void telOp(double... getallen) {
		double uitkomst = 0;
		StringBuilder tekst = new StringBuilder("");
		for (int i = 0; i < getallen.length; i++) {
			uitkomst += getallen[i];
			getallen[i] = ((int) (getallen[i] * 100) / 100.0);
			if (i == 0) {
				tekst.append(getallen[i]);
			} else {
				if (getallen[i] < 0) {
					tekst.append(" " + getallen[i]);
				} else {
					tekst.append(" + " + getallen[i]);
				}
			}

		}
		uitkomst = (int) (uitkomst * 100) / 100.0;
		tekst.append(" = " + uitkomst);
		System.out.println(tekst);
	}

	public void deel(int getal1, int getal2) {
		if (getal2 == 0) {
			System.out.println("Kan niet delen door 0!");
		} else {
			double uitkomst = (double) getal1 / getal2;
			System.out.printf("%d / %d = %.2f\n", getal2, getal1, uitkomst);
		}
	}

	public void faculteit(int getal) {
		Scanner keyboard = new Scanner(System.in);
		while (getal < 0 || getal > 20) {
			if (getal < 0) {
				System.out.println("Kan de faculteit niet berekenen van een negatief getal, geef een nieuw in:");
				getal = keyboard.nextInt();
			} else {
				System.out.println("Kan de faculteit niet berekenen, geef een nieuw in:");
				getal = keyboard.nextInt();
			}
		}
		long uitkomst = 1;
		for (int i = getal; i > 0; i--) {
			uitkomst = uitkomst * i;
		}

		System.out.println(uitkomst);
	}
}
