package oefening4;

public class Huwelijk {
	private Persoon persoon1;
	private Persoon persoon2;
	private Datum huwDatum;

	public Huwelijk(Persoon man, Persoon vrouw, int dag, int maand, int jaar) throws DatumException {
		persoon1 = new Persoon();
		persoon1 = man;
		persoon2 = new Persoon();
		persoon2 = vrouw;
		huwDatum = new Datum(dag, maand, jaar);
		
		persoon2.getAdres().setStraat(persoon1.getAdres().getStraat());
		persoon2.getAdres().setHuisnr(persoon1.getAdres().getHuisnr());
		persoon2.getAdres().getGemeente().setGemNaam(persoon1.getAdres().getGemeente().getGemNaam());
		persoon2.getAdres().getGemeente().setPostcode(persoon1.getAdres().getGemeente().getPostcode());
		System.out.println(persoon1.getVoornaam() + " " + persoon1.getNaam() + " en " + persoon2.getVoornaam() + " " + persoon2.getNaam() + " zijn gehuwd op " + huwDatum.getDag() + " " + huwDatum.getMaandNaam() + " " + huwDatum.getJaar() + ". Proficiat!");
	
	}

	public Huwelijk() throws DatumException {
		persoon1 = new Persoon();
		persoon2 = new Persoon();
		huwDatum = new Datum();
	}

	public Persoon getPersoon1() {
		return persoon1;
	}

	public Persoon getPersoon2() {
		return persoon2;
	}

	public Datum getHuwelijksdatum() {
		return huwDatum;
	}

	public void adresWijziging(String straat, String huisnummer, int postcode, String gemeente) {
		persoon1.getAdres().setStraat(straat);
		persoon1.getAdres().setHuisnr(huisnummer);
		persoon1.getAdres().getGemeente().setGemNaam(gemeente);
		persoon1.getAdres().getGemeente().setPostcode(postcode);
		persoon2.getAdres().setStraat(straat);
		persoon2.getAdres().setHuisnr(huisnummer);
		persoon2.getAdres().getGemeente().setGemNaam(gemeente);
		persoon2.getAdres().getGemeente().setPostcode(postcode);
	}

	public void print() {
		System.out.println(persoon1.toString());
		System.out.println("Geboren op " + persoon1.getGeboortedatum().getDag() + " "
				+ persoon1.getGeboortedatum().getMaandNaam() + " " + persoon1.getGeboortedatum().getJaar() + "\n");
		System.out.println(persoon2.toString());
		System.out.println("Geboren op " + persoon2.getGeboortedatum().getDag() + " "
				+ persoon2.getGeboortedatum().getMaandNaam() + " " + persoon2.getGeboortedatum().getJaar() + "\n");
		System.out.println("het huwelijk vond plaats op " + huwDatum.getDag() + " " + huwDatum.getMaandNaam() + " "
				+ huwDatum.getJaar());
	}

}
