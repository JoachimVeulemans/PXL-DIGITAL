package extraOefening3;

public class Munt {
	private String naam;
	private double koers;
	private static final int AFRONDING = 3;
	private static int aantal;

	public Munt() {
		this("euro", 1.100);
	}

	public Munt(String n, double k) {
		this.naam = n;
		this.koers = k;
		this.afronden();
	}

	public void afronden() {
		int deler = 1;
		for (int i = 0; i < Munt.AFRONDING; i++) {
			deler *= 10;
		}
		this.koers = ((int) (this.koers * deler));
		this.koers = this.koers / (double) deler;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String n) {
		this.naam = n;
	}

	public double getKoers() {
		return koers;
	}

	public void setKoers(double k) {
		this.koers = k;
		this.afronden();
	}

	public static int getAfronding() {
		return AFRONDING;
	}

	public static int getAantal() {
		return aantal;
	}

}
