package ppt;

import java.util.Scanner;

public class Opdracht4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		try {
			int numerator = Integer.parseInt(keyboard.next());
			int denominator = Integer.parseInt(keyboard.next());
			int division = numerator / denominator;
			System.out.println(numerator + "/" + denominator + "=" + division);
		}
		catch (RuntimeException ex) {
			System.out.println("Foutieve invoer");
		}
		
		try {
			int numerator = Integer.parseInt(keyboard.next());
			int denominator = Integer.parseInt(keyboard.next());
			int division = numerator / denominator;
			System.out.println(numerator + "/" + denominator + "=" + division);
		}
		catch (NumberFormatException | IndexOutOfBoundsException ex) {
			System.out.println("Foutieve invoer");
		}

		
		keyboard.close();
	}

}
