package oefening6;

import java.util.Scanner;

public class Oefening6 {
	public static void main(String[] args) {
		int getal, uitkomst;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een getal in:");
		getal = keyboard.nextInt();
		
		for (int count = 1; count < 21; count++) {
			uitkomst = (count * getal);
			System.out.println(count + "\tx\t" + getal + "\t=\t" + uitkomst);
		}
		
		keyboard.close();
	}
}
