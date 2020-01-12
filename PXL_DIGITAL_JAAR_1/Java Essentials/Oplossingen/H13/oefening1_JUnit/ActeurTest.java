package oefening1_JUnit;

import static org.junit.Assert.*;
import org.junit.Test;

import oefening1.Acteur;
import oefening1.Egel;
import oefening1.Konijn;

public class ActeurTest {

	@Test
	public void testImplementatieBeweegbaar() {
		Acteur acteur = new Konijn(5, 10);

		// test stap boven
		acteur.stapBoven();
		assertTrue("Verbeter implementatie van stapBoven() in klasse Acteur.",
				acteur.getX() == 5 && acteur.getY() == 11);
		// test stap links
		acteur.stapLinks();
		assertTrue("Verbeter implementatie van stapLink() in klasse Acteur.",
				acteur.getX() == 4 && acteur.getY() == 11);
		// test stap onder
		acteur.stapOnder();
		assertTrue("Verbeter implementatie van stapOnder() in klasse Acteur.",
				acteur.getX() == 4 && acteur.getY() == 10);
		// test stap rechts
		acteur.stapRechts();
		assertTrue("Verbeter implementatie van stapRechts() in klasse Acteur.",
				acteur.getX() == 5 && acteur.getY() == 10);

	}

	@Test
	public void testEenEgelGroetEenEgelBinnenStraal20() {
		Egel egel = new Egel(0, 0);
		Egel andereEgel = new Egel(4, 4);
		String tekst = egel.interageer(andereEgel);
		assertTrue("egel moet egel binnen straal 20 groeten", tekst != null && tekst.equalsIgnoreCase("Dag egel"));

	}

	@Test
	public void testEenEgelGroetEenEgelBuitenStraal20Niet() {
		Egel egel = new Egel(0, 0);
		Egel andereEgel = new Egel(20, 20);
		assertEquals("egel kan egel buiten straal 20 niet groeten", egel.interageer(andereEgel), null);
	}

	@Test
	public void testEenEgelGroetEenKonijnBinnenStraal10() {
		Egel egel = new Egel(0, 0);
		Konijn konijn = new Konijn(4, 4);
		String tekst = egel.interageer(konijn);
		assertTrue("egel moet konijn binnen straal 10 groeten", tekst != null && tekst.equalsIgnoreCase("dag konijn"));

	}

	@Test
	public void testEenEgelGroetEenKonijnBuitenStraal10Niet() {
		Egel egel = new Egel(0, 0);
		Konijn konijn = new Konijn(14, 14);
		assertEquals("egel kan konijn buiten straal 10 niet groeten", egel.interageer(konijn), null);
	}

	@Test
	public void testEenKonijnGroetEenKonijnNiet() {
		Konijn konijn = new Konijn(0, 0);
		Konijn anderKonijn = new Konijn(1, 1);
		assertEquals("konijn mag een konijn niet groeten", konijn.interageer(anderKonijn), null);
	}

	@Test
	public void testEenKonijnGroetEenEgelNiet() {
		Egel egel = new Egel(1, 1);
		Konijn konijn = new Konijn(14, 14);
		assertEquals("konijn mag een egel niet groeten", konijn.interageer(egel), null);
	}

}
