package examen2;

import java.util.Random;
import java.util.Scanner;

public class Vraag2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String[] roman = { "XL", "X", "IX", "V", "IV", "I" };
		int[] waarde = { 40, 10, 9, 5, 4, 1 };
		Random rand = new Random();
		int[] somReeksen = new int[4];

		System.out.println("Geef letter:");
		char letter = keyboard.next().charAt(0);

		for (char start = 'a'; start <= letter; start++) {
			System.out.println("Reeks " + start);
			int som = 0;
			
			int eersteGetal = rand.nextInt(50) + 1;
			String romeinsGetal = zetOmNaarRomeinsCijfer(roman, waarde, eersteGetal);
			System.out.println("Het Romeinse cijfer voor " + eersteGetal + " is " + romeinsGetal);
			som = som + eersteGetal;
			int tweedeGetal = rand.nextInt(50) + 1;
			while (tweedeGetal > eersteGetal) {
				romeinsGetal = zetOmNaarRomeinsCijfer(roman, waarde, tweedeGetal);
				System.out.println("Het Romeinse cijfer voor " + tweedeGetal + " is " + romeinsGetal);
				som = som + tweedeGetal;
				eersteGetal = tweedeGetal;
				tweedeGetal = rand.nextInt(50) + 1;
			}
			
			if (som < 50) {
				somReeksen[0]++;
			} else {
				if (som < 70) {
					somReeksen[1]++;
				} else {
					if (som < 90) {
						somReeksen[2]++;
					} else {
						somReeksen[3]++;
					}
				}
			}
		}
		
		System.out.println("Aantal reeksen met een som van gegenereerde getallen minder dan 50: " + somReeksen[0]);
		System.out.println("Aantal reeksen met een som van gegenereerde getallen tussen 50 en 70: " + somReeksen[1]);
		System.out.println("Aantal reeksen met een som van gegenereerde getallen tussen 70 en 90: " + somReeksen[2]);
		System.out.println("Aantal reeksen met een som van gegenereerde getallen van 90 of meer: " + somReeksen[3]);
		
		keyboard.close();
	}

	public static String zetOmNaarRomeinsCijfer(String[] roman, int[] waarde, int getal) {
		StringBuilder romeins = new StringBuilder("");

		for (int i = 0; i < roman.length; i++) {
			if (getal >= waarde[i]) {
				romeins.append(roman[i]);
				getal = getal - waarde[i];
				i--;
			}
		}

		return romeins.toString();
	}

}
