package opdracht3;

public class BoekApp {

	public static void main(String[] args) {
		Boek boekje = new Boek();
		boekje.getAuteur().setVoornaam("tommie");
		boekje.getAuteur().setNaam("bleesking");
		boekje.setBladzijden(200);
		boekje.setIsbn("123-456789-123");
		boekje.setTitel("Paffen voor dummies");

		System.out.println(boekje.getAuteur());
		boekje.toonBoekGegevens();

	}

}
