package oefening3;

public final class Voetballer extends Sporter {
	private String club;
	private String opstelling;
	private static String[] opstellingen = { "aanvaller", "middenvelder", "verdediger", "onbepaald" };

	public Voetballer(String naam, String voornaam) {
		this(naam, voornaam, "onbekend", "onbekend");
	}

	public Voetballer(String naam, String voornaam, String club, String opstelling) {
		super(naam, voornaam, "voetbal");
		this.club = club;
		this.setOpstelling(opstelling);
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getOpstelling() {
		return opstelling;
	}

	public void setOpstelling(String opstelling) {
		this.opstelling = opstelling;
		int count = 0;
		for (int i = 0; i < opstellingen.length; i++) {
			if (this.opstelling.toLowerCase().equals(opstellingen[i])) {
				count++;
			}
		}
		if (count == 0) {
			this.opstelling = opstellingen[opstellingen.length - 1];
		}
	}

	public static String[] getArray() {
		return opstellingen;
	}

	@Override
	public void print() {
		System.out.println("*** " + this.opstelling + " ***");
		super.print();
		System.out.println("club: " + this.club + " opstelling: " + this.opstelling);
	}

}
