package examen2;

import java.util.Random;
import java.util.Scanner;

public class Vraag1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		double gemiddelde = 0;

		System.out.println("Geef het aantal getallen dat random zal berekend worden:");
		int aantalInput = keyboard.nextInt();

		while (aantalInput <= 1) {
			System.out.println("Geef het aantal getallen dat random zal berekend worden:");
			aantalInput = keyboard.nextInt();
		}

		int[] aantal = new int[aantalInput];

		System.out.println("Geef het veelvoud op:");
		int veelvoud = keyboard.nextInt();

		while (veelvoud >= 10) {
			System.out.println("Geef het veelvoud op:");
			veelvoud = keyboard.nextInt();
		}

		for (int i = 0; i < aantal.length; i++) {
			aantal[i] = rand.nextInt(100) + 1;
			while (!(aantal[i] % veelvoud == 0)) {
				aantal[i] = rand.nextInt(100) + 1;
			}
			gemiddelde = gemiddelde + aantal[i];
		}
		
		gemiddelde = gemiddelde / aantalInput;

		System.out.println("De gegenereerde getallen zijn:");
		if (aantalInput % 2 == 0) {
			for (int i = 0; i < aantal.length; i++) {
				System.out.print(aantal[i] + " ");
			}
		} else {
			for (int i = aantal.length - 1; i >= 0; i--) {
				System.out.print(aantal[i] + " ");
			}
		}
		System.out.println();
		System.out.println("De getallen die kleiner zijn dan het gemiddelde:");
		for (int i = 0; i < aantal.length; i++) {
			if (aantal[i] < gemiddelde) {
			System.out.print(aantal[i] + " ");
			}
		}

		keyboard.close();
	}

}
