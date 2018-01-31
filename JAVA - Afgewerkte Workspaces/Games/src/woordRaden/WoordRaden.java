package woordRaden;

import java.util.Scanner;

public class WoordRaden {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een woord in om te raden!");
		String woord = keyboard.nextLine();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		String gok = "";
		StringBuilder tip = new StringBuilder("");

		while (!gok.equals(woord)) {
			tip = new StringBuilder("");
			int verkeerd = 0;
			for (int i = 0; i < woord.length(); i++) {
				tip.append("*");
			}

			if (!(gok.length() == 0)) {
				for (int i = 0; i < woord.length(); i++) {
					if (gok.charAt(i) == woord.charAt(i)) {
						tip.setCharAt(i, woord.charAt(i));
						verkeerd--;
					}
				}

				for (int j = 0; j < woord.length(); j++) {
					for (int i = 0; i < woord.length(); i++) {
						if (gok.charAt(j) == woord.charAt(i)) {
							verkeerd++;
						}
					}
				}
				int teller = 0;
				int tusseni = 0;
				char[] karakters = new char[gok.length()];
				//int[] karaktersAantal = new int[gok.length()];
				for (int i = 0; i < gok.length(); i++) {
					int inteller = 0;
					int tussenj = 0;
					for (int j = 0; j < karakters.length; j++) {
						inteller = 0;
						if (gok.charAt(i) == karakters[j]) {
							teller++;
							inteller++;
							tussenj = j;
							j = karakters.length;
						} 

					}
					if (inteller == 0) {
						karakters[tusseni] = gok.charAt(i);
						tusseni++;
					}

				}
				verkeerd = verkeerd - teller;
				
			}
			if (verkeerd < 0) {
				verkeerd = 0;
			}
			System.out.println("Een tip is " + tip);
			System.out.println("Er zijn " + verkeerd + " letters verkeerd geplaatst!");

			System.out.println("Doe een gok van het woord!");
			gok = keyboard.nextLine();
		}

		System.out.println("Je hebt het geraden! Het woord was: " + woord);

		keyboard.close();
	}

}
