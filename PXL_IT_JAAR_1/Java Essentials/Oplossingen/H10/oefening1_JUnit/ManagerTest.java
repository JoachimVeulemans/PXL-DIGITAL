package oefening1_JUnit;

import static org.junit.Assert.*;

import org.junit.Test;
import oefening1.Manager;
import oefening1.Werknemer;

public class ManagerTest {

	@Test
	public void testConstructorNaamVoornaamSalarisFunctie() {
		Manager manager = new Manager("Doe", "John", "Manager", 2500.5);
		assertTrue("John".equalsIgnoreCase(manager.getVoornaam()));
		assertTrue("Doe".equalsIgnoreCase(manager.getNaam()));
		assertTrue("Manager".equalsIgnoreCase(manager.getFunctie()));
		assertEquals(50, manager.getBonus(), 0);
	}

	@Test
	public void testConstructorNaamVoornaamSalarisFunctieEnBonus() {
		Manager manager = new Manager("Doe", "John", "Manager", 2500.5, 600.5);
		assertTrue("John".equalsIgnoreCase(manager.getVoornaam()));
		assertTrue("Doe".equalsIgnoreCase(manager.getNaam()));
		assertTrue("Manager".equalsIgnoreCase(manager.getFunctie()));
		assertEquals(600.5, manager.getBonus(), 0);
	}

	@Test
	public void testGetBonus() {
		Manager manager = new Manager("Doe", "John", "Manager", 2500.5, 600.5);
		assertEquals(600.5, manager.getBonus(), 0);
	}

	@Test
	public void testSetBonus() {
		Manager manager = new Manager("Doe", "John", "Manager", 2500.5, 600.5);
		manager.setBonus(1000.5);
		assertEquals(1000.5, manager.getBonus(), 0);
	}

	@Test
	public void testGetSalaris() {
		Manager manager = new Manager("Doe", "John", "Manager", 2500.5, 600.5);
		assertEquals(2500.5 + 600.5, manager.getSalaris(), 0);
	}

	@Test
	public void testCountManagerObjecten() {
		int telBefore = Manager.getAantal();
		new Manager("", "", "", 0, 0);
		new Manager("", "", "", 0, 0);
		int telAfter = Manager.getAantal();
		assertEquals(2, telAfter - telBefore);

	}

	@Test
	public void testGetProcAandeelManagers() {
		int telBeforeManager = Manager.getAantal();
		int telBeforeWerknemer = Werknemer.getAantal();
		new Manager("", "", "", 0, 0);
		new Manager("", "", "", 0, 0);
		new Werknemer("", "");
		new Werknemer("", "");
		new Werknemer("", "");
		int telAfterManager = Manager.getAantal();
		int telManager = telAfterManager - telBeforeManager;
		int telAfterWerknemer = Werknemer.getAantal();
		int telWerknemer = telAfterWerknemer - telBeforeWerknemer;
		double percentage = (double) telManager / telWerknemer;
		assertTrue(0.4 == percentage || 40 == percentage * 100);

	}
}