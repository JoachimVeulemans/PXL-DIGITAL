package extraOefening3;

import java.util.Scanner;

public class ExtraOefening3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int lengte, breedte, diepte, inhoud, water, ontsmetting;
		
		System.out.println("Geef de lengte van het zwembad in:");
		lengte = keyboard.nextInt();
		
		System.out.println("Geef de breedte van het zwembad in:");
		breedte = keyboard.nextInt();
		
		System.out.println("Geef de diepte van het zwembad in:");
		diepte = keyboard.nextInt();
		
		inhoud = (lengte * breedte * diepte);
		
		water = (int)((double)inhoud * 0.98);
		ontsmetting = (int)((double)inhoud * 0.02);	
		
		System.out.println("Voor een zwembad met een inhoud van " + inhoud + " l heeft " + water + " l water nodig en " + ontsmetting + " l ontsmettingsmiddel nodig.");

		keyboard.close();
	}

}
