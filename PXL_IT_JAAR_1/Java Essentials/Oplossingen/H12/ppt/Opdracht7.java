package ppt;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Opdracht7 {

	public static void main(String[] args) {
		ZoneId huidigePlaats = ZoneId.systemDefault();
		ZonedDateTime huidigeTijd = ZonedDateTime.now(huidigePlaats);
		System.out.println("Huidige plaats: " + huidigeTijd);

		ZoneId londonPlaats = ZoneId.of("Europe/London");
		ZonedDateTime londonTijd = ZonedDateTime.now(londonPlaats);
		System.out.println("London: " + londonTijd);

		ZoneId sydneyPlaats = ZoneId.of("Australia/Sydney");
		ZonedDateTime sydneyTijd = ZonedDateTime.now(sydneyPlaats);
		System.out.println("Sydney: " + sydneyTijd);

		ZoneId los_angelesPlaats = ZoneId.of("America/Los_Angeles");
		ZonedDateTime los_angelesTijd = ZonedDateTime.now(los_angelesPlaats);
		System.out.println("Los Angeles: " + los_angelesTijd);

		ZoneId UTC4Plaats = ZoneId.of("UTC-4");
		ZonedDateTime UTC4Tijd = ZonedDateTime.now(UTC4Plaats);
		System.out.println("UTC-4: " + UTC4Tijd);
	}

}
