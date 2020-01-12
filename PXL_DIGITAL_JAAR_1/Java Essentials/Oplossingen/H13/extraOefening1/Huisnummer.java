package extraOefening1;

public class Huisnummer {
	private int getal;
	private char symbool;

	public Huisnummer(int getal, char symbool) {
		if (getal <= 0 || getal >= 1000 || (!(Character.getNumericValue(symbool) >= 10 && Character.getNumericValue(symbool) <= 35) || symbool == ' ')) {
			this.getal = -1;
			this.symbool = ' ';
		} else {
			this.getal = getal;
			this.symbool = symbool;
		}
	}

	public Huisnummer(Huisnummer h) {
		this(h.getal, h.symbool);
	}

	public String getHuisnummer() {
		if (this.symbool == ' ') {
			return Integer.toString(this.getal);
		} else {
			return Integer.toString(this.getal) + this.symbool;
		}
	}

	public boolean equals(Huisnummer h) {
		if (this.getal == h.getal && this.symbool == h.symbool) {
			return true;
		} else {
			return false;
		}
	}
}
