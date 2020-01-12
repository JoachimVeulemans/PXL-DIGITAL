package ppt;

import java.util.Scanner;

public class Opdracht16b {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef het belastbaar bedrag in:");
		double belastbaar = keyboard.nextDouble();

		double bedrag = berekenBelasting(belastbaar);

		System.out.println("U moet €" + bedrag + " belasting betalen.");

		keyboard.close();
	}

	public static double berekenBelasting(double belastbaar) {
		double belasting;

		if (belastbaar <= 25000) {
			belasting = (belastbaar * 38.4 / 100);
		} else {
			if (belastbaar <= 55000) {
				belasting = (25000 * 38.4 / 100) + ((belastbaar - 25000) * 50.0 / 100);
			} else {
				belasting = (25000 * 38.4 / 100) + (30000 * 50.0 / 100) + ((belastbaar - 55000) * 60.0 / 100);
			}
		}
		
		return belasting;
	}

}
