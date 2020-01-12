package oefening4;

import java.util.Scanner;

public class Oefening4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int seconden;
		int uren, minuten;

		System.out.println("Geef de tijd in in seconden:");
		seconden = keyboard.nextInt();

		uren = (seconden / 3600);
		System.out.println(uren);
		seconden = seconden - (uren * 3600);
		minuten = (seconden / 60);
		System.out.println(minuten);
		seconden = seconden - (minuten * 60);
		System.out.println(seconden);

		keyboard.close();

	}

}
