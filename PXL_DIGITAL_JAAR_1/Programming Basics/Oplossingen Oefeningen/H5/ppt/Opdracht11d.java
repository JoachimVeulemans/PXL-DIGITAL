package ppt;

import java.util.Scanner;

public class Opdracht11d {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		float lengte, bmi;
		int gewicht;

		System.out.println("Geef je lengte in:");
		lengte = keyboard.nextFloat();

		System.out.println("Geef je gewicht in:");
		gewicht = keyboard.nextInt();

		bmi = (gewicht / (lengte * lengte));
		System.out.println("Je BMI is " + bmi);

		if (bmi < 18) {
			System.out.println("Ondergewicht");
		} else {
			if (bmi <= 25) {
				System.out.println("Ok");
			} else {
				if (bmi <= 30) {
					System.out.println("Overgewicht");
				} else {
					if (bmi <= 40) {
						System.out.println("Obesitas");
					} else {
						System.out.println("Ziekelijk overgewicht");
					}
				}
			}
		}

		keyboard.close();
	}

}
