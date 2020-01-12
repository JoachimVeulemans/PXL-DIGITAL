
/**
 * Het package <b>oefening2</b> bevat de klasse Reis, TreinReis, VliegtuigReis, GeboekteReis
 * @author Joachim
 * @version 1.0
 */
package oefening2;

public abstract class Reis {
	private String bestemming;
	private double prijs;
	/**
	 * Bepaald de minimumprijs van de variable prijs in Reis
	 */
	private static final double MINPRIJS = 5;

	public Reis(String bestemming) {
		this(bestemming, Reis.MINPRIJS);
	}

	public Reis(String bestemming, double prijs) {
		this.bestemming = bestemming;
		this.prijs = prijs;
	}

	public String getBestemming() {
		return bestemming;
	}

	public void setBestemming(String bestemming) {
		this.bestemming = bestemming;
		int count = 0;
		for (int i = 0; i < 10; i++) {
			if (this.bestemming.substring(0, 1).equals(Integer.toString(i))) {
				count++;
			}
		}
		if (count != 0) {
			this.bestemming = this.bestemming.substring(1);
		}
	}

	public double getPrijs() {
		return prijs;
	}

	public void setPrijs(double prijs) {
		this.prijs = prijs;
		if (this.prijs < Reis.MINPRIJS) {
			this.prijs = Reis.MINPRIJS;
		}
	}

	public static double getMinprijs() {
		return MINPRIJS;
	}

	public void print() {
		System.out.println(
				"Reis met bestemming " + this.bestemming + " kost " + ((int) (this.prijs * 100)) / 100.0 + " euro.");
	}

}
