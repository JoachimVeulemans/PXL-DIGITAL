package h10_Boete;

public class RijdenZonderGordel extends Verkeersboete {
	private int aantalZonderGordel;

	public RijdenZonderGordel(String ontvanger, int aantalZonderGordel) {
		super(ontvanger);
		this.aantalZonderGordel = aantalZonderGordel;
	}

	@Override
	public double getBedrag() {
		return aantalZonderGordel * 90;
	}
}
