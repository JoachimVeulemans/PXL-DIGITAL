package ppt;

import java.util.Scanner;

public class Opdracht1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int numerator = Integer.parseInt(keyboard.next());
		int denominator = Integer.parseInt(keyboard.next());
		int division = numerator / denominator;
		System.out.println(numerator + "/" + denominator + "=" + division);

		keyboard.close();
	}

}
