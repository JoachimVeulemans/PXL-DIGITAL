package oefening20;

import java.util.Scanner;

public class Oefening20 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		long getal;

		System.out.println("Geef een getal in:");
		getal = keyboard.nextLong();

		while (getal != 0) {
			long faculteit = berekening(getal);
			System.out.println("De faculteit is " + faculteit + ".");
			System.out.println("Geef een getal in:");
			getal = keyboard.nextInt();
		}

		keyboard.close();
	}

	public static long berekening(long getal) {
		long faculteit = 1;
			for (; getal > 1; getal--) {
				faculteit = faculteit * getal;
			}
		return faculteit;
	}
}