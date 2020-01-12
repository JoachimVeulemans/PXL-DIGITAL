package oefening5_JUnit;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import oefening5.Auto;

public class AutoTest {
	private Auto auto;

	@Before
	public void init() {
		auto = new Auto("BMW", "318", 2012, "zwart", 160);

	}

	@Test
	public void testConstructorZonderParameters() {
		Auto autoDefault = new Auto();
		assertTrue(autoDefault.getMerk().equals("VW"));
		assertTrue(autoDefault.getModel().equals("Polo"));
		assertEquals(autoDefault.getBouwjaar(), 2017, 0);
		assertTrue(autoDefault.getKleur().equals("Grijs"));
		assertEquals(autoDefault.getMaxSnelheid(), 160, 0);

	}

	@Test
	public void testConstructorMetAlleEigenschappen() {

		assertTrue(auto.getMerk().equals("BMW"));
		assertTrue(auto.getModel().equals("318"));
		assertEquals(auto.getBouwjaar(), 2012, 0);
		assertTrue(auto.getKleur().equals("zwart"));
		assertEquals(auto.getMaxSnelheid(), 160, 0);

	}

	@Test
	public void testConstructorMetAlleEigenschappenWaardeMaxSnelheidTeGroot() {
		Auto auto = new Auto("BMW", "318", 2012, "zwart", 210);
		assertTrue(auto.getMerk().equals("BMW"));
		assertTrue(auto.getModel().equals("318"));
		assertEquals(auto.getBouwjaar(), 2012, 0);
		assertTrue(auto.getKleur().equals("zwart"));
		assertEquals(auto.getMaxSnelheid(), 180, 0);

	}

	@Test
	public void testCopyConstructor() {

		Auto copyAuto = new Auto(auto);
		assertTrue(copyAuto.getMerk().equals("BMW"));
		assertTrue(copyAuto.getModel().equals("318"));
		assertEquals(copyAuto.getBouwjaar(), 2012);
		assertTrue(copyAuto.getKleur().equals("zwart"));
		assertEquals(copyAuto.getMaxSnelheid(), 160);

	}

	@Test
	public void testGetMerk() {
		assertTrue(auto.getMerk().equals("BMW"));
	}

	@Test
	public void testSetMerk() {

		auto.setMerk("test");
		assertTrue(auto.getMerk().equals("test"));

	}

	@Test
	public void testGetModel() {

		assertTrue(auto.getModel().equals("318"));

	}

	@Test
	public void testSetModel() {

		auto.setModel("model 5");
		assertTrue(auto.getModel().equals("model 5"));

	}

	@Test
	public void testGetKleur() {

		assertTrue(auto.getKleur().equals("zwart"));

	}

	@Test
	public void testSetKleur() {

		auto.setKleur("groen");
		assertTrue(auto.getKleur().equals("groen"));

	}

	@Test
	public void testGetBouwjaar() {

		assertEquals(auto.getBouwjaar(), 2012);

	}

	@Test
	public void testSetBouwjaar() {

		auto.setBouwjaar(2000);
		assertEquals(auto.getBouwjaar(), 2000);

	}

	@Test
	public void testGetMaxSnelheid() {

		assertEquals(auto.getMaxSnelheid(), 160);

	}

	@Test
	public void testSetMaxSnelheid() {

		auto.setMaxSnelheid(100);
		assertEquals(auto.getMaxSnelheid(), 100);

	}

	@Test
	public void testSetMaxSnelheidTeGroot() {

		auto.setMaxSnelheid(200);
		assertEquals(auto.getMaxSnelheid(), 180);

	}

	@Test
	public void testGetMax() {
		assertEquals(Auto.getMax(), 180);

	}

	@Test
	public void testGetAantal() {

		int beforeConstructor = Auto.getCount();
		new Auto();
		new Auto();
		int afterConstructor = Auto.getCount();
		assertTrue(afterConstructor - beforeConstructor == 2);

	}

}
