package extraOefening1;

public class DatumBewerkingen {

	private int dag;
	private int maand;
	private int jaar;
	private String[] maandNamen = { "januari", "februari", "maart", "april", "mei", "juni", "juli", "augustus",
			"september", "oktober", "november", "december" };

	public void printDatum(int dag, int maand, int jaar) {
		System.out.print(dag + " " + this.getMaandNaam(maand) + " " + jaar + " ");
	}

	public String getMaandNaam() {
		return maandNamen[this.maand - 1];
	}

	public String getMaandNaam(int maand) {
		return maandNamen[maand - 1];
	}

	public boolean bepaalSchrikkeljaar(int jaar) {
		if (jaar % 4 == 0) {
			if (jaar % 100 == 0) {
				if (jaar % 400 == 0) {
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}

	public void dagVanHetJaar(int dag, int maand, int jaar) {
		int[] dagenPerMaand = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (this.bepaalSchrikkeljaar(jaar)) {
			dagenPerMaand[1]++;
		}
		int totaal = 0;
		for (int i = 0; i < dagenPerMaand.length; i++) {
			if (i + 1 == maand) {
				i = 11;
				totaal += dag;
			} else {
				totaal += dagenPerMaand[i];
			}
		}
		System.out.print(dag + " " + this.getMaandNaam() + " is dag " + totaal + " van het jaar " + jaar + ", ");
	}

	public void rangschikData(int dag, int maand, int jaar, int dag2, int maand2, int jaar2) {
		if (jaar < jaar2) {
			this.druk(dag, maand, jaar);
			System.out.print("ligt voor ");
			this.druk(dag2, maand2, jaar2);
		} else {
			if (jaar > jaar2) {
				this.druk(dag2, maand2, jaar2);
				System.out.print("ligt voor ");
				this.druk(dag, maand, jaar);
			} else {
				if (maand < maand2) {
					this.druk(dag, maand, jaar);
					System.out.print("ligt voor ");
					this.druk(dag2, maand2, jaar2);
				} else {
					if (maand > maand2) {
						this.druk(dag2, maand2, jaar2);
						System.out.print("ligt voor ");
						this.druk(dag, maand, jaar);
					} else {
						if (dag < dag2) {
							this.druk(dag, maand, jaar);
							System.out.print("ligt voor ");
							this.druk(dag2, maand2, jaar2);
						} else {
							this.druk(dag2, maand2, jaar2);
							System.out.print("ligt voor ");
							this.druk(dag, maand, jaar);
						}
					}
				}
			}
		}
	}

	public void druk(int dag, int maand, int jaar) {
		this.printDatum(dag, maand, jaar);
	}

	public int getDag() {
		return dag;
	}

	public void setDag(int dag) {
		this.dag = dag;
	}

	public int getMaand() {
		return maand;
	}

	public void setMaand(int maand) {
		this.maand = maand;
	}

	public int getJaar() {
		return jaar;
	}

	public void setJaar(int jaar) {
		this.jaar = jaar;
	}
}
