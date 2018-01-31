package oefening7;

import java.util.Random;
import java.util.Scanner;

public class Oefening7App {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("Geef een geheel getal in:");
		int x = keyboard.nextInt();

		int y = rand.nextInt(6000) + 100;

		double uitkomst = Math.E * Math.sqrt((Math.pow(x, 2) + Math.pow(y, 3)));
		uitkomst = ((int) (uitkomst * 1000)) / 1000.0;
		System.out.println(uitkomst);
		keyboard.close();
	}

}
