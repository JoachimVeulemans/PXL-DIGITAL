package extraOefening13;

import java.util.Scanner;

public class ExtraOefening13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int jaren;
		double beginkapitaal, eindkapitaal, intrest, tussenWaarde;

		System.out.println("Geef het beginkapitaal in:");
		beginkapitaal = keyboard.nextDouble();

		System.out.println("Geef de intrestvoet in:");
		intrest = keyboard.nextDouble();

		System.out.println("Geef het aantal jaren in:");
		jaren = keyboard.nextInt();

		for (int jarenOptellen = 1; jarenOptellen < jaren + 1; jarenOptellen++) {
			
			tussenWaarde = (1 + intrest);

			for (int count = 1; count < jarenOptellen; count++) {
				tussenWaarde = tussenWaarde * (1 + intrest);
			}

			eindkapitaal = (beginkapitaal * tussenWaarde);

			if (jarenOptellen == 1) {
				System.out.println("Na " + jarenOptellen + " jaar is het eindkapitaal €" + (int) eindkapitaal + ".");
			} else {
				System.out.println("Na " + jarenOptellen + " jaren is het eindkapitaal €" + (int) eindkapitaal + ".");
			}
		}

		keyboard.close();
	}

}
