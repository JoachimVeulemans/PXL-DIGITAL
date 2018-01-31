package oefening1_JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import oefening1.Adres;
import oefening1.Datum;
import oefening1.Persoon;

public class PersoonTest {
	private Persoon persoon;

	@Before
	public void init() {
		persoon = new Persoon("Aerts", "Jef", 29, 11, 1990, "Lindestraat", "23d", 3500, "Hasselt");

	}

	@Test
	public void testConstructorZonderObjecten() {
		assertEquals(persoon.getNaam(), "Aerts");
		assertEquals(persoon.getVoornaam(), "Jef");
		assertNotNull(persoon.getGeboortedatum());
		assertEquals(persoon.getGeboortedatum().getDag(), 29, 0);
		assertEquals(persoon.getGeboortedatum().getMaandNr(), 11, 0);
		assertEquals(persoon.getGeboortedatum().getJaar(), 1990, 0);
		assertNotNull(persoon.getAdres());
		assertEquals(persoon.getAdres().getStraat(), "Lindestraat");
		assertEquals(persoon.getAdres().getHuisnr(), "23d");
		assertNotNull(persoon.getAdres().getGemeente());
		assertEquals(persoon.getAdres().getGemeente().getPostcode(), 3500);
		assertEquals(persoon.getAdres().getGemeente().getGemNaam(), "Hasselt");
	}

	@Test
	public void testConstructorMetObjecten() {
		Adres adres = new Adres("Lindestraat", "23d", 3500, "Hasselt");
		Datum geboorteDatum = new Datum(29, 11, 1990);
		Persoon persoonObject = new Persoon("Aerts", "Jef", geboorteDatum, adres);
		assertEquals(persoonObject.getNaam(), "Aerts");
		assertEquals(persoonObject.getVoornaam(), "Jef");
		assertNotNull(persoonObject.getGeboortedatum());
		assertEquals(persoonObject.getGeboortedatum(), geboorteDatum);
		assertNotNull(persoonObject.getAdres());
		assertEquals(persoonObject.getAdres(), adres);
	}

	@Test
	public void testVoegVoornamenToe() {
		persoon.voegVoornamenToe("Sofie", "Robbe", "Hans");
		assertEquals("Jef Sofie Robbe Hans", persoon.getVoornaam());
	}

	@Test
	public void testToString() {
		String tekst = "Jef Aerts\nLindestraat 23d\n3500 Hasselt";
		assertEquals(persoon.toString(), tekst);
	}
}
