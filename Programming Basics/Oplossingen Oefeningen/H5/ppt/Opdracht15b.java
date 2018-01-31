package ppt;

import java.util.Scanner;

public class Opdracht15b {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		// FOR
		System.out.println("Oplossing met FOR");
		int tot = 0;
		int g;

		for (int i = 12; i > 7; i -= 2) {
			System.out.println("Geef een getal:");
			g = keyboard.nextInt();
			tot = tot + g;
		}

		// WHILE
		System.out.println("Oplossing met WHILE");
		System.out.println("Geef een getal:");
		g = keyboard.nextInt();

		int i = 12;

		while (i > 9) {
			System.out.println("Geef een getal in:");
			g = keyboard.nextInt();
			tot = tot + g;
			i -= 2;
		}

		keyboard.close();
	}

}
