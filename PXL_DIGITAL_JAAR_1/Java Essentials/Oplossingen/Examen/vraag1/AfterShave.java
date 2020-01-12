package vraag1;

public class AfterShave extends Product {
	
	public AfterShave(int productNummer, String merk, String naam, int volume, double prijs, DeoType soort) {
		super(productNummer, merk, naam, volume, prijs);
		this.soort = soort;
	}

	private DeoType soort;
	
	@Override
	public String toString() {
		return super.toString() + this.soort;
	}
	
	
}
