package oefening5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persoon {
	private String naam;
	private LocalDate geboorteDatum;

	public Persoon(String naam, int dag, int maand, int jaar) {
		this.naam = naam;
		this.geboorteDatum = LocalDate.of(jaar, maand, dag);
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof Persoon && this.naam.equals(((Persoon) object).naam)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return this.naam + " " + this.geboorteDatum.getDayOfMonth() + " " + this.geboorteDatum.getMonthValue() + " " + this.geboorteDatum.getYear();
	}

	public long aantalDagenTotVerjaardag() {
		return ChronoUnit.DAYS.between(this.geboorteDatum, LocalDate.now());
	}

	public String getNaam() {
		return naam;
	}
}
