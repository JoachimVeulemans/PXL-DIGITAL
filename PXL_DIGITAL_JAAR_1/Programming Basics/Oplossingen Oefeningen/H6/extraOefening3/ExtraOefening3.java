package extraOefening3;

import java.util.Random;
import java.util.Scanner;

public class ExtraOefening3 {

	public static void main(String[] args) {
		Random willekeurig = new Random();
		Scanner keyboard = new Scanner(System.in);
		int getal, charCount;
		char newChar;

		System.out.println("Geef een string in om te encrypteren:");
		StringBuilder tekst = new StringBuilder(keyboard.nextLine());

		do {
			getal = willekeurig.nextInt(24) + 2;
		} while (getal % 2 == 1);

		for (int count = 0; count < tekst.length(); count++) {
			newChar = tekst.charAt(count);
			
			for (charCount = 0; charCount < getal; charCount++) {
				newChar++;
			}
			
			tekst.setCharAt(count, newChar);
		}
		System.out.println("De string is: " + tekst);
		System.out.println("Het getal is: " + getal);

		keyboard.close();

	}

}
