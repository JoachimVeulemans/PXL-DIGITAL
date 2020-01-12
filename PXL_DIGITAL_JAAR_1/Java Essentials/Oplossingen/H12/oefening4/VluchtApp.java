package oefening4;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VluchtApp {

	public static void main(String[] args) {
		Instant tijdstip1 = Instant.now();
		long long1 = tijdstip1.toEpochMilli();

		Vlucht[] vluchten = new Vlucht[7];

		vluchten[0] = new Vlucht("America", "New York", 8, 30);
		vluchten[1] = new Vlucht("Africa", "Luanda", 8, 30);
		vluchten[2] = new Vlucht("Asia", "Beirut", 4, 10);
		vluchten[3] = new Vlucht("Asia", "Bangkok", 11, 5);
		vluchten[4] = new Vlucht("Asia", "Tokyo", 11, 20);
		vluchten[5] = new Vlucht("America", "Montreal", 7, 55);
		vluchten[6] = new Vlucht("Atlantic", "Reykjavik", 3, 25);

		System.out.println("---------- 2 ----------");
		for (int i = 0; i < vluchten.length; i++) {
			System.out.println(vluchten[i].getAankomst(LocalDate.of(2017, 1, 5), LocalTime.of(20, 15)));
			System.out.println();
		}

		System.out.println("---------- 3 ----------");
		for (int i = 0; i < vluchten.length; i++) {
			System.out.println(vluchten[i].getAankomstFormatted(LocalDate.of(2017, 1, 5), LocalTime.of(20, 15)));
			System.out.println();
		}

		System.out.println("---------- 4 ----------");
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een vertrekmoment in in het formaat dd/MM/yyyy HH:mm:");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDateTime vertrek = LocalDateTime.parse(keyboard.nextLine(), formatter);

		for (int i = 0; i < vluchten.length; i++) {
			System.out.println(vluchten[i].getAankomstFormatted(vertrek));
			System.out.println();
		}

		keyboard.close();

		System.out.println("---------- 5 ----------");
		Instant tijdstip2 = Instant.now();
		long long2 = tijdstip2.toEpochMilli();

		System.out.println("Het duurde " + (((double) long2 - long1) / 1000) + " seconden om het programma uit te voeren.");

	}

}
