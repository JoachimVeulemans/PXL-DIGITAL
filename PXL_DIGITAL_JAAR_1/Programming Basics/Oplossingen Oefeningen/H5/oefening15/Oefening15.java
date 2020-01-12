package oefening15;

import java.util.Scanner;

public class Oefening15 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double temperatuur, hoogsteTemperatuur, gemTemperatuur;
		hoogsteTemperatuur = -1000;
		gemTemperatuur = 0;
		for (int count = 1; count < 11; count++) {
			System.out.println("Geef de temperatuur om 12u 's middags in van dag " + count + ".");
			temperatuur = keyboard.nextDouble();

			if (temperatuur > hoogsteTemperatuur) {
				hoogsteTemperatuur = temperatuur;
			}
			
			gemTemperatuur = gemTemperatuur + temperatuur;
		}

		gemTemperatuur = (gemTemperatuur / 10);
		
		System.out.println("De hoogste temperatuur van deze 10 dagen is " + hoogsteTemperatuur + "°C.");
		System.out.println("De gemiddelde temperatuur van deze 10 dagen is " + gemTemperatuur + "°C.");

		keyboard.close();
	}

}