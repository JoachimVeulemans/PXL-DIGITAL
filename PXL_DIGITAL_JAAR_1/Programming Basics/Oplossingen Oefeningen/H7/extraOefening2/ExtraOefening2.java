package extraOefening2;

import java.util.Scanner;

public class ExtraOefening2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int onkosten;

		System.out.println("Geef de klascode in:");
		String klascode = keyboard.nextLine();

		System.out.println("Geef het betaalde voorschot in:");
		int voorschot = keyboard.nextInt();

		System.out.println("Geef het aantal studenten van de klas in:");
		int studenten = keyboard.nextInt();

		int[] kosten = new int[studenten];
		int[] saldo = new int[studenten];

		System.out.println("Geef de nummer van een student in:");
		int nummer = keyboard.nextInt();

		while (nummer != 0) {

			if (nummer < 0 || nummer > studenten) {
				System.out.println("Fout studentennummer!");
				System.out.println("Geef de nummer van een student in:");
				nummer = keyboard.nextInt();
			} else {
				System.out.println("Geef de onkosten voor student " + nummer + " in:");
				onkosten = keyboard.nextInt();
				kosten[nummer - 1] = kosten[nummer - 1] + onkosten;

				System.out.println("Geef de nummer van een student in:");
				nummer = keyboard.nextInt();
			}
		}
		
		System.out.printf("%-10s %5s %10s %10s\n", "klascode", "nr.", "onkosten", "saldo");
		for (int i = 0; i < kosten.length; i++) {
			int nr = i + 1;
			
			saldo[i] = voorschot - kosten[i];
			
			System.out.printf("%-10s %5d %10d %10d\n", klascode, nr, kosten[i], saldo[i]);
		}

		keyboard.close();
	}

}
