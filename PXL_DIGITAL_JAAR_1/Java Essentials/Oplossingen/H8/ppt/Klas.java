package ppt;

public class Klas {

	private String naam;
	private int aantalStudenten;
	private static int maxStudenten;
	private static int aantalObjecten;
	private static int totaalStudenten;

	static {
		maxStudenten = 40;
	}

	{
		aantalObjecten++;
	}

	public Klas() {
		this("1TINx", 0);
	}

	public Klas(String naam, int aantalStudenten) {
		this.naam = naam;
		this.setAantalStudenten(aantalStudenten);

	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getAantalStudenten() {
		return aantalStudenten;
	}

	public void setAantalStudenten(int aantal) {
		if (aantal > maxStudenten) {

			aantal = maxStudenten;
		}

		Klas.totaalStudenten += aantal - this.getAantalStudenten();
		this.aantalStudenten = aantal;

	}

	public static int getAantalObjecten() {
		return Klas.aantalObjecten;
	}

	public static int getTotaalStudenten() {
		return Klas.totaalStudenten;
	}

}
