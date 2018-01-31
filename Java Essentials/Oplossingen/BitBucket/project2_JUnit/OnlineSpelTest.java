package project2_JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import project2.OnlineSpel;
import project2.Uitgever;

public class OnlineSpelTest {
    public static final String LOL = "League of Legends";
    public static final String GENRE = "online arena game";
    public static final String URL = "www.lol.com";
    private Uitgever uitgever;

    @Before
    public void setup() {
        uitgever = new Uitgever("RiotGames", "LA", 2006);
    }

    @Test
    public void testConstructor() {
        OnlineSpel spel = new OnlineSpel(LOL, uitgever);
        assertNotNull(spel);
        assertNotNull(spel.getUitgever());
        assertEquals(uitgever, spel.getUitgever());
        assertEquals(LOL, spel.getNaam());
    }
    
    @Test
    public void testSetNaam() {
    	OnlineSpel spel = new OnlineSpel(LOL, uitgever);
    	spel.setNaam("Nieuwe naam");
    	assertEquals("Nieuwe naam" , spel.getNaam());
    }

    @Test
    public void testSetGenre() {
        OnlineSpel spel = new OnlineSpel(LOL, uitgever);
        spel.setGenre(GENRE);
        assertEquals(GENRE, spel.getGenre());
    }

    @Test
    public void testSetMinimumLeeftijd() {
        OnlineSpel spel = new OnlineSpel(LOL, uitgever);
        spel.setMinimumLeeftijd(8);
        assertEquals(8, spel.getMinimumLeeftijd());
    }

    @Test
    public void testMinimumLeeftijdWordt12IndienNegatieveWaarde() {
        OnlineSpel spel = new OnlineSpel(LOL, uitgever);
        spel.setMinimumLeeftijd(-2);
        assertEquals(12, spel.getMinimumLeeftijd());
    }

    @Test
    public void testSetUrl() {
        OnlineSpel spel = new OnlineSpel(LOL, uitgever);
        spel.setUrl(URL);
        assertEquals(URL, spel.getUrl());
    }
    
    @Test
    public void testToStringBevatAlleRelevanteInformatie() {
    	 OnlineSpel spel = new OnlineSpel(LOL, uitgever);
         spel.setMinimumLeeftijd(8);
         spel.setGenre(GENRE);
         String result = spel.toString();
         assertTrue(result.contains(LOL));
         assertTrue(result.contains(uitgever.getNaam()));
         assertTrue(result.contains(GENRE));
         assertTrue(result.contains(String.valueOf(8)));
    }

}
