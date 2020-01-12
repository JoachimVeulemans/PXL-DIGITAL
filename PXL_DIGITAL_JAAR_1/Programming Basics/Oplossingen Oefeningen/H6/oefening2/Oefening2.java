package oefening2;

import java.util.Scanner;

public class Oefening2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een string in:");
		String tekst = keyboard.nextLine();
		String temp = tekst.toLowerCase();

		int positie = temp.indexOf("t");

		if (positie != -1) {
			if (tekst.length() % 2 == 1) {

				tekst = tekst.substring(0, positie) + tekst.substring(positie).toUpperCase();
			}
		} else {
			System.out.println("Er zijn geen t's of T's in de tekst gevonden.");

		}

		System.out.println(tekst);

		keyboard.close();
	}

}
