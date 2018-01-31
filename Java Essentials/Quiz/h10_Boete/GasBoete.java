package h10_Boete;

public class GasBoete extends Boete {
	private String omschrijving;
	private double bedrag;

	public GasBoete(String ontvanger, String omschrijving, double bedrag) {
		super(ontvanger);
		this.omschrijving = omschrijving;
		this.bedrag = bedrag;
	}

	@Override
	public double getBedrag() {
		return bedrag;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	@Override
	public String toString() {
		return super.toString() + " [" + omschrijving + "]";
	}
}
