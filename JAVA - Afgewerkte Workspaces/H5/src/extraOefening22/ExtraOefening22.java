package extraOefening22;

import java.util.Scanner;

public class ExtraOefening22 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		char hoekSym, horSym, verSym;

		System.out.println("Geef het hoeksymbool in:");
		hoekSym = keyboard.next().charAt(0);

		System.out.println("Geef het symbool voor de horizontale lijnen in:");
		horSym = keyboard.next().charAt(0);

		System.out.println("Geef het symbool voor de horizontale lijnen in:");
		verSym = keyboard.next().charAt(0);

		for (int count = 1; count < 5; count++) {
			tekenenHoek(hoekSym, horSym);
			tekenenTussen(verSym);
		}
		tekenenHoek(hoekSym, horSym);

		keyboard.close();
	}

	public static void tekenenHoek(char hoek, char lijn) {
		for (int countHoek = 1; countHoek < 6; countHoek++) {
			System.out.print(hoek);
			for (int countLijn = 1; countLijn < 10; countLijn++) {
				System.out.print(lijn);
			}
		}
		System.out.println(hoek);
	}

	public static void tekenenTussen(char lijn) {
		for ( int countRegels = 1; countRegels < 5; countRegels++) {
			for (int countTeken = 1; countTeken < 6; countTeken++) {
				System.out.print(lijn);
				for (int countBlanco = 1; countBlanco < 10; countBlanco++) {
					System.out.print(" ");
				}
			}
			System.out.println(lijn);
		}
	}
}
