package project1_JUnit;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import project1.Wijn;

public class WijnGetAdviesPrijsTest {

	private Wijn wijn;
	private static final double BASIS_ADVIESPRIJS_FRANKRIJK = 7.5;
	private static final double BASIS_ADVIESPRIJS_CHILI = 8.25;
	private static final double BASIS_ADVIESPRIJS_MAX = 9.30;

	@Before
	public void setup() {
		wijn = new Wijn("Wine Complet", "Rood", "Frankrijk");
		wijn.setJaargang(LocalDate.now().getYear());
	}

	@Test
	public void testHuidigJaarFrankrijkGeeftBasisAdviesPrijsFrankrijk() {
		assertEquals(BASIS_ADVIESPRIJS_FRANKRIJK, wijn.getAdviesPrijs(), 0);
	}

	@Test
	public void testHuidigJaarChiliGeeftBasisAdviesPrijsChili() {
		wijn.setLand("Chili");
		assertEquals(BASIS_ADVIESPRIJS_CHILI, wijn.getAdviesPrijs(), 0);
	}

	@Test
	public void testHuidigJaarEnOnbekendLandGeeftMaxBasisAdviesPrijs() {
		wijn.setLand("Onbekend");
		assertEquals(BASIS_ADVIESPRIJS_MAX, wijn.getAdviesPrijs(), 0);
	}

	@Test
	public void testIederJaarWordtEenWijnTienCentDuurderTovBasisAdviesPrijs() {
		wijn.setJaargang(2000);
		int jaren = LocalDate.now().getYear() - 2000;
		assertEquals(BASIS_ADVIESPRIJS_FRANKRIJK + (jaren * 0.10), wijn.getAdviesPrijs(), 0);
	}

	@Test
	public void testVoorJaargangenDieEindigenOp7BlijftDeBasisAdviesPrijsGelden() {
		wijn.setJaargang(1967);
		assertEquals(BASIS_ADVIESPRIJS_FRANKRIJK, wijn.getAdviesPrijs(), 0);
	}

}
