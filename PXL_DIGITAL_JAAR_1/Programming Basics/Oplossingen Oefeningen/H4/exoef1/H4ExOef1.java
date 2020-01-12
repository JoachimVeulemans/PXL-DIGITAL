package be.pxl.h4.exoef1;

/*Extra oefening 1
 * 
 * Geef 2 getallen in via het toetsenbord. Maak een afdruk als volgt:
 * 	het kleinste getal is ...
 * 	Het kwadraat van het kleinste getal is ...*/

import java.util.Scanner;

public class H4ExOef1 {
	public static void main(String[] args) {
		//Scanner en variabelen aanmaken
		Scanner keyboard = new Scanner(System.in);
		int a, b, kleinste_getal, kwadraat_kleinste_getal;
		
		//Input vragen van de gebruiker
		System.out.println("Getal a: ");
		a = keyboard.nextInt();
		
		System.out.println("Getal b: ");
		b = keyboard.nextInt();
		
		//Bepalen welk getal het kleinste is
		if (a > b) {
			kleinste_getal = b;
		} else {
			kleinste_getal = a;
		}
		
		//Kwadraat berekenen en kleinste getal en zijn kwadraat uitrekenen
		kwadraat_kleinste_getal = kleinste_getal * kleinste_getal; // Opgelost zonder de math klasse - normaal wordt die voor deze berekening gebruikt.
		System.out.println("Het kleinste getal is " + kleinste_getal);
		System.out.println("Het kwadraat van het kleinste getal is " + kwadraat_kleinste_getal);
		
		keyboard.close();
	}
}
