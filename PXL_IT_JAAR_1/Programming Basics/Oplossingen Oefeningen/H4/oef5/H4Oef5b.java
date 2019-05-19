package be.pxl.h4.oef5;

import java.util.Scanner;

public class H4Oef5b {

	public static void main(String[] args) {
		//Aanmaken van Scanner en variabelen
				Scanner keyboard = new Scanner(System.in);
				int gewicht, aantal, i = 0;// i -> Controle while loop
				
				//Gegevens opvragen aan gebruiker
				System.out.println("Gewicht appel (gram): ");
				gewicht = keyboard.nextInt();
				
				System.out.println("aantal appels     gewicht in gram");
				
				//Tabel maken en printen, lijn per lijn.
				while(i < 100) {
					aantal = i + 1;
					System.out.println(aantal + "                 " + (gewicht * aantal));
					i = i + 1; //We tellen steeds i steeds op met 1
				}
				
				keyboard.close();
	}
}
