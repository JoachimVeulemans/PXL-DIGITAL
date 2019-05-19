package oefening1;

public class Adres {
	private String straat;
	private String huisnr;
	private Gemeente gemeente = new Gemeente();

	public Adres(String straat, String huisnummer, int postcode, String stad) {
		this.straat = straat;
		this.huisnr = huisnummer;
		gemeente.setPostcode(postcode);
		gemeente.setGemNaam(stad);
	}

	public Adres() {
		this("onbekend", "onbekend", 0000, "onbekend");
	}

	public String getStraat() {
		return straat;
	}

	public void setStraat(String straat) {
		this.straat = straat;
	}

	public String getHuisnr() {
		return huisnr;
	}

	public void setHuisnr(String huisnr) {
		this.huisnr = huisnr;
	}

	public Gemeente getGemeente() {
		return gemeente;
	}

	public String toString() {
		return this.straat + " " + this.huisnr + "\n" + gemeente.getPostcode() + " " + gemeente.getGemNaam();
	}

}
