package extraOefening4a;

import java.util.Scanner;

public class ExtraOefening4a {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		char[] tabel = { 'z', 'b', 'r', 'o', 'g', 'G', 'B', 'V', 'L', 'W' };
		boolean controleOK = false;
		String karakters = "";

		while (!controleOK) {
			System.out.println("Geef 3 karakters in:");
			karakters = keyboard.nextLine();
			controleOK = controleKarakters(karakters, tabel);
		}

		int[] waardes = berekeningWaardes(karakters, tabel);

		int waarde10C = berekening10C(waardes[2]);

		int R = (10 * waardes[0] + waardes[1]) * waarde10C;

		System.out.println("De weerstand is " + R + " ohm.");

		keyboard.close();
	}

	public static boolean controleKarakters(String karakters, char[] tabel) {
		char temp;
		int teller;

		if (karakters.length() != 3) {
			System.out.println("Lengte niet correct!");
			return false;
		}

		for (int i = 0; i < karakters.length(); i++) {
			temp = karakters.charAt(i);
			teller = 0;

			for (int k = 0; k < tabel.length && teller == 0; k++) {
				if (temp == tabel[k]) {
					teller++;
				}
			}

			if (teller != 1) {
				System.out.println("Verkeerde invoer!");
				return false;
			}

		}
		return true;
	}

	public static int berekening10C(int macht) {
		int uitkomst = 1;

		for (int i = 0; i < macht; i++) {
			uitkomst = uitkomst * 10;
		}

		return uitkomst;
	}

	public static int[] berekeningWaardes(String karakters, char[] tabel) {

		int[] waardes = new int[3];

		for (int i = 0; i < karakters.length(); i++) {
			for (int k = 0; k < tabel.length; k++) {
				if (karakters.charAt(i) == tabel[k]) {
					waardes[i] = k;
				}
			}
		}

		return waardes;
	}

}
