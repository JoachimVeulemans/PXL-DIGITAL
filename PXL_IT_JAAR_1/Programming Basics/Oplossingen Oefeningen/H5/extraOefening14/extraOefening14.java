package extraOefening14;

import java.util.Scanner;

public class extraOefening14 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int geslacht, werknemers;
		double afgKm, conditie;
		double slechteConditie = 0;
		werknemers = 0;
		
		System.out.println("Geef uw geslacht in:");
		geslacht = keyboard.nextInt();
		
		while (geslacht == 1 || geslacht == 2) {
			System.out.println("Geef de afgelegde afstand in km in:");
			afgKm = keyboard.nextDouble();
			
			conditie = ((afgKm - 504.9) / 44.73);
			werknemers++;
			
			if (geslacht == 1) {
				if (conditie < 36) {
					slechteConditie++;
				}
			} else {
				if (conditie < 29) {
					slechteConditie++;
				}
			}
			
			System.out.println("Geef uw geslacht in:");
			geslacht = keyboard.nextInt();
		}
		
		slechteConditie = ((slechteConditie / werknemers) * 100);
		System.out.println("Het percentage van de werknemers met een slechte conditie is " + slechteConditie + "%.");
		
		keyboard.close();
	}

}
