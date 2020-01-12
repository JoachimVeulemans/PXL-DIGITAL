package oefening3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class HuwelijkAppBis {

	public static void main(String[] args) {
		Persoon persoon1 = new Persoon("Petersen", "An", 29, 4, 1958, "Bloemweg", "5", 3500, "Hasselt");
		Persoon persoon2 = new Persoon("Janssen", "Dirk", 13, 7, 1954, "Bloemweg", "5", 3500, "Hasselt");
		
		System.out.println("Persoon 1 " + persoon1.getVoornaam() + " " + persoon1.getNaam() + " geboren op " + persoon1.getGeboortedatum().getDayOfMonth() + "/" + persoon1.getGeboortedatum().getMonthValue() + "/" + persoon1.getGeboortedatum().getYear() + " wonend te " + persoon1.getAdres().getStraat() + " " + persoon1.getAdres().getHuisnr() + ", " + persoon1.getAdres().getGemeente().getPostcode() + " " + persoon1.getAdres().getGemeente().getGemNaam());
		System.out.println("Persoon 2 " + persoon2.getVoornaam() + " " + persoon2.getNaam() + " geboren op " + persoon2.getGeboortedatum().getDayOfMonth() + "/" + persoon2.getGeboortedatum().getMonthValue() + "/" + persoon2.getGeboortedatum().getYear() + " wonend te " + persoon2.getAdres().getStraat() + " " + persoon2.getAdres().getHuisnr() + ", " + persoon2.getAdres().getGemeente().getPostcode() + " " + persoon2.getAdres().getGemeente().getGemNaam());

		int huwDag = LocalDate.of(1987, 6, 1).with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.SATURDAY)).getDayOfMonth();
		Huwelijk huwelijk = new Huwelijk(persoon1, persoon2, huwDag, 6, 1987);
		System.out.println(persoon1.getLeeftijd());
		
		System.out.println(huwelijk.getPersoon1().getVoornaam().toUpperCase() + " (" + Integer.toString(huwelijk.getPersoon1().getLeeftijd()) + ") en " + huwelijk.getPersoon2().getVoornaam().toUpperCase() + " (" + Integer.toString(huwelijk.getPersoon2().getLeeftijd()) + ") zijn " + Period.between(huwelijk.getHuwelijksdatum(), LocalDate.now()).getYears() + " jaar getrouwd");
		
		System.out.println(huwelijk.printFeest());
		
	}

}
