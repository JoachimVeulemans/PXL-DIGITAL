package ppt;

import java.util.Random;

public class Opdracht1 {

	public static void main(String[] args) {
		Random willekeurig = new Random();

		// A
		System.out.println("**********A**********");
		int getal = willekeurig.nextInt();
		System.out.println(getal);

		// B
		System.out.println("**********B**********");
		for (int count = 1; count <= 20; count++) {
			getal = willekeurig.nextInt(11);
			System.out.println(getal);
		}

		// C
		System.out.println("**********C**********");
		for (int count = 1; count <= 10; count++) {
			getal = willekeurig.nextInt(11) + 20;
			System.out.println(getal);
		}

	}

}
