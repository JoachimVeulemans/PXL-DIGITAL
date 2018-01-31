package extraOefening1;

import java.util.Random;
import java.util.Scanner;

public class ExtraOefening1 {

	public static void main(String[] args) {
		Random willekeurig = new Random();
		Scanner keyboard = new Scanner(System.in);

		int getal = willekeurig.nextInt(10) + 1;

		System.out.println("Raad het getal tussen 1 en 10:");
		int raden = keyboard.nextInt();

		for (int count = 1; count < 5; count++) {
			if (getal == raden) {
				count = 5;
			} else {
				System.out.println("Poging " + count + ", raad het getal opnieuw tussen 1 en 10:");
				raden = keyboard.nextInt();
			}
		}

		keyboard.close();
	}

}
