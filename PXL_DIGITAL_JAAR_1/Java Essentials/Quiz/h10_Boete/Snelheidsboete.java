package h10_Boete;

public class Snelheidsboete extends Verkeersboete {
	private int toegestaneSnelheid;
	private int gemetenSnelheid;

	public Snelheidsboete(String ontvanger, int toegestaneSnelheid, int gemetenSnelheid) {
		super(ontvanger);
		this.toegestaneSnelheid = toegestaneSnelheid;
		this.gemetenSnelheid = gemetenSnelheid;
	}

	public int getToegestaneSnelheid() {
		return toegestaneSnelheid;
	}

	public int getGemetenSnelheid() {
		return gemetenSnelheid;
	}

	@Override
	public double getBedrag() {
		return (gemetenSnelheid - toegestaneSnelheid) * 5;
	}

	@Override
	public String toString() {
		return super.toString() + " [Snelheidsboete]";
	}
}
