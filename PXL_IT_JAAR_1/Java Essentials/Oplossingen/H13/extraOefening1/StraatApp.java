package extraOefening1;

public class StraatApp {

	public static void main(String[] args) {
		Straat s = new Straat();
		
		Huis jan = new Huis("Jan", new Huisnummer(12, 'a'));
		s.voegStructuurToe(jan);
		
		Huis geert = new Huis("Geert", new Huisnummer(12, 'a'));
		s.voegStructuurToe(geert);
		System.out.println("Aantal huizen in straat s: " + s.getAantal());
		
		Park park = new Park(new Huisnummer(13, 'b'));
		s.voegStructuurToe(park);
		System.out.println("Aantal huizen in straat s: " + s.getAantal());
		
		System.out.println("--- beschrijvingen ---");
		
		for (int i = 0; i < s.getAantal(); i++) {
			((Structuur)s.getWaarde(i)).beschrijf();
		}
		
	}

}
