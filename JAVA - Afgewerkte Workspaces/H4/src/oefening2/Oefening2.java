package oefening2;

import java.util.Scanner;

public class Oefening2 {
	public static void main(String[] args) {
		int getala, getalb, uitkomst;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een getal in:");
		getala = keyboard.nextInt();

		System.out.println("Geef een tweede getal in:");
		getalb = keyboard.nextInt();

		if (getala < getalb) {
			uitkomst = ((getalb - getala) * 5);

		} else {
			uitkomst = ((getala - getalb) * 5);
		}
		System.out.println("De uitkomst is " + uitkomst + ".");

		keyboard.close();
	}
}