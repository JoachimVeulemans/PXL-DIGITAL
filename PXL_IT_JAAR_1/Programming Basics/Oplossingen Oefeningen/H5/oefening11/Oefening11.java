package oefening11;

import java.util.Scanner;

public class Oefening11 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int getal, som, negatief;
		getal = 1;
		negatief = 0;
		som = 0;

		while (getal != 0) {
			System.out.println("Geef een getal in:");
			getal = keyboard.nextInt();
			
			som = (som + getal);
			
			if (getal < 0) {
				negatief++;
			}
		}

		System.out.println("De som van de getallen is: " + som + ".");
		System.out.println("Aantal negatieve getallen: " + negatief + ".");

		keyboard.close();
	}
}
