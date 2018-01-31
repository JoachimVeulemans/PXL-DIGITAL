package be.pxl.h4.oef6;

/*Geef een getal in via het toetsenbord. Bv 7
 * 
 * maak een vermenigvuldigingstabel als volgt:
 * 	1 x 7 = 7
 *  2 x 7 = 14
 *  ...
 *  20 x 7 = 140*/

import java.util.Scanner;

public class H4Oef6 {
	public static void main(String[] args) {
		//Aanmaken scanner en variabelen
		Scanner keyboard = new Scanner(System.in);
		int a, product, aantal;
		
		//Input opvragen
		System.out.println("Geef een getal in: ");
		a = keyboard.nextInt();
		
		//Tabel maken en printen, lijn per lijn
		for(int i = 0; i < 20; i++) {
			aantal = i + 1;
			product = aantal * a;
			System.out.println(aantal + " x " + a + " = " + product);
			
		}
		
		keyboard.close();
	}
}
