package oefening2_JUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import oefening2.Tijdstip;

public class TijdstipGetterSetterTest {

	private Tijdstip tijd;

	@Before
	public void init() {
		tijd = new Tijdstip(20, 30, 40);
	}

	public void testSetUurOk() {
		tijd.setUren(2);
		assertEquals(tijd.getUren(), 2);
		assertEquals(tijd.getMinuten(), 30);
		assertEquals(tijd.getSeconden(), 40);
	}

	@Test
	public void testSetUurTeGroot() {
		tijd.setUren(25);
		assertEquals(tijd.getUren(), 1);
		assertEquals(tijd.getMinuten(), 30);
		assertEquals(tijd.getSeconden(), 40);
	}

	@Test
	public void testSetMinutenOk() {
		tijd.setMinuten(2);
		assertEquals(tijd.getUren(), 20);
		assertEquals(tijd.getMinuten(), 2);
		assertEquals(tijd.getSeconden(), 40);
	}

	@Test
	public void testSetMinutenTeGroot() {
		tijd.setMinuten(120);
		assertEquals(tijd.getUren(), 22);
		assertEquals(tijd.getMinuten(), 0);
		assertEquals(tijd.getSeconden(), 40);
	}

	@Test
	public void testSetSecondenOk() {
		tijd.setSeconden(12);
		assertEquals(tijd.getUren(), 20);
		assertEquals(tijd.getMinuten(), 30);
		assertEquals(tijd.getSeconden(), 12);

	}

	@Test
	public void testSetSecondenTeGroot() {
		tijd.setSeconden(120);
		assertEquals(tijd.getUren(), 20);
		assertEquals(tijd.getMinuten(), 32);
		assertEquals(tijd.getSeconden(), 0);

	}

	@Test
	public void testVoegUrenToeMetParameterUrenOk() {
		tijd.voegUrenToe(2);
		assertEquals(tijd.getUren(), 22);
		assertEquals(tijd.getMinuten(), 30);
		assertEquals(tijd.getSeconden(), 40);
	}

	@Test
	public void testVoegUrenToeMetParameterUrenTeGroot() {
		tijd.voegUrenToe(10);
		assertEquals(tijd.getUren(), 6);
		assertEquals(tijd.getMinuten(), 30);
		assertEquals(tijd.getSeconden(), 40);
	}

	@Test
	public void testVoegUrenToeZonderParameterUren() {
		tijd.voegUrenToe();
		assertEquals(tijd.getUren(), 21);
		assertEquals(tijd.getMinuten(), 30);
		assertEquals(tijd.getSeconden(), 40);
	}

	
	@Test
	public void testVoegMinutenToeOk() {
		tijd.voegMinutenToe(10);
		assertEquals(tijd.getUren(), 20);
		assertEquals(tijd.getMinuten(), 40);
		assertEquals(tijd.getSeconden(), 40);
	}

	@Test
	public void testVoegMinutenToeTeGroot() {
		tijd.voegMinutenToe(60);
		assertEquals(tijd.getUren(), 21);
		assertEquals(tijd.getMinuten(), 30);
		assertEquals(tijd.getSeconden(), 40);
	}

	@Test
	public void testVoegSecondenToeOk() {
		tijd.voegSecondenToe(6);
		assertEquals(tijd.getUren(), 20);
		assertEquals(tijd.getMinuten(), 30);
		assertEquals(tijd.getSeconden(), 46);
	}

	@Test
	public void testVoegSecondenToeTeGroot() {
		tijd.voegSecondenToe(60);
		assertEquals(tijd.getUren(), 20);
		assertEquals(tijd.getMinuten(), 31);
		assertEquals(tijd.getSeconden(), 40);
	}

}
