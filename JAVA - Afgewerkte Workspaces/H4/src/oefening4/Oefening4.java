package oefening4;

import java.util.Scanner;

public class Oefening4 {

	public static void main(String[] args) {
		int jaar, rating, prijs1, prijs2, prijs;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef het jaar van de film in:");
		jaar = keyboard.nextInt();
		
		System.out.println("Geef een rating (1-5) voor de film:");
		rating = keyboard.nextInt();
		
		if (jaar > 2015) {
			prijs1 = 2;
		} else {
			prijs1 = 0;
		}
		
		
		
		if (rating > 4) {
			prijs2 = 2;
		} else {
			if (rating > 2) {
				prijs2 = 1;
			} else {
				prijs2 = 0;
			}
		}
		
		prijs = prijs1 + prijs2 + 5;
		
		if (prijs > 7) {
			prijs = 7;
		}
		
		System.out.println("De prijs voor de film is:" + prijs + " euro.");
		keyboard.close();
	}

}
