package oefening1_JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import oefening1.Gemeente;

public class GemeenteTest {
	private Gemeente gemeente;

	@Before
	public void init() {
		gemeente = new Gemeente(3500, "Hasselt");
	}

	@Test
	public void testConstructorMetAlleEigenschappen() {
		assertEquals("Fout bij de postcode", gemeente.getPostcode(), 3500);
		assertEquals("Fout bij de gemeente", gemeente.getGemNaam(), "Hasselt");

	}

	@Test
	public void testGetPostcode() {
		assertEquals("Fout bij de gemeente", gemeente.getPostcode(), 3500);
	}

	@Test
	public void testGetGemeente() {
		assertEquals("Fout bij de gemeente", gemeente.getGemNaam(), "Hasselt");
	}

	@Test
	public void testSetPostcode4karakters() {
		gemeente.setPostcode(3020);
		assertEquals(gemeente.getPostcode(), 3020);
	}

	@Test
	public void testSetPostcodeMeerdan4karakters() {
		gemeente.setPostcode(3020523);
		assertEquals(gemeente.getPostcode(), 3020);
	}

	@Test
	public void testSetPostcodeMinderdan4karakters() {
		gemeente.setPostcode(30);
		assertEquals(gemeente.getPostcode(), 3000);
	}

	@Test
	public void testSetGemeenteZonderSpatieZonderCijfer() {
		gemeente.setGemNaam("tonGeren");
		assertEquals(gemeente.getGemNaam(), "Tongeren");
	}

	@Test
	public void testSetGemeenteMetSpatieZonderCijfer() {
		gemeente.setGemNaam("HERK-DE Stad");
		assertEquals(gemeente.getGemNaam(), "Herk-De Stad");
	}

	@Test
	public void testSetGemeenteZonderSpatieMetCijfer() {
		gemeente.setGemNaam("Has45se5l't");
		assertEquals(gemeente.getGemNaam(), "Hassel't");
	}

}
