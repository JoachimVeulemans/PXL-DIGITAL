package extraOefening4b;

import java.util.Scanner;

public class ExtraOefening4b {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int[] [] rijen = new int[4] [3];
		
		for (int i = 0; i < rijen.length; i++) {
			int rijNaam = i + 1;
			for (int j = 0; j < rijen[i].length; j++) {
				int kolomNaam = j + 1;
				System.out.println("Geef kolom " + kolomNaam + " van rij " + rijNaam + " in:");
				rijen[i] [j] = keyboard.nextInt();
			}
		}

		for (int i = 0; i < rijen.length; i++) {
			int rijNaam = i + 1;
			int uitkomst = 0;
			for (int j = 0; j < rijen[i].length; j++) {
				uitkomst = uitkomst + rijen[i] [j];
			}
			System.out.println("De uitkomst van rij " + rijNaam + " is " + uitkomst);
		}
		
		keyboard.close();
	}

}
