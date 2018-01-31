package ppt;

import java.util.Scanner;

public class Opdracht2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		try {
			int numerator = Integer.parseInt(keyboard.next());
			int denominator = Integer.parseInt(keyboard.next());
			int division = numerator / denominator;
			System.out.println(numerator + "/" + denominator + "=" + division);
		}
		catch (NumberFormatException ex) {
			System.out.println("Invalid number");
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
		keyboard.close();
	}

}
