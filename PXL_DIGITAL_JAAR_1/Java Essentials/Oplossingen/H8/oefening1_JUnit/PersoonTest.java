package oefening1_JUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import oefening1.Persoon;

public class PersoonTest {
	private Persoon persoon;

	@Before
	public void init() {
		persoon = new Persoon("Aers", "Jef");
	}

	@Test
	public void testConstructorZonderParameters() {
		Persoon persoon = new Persoon();
		assertEquals(persoon.getNaam(), "onbekend");
		assertEquals(persoon.getVoornaam(), "onbekend");
	}

	@Test
	public void testConstructorMetParameters() {
		assertEquals(persoon.getNaam(), "Aers");
		assertEquals(persoon.getVoornaam(), "Jef");
	}

	@Test
	public void testCopyConstructor() {
		persoon.setLengte(200);
		persoon.setGewicht(50);
		persoon.setGeboortejaar(1997);
		Persoon persoon2 = new Persoon(persoon);
		assertEquals(persoon.getNaam(), persoon2.getNaam());
		assertEquals(persoon.getVoornaam(), persoon2.getVoornaam());
		assertEquals(persoon.getGeboortejaar(), persoon2.getGeboortejaar());
		assertEquals(persoon.getLengte(), persoon2.getLengte(), 0);
		assertEquals(persoon.getGewicht(), persoon2.getGewicht(), 0);

	}

	@Test
	public void testSetNaam() {
		persoon.setNaam("xxxx");
		assertEquals(persoon.getNaam(), "xxxx");
	}

	@Test
	public void testSetVoornaam() {
		persoon.setVoornaam("AAAA");
		assertEquals(persoon.getVoornaam(), "AAAA");
	}

	@Test
	public void testSetLengteMinderdan240cm() {
		persoon.setLengte(2.3);
		assertEquals(persoon.getLengte(), 2.3, 0);
	}

	@Test
	public void testSetLengteMeerdan240cm() {
		persoon.setLengte(2.5);
		assertEquals(persoon.getLengte(), 2.4, 0);
	}

	@Test
	public void testSetGewicht() {
		persoon.setGewicht(25);
		assertEquals(persoon.getGewicht(), 25, 0);
	}

	@Test
	public void testSetGeboortejaar() {
		persoon.setGeboortejaar(1995);
		assertEquals(persoon.getGeboortejaar(), 1995, 0);
	}

	@Test
	public void testVoegVoornamenToe() {
		persoon.voegVoornamenToe("Sofie", "Robbe", "Hans");
		assertEquals("Jef Sofie Robbe Hans", persoon.getVoornaam());
	}

	@Test
	public void testToString() {
		persoon.setLengte(200);
		persoon.setGewicht(50);
		persoon.setGeboortejaar(1997);
		StringBuilder tekst = new StringBuilder(
				"Deze persoon is " + persoon.getVoornaam() + " " + persoon.getNaam() + "\n");
		tekst.append(String.format("%-15s : %.2f\n", "gewicht", persoon.getGewicht()));
		tekst.append(String.format("%-15s : %.2f\n", "lengte", persoon.getLengte()));
		tekst.append(String.format("%-15s : %d\n", "geboortejaar", persoon.getGeboortejaar()));
		assertEquals(persoon.toString(), tekst.toString());
	}

	@Test
	public void testBerekenBmi() {
		persoon.setLengte(2);
		persoon.setGewicht(50);
		assertEquals(persoon.berekenBmi(), 50 / 4.0, 0);
	}

	@Test
	public void testGeefOmschrijvingBmiKleinerDan18() {
		persoon.setGewicht(17);
		persoon.setLengte(1);
		assertEquals(persoon.geefOmschrijving(), "ondergewicht");
	}

	@Test
	public void testGeefOmschrijvingBmi18() {
		persoon.setGewicht(18);
		persoon.setLengte(1);
		assertEquals(persoon.geefOmschrijving(), "normaal");
	}

	@Test
	public void testGeefOmschrijvingBmiTussen18en25() {
		persoon.setGewicht(19);
		persoon.setLengte(1);
		assertEquals(persoon.geefOmschrijving(), "normaal");
	}

	@Test
	public void testGeefOmschrijvingBmi25() {
		persoon.setGewicht(25);
		persoon.setLengte(1);
		assertEquals(persoon.geefOmschrijving(), "overgewicht");
	}

	@Test
	public void testGeefOmschrijvingBmiTussen25en30() {
		persoon.setGewicht(26);
		persoon.setLengte(1);
		assertEquals(persoon.geefOmschrijving(), "overgewicht");
	}

	@Test
	public void testGeefOmschrijvingBmi30() {
		persoon.setGewicht(30);
		persoon.setLengte(1);
		assertEquals(persoon.geefOmschrijving(), "obesitas");
	}

	@Test
	public void testGeefOmschrijvingBmiTussen30en40() {
		persoon.setGewicht(35);
		persoon.setLengte(1);
		assertEquals(persoon.geefOmschrijving(), "obesitas");
	}

	@Test
	public void testGeefOmschrijvingBmi40() {
		persoon.setGewicht(40);
		persoon.setLengte(1);
		assertEquals(persoon.geefOmschrijving(), "morbide obesitas");
	}

	@Test
	public void testGetVoornaam() {
		assertEquals(persoon.getVoornaam(), "Jef");
	}

	@Test
	public void testGetNaam() {
		assertEquals(persoon.getNaam(), "Aers");
	}

	@Test
	public void testLengte() {
		assertEquals(persoon.getLengte(), 0, 0);
	}

	@Test
	public void testGetGewicht() {
		assertEquals(persoon.getGewicht(), 0, 0);
	}

	@Test
	public void testGetGeboorteJaar() {
		assertEquals(persoon.getGeboortejaar(), 0);
	}

	@Test
	public void testGetLeeftijd() {
		persoon.setGeboortejaar(2000);
		assertEquals(persoon.getLeeftijd(), 17);
	}

	@Test
	public void testGroeiZonderArgumentenonder240cm() {
		persoon.groei();
		assertEquals(persoon.getLengte(), 0.01, 0);
	}

	@Test
	public void testGroeiZonderArgumentenboven240cm() {
		persoon.setLengte(2.40);
		persoon.groei();
		assertEquals(persoon.getLengte(), 2.4, 0);
	}

	@Test
	public void testGroeiMetArgumentenonder240cm() {
		persoon.setLengte(0);
		persoon.groei(5);
		assertEquals(persoon.getLengte(), 0.05, 0);
	}

	@Test
	public void testGroeiMetArgumentenboven240cm() {
		persoon.setLengte(2.40);
		persoon.groei(5);
		assertEquals(persoon.getLengte(), 2.4, 0);
	}
}
