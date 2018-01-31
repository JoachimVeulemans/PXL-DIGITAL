package oefening1_JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import oefening1.Datum;

public class DatumTest {
	private Datum datum;

	@Before
	public void init() {
		datum = new Datum(2, 3, 2017);
	}

	@Test
	public void testDefaultConstructor() {
		Datum datumDefault = new Datum();
		assertEquals("Fout bij de dag", datumDefault.getDag(), 1);
		assertEquals("Fout bij de maand", datumDefault.getMaandNr(), 1);
		assertEquals("Fout bij het jaar", datumDefault.getJaar(), 2017);

	}

	@Test
	public void testConstructor() {
		assertEquals("Fout bij de dag", datum.getDag(), 2);
		assertEquals("Fout bij de maand", datum.getMaandNr(), 3);
		assertEquals("fout bij het jaar", datum.getJaar(), 2017);

	}

	@Test
	public void testCopyConstructor() {
		Datum ander = new Datum(datum);
		assertEquals(ander.getDag(), 2);
		assertEquals(ander.getMaandNr(), 3);
		assertEquals(ander.getJaar(), 2017);
	}

	@Test
	public void testSetDag() {
		datum.setDag(5);
		assertEquals(datum.getDag(), 5);
	}

	@Test
	public void testSetMaandTussen1en12() {
		datum.setMaand(5);
		assertEquals(datum.getMaandNr(), 5);
	}

	@Test
	public void testSetMaandKleinerdan1() {
		datum.setMaand(-6);
		assertEquals(datum.getMaandNr(), 1);
	}

	@Test
	public void testSetMaandGroterdan12() {
		datum.setMaand(16);
		assertEquals(datum.getMaandNr(), 12);
	}

	@Test
	public void testGetDag() {
		assertEquals(datum.getDag(), 2);
	}

	@Test
	public void testGetMaandNr() {
		datum.setMaand(3);
		assertEquals(datum.getMaandNr(), 3);
	}

	@Test
	public void testGetMaandNaam() {
		assertEquals(datum.getMaandNaam(), "maart");
	}

	@Test
	public void testGetJaar() {
		assertEquals(datum.getJaar(), 2017);
	}

	@Test
	public void testToString() {
		assertEquals(datum.toString(), "2 maart 2017");
	}
}
