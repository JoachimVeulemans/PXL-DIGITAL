package ppt;

import java.util.Scanner;

public class Opdracht3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		try {
			int numerator = Integer.parseInt(keyboard.next());
			int denominator = Integer.parseInt(keyboard.next());
			int division = numerator / denominator;
			System.out.println(numerator + "/" + denominator + "=" + division);
		}
		catch (NumberFormatException ex) {
			System.out.println("Foutief nummer");
		}
		catch (ArithmeticException ex) {
			System.out.println("Deling door 0");
		}
		
		keyboard.close();
	}

}
