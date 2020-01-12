package project2_Uitbreiding;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.temporal.ChronoUnit;

public class Uitgever {
	private String naam;
	private LocalDate datumOprichting;
	private String hoofdkantoor;
	private String website;

	public Uitgever(String naam, String hoofdkantoor, LocalDate datumOprichting) {
		this.naam = naam;
		this.hoofdkantoor = hoofdkantoor;
		this.setDatumOprichting(datumOprichting);
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public LocalDate getDatumOprichting() {
		return datumOprichting;
	}

	public void setDatumOprichting(LocalDate datumOprichting) {
		this.datumOprichting = datumOprichting;
		if (ChronoUnit.DAYS.between(this.datumOprichting, LocalDate.now()) < 0) {
			this.datumOprichting = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), 01);
		}
	}

	public String getHoofdkantoor() {
		return hoofdkantoor;
	}

	public long getMaandenSindsOprichting() {
		return ChronoUnit.MONTHS.between(this.datumOprichting, LocalDate.now());
	}

	public void setHoofdkantoor(String hoofdkantoor) {
		this.hoofdkantoor = hoofdkantoor;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String toString() {
		return "Uitgever{naam='" + this.naam + "', datumOprichting=" + this.datumOprichting + ", hoofdkantoor='"
				+ this.hoofdkantoor + "', website='" + this.website + "'}";
	}
}
