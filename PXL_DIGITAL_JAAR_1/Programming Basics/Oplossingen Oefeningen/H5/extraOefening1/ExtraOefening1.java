package extraOefening1;

import java.util.Scanner;

public class ExtraOefening1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double temperatuur;
		
		System.out.println("Geef de temperatuur in °C in:");
		temperatuur = keyboard.nextDouble();
		
		temperatuur = ((((double)9 / 5) * temperatuur) + 32);
		System.out.println("De temperatuur is " + temperatuur + "°F.");
		
		
		keyboard.close();
	}

}
