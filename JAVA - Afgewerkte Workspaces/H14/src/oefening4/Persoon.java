package oefening4;

public class Persoon {
	private String naam;
	private String voornaam;
	private Datum geboortedatum;
	private Adres adres = new Adres();

	public Persoon() throws DatumException {
		this("Aerts", "Jef", 29, 11, 1990, "lindestraat", "23D", 3500, "Hasselt");
	}

	public Persoon(String naam, String voornaam, int dag, int maand, int jaar, String straat, String huisnummer, int postcode, String gemeente) throws DatumException {
		this.naam = naam;
		this.voornaam = voornaam;
		geboortedatum = new Datum(dag, maand, jaar);
		adres.setStraat(straat);
		adres.setHuisnr(huisnummer);
		adres.getGemeente().setGemNaam(gemeente);
		adres.getGemeente().setPostcode(postcode);
	}

	public Persoon(String naam, String voornaam, Datum g, Adres a) {
		this.naam = naam;
		this.voornaam = voornaam;
		geboortedatum = g;
		adres = a;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public Datum getGeboortedatum() {
		return geboortedatum;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public void voegVoornamenToe(String... voornamen) {
		for (int i = 0; i < voornamen.length; i++) {
			this.voornaam = this.voornaam.concat(" ").concat(voornamen[i]);
		}
	}

	public String toString() {
		return this.voornaam + " " + this.naam + "\n" + adres.getStraat() + " " + adres.getHuisnr() + "\n"
				+ adres.getGemeente().getPostcode() + " " + adres.getGemeente().getGemNaam();
	}

}
