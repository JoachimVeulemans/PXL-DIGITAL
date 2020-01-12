package ppt;

import java.util.Scanner;

public class Opdracht5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		try {
			int numerator = Integer.parseInt(keyboard.next());
			int denominator = Integer.parseInt(keyboard.next());
			int division = numerator / denominator;
			System.out.println(numerator + "/" + denominator + "=" + division);
		}
		catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("Foutieve invoer");
		}
		finally {
			System.out.println("Einde programma");
		}

		
		keyboard.close();
	}

}
