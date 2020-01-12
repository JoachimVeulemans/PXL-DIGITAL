package vraag1;

public abstract class Product {
	private int productNummer;
	private String merk;
	private String naam;
	private int volume;
	private double prijs;

	public Product(int productNummer, String merk, String naam, int volume, double prijs) {
		this.productNummer = productNummer;
		this.merk = merk;
		this.naam = naam;
		this.volume = volume;
		this.prijs = prijs;
	}

	public int getProductNummer() {
		return productNummer;
	}

	public void setProductNummer(int productNummer) {
		this.productNummer = productNummer;
	}

	public String getMerk() {
		return merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public double getPrijs() {
		return prijs;
	}

	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}

	public String getProductCode() {
		StringBuilder tekst = new StringBuilder("");
		tekst.append(this.merk.substring(0, 3));
		tekst.append(this.naam.substring(0, 3));
		tekst.append(this.volume);
		return tekst.toString().replace(' ', '_').toUpperCase();
	}

	@Override
	public String toString() {
		return String.format("%-5dMerk: %-20sNaam:%-25sVolume:%5dml Prijs: %2.2f Code: %-12s", this.productNummer, this.merk, this.naam, this.volume, this.prijs, this.getProductCode());
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof Product && this.merk.equals(((Product) object).getMerk()) && this.naam.equals(((Product) object).getNaam()) && this.volume == ((Product) object).getVolume()) {
			return true;
		} else {
			return false;
		}
	}
}
