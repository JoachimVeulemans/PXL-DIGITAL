package voorbeelden;

import java.util.Scanner;


//Ctrl Shift F --> Juiste positie zetten!!

public class VoorbeeldSum {
	public static void main(String[] args) {

		int getal1, getal2, som; // Int=integer=geheel getal

		Scanner keyboard = new Scanner(System.in); // keyboard is aanpasbaar

		System.out.println("Geef een getal in:");
		getal1 = keyboard.nextInt();

		System.out.println("Geef een tweede getal in:");
		getal2 = keyboard.nextInt();

		som = getal1 + getal2;
		System.out.println("De som is " + som);
		
		keyboard.close();
	}
}
