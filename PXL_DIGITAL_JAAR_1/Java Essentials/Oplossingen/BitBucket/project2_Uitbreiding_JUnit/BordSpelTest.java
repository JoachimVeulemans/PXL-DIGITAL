package project2_Uitbreiding_JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import project2_Uitbreiding.BordSpel;
import project2_Uitbreiding.Uitgever;

public class BordSpelTest {
    public static final String RUMIKUB = "Rumikub";
    private Uitgever uitgever;

    @Before
    public void setup() {
        uitgever = new Uitgever("999Games", "Almere", LocalDate.of(1990, 5, 12));
    }

    @Test
    public void testConstructor() {
        BordSpel bordSpel = new BordSpel(RUMIKUB, uitgever);
        assertNotNull(bordSpel);
        assertNotNull(bordSpel.getUitgever());
        assertEquals(uitgever, bordSpel.getUitgever());
        assertEquals(RUMIKUB, bordSpel.getNaam());
    }

    @Test
    public void testSetAantalSpelers() {
        BordSpel bordSpel = new BordSpel(RUMIKUB, uitgever);
        bordSpel.setAantalSpelers(5);
        assertEquals(5, bordSpel.getAantalSpelers());
    }

    @Test
    public void testAantalSpelersWordt1IndienNegatieveWaarde() {
        BordSpel bordSpel = new BordSpel(RUMIKUB, uitgever);
        bordSpel.setAantalSpelers(-2);
        assertEquals(1, bordSpel.getAantalSpelers());
    }

    @Test
    public void testSetMinimumLeeftijd() {
        BordSpel bordSpel = new BordSpel(RUMIKUB, uitgever);
        bordSpel.setMinimumLeeftijd(8);
        assertEquals(8, bordSpel.getMinimumLeeftijd());
    }

    @Test
    public void testMinimumLeeftijdWordt12IndienNegatieveWaarde() {
        BordSpel bordSpel = new BordSpel(RUMIKUB, uitgever);
        bordSpel.setMinimumLeeftijd(-2);
        assertEquals(12, bordSpel.getMinimumLeeftijd());
    }

    @Test
    public void testSetSpeelduur() {
        BordSpel bordSpel = new BordSpel(RUMIKUB, uitgever);
        bordSpel.setSpeelduur(50);
        assertEquals(50, bordSpel.getSpeelduur());
    }

    @Test
    public void testSpeelduurWordt30IndienNegatieveWaarde() {
        BordSpel bordSpel = new BordSpel(RUMIKUB, uitgever);
        bordSpel.setSpeelduur(-15);
        assertEquals(30, bordSpel.getSpeelduur());
    }
    
    @Test
    public void testToStringBevatAlleRelevanteInformatie() {
    	 BordSpel spel = new BordSpel(RUMIKUB, uitgever);
         spel.setMinimumLeeftijd(8);
         spel.setSpeelduur(25);
         spel.setAantalSpelers(7);
         String result = spel.toString();
         assertTrue(result.contains(RUMIKUB));
         assertTrue(result.contains(uitgever.getNaam()));
         assertTrue(result.contains(String.valueOf(8)));
         assertTrue(result.contains(String.valueOf(25)));
         assertTrue(result.contains(String.valueOf(7)));
    }
}
