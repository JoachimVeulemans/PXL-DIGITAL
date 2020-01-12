package project2;

public abstract class Spel {
	private String naam;
	private int minimumLeeftijd;
	private Uitgever uitgever;
	
	public Spel(String naam, Uitgever uitgever) {
		this.naam = naam;
		this.uitgever = uitgever;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getMinimumLeeftijd() {
		return minimumLeeftijd;
	}

	public void setMinimumLeeftijd(int minimumLeeftijd) {
		this.minimumLeeftijd = minimumLeeftijd;
		if (this.minimumLeeftijd < 0) {
			this.minimumLeeftijd = 12;
		}
	}
	
	public String toString() {
		return "{naam='" + this.naam + "', minimumLeeftijd=" + this.minimumLeeftijd + ",\nuitgever=" + uitgever.toString();
	}

	public Uitgever getUitgever() {
		return uitgever;
	}
}
