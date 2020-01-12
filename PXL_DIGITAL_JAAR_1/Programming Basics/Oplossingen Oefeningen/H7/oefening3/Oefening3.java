package oefening3;

import java.util.Scanner;

public class Oefening3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int positiePos = -1;
		int positieNeg = -1;
		int aantalPos = 0;
		int aantalNeg = 0;
		int getal;
		int kleinsteNeg = 999999999;
		int[] getallen = new int[10];

		for (int i = 0; i < getallen.length; i++) {
			getal = i + 1;
			System.out.println("Geef getal " + getal + " in:");
			getallen[i] = keyboard.nextInt();

			if (getallen[i] < 0) {
				aantalNeg++;
			} else {
				aantalPos++;
			}
		}

		int[] pos = new int[aantalPos];
		int[] neg = new int[aantalNeg];

		for (int i = 0; i < getallen.length; i++) {
			if (getallen[i] < 0) {
				positieNeg++;
				neg[positieNeg] = getallen[i];
			} else {
				positiePos++;
				pos[positiePos] = getallen[i];

			}
		}

		System.out.println("Positieve array:");
		for (int j = 0; j < pos.length; j++) {
			System.out.println(pos[j]);
		}

		System.out.println("Negatieve array:");
		for (int k = 0; k < neg.length; k++) {
			System.out.println(neg[k]);

			if (neg[k] < kleinsteNeg) {
				kleinsteNeg = neg[k];
			}
		}

		if (kleinsteNeg == 999999999) {
			System.out.println("Er zijn geen negatieve getallen ingegeven.");
		} else {
			System.out.println("Het kleinste getal (van de neg array) is " + kleinsteNeg);
		}

		keyboard.close();
	}

}
