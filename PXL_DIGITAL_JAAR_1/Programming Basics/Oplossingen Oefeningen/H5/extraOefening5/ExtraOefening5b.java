package extraOefening5;

import java.util.Scanner;

public class ExtraOefening5b {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double volledigGetal, getal;

		System.out.println("Geef een getal in:");
		volledigGetal = keyboard.nextDouble();

		getal = ((int) (volledigGetal * 100)) / 100.0;
		System.out.println("AFGEKAPT: " + getal);

		getal = ((int) ((volledigGetal * 100) + 0.5)) / 100.0;
		System.out.println("AFGEROND: " + getal);

		keyboard.close();
	}

}
