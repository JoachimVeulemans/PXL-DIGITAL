package oefening5;

public class Vriendengroep {
	private Persoon[] vrienden;
	private static final int MAXAANTALVRIENDEN = 10;

	{
		vrienden = new Persoon[Vriendengroep.MAXAANTALVRIENDEN];
	}

	public void voegVriendToe(Persoon persoon) {
		try {
			int count = 0;
			for (int i = 0; i < vrienden.length; i++) {
				if (vrienden[i] != null && vrienden[i].getNaam().equals(persoon.getNaam())) {
					count++;
					throw new Exception("Deze naam bestaat al: " + persoon.getNaam());
				}
			}
			int count2 = 0;
			if (count == 0) {
				for (int i = 0; i < vrienden.length; i++) {
					if (vrienden[i] == null) {
						vrienden[i] = persoon;
						i = vrienden.length;
						count2++;
					}
				}
			}
			if (count2 == 0) {
				throw new Exception("De rij vrienden is al vol");
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void verwijderVriend(String naam) {
		try {
			int count = 0;
			for (int i = 0; i < vrienden.length; i++) {
				if (vrienden[i] != null && vrienden[i].getNaam().equals(naam)) {
					vrienden[i] = null;
					count++;
				}
			}
			if (count == 0) {
				throw new Exception("Deze persoon is geen vriend en kan niet verwijderd worden uit de vriendenlijst");
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Override
	public String toString() {
		StringBuilder tekst = new StringBuilder("");

		String volgendeJarigeNaam = "";
		long volgendeJarigeDagen = 1000000;
		for (int i = 0; i < vrienden.length; i++) {
			if (vrienden[i] != null) {
				tekst.append(vrienden[i].toString()).append("\n");
				if (vrienden[i].aantalDagenTotVerjaardag() < volgendeJarigeDagen) {
					volgendeJarigeDagen = vrienden[i].aantalDagenTotVerjaardag();
					volgendeJarigeNaam = vrienden[i].getNaam();
				}
			}
		}

		if (!volgendeJarigeNaam.equals("")) {
			tekst.append("De volgende jarige is ").append(volgendeJarigeNaam).append(".\n");
		}

		return tekst.toString();
	}

}
