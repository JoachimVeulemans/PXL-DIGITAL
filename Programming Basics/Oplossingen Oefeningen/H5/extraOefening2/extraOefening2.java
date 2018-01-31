package extraOefening2;

import java.util.Scanner;

public class extraOefening2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double temperatuur;
		
		System.out.println("Geef de temperatuur in °F in:");
		temperatuur = keyboard.nextDouble();
		
		temperatuur = ((temperatuur - 32) * ((double)5 / 9));
		System.out.println("De temperatuur is " + temperatuur + "°C.");
		
		keyboard.close();
	}
}
