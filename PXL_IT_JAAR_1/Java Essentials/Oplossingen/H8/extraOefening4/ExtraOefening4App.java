package extraOefening4;

import java.util.Scanner;

public class ExtraOefening4App {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef x in:");
		int x = keyboard.nextInt();
		System.out.println("Geef y in:");
		int y = keyboard.nextInt();

		double uitkomst = Math.PI * (Math.sqrt((Math.pow(x, 4) + Math.pow(y, 4))));
		uitkomst = Math.round(uitkomst * 10) / 10.0;
		System.out.println(uitkomst);

		keyboard.close();
	}

}
