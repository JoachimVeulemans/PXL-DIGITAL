package oefening2_JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import oefening2.Tijdstip;

public class TijdstipConstructorTest {

	@Test
	public void testConstructorMetParameters() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		assertEquals(tijd.getUren(), 20);
		assertEquals(tijd.getMinuten(), 30);
		assertEquals(tijd.getSeconden(), 40);
	}

	@Test
	public void testConstructorMetParametersTeGroot() {
		Tijdstip tijd = new Tijdstip(25, 186, 230);
		assertEquals(tijd.getUren(), 4);
		assertEquals(tijd.getMinuten(), 9);
		assertEquals(tijd.getSeconden(), 50);
	}

	@Test
	public void testConstructorEenParameter() {
		Tijdstip tijd = new Tijdstip(3700);
		assertEquals(tijd.getUren(), 1);
		assertEquals(tijd.getMinuten(), 1);
		assertEquals(tijd.getSeconden(), 40);
	}

	@Test
	public void testCopyConstructor() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		Tijdstip tijd1 = new Tijdstip(tijd);
		assertEquals(tijd.getMinuten(), tijd1.getMinuten());
		assertEquals(tijd.getSeconden(), tijd1.getSeconden());
		assertEquals(tijd.getUren(), tijd1.getUren());
	}

	@Test
	public void testSetUurOk() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.setUren(2);
		assertEquals(tijd.getUren(), 2);
		assertEquals(tijd.getMinuten(), 30);
		assertEquals(tijd.getSeconden(), 40);
	}

	@Test
	public void testSetUurTeGroot() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.setUren(25);
		assertEquals(tijd.getUren(), 1);
		assertEquals(tijd.getMinuten(), 30);
		assertEquals(tijd.getSeconden(), 40);
	}

	@Test
	public void testSetMinutenOk() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.setMinuten(2);
		assertEquals(tijd.getUren(), 20);
		assertEquals(tijd.getMinuten(), 2);
		assertEquals(tijd.getSeconden(), 40);
	}

	@Test
	public void testSetMinutenTeGroot() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.setMinuten(120);
		assertEquals(tijd.getUren(), 22);
		assertEquals(tijd.getMinuten(), 0);
		assertEquals(tijd.getSeconden(), 40);
	}

	@Test
	public void testSetSecondenOk() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.setSeconden(12);
		assertEquals(tijd.getUren(), 20);
		assertEquals(tijd.getMinuten(), 30);
		assertEquals(tijd.getSeconden(), 12);

	}

	@Test
	public void testSetSecondenTeGroot() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.setSeconden(120);
		assertEquals(tijd.getUren(), 20);
		assertEquals(tijd.getMinuten(), 32);
		assertEquals(tijd.getSeconden(), 0);

	}

	@Test
	public void testVoegUrenToeMetParameterUrenOk() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.voegUrenToe(2);
		assertEquals(tijd.getUren(), 22);
		assertEquals(tijd.getMinuten(), 30);
		assertEquals(tijd.getSeconden(), 40);
	}

	@Test
	public void testVoegUrenToeMetParameterUrenTeGroot() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.voegUrenToe(10);
		assertEquals(tijd.getUren(), 6);
		assertEquals(tijd.getMinuten(), 30);
		assertEquals(tijd.getSeconden(), 40);
	}

	@Test
	public void testVoegUrenToeZonderParameterUrenOk() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.voegUrenToe();
		assertEquals(tijd.getUren(), 21);
		assertEquals(tijd.getMinuten(), 30);
		assertEquals(tijd.getSeconden(), 40);
	}

	@Test
	public void testVoegUrenToeZonderParameterUrenTeGroot() {
		Tijdstip tijd = new Tijdstip(23, 30, 40);
		tijd.voegUrenToe();
		assertEquals(tijd.getUren(), 0);
		assertEquals(tijd.getMinuten(), 30);
		assertEquals(tijd.getSeconden(), 40);
	}

	@Test
	public void testVoegMinutenToeOk() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.voegMinutenToe(10);
		assertEquals(tijd.getUren(), 20);
		assertEquals(tijd.getMinuten(), 40);
		assertEquals(tijd.getSeconden(), 40);
	}

	@Test
	public void testVoegMinutenToeTeGroot() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.voegMinutenToe(60);
		assertEquals(tijd.getUren(), 21);
		assertEquals(tijd.getMinuten(), 30);
		assertEquals(tijd.getSeconden(), 40);
	}

	@Test
	public void testVoegSecondenToeOk() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.voegSecondenToe(6);
		assertEquals(tijd.getUren(), 20);
		assertEquals(tijd.getMinuten(), 30);
		assertEquals(tijd.getSeconden(), 46);
	}

	@Test
	public void testVoegSecondenToeTeGroot() {
		Tijdstip tijd = new Tijdstip(20, 30, 40);
		tijd.voegSecondenToe(60);
		assertEquals(tijd.getUren(), 20);
		assertEquals(tijd.getMinuten(), 31);
		assertEquals(tijd.getSeconden(), 40);
	}

	@Test
	public void testToStringEngelsNotatie() {
		Tijdstip tijd = new Tijdstip(8, 4, 4);
		assertEquals(tijd.toStringTijd(false), "8:04 u");
	}

	@Test
	public void testToStringEngelsNotatieMiddernacht() {
		Tijdstip tijd = new Tijdstip(0, 0, 0);
		assertEquals(tijd.toStringTijd(false), "0:00 u");
	}

	@Test
	public void testToStringGeenEngelsNotatieVoorMiddag() {
		Tijdstip tijd = new Tijdstip(8, 5, 0);
		assertEquals(tijd.toStringTijd(true), "08:05 AM");
	}

	@Test
	public void testToStringGeenEngelsNotatieNaMiddag() {
		Tijdstip tijd = new Tijdstip(18, 5, 0);
		assertEquals(tijd.toStringTijd(true), "06:05 PM");
	}

	@Test
	public void testToStringGeenEngelsNotatieMiddag() {
		Tijdstip tijd = new Tijdstip(12, 0, 0);
		assertEquals(tijd.toStringTijd(true), "12:00 PM (noon)");
	}

	@Test
	public void testToStringGeenEngelsNotatieMiddernacht() {
		Tijdstip tijd = new Tijdstip(24, 0, 0);
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
