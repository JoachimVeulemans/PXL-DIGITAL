package project1_JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.time.LocalDate;

import org.junit.Test;

import project1.Wijn;

public class WijnConstructorTest {
	@Test
	public void testGeldigeBasisVelden() {
		Wijn wijn = new Wijn("Wine Complet", "Wit", "Chili");
		assertEquals("Wine Complet", wijn.getNaam());
		assertEquals("Wit", wijn.getKleur());
		assertEquals("Chili", wijn.getLand());
		assertEquals(12.5, wijn.getAlcoholpercentage(), 0);
		assertEquals(LocalDate.now().getYear() - 1, wijn.getJaargang());
		assertNull(wijn.getOmschrijving());
		assertNull(wijn.getRegio());
		assertNull(wijn.getServeerTip());
		assertNull(wijn.getDruivenras());
	}

	@Test
	public void testGeldigeBasisVeldenGrootsteConstructor() {
		Wijn wijn = new Wijn("Wine Complet", "Wit", "Chili", 2014, 13.5);
		assertEquals("Wine Complet", wijn.getNaam());
		assertEquals("Wit", wijn.getKleur());
		assertEquals("Chili", wijn.getLand());
		assertEquals(13.5, wijn.getAlcoholpercentage(), 0);
		assertEquals(2014, wijn.getJaargang());
		assertNull(wijn.getOmschrijving());
		assertNull(wijn.getRegio());
		assertNull(wijn.getServeerTip());
		assertNull(wijn.getDruivenras());
	}

	@Test
	public void testOngeldigLandGeeftOnbekend() {
		Wijn wijn = new Wijn("Wine Complet", "Wit", "België");
		assertEquals("Onbekend", wijn.getLand());
	}

	@Test
	public void testOngeldigeKleurGeeftRood() {
		Wijn wijn = new Wijn("Wine Complet", "Groen", "Frankrijk");
		assertEquals("Rood", wijn.getKleur());
	}

	@Test
	public void testJaargangVoor1950Geeft1950() {
		Wijn wijn = new Wijn("Wine Complet", "Rood", "Frankrijk", 1949, 12.5);
		assertEquals(1950, wijn.getJaargang());
	}

	@Test
	public void testJaargangNaHuidigJaarGeeftHuidigJaar() {
		Wijn wijn = new Wijn("Wine Complet", "Rood", "Frankrijk", LocalDate.now().getYear() + 1, 12.5);
		assertEquals(LocalDate.now().getYear(), wijn.getJaargang());
	}

	@Test
	public void testJaargangTussen1950EnHuidigJaar() {
		Wijn wijn = new Wijn("Wine Complet", "Rood", "Frankrijk", 2005, 12.5);
		assertEquals(2005, wijn.getJaargang());
	}

	@Test
	public void testJaargang1950() {
		Wijn wijn = new Wijn("Wine Complet", "Rood", "Frankrijk", 1950, 12.5);
		assertEquals(1950, wijn.getJaargang());
	}

	@Test
	public void testJaargangHuidigJaar() {
		Wijn wijn = new Wijn("Wine Complet", "Rood", "Frankrijk", LocalDate.now().getYear(), 12.5);
		assertEquals(LocalDate.now().getYear(), wijn.getJaargang());
	}

	@Test
	public void testNegatiefAlcoholPercentageGeeft0() {
		Wijn wijn = new Wijn("Wine Complet", "Rood", "Frankrijk", 2005, -3);
		assertEquals(0, wijn.getAlcoholpercentage(), 0);
	}

	@Test
	public void testAlcolholPercentageBovenMaxGeeftMax() {
		Wijn wijn = new Wijn("Wine Complet", "Rood", "Frankrijk", 2005, 17 + 0.1);
		assertEquals(17, wijn.getAlcoholpercentage(), 0);
	}

	@Test
	public void testAlcolholPercentageMaxGeeftMax() {
		Wijn wijn = new Wijn("Wine Complet", "Rood", "Frankrijk", 2005, 17);
		assertEquals(17, wijn.getAlcoholpercentage(), 0);
	}

	@Test
	public void testAlcolholPercentageTussen0EnMax() {
		Wijn wijn = new Wijn("Wine Complet", "Rood", "Frankrijk", 2005, 12.5);
		assertEquals(12.5, wijn.getAlcoholpercentage(), 0);
	}

}
