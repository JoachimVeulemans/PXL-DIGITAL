package h14_Muziek;

public interface Luisteraar {
	String beschrijf();
	void luister(Muziek muziek) throws SlechteMuziekException;
}