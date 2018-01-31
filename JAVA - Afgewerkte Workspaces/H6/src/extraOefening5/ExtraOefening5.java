package extraOefening5;

import java.util.Scanner;

public class ExtraOefening5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een string in:");
		StringBuilder tekst = new StringBuilder(keyboard.nextLine());

		System.out.println("Geef een karakter in ter vervanging:");
		char teken = keyboard.next().charAt(0);

		StringBuilder bewerkteTekst = vervangingTeken(tekst, teken);

		System.out.println(bewerkteTekst);

		keyboard.close();
	}

	public static StringBuilder vervangingTeken(StringBuilder tekst, char teken) {
		String temp;
		for (int count = 0; count < tekst.length(); count++) {
			temp = tekst.substring(count, count + 1).toLowerCase();
			if (temp.equals("a") || temp.equals("e") || temp.equals("o") || temp.equals("i") || temp.equals("u")) {
				tekst.setCharAt(count, teken);
			}
		}

		return tekst;
	}

}
