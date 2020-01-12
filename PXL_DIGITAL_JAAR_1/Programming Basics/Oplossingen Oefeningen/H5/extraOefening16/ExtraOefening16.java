package extraOefening16;

import java.util.Scanner;

public class ExtraOefening16 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int lengte, hoogte;

		System.out.println("Geef de lengte van de rechthoek in:");
		lengte = keyboard.nextInt();

		System.out.println("Geef de hoogte van de rechthoek in:");
		hoogte = keyboard.nextInt();

		for (int countHoogte = 1; countHoogte < hoogte + 1; countHoogte++) {
			int countLengte = 1;
			for (; countLengte < lengte + 1; countLengte++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

		keyboard.close();
	}

}
