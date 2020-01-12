package ppt;

import java.util.Scanner;

public class OpdrachtMath {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef een getal:");
		int x = keyboard.nextInt();
		int uitkomst = (int) Math.pow(x, 3);
		System.out.println(uitkomst);

		System.out.println("Geef een oppervlakte:");
		double oppervlakte = keyboard.nextDouble();
		double diameter = ((int) ((Math.sqrt(oppervlakte / Math.PI) * 2) * 100)) / 100.0;
		System.out.println(diameter);

		keyboard.close();
	}

}
