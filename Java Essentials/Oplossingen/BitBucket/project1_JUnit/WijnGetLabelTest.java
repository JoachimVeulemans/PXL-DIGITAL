package project1_JUnit;

import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import project1.Wijn;

public class WijnGetLabelTest {

	private Wijn wijn;
	private static final String NAAM = "Wine Complet";
	private static final String REGIO = "Ergens";
	private static final String DRUIVENRAS = "Pinot Gris";
	private static final int JAARGANG = 2013;

	@Before
	public void setup() {
		wijn = new Wijn(NAAM, "Rood", "Frankrijk");
		wijn.setJaargang(JAARGANG);
	}

	@Test
	public void testLabelStartMetNaam() {
		assertTrue(wijn.getLabel().startsWith("Wine Complet"));
	}

	@Test
	public void testLabelBevatJaargang() {
		assertTrue(wijn.getLabel().contains(String.valueOf(JAARGANG)));
	}

	@Test
	public void testLabelBevatJaargangOpVierdeRegel() {
		Assert.assertEquals(4, getLijnNummer(wijn.getLabel(), String.valueOf(JAARGANG)));
	}

	private int getLijnNummer(String volledigeTekst, String teZoekenTekst) {
		Scanner scanner = new Scanner(volledigeTekst);
		int i = 1;
		while (!teZoekenTekst.equals(scanner.nextLine())) {
			i++;
		}
		scanner.close();
		return i;
	}

	@Test
	public void testLabelBevatRegio() {
		wijn.setRegio(REGIO);
		assertTrue(wijn.getLabel().contains(REGIO));
	}

	@Test
	public void testLabelBevatRegioOpDerdeRegel() {
		wijn.setRegio(REGIO);
		Assert.assertEquals(3, getLijnNummer(wijn.getLabel(), REGIO));
	}

	@Test
	public void testLabelBevatDruivenras() {
		wijn.setDruivenras(DRUIVENRAS);
		assertTrue(wijn.getLabel().contains(DRUIVENRAS));
	}

	@Test
	public void testLabelBevatDruivenrasOpTweedeRegel() {
		wijn.setDruivenras(DRUIVENRAS);
		Assert.assertEquals(2, getLijnNummer(wijn.getLabel(), DRUIVENRAS));
	}

}
