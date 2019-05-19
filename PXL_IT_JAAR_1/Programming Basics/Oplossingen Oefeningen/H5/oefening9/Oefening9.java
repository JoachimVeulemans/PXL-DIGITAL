package oefening9;

import java.util.Scanner;

public class Oefening9 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int getala, getalb, c, getalc;

		System.out.println("Geef een geheel getal:");
		getala = keyboard.nextInt();

		System.out.println("Geef nog een geheel getal in:");
		getalb = keyboard.nextInt();

		System.out.println("Geef een code (1-5) in om uit te voeren:");
		c = keyboard.nextInt();

		if (c == 1) {
			getalc = (getala + getalb);
			System.out.println("De som van " + getala + " en " + getalb + " is " + getalc + ".");
		} else {
			if (c == 2) {
				getalc = (getala - getalb);
				System.out.println("Het verschil van " + getala + " en " + getalb + " is " + getalc + ".");
			} else {
				if (c == 3) {
					getalc = (getala * getalb);
					System.out.println("Het product van " + getala + " en " + getalb + " is " + getalc + ".");
				} else {
					if (c == 4) {
						getalc = (getala * getala);
						System.out.println("Het kwadraat van " + getala + " is " + getalc + ".");
					} else {
						if (c == 5) {
							getalc = (getalb * getalb);
							System.out.println("Het kwadraat van " + getalb + " is " + getalc + ".");
						} else {
							System.out.println("Foutieve code!");
						}
					}
				}
			}
		}
		keyboard.close();
	}
}
