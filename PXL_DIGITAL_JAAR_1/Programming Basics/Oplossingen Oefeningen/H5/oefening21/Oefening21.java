package oefening21;

import java.util.Scanner;

public class Oefening21 {
	public static void main(String[] args) {
		double bruto;
		byte code;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef het brutojaarwedde van de werknemer in:");
		bruto = keyboard.nextDouble();

		while (bruto != 0) {
			do {
				System.out.println("Geef de beoordelingscode in (1:slecht, 2:voldoende, 3:goed, 4:schittereend)");
				code = keyboard.nextByte();
			} while (code < 1 || code > 4);
			double premie = berekeningJaarPremie(bruto, code);

			System.out.println("De eindejaarspremie is €" + premie);

			System.out.println("Geef het brutojaarwedde van de werknemer in:");
			bruto = keyboard.nextDouble();
		}
		keyboard.close();
	}

	public static double berekeningJaarPremie(double bruto, byte code) {
		double vast;
		vast = bruto / 20;
		double premie = vast;
		switch (code) {
		case 2:
			premie = ((vast * 0.18) + vast);
			break;
		case 3:
			premie = ((vast * 0.25) + vast);
			break;
		case 4:
			premie = ((vast * 0.33) + vast);
			break;

		}
		return premie;
	}
}