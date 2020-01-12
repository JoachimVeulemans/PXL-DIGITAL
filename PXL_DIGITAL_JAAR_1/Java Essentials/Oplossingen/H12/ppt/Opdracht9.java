package ppt;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Opdracht9 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een datum in in formaat DD/MM/YYYY:");
		String datum = keyboard.nextLine();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate datumFormatted = LocalDate.parse(datum, formatter);
		System.out.println(datumFormatted);

		keyboard.close();
	}

}
