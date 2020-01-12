package oefening10;

import java.util.Scanner;

public class Oefening10 {

	public static void main(String[] args) {
		double bruto, premie, vast;
		byte beoordeling;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef het bruto jaarwedde in:");
		bruto = keyboard.nextDouble();

		System.out.println("Geef de beoordelingscode in:");
		beoordeling = keyboard.nextByte();

		vast = (bruto / 20);

		switch (beoordeling) {
		case 1:
			premie = vast;
			break;
		case 2:
			premie = ((vast * 0.18) + vast);
			break;
		case 3:
			premie = ((vast * 0.25) + vast);
			break;
		case 4:
			premie = ((vast * 0.33) + vast);
			break;
		default:
			System.out.println("Foutieve beoordelingscode!");
			premie = 0;
		}

		System.out.println("Uw eindejaarspremie bedraagt €" + premie + ".");

		keyboard.close();
	}

}
