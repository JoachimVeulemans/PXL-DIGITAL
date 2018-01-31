package be.pxl.h4.oef2;

/*Oefening 2
 * 
 * Geef 2 getallen a en b in, trek het kleinste van het grootste af
 * en vermenigvuldig het resultaat met 5. Druk het resultaat af
 * zoals in het volgende voorbeeld:
 * 
 * Vb. De waarde voor a is 5 en de waarde voor b is 8
 * 
 * 8 - 5 = 3
 * 3 x 5 = 15
 * 
 * vermijd 2 keer dezelfde code!*/

import java.util.Scanner;

public class H4Oef2 {

	public static void main(String[] args) {
		//Scanner en variabelen aanmaken
		int a, b, difference, product, kleinste_getal, grootste_getal;
		Scanner keyboard = new Scanner(System.in);
		
		//Input vragen aan de gebruiker
		System.out.println("First number:");
		a = keyboard.nextInt();
		
		System.out.println("Second number:");
		b = keyboard.nextInt();
		
		//Grootste getal zoeken
		if (a > b) {
			grootste_getal = a;
			kleinste_getal = b;
			
		} else {
			grootste_getal = b;
			kleinste_getal = a;
		}
		
		difference = grootste_getal - kleinste_getal;
		product = difference * 5;
		
		System.out.println(grootste_getal + " - " + kleinste_getal + " = " + difference);
		System.out.println(difference + " x 5 = " + product);
		
		keyboard.close();
	}
}
