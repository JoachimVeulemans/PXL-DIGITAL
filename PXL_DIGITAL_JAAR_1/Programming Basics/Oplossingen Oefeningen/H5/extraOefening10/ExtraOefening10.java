package extraOefening10;

import java.util.Scanner;

public class ExtraOefening10 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int jaar;

		System.out.println("Geef een jaartal in:");
		jaar = keyboard.nextInt();

		if (((jaar % 100) == 0) && ((jaar % 400) == 0)) {
			System.out.println(jaar + " is een schrikkeljaar.");
		} else {
			if ((jaar % 4 == 0) && (jaar % 100 != 0)) {
				System.out.println(jaar + " is een schrikkeljaar.");
			} else {
				System.out.println(jaar + " is geen schrikkeljaar.");
			}
		}

		keyboard.close();
	}

}
