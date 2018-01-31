package project2;

public class BordSpel extends Spel {
	private int speelduur;
	private int aantalSpelers;
	
	public BordSpel(String naam, Uitgever uitgever) {
		super(naam, uitgever);
	}

	public int getSpeelduur() {
		return speelduur;
	}

	public void setSpeelduur(int speelduur) {
		this.speelduur = speelduur;
		if ( this.speelduur < 0) {
			this.speelduur = 30;
		}
	}

	public int getAantalSpelers() {
		return aantalSpelers;
	}

	public void setAantalSpelers(int aantalSpelers) {
		this.aantalSpelers = aantalSpelers;
		if (this.aantalSpelers < 0) {
			this.aantalSpelers = 1;
		}
	}
	
	@Override
	public String toString() {
		return "BordSpel" + super.toString() + ", aantalSpelers=" + this.aantalSpelers + ", speelduur=" + this.speelduur + "}";
	}
}
