package ppt;

public class Persoon {

	private String naam;
	private String voornaam;
	private static int count = 0;
	
	{
		count++;
	}

	public static int getAantal() {
		return count;
	}

	public Persoon() {
		this("onbekend", "onbekend");
	}

	public Persoon(String naam, String voornaam) {
		this.naam = naam;
		this.voornaam = voornaam;
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
	
	public void print() {
		System.out.println(this.naam);
		System.out.println(this.voornaam);
	}
}
