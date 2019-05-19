package extraOefening1;

public class Tshirt {
	
	private TShirtSize maat;
	private Kleur kleur;
	private int aantalBesteld;
	
	public Tshirt(TShirtSize maat, Kleur kleur) {
		this(maat, kleur, 0);
	}
	
	public Tshirt(TShirtSize maat, Kleur kleur, int aantal) {
		this.maat = maat;
		this.kleur = kleur;
		this.aantalBesteld = aantal;
	}

	public TShirtSize getMaat() {
		return maat;
	}

	public void setMaat(TShirtSize maat) {
		this.maat = maat;
	}

	public Kleur getKleur() {
		return kleur;
	}

	public void setKleur(Kleur kleur) {
		this.kleur = kleur;
	}

	public int getAantalBesteld() {
		return aantalBesteld;
	}

	public void setAantalBesteld(int aantalBesteld) {
		this.aantalBesteld = aantalBesteld;
	}
	
	@Override
	public boolean equals(Object object) {
		if (object instanceof Tshirt && (this.getKleur().equals(((Tshirt) object).getKleur())) && (this.getMaat().equals(((Tshirt) object).getMaat()))) {
			return true;
		}
		return false;
	}
	
}
