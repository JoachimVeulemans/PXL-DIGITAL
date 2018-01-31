package extraOefening1;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Opdracht5 {

	public static void main(String[] args) {
		try {
			Scanner keyboard = new Scanner(System.in);

			System.out.println("Geef een weekdag in het Engels in:");
			String weekdag = keyboard.nextLine().toUpperCase();

			System.out.println("Geef in hoeveel dagen u er bij wilt optellen:");
			int aantal = keyboard.nextInt();

			int nieuweDag = DayOfWeek.valueOf(weekdag).getValue() + aantal;
			while (nieuweDag > 7) {
				nieuweDag -= 7;
			}

			System.out.println(DayOfWeek.of(nieuweDag));

			keyboard.close();
		} catch (IllegalArgumentException ex) {
			System.out.println("Verkeerde dag ingegeven!");
		} catch (InputMismatchException ex) {
			System.out.println("Verkeerd aantal dagen ingegeven!");
		} catch (DateTimeException ex) {
			System.out.println("Aantal dagen is negatief!");
		}
	}

}
