package be.pxl.h4.oef5;

/*Geef het gewicht van een appel (in gram) via het toetsenbord.
 * 
 * Maak een tabel om het gewicht van 1 tot 100 appels af te drukken als volgt:
 * 
 *		Aantal appels		gewicht in gram
 *		1					165
 *		2					330
 *		...					...
 *		100					16500*/

import java.util.Scanner;

public class H4Oef5 {
	public static void main(String[] args) {
		//Aanmaken van Scanner en variabelen
		Scanner keyboard = new Scanner(System.in);
		int gewicht, aantal;
		
		//Gegevens opvragen aan gebruiker
		System.out.println("Gewicht appel (gram): ");
		gewicht = keyboard.nextInt();
		
		System.out.println("aantal appels     gewicht in gram");
		
		//Tabel maken en printen, lijn per lijn.
		for(int i = 0; i < 100; i++) {
			aantal = i + 1;
			System.out.println(aantal + "                 " + (gewicht * aantal));
		}
		
		keyboard.close();
	}
}

/*FOR VS WHILE LOOP
 * 
 * We gebruiken een FOR loop als we weten hoeveel iteraties er nodig zijn
 * We gebruiken een WHILE loop als we niet weten hoeveel iteraties er nodig zijn
 * 
 * Voorbeeld met while loop staat in H4Oef5b
 * 
 */