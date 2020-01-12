package extraOefening3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExtraOefening3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een beginjaar in:");
		String beginjaar = keyboard.nextLine();

		System.out.println("Geef een eindjaar in:");
		String eindjaar = keyboard.nextLine();

		int aantalJaar = Integer.parseInt(eindjaar) - Integer.parseInt(beginjaar);
		LocalDate[][] datums = new LocalDate[aantalJaar + 1][12];

		System.out.println("Lijst van vrijdag de 13de in het jaar " + beginjaar + " tot en met het jaar " + eindjaar);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");

		for (int jaren = 0; jaren < datums.length; jaren++) {
			for (int maanden = 0; maanden < datums[jaren].length; maanden++) {
				datums[jaren][maanden] = LocalDate.of(Integer.parseInt(beginjaar) + jaren, maanden + 1, 13);
				if (datums[jaren][maanden].getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
					System.out.println(datums[jaren][maanden].format(formatter));
				}
			}
		}

		keyboard.close();

	}

}
