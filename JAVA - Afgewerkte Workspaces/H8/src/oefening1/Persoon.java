package oefening1;

public class Persoon {

	private String voornaam;
	private String naam;
	private double lengte;
	private double gewicht;
	private int geboortejaar;

	public Persoon(String naam, String voornaam) {
		this.voornaam = voornaam;
		this.naam = naam;
	}

	public Persoon() {
		this("onbekend", "onbekend");
	}

	public Persoon(Persoon persoon) {
		this(persoon.naam, persoon.voornaam);
		persoon.geboortejaar = geboortejaar;
		persoon.gewicht = gewicht;
		persoon.lengte = lengte;
	}

	public String toString() {
		StringBuilder tekst = new StringBuilder(String.format("Deze persoon is %s %s\n", this.voornaam, this.naam));
		tekst.append(String.format("%-15s : %.2f\n", "gewicht", this.gewicht));
		tekst.append(String.format("%-15s : %.2f\n", "lengte", this.lengte));
		tekst.append(String.format("%-15s : %d\n", "geboortejaar", this.geboortejaar));
		return tekst.toString();
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public double getLengte() {
		return lengte;
	}

	public void setLengte(double lengte) {
		this.lengte = lengte;

		if (this.lengte > 2.4) {
			this.lengte = 2.4;
		}
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public int getGeboortejaar() {
		return geboortejaar;
	}

	public void setGeboortejaar(int geboortejaar) {
		this.geboortejaar = geboortejaar;
	}

	public double berekenBmi() {
		double bmi = (this.gewicht / (this.lengte * this.lengte));
		return bmi;
	}

	public String geefOmschrijving() {
		if (this.berekenBmi() < 18) {
			return "ondergewicht";
		} else {
			if (this.berekenBmi() < 25) {
				return "normaal";
			} else {
				if (this.berekenBmi() < 30) {
					return "overgewicht";
				} else {
					if (this.berekenBmi() < 40) {
						return "obesitas";
					} else {
						return "morbide obesitas";
					}
				}
			}
		}
	}

	public void voegVoornamenToe(String... voornamen) {
		StringBuilder temp = new StringBuilder(this.getVoornaam());

		for (int i = 0; i < voornamen.length; i++) {
			temp.append(" ");
			temp.append(voornamen[i]);
		}

		this.setVoornaam(temp.toString());
	}

	public int getLeeftijd() {
		return (2017 - this.geboortejaar);
	}

	public void groei() {
		this.setLengte(this.lengte + 0.01);
	}

	public void groei(int cm) {
		this.setLengte(this.lengte + (cm / 100.0));
	}

}
