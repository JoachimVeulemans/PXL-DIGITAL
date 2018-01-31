package project2_Uitbreiding_JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.time.LocalDate;

import org.junit.Test;

import project2_Uitbreiding.Speler;

public class SpelerTest {
	private static final LocalDate GEBOORTEDATUM = LocalDate.of(2003, 11, 29);
	private static final LocalDate DATUM_IN_TOEKOMST = LocalDate.now().plusDays(1);

	@Test
	public void testConstructor() {
		Speler speler = new Speler("Speler1", GEBOORTEDATUM);
		assertNotNull(speler);
		assertEquals("Speler1", speler.getNaam());
		assertEquals(GEBOORTEDATUM, speler.getGeboortedatum());
	}

	@Test
	public void testConstructorGeboortedatumInToekomst() {
		Speler speler = new Speler("Speler1", DATUM_IN_TOEKOMST);
		assertNotNull(speler);
		assertNull(speler.getGeboortedatum());
	}

	@Test
	public void testSetNaam() {
		Speler speler = new Speler("Speler1", GEBOORTEDATUM);
		speler.setNaam("Nieuwe naam");
		assertEquals("Nieuwe naam", speler.getNaam());
	}

	@Test
	public void testSetGeboortedatumMetDatumInToekomstWijzigtGeboortedatumNiet() {
		Speler speler = new Speler("Speler1", GEBOORTEDATUM);
		speler.setGeboortedatum(DATUM_IN_TOEKOMST);
		assertEquals(GEBOORTEDATUM,  speler.getGeboortedatum());
	}

	@Test
	public void testGetLeeftijdGeefNegatiefGetalIndienGeboortedatumNull() {
		Speler speler = new Speler("Speler1", null);
		assertEquals(-1, speler.getLeeftijd());
	}

	@Test
	public void testGetLeeftijdGeeftCorrecteWaardeIndienGisterenJarig() {
		LocalDate gisterenAchtJaarGeleden = LocalDate.now().minusDays(1).minusYears(8);
		Speler speler = new Speler("Speler1", gisterenAchtJaarGeleden);
		assertEquals(8, speler.getLeeftijd());
	}

	@Test
	public void testGetLeeftijdGeeftCorrecteWaardeIndienMorgenJarig() {
		LocalDate morgenAchtJaarGeleden = LocalDate.now().plusDays(1).minusYears(8);
		Speler speler = new Speler("Speler1", morgenAchtJaarGeleden);
		assertEquals(7, speler.getLeeftijd());
	}

	@Test
	public void testGetLeeftijdGeeftCorrecteWaardeIndienVandaagJarig() {
		LocalDate vandaagAchtJaarGeleden = LocalDate.now().minusYears(8);
		Speler speler = new Speler("Speler1", vandaagAchtJaarGeleden);
		assertEquals(8, speler.getLeeftijd());
	}
}
