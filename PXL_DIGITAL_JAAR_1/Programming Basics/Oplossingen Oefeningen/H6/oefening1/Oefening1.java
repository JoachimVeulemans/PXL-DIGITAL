package oefening1;

import java.util.Random;

public class Oefening1 {

	public static void main(String[] args) {
		Random willekeurig = new Random();

		int getal1, getal2;

		for (char reeks = 'A'; reeks < 'G'; reeks++) {
			System.out.println("Reeks " + reeks);
			for (int count = 1; count < 6; count++) {
				System.out.print(count + ")\t");
				getal1 = willekeurig.nextInt(21);
				getal2 = willekeurig.nextInt(21);
				if (getal1 < getal2) {
					System.out.println(getal2 + " - " + getal1 + " =");
				} else {
					System.out.println(getal1 + " - " + getal2 + " =");
				}
			}
		}

	}

}
