package oefening9;

import java.util.Scanner;

public class Oefening9b {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int getala, getalb, c, getalc;

		System.out.println("Geef een geheel getal:");
		getala = keyboard.nextInt();

		System.out.println("Geef nog een geheel getal in:");
		getalb = keyboard.nextInt();

		System.out.println("Geef een code (1-5) in om uit te voeren:");
		c = keyboard.nextInt();

		switch (c) {
		case 1:
			getalc = (getala + getalb);
			System.out.println("De som van " + getala + " en " + getalb + " is " + getalc + ".");
			break;
		case 2:
			getalc = (getala - getalb);
			System.out.println("Het verschil van " + getala + " en " + getalb + " is " + getalc + ".");
			break;
		case 3:
			getalc = (getala * getalb);
			System.out.println("Het product van " + getala + " en " + getalb + " is " + getalc + ".");
			break;
		case 4:
			getalc = (getala * getala);
			System.out.println("Het kwadraat van " + getala + " is " + getalc + ".");
			break;
		case 5:
			getalc = (getalb * getalb);
			System.out.println("Het kwadraat van " + getalb + " is " + getalc + ".");
			break;
		default:
			System.out.println("Foutieve code!");
		}
		keyboard.close();
	}
}
