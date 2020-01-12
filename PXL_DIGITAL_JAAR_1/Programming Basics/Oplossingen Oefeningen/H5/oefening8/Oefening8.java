package oefening8;

import java.util.Scanner;

public class Oefening8 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double examen1, examen2, examen3, examentotaal;
		int examen1cast, examen2cast, examen3cast;
		
		System.out.println("Geef de score van examen 1 in:");
		examen1 = keyboard.nextInt();
		
		System.out.println("Geef de score van examen 2 in:");
		examen2 = keyboard.nextInt();

		System.out.println("Geef de score van examen 3 in:");
		examen3 = keyboard.nextInt();
		
		examen1cast = (int)examen1;
		examen2cast = (int)examen2;
		examen3cast = (int)examen3;
		examentotaal = ((double)(examen1cast + examen2cast + examen3cast) / 60);

		if (examentotaal < 0.6) {
			System.out.println("Onvoldoende, " + (examentotaal * 100) + "% behaald.");
		} else {
			if (examentotaal < 0.7) {
				System.out.println("Voldoende, " + (examentotaal * 100) + "% behaald.");
			} else {
				if (examentotaal < 0.8) {
					System.out.println("Onderscheiding, " + (examentotaal * 100) + "% behaald.");
				} else {
					if (examentotaal < 0.9) {
						System.out.println("Grote onderscheiding, " + (examentotaal * 100) + "% behaald.");
					} else {
						System.out.println("Grootste onderscheiding, " + (examentotaal * 100) + "% behaald.");
					}
				}
			}
		}
		
		keyboard.close();
	}

}
