package oefening2_JUnit;

import static org.junit.Assert.*;


import org.junit.Test;

import oefening2.Tijdstip;

public class TijdstiptoStringTest {

	@Test
	public void testToStringEngelseNotatie() {
		Tijdstip tijd = new Tijdstip(8, 4, 4);
		assertEquals(tijd.toStringTijd(false), "8:04 u");
	}

	@Test
	public void testToStringEngelseNotatieMiddernacht() {
		Tijdstip tijd = new Tijdstip(0, 0, 0);
		assertEquals(tijd.toStringTijd(false), "0:00 u");
	}

	@Test
	public void testToStringGeenEngelseNotatieVoorMiddag() {
		Tijdstip tijd = new Tijdstip(8, 5, 0);
		assertEquals(tijd.toStringTijd(true), "08:05 AM");
	}

	@Test
	public void testToStringGeenEngelseNotatieNaMiddag() {
		Tijdstip tijd = new Tijdstip(18, 5, 5);
		assertEquals(tijd.toStringTijd(true), "06:05 PM");
	}

	@Test
	public void testToStringGeenEngelseNotatieMiddag() {
		Tijdstip tijd = new Tijdstip(12, 0, 5);
		assertEquals(tijd.toStringTijd(true), "12:00 PM (noon)");
	}

	@Test
	public void testToStringGeenEngelseNotatieMiddernacht() {
		Tijdstip tijd = new Tijdstip(24, 0, 5);
		assertEquals(tijd.toStringTijd(true), "12:00 AM (midnight)");
		
	}

	@Test
	public void testToStringTechnischZonderVoorloopNullen() {
		Tijdstip tijd = new Tijdstip(15, 10, 20);
		assertEquals(tijd.toStringTechnisch(), "15:10:20");
	}

	@Test
	public void testToStringTechnischMetVoorloopNullen() {
		Tijdstip tijd = new Tijdstip(5, 1, 2);
		assertEquals(tijd.toStringTechnisch(), "05:01:02");
	}
}
