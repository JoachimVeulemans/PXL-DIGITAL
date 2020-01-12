package extraOefening3;

import java.util.Scanner;

public class ExtraOefening3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		char karakter;
		StringBuilder tekst = new StringBuilder("");

		System.out.println("Geef een reeks van getallen in:");
		StringBuilder getallen = new StringBuilder(keyboard.nextLine());

		String[] omzetting = { "nul ", "een ", "twee ", "drie ", "vier ", "vijf ", "zes ", "zeven ", "acht ", "negen ", "tien " };

		for (int i = 0; i < getallen.length(); i++) {
			karakter = getallen.charAt(i);
			if (karakter < 48 || karakter > 57) {
				tekst.append("(fout karakter ingegeven) ");
			} else {
				karakter = (char) (karakter - 48);
				tekst.append(omzetting[karakter]);
			}

		}

		System.out.println(tekst);

		keyboard.close();
	}

}
