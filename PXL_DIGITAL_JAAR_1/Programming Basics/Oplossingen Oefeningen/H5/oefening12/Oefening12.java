package oefening12;

import java.util.Scanner;

public class Oefening12 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double maan, jupiter, mars;
		int maancast, jupitercast, marscast;

		System.out.println("Geef het percentage van het gewicht van de maan t.o.v. de aarde in:");
		maan = (keyboard.nextDouble() / 100);

		System.out.println("Geef het percentage van het gewicht van jupiter t.o.v. de aarde in:");
		jupiter = (keyboard.nextDouble() / 100);

		System.out.println("Geef het percentage van het gewicht van mars t.o.v. de aarde in:");
		mars = (keyboard.nextDouble() / 100);

		System.out.println("Aarde \t Maan \t Jupiter \t Mars \t");

		for (int count = 50; count < 121; count += 5) {

			maancast = (int) (maan * count);
			jupitercast = (int) (jupiter * count);
			marscast = (int) (mars * count);
			System.out.println(count + "\t" + maancast + "\t" + jupitercast + "\t" + marscast);
		}

		keyboard.close();
	}

}
