package oefening2;

import java.util.Scanner;

public class PXLApp {

	public static void main(String[] args) {
		String codeTabel[] = { "41TIN1100", "48TIN1130", "41TIN1140", "41TIN1160", "41TIN1240", "41TIN1290",
				"41TIN1300", "42TIN1220", "42TIN1230", "43AON3120", "43AON3130" };
		String[] naamTabel = { "Web Essentials", "Java Essentials", ".Net Essentials", "SQL Essentials", "Desktop OS",
				"Math for IT", "Programming Basics", ".Net Advanced", "Java Advanced", "Programming Expert",
				"Mobile development" };
		int[] stpTabel = { 7, 6, 6, 3, 6, 6, 5, 3, 3, 3, 3 };

		Vak[] vakken = new Vak[codeTabel.length];

		for (int i = 0; i < codeTabel.length; i++) {
			Vak vak = new Vak(codeTabel[i], naamTabel[i], stpTabel[i]);
			vakken[i] = vak;
		}

		Leraar leraar = new Leraar("Daems", "Greta", 70);
		for (int i = 6; i < codeTabel.length; i++) {
			leraar.voegVakToe(vakken[i]);
		}

		leraar.print();

		// EXTRA -------- EXTRA

		Scanner keyboard = new Scanner(System.in);

		for (int i = 0; i < vakken.length; i++) {
			vakken[i] = null;
		}

		System.out.println("Geef de naam in:");
		String naam = keyboard.nextLine();
		System.out.println("Geef de voornaam in:");
		String voornaam = keyboard.nextLine();
		System.out.println("Geef het aanstellingspercentage in:");
		int aanstellingsperc = keyboard.nextInt();
		System.out.println("Geef in hoeveel vakken u wilt ingeven:");
		int aantalVakken = keyboard.nextInt();
		int[] gebruikteVakken = new int[codeTabel.length];

		for (int count = 0; count < aantalVakken; count++) {
			for (int i = 0; i < codeTabel.length; i++) {
				if (gebruikteVakken[i] == 0) {
					System.out.println((i + 1) + "\t" + codeTabel[i] + "\t" + naamTabel[i]);
				}

			}
			System.out.println("Geef een nummer in voor het vak te kiezen:");
			int keuze = keyboard.nextInt();
			while (gebruikteVakken[keuze - 1] == 1) {
				System.out.println("Geef een nummer in voor het vak te kiezen:");
				keuze = keyboard.nextInt();
			}
			Vak vak = new Vak(codeTabel[keuze - 1], naamTabel[keuze - 1], stpTabel[keuze - 1]);
			vakken[count] = vak;
			gebruikteVakken[keuze - 1] = 1;
		}

		Leraar leraar2 = new Leraar(naam, voornaam, aanstellingsperc);
		for (int i = 0; i < vakken.length; i++) {
			leraar2.voegVakToe(vakken[i]);
		}

		leraar2.print();

		keyboard.close();
	}

}
