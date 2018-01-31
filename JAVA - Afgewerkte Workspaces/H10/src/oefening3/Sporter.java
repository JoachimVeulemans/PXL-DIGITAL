package oefening3;

import ppt.Persoon;

public class Sporter extends Persoon {
	private String omschrijving;
	private static int count = 0;

	{
		count++;
	}

	public Sporter(String naam, String voornaam) {
		this(naam, voornaam, "onbepaald");
	}

	public Sporter(String naam, String voornaam, String omschrijving) {
		super(naam, voornaam);
		this.omschrijving = omschrijving;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public static int getCount() {
		return count;
	}

	public void print() {
		System.out.println(super.getVoornaam() + " " + super.getNaam());
		System.out.println(this.getOmschrijving());
	}

}
