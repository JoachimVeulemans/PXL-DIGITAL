package extraOefening8;

import java.util.Scanner;

public class ExtraOefening8 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double a, b, c;
		double klein, middel, groot;

		System.out.println("Geef een getal a in:");
		a = keyboard.nextDouble();

		System.out.println("Geef een getal b in:");
		b = keyboard.nextDouble();

		System.out.println("Geef een getal c in:");
		c = keyboard.nextDouble();

		if (a < b) {
			klein = a;
			groot = b;
		} else {
			klein = b;
			groot = a;
		}
		if (c > groot) {
			middel = groot;
			groot = c;
		} else {
			if (c < a) {
				klein = c;
				middel = b;
			} else {
				klein = a;
				middel = b;
			}
		}

		System.out
				.println("Het kleinste getal is " + klein + " en daarna " + middel + " en als grootste " + groot + ".");

		keyboard.close();
	}
}
