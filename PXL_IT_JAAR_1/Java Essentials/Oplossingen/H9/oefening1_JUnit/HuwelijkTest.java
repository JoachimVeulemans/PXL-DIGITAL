package oefening1_JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import oefening1.Huwelijk;
import oefening1.Persoon;

public class HuwelijkTest {
	private Persoon an;
	private Persoon jo;
	private Huwelijk huwelijk;

	@Before
	public void init() {
		jo = new Persoon("Adams", "An", 29, 9, 1990, "lentestraat", "3B", 3290, "Diest");
		an = new Persoon("Bex", "Jo", 12, 6, 1992, "garagestraat", "15", 3500, "Hasselt");
		huwelijk = new Huwelijk(an, jo, 3, 4, 2016);
	}

	@Test
	public void testConstructor() {

		Persoon persoon1 = huwelijk.getPersoon1();
		Persoon persoon2 = huwelijk.getPersoon2();
		assertNotNull(persoon1);
		assertEquals(persoon1, an);
		assertNotNull(persoon2);
		assertTrue(persoon2.equals(jo));
		assertNotNull(huwelijk.getHuwelijksdatum());
		assertEquals(huwelijk.getHuwelijksdatum().getDag(), 3);
		assertEquals(huwelijk.getHuwelijksdatum().getMaandNr(), 4);
		assertEquals(huwelijk.getHuwelijksdatum().getJaar(), 2016);
		assertNotNull(jo.getAdres());
		assertEquals(jo.getAdres().getGemeente().getGemNaam(), "Diest");
		assertEquals(jo.getAdres().getGemeente().getPostcode(), 3290, 0);
		assertEquals(jo.getAdres().getHuisnr(), "3B");
		assertEquals(jo.getAdres().getStraat(), "lentestraat");
	}

	@Test
	public void testGetPartner1() {
		Persoon persoon1 = huwelijk.getPersoon1();
		assertNotNull(persoon1);
		assertEquals(persoon1, an);
	}

	@Test
	public void testGetPartner2() {
		Persoon persoon2 = huwelijk.getPersoon2();

		assertNotNull(persoon2);
		assertEquals(persoon2, jo);
	}

	@Test
	public void testGetAdres() {
		assertNotNull(jo.getAdres());
		assertEquals("Fout bij gemeentenaam van het adres", jo.getAdres().getGemeente().getGemNaam(), "Diest");
		assertEquals("Fout bij de postcode van het adres", jo.getAdres().getGemeente().getPostcode(), 3290);
		assertEquals("Fout bij huisnummer van het adres", jo.getAdres().getHuisnr(), "3B");
		assertEquals("Fout bij straat van het adres", jo.getAdres().getStraat(), "lentestraat");
	}

	@Test
	public void testAdresWijziging() {
		huwelijk.adresWijziging("kerkstraat", "12", 3960, "Bree");
		assertNotNull(an.getAdres());
		assertNotNull(jo.getAdres());
		assertEquals("Fout van straat bij adreswijziging", "kerkstraat", jo.getAdres().getStraat());
		assertEquals("Fout van straat bij adreswijziging", "kerkstraat", an.getAdres().getStraat());
		assertEquals("Fout bij huisnummer bij adreswijziging", "12", jo.getAdres().getHuisnr());
		assertEquals("Fout bij huisnummer bij adreswijziging", "12", an.getAdres().getHuisnr());
		assertEquals("Fout bij gemeentenaam bij adreswijziging", "Bree", jo.getAdres().getGemeente().getGemNaam());
		assertEquals("Fout bij gemeentenaam bij adreswijziging", "Bree", an.getAdres().getGemeente().getGemNaam());
		assertEquals("Fout bij postcode bij adreswijziging", jo.getAdres().getGemeente().getPostcode(), 3960);
		assertEquals("Fout bij postcode bij adreswijziging", an.getAdres().getGemeente().getPostcode(), 3960);

	}
}
