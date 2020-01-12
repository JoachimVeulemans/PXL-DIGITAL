package extraOefening7;

import java.util.Scanner;

public class ExtraOefening7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double prijsMetBtw, prijsZonderBtw, prijsBtw;
		int Btw;

		System.out.println("Geef de prijs incl BTW in:");
		prijsMetBtw = keyboard.nextDouble();

		System.out.println("Geef de BTW in % in:");
		Btw = keyboard.nextInt();

		switch (Btw) {
		case 6:
		case 17:
		case 19:
		case 25:
		case 33:
			break;
		default:
			Btw = 21;

		}
		
		prijsBtw = ((Btw / 100.0) * prijsMetBtw);
		prijsZonderBtw = (prijsMetBtw - prijsBtw);
		
		System.out.println("Het BTW-percentage is " + Btw + "%.");
		System.out.println("De prijs excl BTW is €" + prijsZonderBtw + ".");
		System.out.println("Het BTW-bedrag is €" + prijsBtw + ".");

		keyboard.close();
	}

}
