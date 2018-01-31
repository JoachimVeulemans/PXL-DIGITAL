package h10_Boete;

public abstract class Boete {
	private String ontvanger;

	public Boete(String ontvanger) {
		this.ontvanger = ontvanger;
	}

	public abstract double getBedrag();

	public String toString() {
		return String.format("%s: %s %s: %5.2f", "Ontvanger", ontvanger, "Bedrag", getBedrag());
	}
}
