package voorbeelden;

import java.util.Scanner;

public class Oefening5Ppt {

	public static void main(String[] args) {
		int getal = 101;
		int driedubbel;
		
		Scanner keyboard = new Scanner(System.in);
		
		while (getal > 100) {
			System.out.println("Geef een getal in:");
			getal = keyboard.nextInt();
			driedubbel = (getal * 3);
			System.out.println("Het getal is " + getal + " en het 3-dubbel ervan is " + driedubbel + ".");
			
		}
		
		keyboard.close();
	}

}
