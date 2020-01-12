package ppt;

import java.time.Instant;
import java.util.Scanner;

public class Opdracht4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef uw naam in:");
		
		Instant tijdstip1 = Instant.now();
		long long1 = tijdstip1.toEpochMilli();

		String naam = keyboard.nextLine();

		Instant tijdstip2 = Instant.now();
		long long2 = tijdstip2.toEpochMilli();

		System.out.println("Het duurde " + (((double) long2 - long1) / 1000) + " seconden om uw naam in te geven.");

		keyboard.close();
	}

}
