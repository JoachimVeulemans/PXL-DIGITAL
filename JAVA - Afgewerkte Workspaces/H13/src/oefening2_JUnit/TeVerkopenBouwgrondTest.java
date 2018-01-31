package oefening2_JUnit;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import org.junit.Test;

import oefening2.TeVerkopenBouwGrond;
import oefening2.Verkoopbaar;

public class TeVerkopenBouwgrondTest {

	@Test
	public void testConstructor() {
		TeVerkopenBouwGrond teVerkopenBouwGrond = new TeVerkopenBouwGrond("12ER", 12.4f, "Open Bebouwing");
		assertEquals(teVerkopenBouwGrond.getPerceelGrootte(), 12.4f, 0);
		assertEquals("12ER", teVerkopenBouwGrond.getPerceelNr());
		assertEquals("Open Bebouwing", teVerkopenBouwGrond.getBouwVoorschrift());
	}

	@Test
	public void testEenmaligeToewijzingAanNotaris() {
		TeVerkopenBouwGrond teVerkopenBouwGrond = new TeVerkopenBouwGrond("12ER", 12.4f, "Open Bebouwing");
		LocalDate datum1 = LocalDate.of(2017, 1, 5);
		LocalDate datum2 = LocalDate.of(2017, 1, 7);
		teVerkopenBouwGrond.wijsEenNotarisToe("Notaris1", datum1);
		teVerkopenBouwGrond.wijsEenNotarisToe("Notaris2", datum2);
		assertEquals("er kan slechts 1 maal een notaris toegewezen worden", "Notaris1",
				teVerkopenBouwGrond.getNotaris());
		assertEquals(" Verbeter: instellen datumTeKoop", datum1, teVerkopenBouwGrond.getDatumTeKoop());
	}

	@Test
	public void testBodWordtNietGeregistreerdIndienGeenNotaris() {
		TeVerkopenBouwGrond teVerkopenBouwGrond = new TeVerkopenBouwGrond("12ER", 12.4f, "Open Bebouwing");
		teVerkopenBouwGrond.doeEenBod(150000, LocalDate.of(2017, 2, 1));
		assertEquals("een bod wordt niet geregistreerd indien er geen notaris is toegewezen", null,
				teVerkopenBouwGrond.getDatumHoogsteBod());
	}

	@Test
	public void testBodWordtNietGeregistreerdIndienMinderDan10DagenSindsVerkoopdatum() {
		TeVerkopenBouwGrond teVerkopenBouwGrond = new TeVerkopenBouwGrond("12ER", 12.4f, "Open Bebouwing");
		teVerkopenBouwGrond.wijsEenNotarisToe("Notaris1", LocalDate.of(2017, 1, 7));
		teVerkopenBouwGrond.doeEenBod(150000, LocalDate.of(2017, 1, 16));
		assertEquals("een bod wordt niet geregistreerd indien minder dan 10 dagen sinds verkoopdatum", null,
				teVerkopenBouwGrond.getDatumHoogsteBod());

	}

	@Test
	public void testBodWordtNietGeregistreerdIndienMinderDanMinimumPrijs() {
		TeVerkopenBouwGrond teVerkopenBouwGrond = new TeVerkopenBouwGrond("12ER", 12.4f, "Open Bebouwing");
		teVerkopenBouwGrond.wijsEenNotarisToe("Notaris1", LocalDate.of(2017, 1, 7));
		teVerkopenBouwGrond.doeEenBod(Verkoopbaar.minPrijsM2 * 100 * teVerkopenBouwGrond.getPerceelGrootte() - 1,
				LocalDate.of(2017, 2, 1));
		assertEquals("een bod wordt niet geregistreerd indien minder dan minimumprijs", null,
				teVerkopenBouwGrond.getDatumHoogsteBod());

	}

	@Test
	public void testBodWordtNietGeregistreerdMinderDanHoogsteBod() {
		TeVerkopenBouwGrond teVerkopenBouwGrond = new TeVerkopenBouwGrond("12ER", 12.4f, "Open Bebouwing");
		teVerkopenBouwGrond.wijsEenNotarisToe("Notaris1", LocalDate.of(2017, 1, 7));
		teVerkopenBouwGrond.doeEenBod(150000, LocalDate.of(2017, 2, 1));
		teVerkopenBouwGrond.doeEenBod(130000, LocalDate.of(2017, 2, 2));
		assertEquals("een bod wordt niet geregistreerd indien minder dan hoogste bod", 150000,
				teVerkopenBouwGrond.getHoogsteBod(), 0);

	}

	@Test
	public void testBodWordtGeregistreerd() {
		TeVerkopenBouwGrond teVerkopenBouwGrond = new TeVerkopenBouwGrond("12ER", 12.4f, "Open Bebouwing");
		teVerkopenBouwGrond.wijsEenNotarisToe("Notaris1", LocalDate.of(2017, 1, 7));
		LocalDate bodDatum = LocalDate.of(2017, 2, 1);
		teVerkopenBouwGrond.doeEenBod(150000, bodDatum);
		assertEquals("Verbeter: registratie bod van een geldig bod", 150000, teVerkopenBouwGrond.getHoogsteBod(), 0);
		assertEquals("Verbeter: registratie datum van een geldig bod", bodDatum,
				teVerkopenBouwGrond.getDatumHoogsteBod());

	}

	@Test
	public void testBodWordtGeregistreerdIndienHogerDanHoogsteBod() {
		TeVerkopenBouwGrond teVerkopenBouwGrond = new TeVerkopenBouwGrond("12ER", 12.4f, "Open Bebouwing");
		teVerkopenBouwGrond.wijsEenNotarisToe("Notaris1", LocalDate.of(2017, 1, 7));
		LocalDate bodDatum = LocalDate.of(2017, 2, 2);
		teVerkopenBouwGrond.doeEenBod(150000, LocalDate.of(2017, 2, 1));
		teVerkopenBouwGrond.doeEenBod(170000, bodDatum);
		assertEquals("Verbeter: registratie bod van een hoger bod", 170000, teVerkopenBouwGrond.getHoogsteBod(), 0);
		assertEquals("Verbeter: registratie datum van een hoger bod", bodDatum,
				teVerkopenBouwGrond.getDatumHoogsteBod());
	}

	@Test
	public void testGetNotaris() {
		TeVerkopenBouwGrond teVerkopenBouwGrond = new TeVerkopenBouwGrond("12ER", 12.4f, "Open Bebouwing");
		teVerkopenBouwGrond.wijsEenNotarisToe("Notaris1", LocalDate.of(2017, 1, 7));
		assertEquals("Notaris1", teVerkopenBouwGrond.getNotaris());
	}

	@Test
	public void testGetDatumTeKoop() {
		TeVerkopenBouwGrond teVerkopenBouwGrond = new TeVerkopenBouwGrond("12ER", 12.4f, "Open Bebouwing");
		LocalDate aankoopdatum = LocalDate.of(2017, 1, 7);
		teVerkopenBouwGrond.wijsEenNotarisToe("Notaris1", aankoopdatum);
		assertEquals(aankoopdatum, teVerkopenBouwGrond.getDatumTeKoop());
	}

	@Test
	public void testGetHoogsteBod() {
		TeVerkopenBouwGrond teVerkopenBouwGrond = new TeVerkopenBouwGrond("12ER", 12.4f, "Open Bebouwing");
		teVerkopenBouwGrond.wijsEenNotarisToe("Notaris1", LocalDate.of(2017, 1, 7));
		teVerkopenBouwGrond.doeEenBod(150000, LocalDate.of(2017, 2, 1));
		assertEquals(150000, teVerkopenBouwGrond.getHoogsteBod(), 0);
	}

	@Test
	public void testGetDatumHoogsteBod() {
		TeVerkopenBouwGrond teVerkopenBouwGrond = new TeVerkopenBouwGrond("12ER", 12.4f, "Open Bebouwing");
		teVerkopenBouwGrond.wijsEenNotarisToe("Notaris1", LocalDate.of(2017, 1, 7));
		LocalDate datumBod = LocalDate.of(2017, 2, 1);
		teVerkopenBouwGrond.doeEenBod(150000, datumBod);
		assertEquals(datumBod, teVerkopenBouwGrond.getDatumHoogsteBod());
	}

}