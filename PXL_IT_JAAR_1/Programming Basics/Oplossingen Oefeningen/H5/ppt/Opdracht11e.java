package ppt;

import java.util.Scanner;

public class Opdracht11e {

	public static void main(String[] args) {

		int bs, lidgeld, leeftijd;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef bs in:");
		bs = keyboard.nextInt();
		
		System.out.println("Geef leeftijd in:");
		leeftijd = keyboard.nextInt();

		// A

		if (bs == 1) {
			lidgeld = 25;
		} else {
			if (bs == 2) {
				lidgeld = 20;
			} else {
				lidgeld = 15;
			}
		}
		
		// B
		
		if (leeftijd < 30 && bs == 1) {
			lidgeld = 25;
		} else {
			lidgeld = 15;
		}
		
		// C
		
		if (leeftijd < 30 && bs == 1) {
			lidgeld = 25;
		} else {
			lidgeld = 15;
		}
		
		// D
		
		if (bs == 1) {
			lidgeld = 25;
		} else {
			if (bs == 2 && leeftijd < 30) {
				lidgeld = 20;
			} else {
				lidgeld = 15;
			}
		}
		System.out.println("Het lidgeld is €" + lidgeld + ".");
		keyboard.close();
	}

}
