package oefening2;

public class VliegtuigReis extends Reis {
	private String vluchtnummer;
	private final int MINPRIJS = 25;

	/**
	 * Deze constructor maakt een VliegtuigReis-object aan
	 * @param bestemming bepaald de bestemming van het object
	 * @see oefening2.VliegtuigReis#setPrijs(double)
	 * @see oefening2.VliegtuigReis#setVluchtnummer(String)
	 */
	public VliegtuigReis(String bestemming) {
		this(bestemming, 0, bestemming.substring(0, 1).concat("999"));
	}

	public VliegtuigReis(String bestemming, double prijs, String vluchtnummer) {
		super(bestemming, prijs);
		this.vluchtnummer = vluchtnummer;
	}

	public String getVluchtnummer() {
		return vluchtnummer;
	}

	public void setVluchtnummer(String vluchtnummer) {
		this.vluchtnummer = vluchtnummer;
		String EersteLetter = this.getBestemming().substring(0, 1);
		if (!this.vluchtnummer.substring(0, 1).equals(EersteLetter)) {
			this.vluchtnummer = EersteLetter.concat(this.vluchtnummer);
		}
	}

	public int getMINPRIJS() {
		return MINPRIJS;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Vliegtuigreis (vluchtnr " + this.vluchtnummer + ")");
	}

}
