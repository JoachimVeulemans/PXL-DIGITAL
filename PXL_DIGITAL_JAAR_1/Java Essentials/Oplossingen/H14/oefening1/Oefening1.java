package oefening1;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Oefening1 {

	public static void main(String[] args) {
		try {
			DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

			LocalDateTime dt = LocalDateTime.parse("03/08/1998 13:45:23", myFormatter);

			System.out.println(myFormatter.format(dt));
			System.out.println(isoFormatter.format(dt));
		} catch (DateTimeException ex) {
			System.out.println("Verkeerde invoer!");
		}

	}

}
