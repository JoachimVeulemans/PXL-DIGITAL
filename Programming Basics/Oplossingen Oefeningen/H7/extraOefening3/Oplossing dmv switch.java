package extraOefening3;

import java.util.Scanner;

public class ExtraOefening3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		char karakter;
		StringBuilder tekst = new StringBuilder("");

		System.out.println("Geef een reeks van getallen in:");
		StringBuilder getallen = new StringBuilder(keyboard.nextLine());

		for (int i = 0; i < getallen.length(); i++) {
			karakter = getallen.charAt(i);
			switch (karakter) {
			case 49:
				tekst.append("een ");
				break;
			case 50:
				tekst.append("twee ");
				break;
			case 51:
				tekst.append("drie ");
				break;
			case 52:
				tekst.append("vier ");
				break;
			case 53:
				tekst.append("vijf ");
				break;
			case 54:
				tekst.append("zes ");
				break;
			case 55:
				tekst.append("zeven ");
				break;
			case 56:
				tekst.append("acht ");
				break;
			case 57:
				tekst.append("negen ");
				break;
			case 48:
				tekst.append("nul ");
				break;
			default:
				tekst.append("(fout karakter ingegeven) ");
			}
		}

		System.out.println(tekst);

		keyboard.close();
	}

}
