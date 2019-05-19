package oefening4;

public class Datum {

	private int dag;
	private int maand;
	private int jaar;
	private String[] maandNamen = { "januari", "februari", "maart", "april", "mei", "juni", "juli", "augustus",
			"september", "oktober", "november", "december" };

	public Datum() throws DatumException {
		this(1, 1, 2017);
	}

	public Datum(int d, int m, int j) throws DatumException {
		this.dag = d;
		this.setMaand(m);
		this.jaar = j;
	}

	public Datum(Datum d) throws DatumException {
		this(d.dag, d.maand, d.jaar);
	}

	public void setDag(int d) {
		this.dag = d;
	}

	public void setMaand(int m) throws DatumException {
		this.maand = m;
		if (m < 1) {
			throw new DatumException();
		}
		if (m > 12) {
			throw new DatumException();
		}
	}

	public void setJaar(int j) {
		this.jaar = j;
	}

	public int getDag() {
		return this.dag;
	}

	public int getMaandNr() {
		return this.maand;
	}

	public String getMaandNaam() {
		return maandNamen[this.maand - 1];
	}

	public int getJaar() {
		return this.jaar;
	}

	public String toString() {
		StringBuilder uitkomst = new StringBuilder("");
		uitkomst.append(this.dag).append(" ").append(this.getMaandNaam()).append(" ").append(this.jaar);
		return uitkomst.toString();
	}

	public void drukKalender(int[] actDag, String[] actNaam) {
		System.out.println("**** Kalender voor " + this.getMaandNaam() + " " + this.jaar + " ****");
		for (int i = 0; i < 10; i++) {
			if (actDag[i] == 0) {
				i = 10;
			}
			if (i != 10) {
				System.out.printf("%-2d %s %-15d %s\n", actDag[i], this.getMaandNaam(), this.getJaar(), actNaam[i]);
			}
		}
	}
}
