package oefening1_JUnit;

import static org.junit.Assert.*;
import org.junit.Test;
import oefening1.Werknemer;
import ppt.Persoon;

public class WerknemerTest {

	@Test
	public void testConstructorNaamVoornaam() {
		Werknemer werknemer = new Werknemer("Doe", "John");
		assertTrue("John".equalsIgnoreCase(werknemer.getVoornaam()));
		assertTrue("Doe".equalsIgnoreCase(werknemer.getNaam()));
		assertTrue("Algemeen bediende".equalsIgnoreCase(werknemer.getFunctie()));
		assertEquals(1800, werknemer.getSalaris(), 0);
	}

	@Test
	public void testConstructorNaamVoornaamSalarisFunctie() {
		Werknemer werknemer = new Werknemer("Doe", "John", "bediende", 2500.5);
		assertTrue("John".equalsIgnoreCase(werknemer.getVoornaam()));
		assertTrue("Doe".equalsIgnoreCase(werknemer.getNaam()));
		assertTrue("bediende".equalsIgnoreCase(werknemer.getFunctie()));
		assertEquals(2500.5, werknemer.getSalaris(), 0);
	}

	@Test
	public void testConstructorMinimumSalaris() {
		Werknemer werknemer = new Werknemer("Doe", "John", "Manager", 950.5);
		assertTrue("John".equalsIgnoreCase(werknemer.getVoornaam()));
		assertTrue("Doe".equalsIgnoreCase(werknemer.getNaam()));
		assertTrue("Manager".equalsIgnoreCase(werknemer.getFunctie()));
		assertEquals(Werknemer.getMinsalaris(), werknemer.getSalaris(), 0);

	}

	@Test
	public void testSetterNaam() {
		Werknemer werknemer = new Werknemer("Doe", "John");
		String naam = "De Belie";
		werknemer.setNaam(naam);
		assertEquals(naam, werknemer.getNaam());
	}

	@Test
	public void testGetterNaam() {
		Werknemer werknemer = new Werknemer("Doe", "John");
		assertEquals("Doe", werknemer.getNaam());
	}

	@Test
	public void testSetterVoornaam() {
		Werknemer werknemer = new Werknemer("Doe", "John");
		String voornaam = "Ann";
		werknemer.setVoornaam(voornaam);
		assertEquals(voornaam, werknemer.getVoornaam());
	}

	@Test
	public void testGetterVoornaam() {
		Werknemer werknemer = new Werknemer("Doe", "John");
		assertEquals("John", werknemer.getVoornaam());
	}

	@Test
	public void testSetterSalaris() {
		Werknemer werknemer = new Werknemer("Doe", "John");
		double salaris = 3500.25;
		werknemer.setSalaris(salaris);
		assertEquals(salaris, werknemer.getSalaris(), 0);
	}

	@Test
	public void testSetterSalarisTeLaag() {
		Werknemer werknemer = new Werknemer("Doe", "John");
		double salaris = 500.25;
		werknemer.setSalaris(salaris);
		assertEquals(Werknemer.getMinsalaris(), werknemer.getSalaris(), 0);
	}

	@Test
	public void testGetterSalaris() {
		Werknemer werknemer = new Werknemer("Doe", "John", "bediende", 2500.5);
		assertEquals(2500.5, werknemer.getSalaris(), 0);
	}

	@Test
	public void testGetterFunctie() {
		Werknemer werknemer = new Werknemer("Doe", "John", "bediende", 2500.5);
		assertEquals("bediende", werknemer.getFunctie());
	}

	@Test
	public void testSetterFunctie() {
		Werknemer werknemer = new Werknemer("Doe", "John");
		werknemer.setFunctie("verkoper");
		assertEquals("verkoper", werknemer.getFunctie());
	}

	@Test
	public void testCountWerknemerObjecten() {
		int before = Werknemer.getAantal();
		new Werknemer("", "");
		new Werknemer("", "");
		new Persoon("", "");
		int later = Werknemer.getAantal();
		assertEquals("Fout bij opvragen aantal Werknemers", 2, later - before);
	}

}
