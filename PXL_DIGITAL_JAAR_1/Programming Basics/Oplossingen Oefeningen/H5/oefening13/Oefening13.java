package oefening13;

import java.util.Scanner;

public class Oefening13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int getal;
		System.out.println("Geef een getal in:");
		getal = keyboard.nextInt();

		while (getal < 1 || getal > 100) {
			System.out.println("Geef een getal in:");
			getal = keyboard.nextInt();
		}
		System.out.println("Het ingevoerde getal is: " + getal);

		keyboard.close();
	}

}
