package project2_Uitbreiding;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Speler {
	private String naam;
	private LocalDate geboortedatum;

	public Speler(String naam, LocalDate geboortedatum) {
		this.naam = naam;
		this.setGeboortedatum(geboortedatum);
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public LocalDate getGeboortedatum() {
		return geboortedatum;
	}

	public void setGeboortedatum(LocalDate geboortedatum) {
		if (geboortedatum != null) {
				if (ChronoUnit.DAYS.between(geboortedatum, LocalDate.now()) > 0) {
					this.geboortedatum = geboortedatum;
				}
		}
	}

	public int getLeeftijd() {
		if (this.geboortedatum == null) {
			return -1;
		} else {
			return (int) (ChronoUnit.YEARS.between(this.geboortedatum, LocalDate.now()));
		}
	}
}
