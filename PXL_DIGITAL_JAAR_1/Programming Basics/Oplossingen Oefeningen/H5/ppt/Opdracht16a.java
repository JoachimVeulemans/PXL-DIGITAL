package ppt;

import java.util.Scanner;

public class Opdracht16a {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int getal;

		System.out.println("Geef in welke tafel u wilt zien:");
		getal = keyboard.nextInt();

		toonTafel(getal);

		keyboard.close();
	}

	public static void toonTafel(int a) {
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " * " + a + " = " + (i * a));
		}
	}

}
