package extraOefening1;

public abstract class Structuur {
	Huisnummer nummer;

	public abstract void beschrijf();

	public Structuur(Huisnummer h) {
		nummer = new Huisnummer(h);
	}

	public Huisnummer getNummer() {
		return nummer;
	}

	public boolean equals(Structuur s) {
		return this.nummer.equals(s.nummer);
	}
}
