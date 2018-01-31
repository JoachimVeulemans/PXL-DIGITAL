package oefening5;

public class Auto {

	private String merk;
	private String model;
	private int bouwjaar;
	private String kleur;
	private int maxSnelheid;
	public static final int MAX = 180;
	private static int count = 0;

	{
		count++;
	}

	public void controleMax() {
		if (maxSnelheid > MAX) {
			maxSnelheid = MAX;
		}
	}

	public Auto() {
		this("VW", "Polo", 2017, "Grijs", 160);
	}

	public Auto(String merk, String model, int bouwjaar, String kleur, int maxSnelheid) {
		this.merk = merk;
		this.model = model;
		this.bouwjaar = bouwjaar;
		this.kleur = kleur;
		this.maxSnelheid = maxSnelheid;
		controleMax();
	}

	public Auto(Auto auto) {
		this(auto.merk, auto.model, auto.bouwjaar, auto.kleur, auto.maxSnelheid);
	}

	public String getMerk() {
		return merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getBouwjaar() {
		return bouwjaar;
	}

	public void setBouwjaar(int bouwjaar) {
		this.bouwjaar = bouwjaar;
	}

	public String getKleur() {
		return kleur;
	}

	public void setKleur(String kleur) {
		this.kleur = kleur;
	}

	public int getMaxSnelheid() {
		return maxSnelheid;
	}

	public void setMaxSnelheid(int maxSnelheid) {
		this.maxSnelheid = maxSnelheid;
		controleMax();
	}

	public static int getMax() {
		return MAX;
	}

	public void print() {
		System.out.println(this.merk);
		System.out.println(this.model);
		System.out.println(this.bouwjaar);
		System.out.println(this.kleur);
		System.out.println(this.maxSnelheid);
	}

	public static int getCount() {
		return count;
	}

}
