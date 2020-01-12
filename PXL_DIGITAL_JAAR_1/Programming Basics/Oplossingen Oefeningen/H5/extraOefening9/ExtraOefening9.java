package extraOefening9;

import java.util.Scanner;

public class ExtraOefening9 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int geboorteDag, geboorteMaand, geboorteJaar, vandaagDag, vandaagMaand, vandaagJaar, totaal;

		System.out.println("Geef je geboortedag in:");
		geboorteDag = keyboard.nextInt();

		System.out.println("Geef je geboortemaand in:");
		geboorteMaand = keyboard.nextInt();

		System.out.println("Geef je geboortejaar in:");
		geboorteJaar = keyboard.nextInt();

		System.out.println("Geef de dag van vandaag in:");
		vandaagDag = keyboard.nextInt();

		System.out.println("Geef de dag van maand in:");
		vandaagMaand = keyboard.nextInt();

		System.out.println("Geef de dag van jaar in:");
		vandaagJaar = keyboard.nextInt();

		if (geboorteMaand > vandaagMaand || (geboorteMaand == vandaagMaand) && geboorteDag > vandaagDag) {
			totaal = (vandaagJaar - geboorteJaar - 1);
		} else {
			totaal = (vandaagJaar - geboorteJaar);
		}
		System.out.println("Je bent " + totaal + " jaar.");
		
		keyboard.close();
	}

}
