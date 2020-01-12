package h8_Aquarium;

public class Aquarium {
	public final static int DEFAULT_TEMP;
	private static int aantal;
	private int aantalVissen;

	static {
		System.out.println("In static initialisatieblok");
		DEFAULT_TEMP = 32;
	}

	{
		System.out.println("In initialisatieblok");
		aantal++;
		System.out.println("Aantal: " + aantal);
	}

	public Aquarium(int aantalVissen) {
		this.aantalVissen = aantalVissen;
	}

	public static int getAantal() {
		return aantal;
	}

	public int getAantalVissen() {
		return aantalVissen;
	}
}