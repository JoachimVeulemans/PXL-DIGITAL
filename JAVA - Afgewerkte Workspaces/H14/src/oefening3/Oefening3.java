package oefening3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Oefening3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		try {
			System.out.println("Geef een datum in dd-MM-yyyy in:");
			LocalDate.parse(keyboard.nextLine(), formatter);
		} catch (DateTimeParseException ex) {
			System.out.println("Foutieve ingave! Probeer opnieuw!");
			main(args);
		}

		keyboard.close();

	}

}
