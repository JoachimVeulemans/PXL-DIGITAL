package oefening1_JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import oefening1.Punt;

public class PuntTest {

	@Test
	public void testConstructorParametersOk() {
		Punt punt = new Punt(1, 2);
		assertEquals(punt.getX(), 1);
		assertEquals(punt.getY(), 2);
	}

	@Test
	public void testConstructorParameterXTeGroot() {
		Punt punt = new Punt(Punt.getMaximumgrootte() + 1, 2);
		assertEquals(Punt.getMaximumgrootte(), punt.getX());
	}

	@Test
	public void testConstructorParameterYTeGroot() {
		Punt punt = new Punt(1, Punt.getMaximumgrootte() + 1);
		assertEquals(Punt.getMaximumgrootte(), punt.getY());
	}

	@Test
	public void testConstructorParameterXTNegatief() {
		Punt punt = new Punt(-1, 2);
		assertEquals(0, punt.getX());
	}

	@Test
	public void testConstructorParameterYNegatief() {
		Punt punt = new Punt(1, -2);
		assertEquals(0, punt.getY());
	}

	@Test
	public void testGetX() {
		Punt punt = new Punt(1, 2);
		assertEquals(1, punt.getX());
	}

	@Test
	public void testSetXOk() {
		Punt punt = new Punt(1, 2);
		punt.setX(5);
		assertEquals(5, punt.getX());

	}

	@Test
	public void testSetXTeGroot() {
		Punt punt = new Punt(1, 2);
		punt.setX(Punt.getMaximumgrootte());
		assertEquals(Punt.getMaximumgrootte(), punt.getX());
	}

	@Test
	public void testSetXNegatief() {
		Punt punt = new Punt(1, 2);
		punt.setX(-1);
		assertEquals(0, punt.getX());
	}

	@Test
	public void testGetY() {
		Punt punt = new Punt(1, 2);
		assertEquals(2, punt.getY());
	}

	@Test
	public void testSetYOk() {
		Punt punt = new Punt(1, 2);
		punt.setY(5);
		assertEquals(5, punt.getY());
	}

	@Test
	public void testSetYTeGroot() {
		Punt punt = new Punt(1, 2);
		punt.setY(Punt.getMaximumgrootte());
		assertEquals(Punt.getMaximumgrootte(), punt.getY());
	}

	@Test
	public void testSetYNegatief() {
		Punt punt = new Punt(1, 2);
		punt.setY(-1);
		assertEquals(0, punt.getY());
	}

	@Test
	public void testBerekenAfstand() {
		Punt punt = new Punt(0, 0);
		Punt anderpunt = new Punt(1, 1);
		double afstand = Math.sqrt(2);
		assertEquals(afstand, punt.berekenAfstand(anderpunt), 0);
	}
}
