package extraOefening1;

import java.util.Scanner;

public class ExtraOefening1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		StringBuilder totaal = new StringBuilder("");

		System.out.println("Geef een reeks getallen in (telkens gescheiden door één spatie - mag op meerdere regels):");
		String input = keyboard.nextLine();

		while (!input.toLowerCase().equals("stop")) {
			totaal.append(input).append(" ");
			input = keyboard.nextLine();
		}

		int totaalPlaatsen = 0;
		for (int i = 0; i < totaal.toString().length(); i++) {
			if (totaal.charAt(i) == ' ') {
				totaalPlaatsen++;
			}
		}
		double[] getallen = new double[totaalPlaatsen];

		int posBegin = 0;
		int count = 0;
		for (int posEind = 1; posEind < totaal.toString().length(); posEind++) {
			if (totaal.charAt(posEind) == ' ') {
				getallen[count] = Double.parseDouble(totaal.substring(posBegin, posEind));
				count++;
				posBegin = posEind;
			}
		}

		double[] getal = new double[getallen.length / 2];
		for (int i = 0; i < getal.length; i++) {
			getal[i] = getallen[i] / getallen[getallen.length - i - 1];
		}

		for (int i = getal.length - 1; i >= 0; i--) {
			if (Double.toString(getal[i]).equals("NaN")) {
				System.out.println("uitkomst van de deling " + getal[i] + " Deling is niet mogelijk 0/0");
			} else {
				if (Double.toString(getal[i]).equals("Infinity")) {
					System.out.println("uitkomst van de deling " + getal[i] + " Deling is niet mogelijk r/0 met r <>0");
				} else {
					System.out.printf("%.2f\n", getal[i]);
				}
			}

		}

		keyboard.close();

	}

}
