package extraOefening15;

import java.util.Scanner;

public class ExtraOefening15 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int vermenigvuldiger, vermenigvuldigtal, uitkomst;

		System.out.println("Geef de waarde van de vermenigvuldiger in:");
		vermenigvuldiger = keyboard.nextInt();

		System.out.println("Geef de waarde van het vermenigvuldigtal in:");
		vermenigvuldigtal = keyboard.nextInt();

		for (int count = 0; count < vermenigvuldigtal + 1; count++) {
			uitkomst = (count * vermenigvuldiger);
			System.out.println(count + "x" + vermenigvuldiger + " = " + uitkomst);
		}

		keyboard.close();
	}

}
