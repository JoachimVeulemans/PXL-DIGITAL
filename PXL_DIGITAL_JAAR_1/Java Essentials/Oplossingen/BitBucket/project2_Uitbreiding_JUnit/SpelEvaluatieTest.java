package project2_Uitbreiding_JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import project2_Uitbreiding.BordSpel;
import project2_Uitbreiding.Score;
import project2_Uitbreiding.Spel;
import project2_Uitbreiding.SpelEvaluatie;
import project2_Uitbreiding.Speler;
import project2_Uitbreiding.Uitgever;

public class SpelEvaluatieTest {
	private static final int MINIMUM_LEEFTIJD = 12;
	private static final LocalDate GELDIGE_GEBOORTEDATUM = LocalDate.now().minusYears(MINIMUM_LEEFTIJD);
	private static final LocalDate ONGELDIGE_GEBOORTEDATUM = LocalDate.now().minusYears(MINIMUM_LEEFTIJD).plusDays(1);
	private Spel spel;
	private Speler geldigeSpeler;
	private Speler ongeldigeSpeler;

	@Before
	public void setup() {
		Uitgever uitgever = new Uitgever("999 games", "Almere", LocalDate.of(1996, 5, 1));
		spel = new BordSpel("Bonanaza", uitgever);
		spel.setMinimumLeeftijd(MINIMUM_LEEFTIJD);
		geldigeSpeler = new Speler("Geldige speler", GELDIGE_GEBOORTEDATUM);
		ongeldigeSpeler = new Speler("Ongeldige speler", ONGELDIGE_GEBOORTEDATUM);
	}

	@Test
	public void testConstructor() {
		SpelEvaluatie evaluatie = new SpelEvaluatie(spel, geldigeSpeler);
		assertNotNull(evaluatie);
		assertEquals(spel, evaluatie.getSpel());
		assertEquals(geldigeSpeler, evaluatie.getSpeler());
	}

	@Test
	public void testIsGeldigGeeftFalseIndienBeoordelingMaarSpelNull() {
		SpelEvaluatie evaluatie = new SpelEvaluatie(null, geldigeSpeler);
		evaluatie.maakBeoordeling(5, "We hebben ontzettend veel gelachen.");
		assertFalse(evaluatie.isGeldig());
		assertNotNull(evaluatie.getTijdstip());
	}

	@Test
	public void testIsGeldigGeeftFalseIndienBeoordelingMaarSpelerNull() {
		SpelEvaluatie evaluatie = new SpelEvaluatie(spel, null);
		evaluatie.maakBeoordeling(5, "We hebben ontzettend veel gelachen.");
		assertFalse(evaluatie.isGeldig());
	}

	@Test
	public void testIsGeldigGeeftFalseIndienBeoordelingNogNietGegeven() {
		SpelEvaluatie evaluatie = new SpelEvaluatie(spel, geldigeSpeler);
		assertFalse(evaluatie.isGeldig());
	}

	@Test
	public void testIsGeldigGeeftFalseIndienSpelerJongerDanMinimumLeeftijdSpel() {
		SpelEvaluatie evaluatie = new SpelEvaluatie(spel, ongeldigeSpeler);
		evaluatie.maakBeoordeling(5, "We hebben ontzettend veel gelachen.");
		assertFalse(evaluatie.isGeldig());
	}

	@Test
	public void testIsGeldigGeeftFalseIndienSpelerLeeftijdNietBekend() {
		ongeldigeSpeler.setGeboortedatum(null);
		SpelEvaluatie evaluatie = new SpelEvaluatie(spel, ongeldigeSpeler);
		evaluatie.maakBeoordeling(5, "We hebben ontzettend veel gelachen.");
		assertFalse(evaluatie.isGeldig());
	}

	@Test
	public void testIsGeldigGeeftTrueIndienSpelerOuderDanMinimumLeeftijdSpel() {
		SpelEvaluatie evaluatie = new SpelEvaluatie(spel, geldigeSpeler);
		evaluatie.maakBeoordeling(5, "We hebben ontzettend veel gelachen.");
		assertTrue(evaluatie.isGeldig());
	}

	@Test
	public void testMaakBeoordelingVultScoreCorrectIn() {
		SpelEvaluatie evaluatie = new SpelEvaluatie(spel, geldigeSpeler);
		assertNull(evaluatie.getScore());
		evaluatie.maakBeoordeling(5, "We hebben ontzettend veel gelachen.");
		assertNotNull(evaluatie.getScore());
		assertEquals(new Score(5).getStars(), evaluatie.getScore().getStars());
	}

	@Test
	public void testMaakBeoordelingVultMotivatieCorrectIn() {
		String motivatie = "We hebben ontzettend veel gelachen.";
		SpelEvaluatie evaluatie = new SpelEvaluatie(spel, geldigeSpeler);
		assertNull(evaluatie.getMotivatie());
		evaluatie.maakBeoordeling(5, motivatie);
		assertNotNull(evaluatie.getMotivatie());
		assertEquals(motivatie, evaluatie.getMotivatie());
	}

	@Test
	public void testMaakBeoordelingKanEerdereBeoordelingNietOverschrijven() {
		String motivatie = "We hebben ontzettend veel gelachen.";
		SpelEvaluatie evaluatie = new SpelEvaluatie(spel, geldigeSpeler);
		evaluatie.maakBeoordeling(5, motivatie);
		evaluatie.maakBeoordeling(3, "Niet erg spannend.");
		assertEquals(motivatie, evaluatie.getMotivatie());
		assertEquals(new Score(5).getStars(), evaluatie.getScore().getStars());
	}
}
