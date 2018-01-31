package extraOefening7;

import java.util.Scanner;

public class ExtraOefening7Extra1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double prijsMetBtw, prijsZonderBtw, prijsBtw;
		int artikelnummer, Btw, artikelnummerkort;

		System.out.println("Geef de prijs incl BTW in:");
		prijsMetBtw = keyboard.nextDouble();

		System.out.println("Geef het artikelnummer in:");
		artikelnummer = keyboard.nextInt();
		
		artikelnummerkort = (int)(artikelnummer / 1000);

		switch (artikelnummerkort) {
		case 1:
			Btw = 6;
			break;
		case 2:
			Btw = 17;
			break;
		case 3:
			Btw = 19;
			break;
		case 4:
			Btw = 25;
			break;
		case 5:
			Btw = 33;
			break;
		default:
			Btw = 21;
		}
		prijsBtw = ((Btw / 100.0) * prijsMetBtw);		
		prijsZonderBtw = (prijsMetBtw - prijsBtw);

		System.out.println("Het BTW-percentage is " + Btw + "%.");
		System.out.println("De prijs excl BTW is €" + prijsZonderBtw + ".");
		System.out.println("Het BTW-bedrag is €" + prijsBtw + ".");
		System.out.println("Het artikelnummer is " + artikelnummer + ".");

		keyboard.close();
	}

}
