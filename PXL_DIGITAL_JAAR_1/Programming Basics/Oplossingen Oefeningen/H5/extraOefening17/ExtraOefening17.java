package extraOefening17;

import java.util.Scanner;

public class ExtraOefening17 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double rentPercentage;
		int beginKapitaal, jaar;
		jaar = 0;

		System.out.println("Geef het rentpercentage in:");
		rentPercentage = keyboard.nextDouble();

		System.out.println("Geef het beginkapitaal in:");
		beginKapitaal = keyboard.nextInt();

		for (double eindKapitaal = beginKapitaal; eindKapitaal <= (beginKapitaal * 2); jaar++) {
			eindKapitaal = eindKapitaal + (eindKapitaal * (rentPercentage / 100));
		}

		System.out.println("Het duurt " + jaar + " jaar.");

		keyboard.close();
	}

}
