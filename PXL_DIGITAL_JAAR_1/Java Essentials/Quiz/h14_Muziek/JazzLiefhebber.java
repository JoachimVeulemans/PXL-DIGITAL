package h14_Muziek;

public class JazzLiefhebber implements Luisteraar {
	public void luister(Muziek muziek) throws SlechteMuziekException {
		if (!Muziek.JAZZ.equals(muziek)) {
			throw new SlechteMuziekException(this, muziek);
		}
		System.out.println(beschrijf() + " geniet van " + muziek.name().toLowerCase());
	}

	public String beschrijf() {
		return "Een jazz-liefhebber";
	}
}