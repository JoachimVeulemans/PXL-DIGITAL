package extraOefening2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExtraOefening2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een datum in volgens formaat MM/DD:");
		String input = keyboard.nextLine();

		LocalDate datum = LocalDate.of(LocalDate.now().getYear(), Integer.parseInt(input.substring(0, 2)), Integer.parseInt(input.substring(3, 5)));
		System.out.println(datum);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		System.out.println(datum.format(formatter) + ". Dit is dagnr " + datum.getDayOfYear() + ".");

		keyboard.close();
	}

}
