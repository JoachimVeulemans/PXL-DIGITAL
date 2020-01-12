package oefening1;

import java.util.Scanner;

public class Oefening1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int[] getallen = new int[15];
		double totaal = 0;
		int getal;

		for (int i = 0; i < getallen.length; i++) {
			getal = i + 1;
			System.out.println("Geef een getal " + getal + " in:");
			getallen[i] = keyboard.nextInt();
			totaal = totaal + getallen[i];
		}

		double gemiddelde = (double) ((int) (totaal / getallen.length * 10) / 10);
		System.out.println("Het gemiddelde is " + gemiddelde);

		int aantalKleinerGemiddelde = 0;
		for (int i = 0; i < getallen.length; i++) {
			if (getallen[i] < gemiddelde) {
				aantalKleinerGemiddelde++;
			}
		}

		System.out.println("Er zijn " + aantalKleinerGemiddelde + " getallen kleiner dan het gemiddelde");

		double procent = (double)aantalKleinerGemiddelde / getallen.length * 100;
		System.out.println("Dit is gelijk aan " + procent + "%.");

		keyboard.close();
	}

}
