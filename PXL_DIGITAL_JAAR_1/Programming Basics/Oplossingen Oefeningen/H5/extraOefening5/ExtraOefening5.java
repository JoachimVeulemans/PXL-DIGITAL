package extraOefening5;

import java.util.Scanner;

public class ExtraOefening5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int getal;

		System.out.println("Geef een geheel getal in:");
		getal = keyboard.nextInt();

		getal = getal % 1000;

		System.out.print("De laatste getallen van het getal zijn ");
		if (getal < 10) {
			System.out.print("00");
		} else {
			if (getal < 100) {
				System.out.print("0");
			}
		}
		System.out.print(getal);

		keyboard.close();
	}

}