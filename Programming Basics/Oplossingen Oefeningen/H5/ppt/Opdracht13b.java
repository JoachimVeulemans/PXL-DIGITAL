package ppt;

import java.util.Scanner;

public class Opdracht13b {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int getal;

		// DO WHILE
		System.out.println("Getal testen met do while:");
		do {
			System.out.println("Geef een getal in:");
			getal = keyboard.nextInt();
		} while (getal > 10 || getal < 0);
		System.out.println("Het getal is " + getal + ".");

		// WHILE
		System.out.println("Getal testen met while:");
		System.out.println("Geef een getal in:");
		getal = keyboard.nextInt();
		while (getal > 10 || getal < 0) {
			System.out.println("Geef een getal in:");
			getal = keyboard.nextInt();
		}
		System.out.println("Het getal is " + getal + ".");

		keyboard.close();
	}

}
