package oefening1_JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import oefening1.Adres;

public class AdresTest {
	private Adres adres;

	@Before
	public void init() {
		adres = new Adres("kerkstraat", "12b", 3500, "Hasselt");
	}

	@Test
	public void testConstructor() {
		assertEquals("Fout bij de straat", adres.getStraat(), "kerkstraat");
		assertEquals("Fout bij het huisnummer", adres.getHuisnr(), "12b");
		assertNotNull(adres.getGemeente());
		assertEquals(adres.getGemeente().getPostcode(), 3500);
		assertEquals("Fout bij de gemeentenaam", adres.getGemeente().getGemNaam(), "Hasselt");
	}

	@Test
	public void testGetStraat() {
		assertEquals("Fout bij de straat", adres.getStraat(), "kerkstraat");

	}

	@Test
	public void testSetStraat() {
		adres.setStraat("kiekenweg");
		assertEquals("Fout bij de straat", adres.getStraat(), "kiekenweg");
	}

	@Test
	public void testGetHuisNr() {
		assertEquals("Fout bij het huisnummer", adres.getHuisnr(), "12b");
	}

	@Test
	public void testSetHuisNr() {
		adres.setHuisnr("44");
		assertEquals(adres.getHuisnr(), "44");
	}

	@Test
	public void testGetGemeente() {
		assertNotNull(adres.getGemeente());
		assertEquals(adres.getGemeente().getPostcode(), 3500);
		assertEquals(adres.getGemeente().getGemNaam(), "Hasselt");
	}

	@Test
	public void testToString() {
		String tekst = "kerkstraat 12b\n3500 Hasselt";
		assertEquals(tekst, adres.toString());
	}
}
