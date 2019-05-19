package h14_Muziek;

public class SlechteMuziekException extends Exception {
	public SlechteMuziekException(Luisteraar luisteraar, Muziek muziek) {
		super(luisteraar.beschrijf() + " houdt niet van " + muziek.name().toLowerCase());
		// aanroep van public Exception(String message)
	}
}