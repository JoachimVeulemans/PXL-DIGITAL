package oefening1;

import ppt.Persoon;

public class Werknemer extends Persoon {
	private String functie;
	private double salaris;
	private static final int MINSALARIS = 1000;
	private static int count = 0;

	{
		count++;
	}

	public static void setCount(int count) {
		Werknemer.count = count;
	}

	public Werknemer(String naam, String voornaam) {
		this(naam, voornaam, "algemeen bediende", 1800);
	}

	public Werknemer(String naam, String voornaam, String functie, double salaris) {
		super(naam, voornaam);
		this.functie = functie;
		this.setSalaris(salaris);
	}

	public String getFunctie() {
		return functie;
	}

	public void setFunctie(String functie) {
		this.functie = functie;
	}

	public double getSalaris() {
		return salaris;
	}

	public void setSalaris(double salaris) {
		this.salaris = salaris;
		if (this.salaris < Werknemer.MINSALARIS) {
			this.salaris = Werknemer.MINSALARIS;
		}
	}

	@Override
	public void print() {
		System.out.println("Naam: " + this.getNaam());
		System.out.println("Voornaam: " + this.getVoornaam());
		System.out.println("Salaris: " + this.salaris);
		System.out.println("Functie: " + this.functie);
	}

	public static int getMinsalaris() {
		return MINSALARIS;
	}

	public static int getAantal() {
		return count;
	}

}
