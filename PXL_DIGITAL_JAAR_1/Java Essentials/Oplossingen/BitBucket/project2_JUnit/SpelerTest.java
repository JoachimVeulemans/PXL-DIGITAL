package project2_JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.junit.Test;

import project2.Speler;

public class SpelerTest {
    private static final int GEBOORTEJAAR =  2003;
    private static final int GEBOORTEJAAR_IN_TOEKOMST = LocalDate.now().plusYears(1).getYear();

    @Test
    public void testConstructor() {
        Speler speler = new Speler("Speler1", GEBOORTEJAAR);
        assertNotNull(speler);
        assertEquals("Speler1", speler.getNaam());
        assertEquals(GEBOORTEJAAR, speler.getGeboortejaar());
    }
    
    @Test
    public void testConstructorGeboortejaar1900() {
        Speler speler = new Speler("Speler1", 1900);
        assertNotNull(speler);
        assertEquals("Speler1", speler.getNaam());
        assertEquals(1900, speler.getGeboortejaar());
    }
    
    @Test
    public void testConstructorGeboortejaar1899() {
        Speler speler = new Speler("Speler1", 1899);
        assertNotNull(speler);
        assertEquals("Speler1", speler.getNaam());
        assertEquals(0, speler.getGeboortejaar());
    }

    @Test
    public void testConstructorGeboortejaarNietInToekomst() {
        Speler speler = new Speler("Speler1", GEBOORTEJAAR_IN_TOEKOMST);
        assertNotNull(speler);
        assertEquals(0, speler.getGeboortejaar());
    }
    
    @Test
    public void testSetNaam() {
    	Speler speler = new Speler("Speler1", GEBOORTEJAAR_IN_TOEKOMST);
    	speler.setNaam("Nieuwe naam");
    	assertEquals("Nieuwe naam", speler.getNaam());
    }

    @Test
    public void testSetGeboortejaarNietInToekomst() {
        Speler speler = new Speler("Speler1", GEBOORTEJAAR);
        speler.setGeboortejaar(GEBOORTEJAAR_IN_TOEKOMST);
        assertEquals(0, speler.getGeboortejaar());
    }
    
    @Test
    public void testSetGeboortejaarNietVoor1900() {
        Speler speler = new Speler("Speler1", GEBOORTEJAAR);
        speler.setGeboortejaar(1899);
        assertEquals(0, speler.getGeboortejaar());
    }

    
    @Test
    public void testSetGeboortejaar1900() {
        Speler speler = new Speler("Speler1", GEBOORTEJAAR);
        speler.setGeboortejaar(1900);
        assertEquals(1900, speler.getGeboortejaar());
    }
    @Test
    public void testGetLeeftijdGeeftNegatiefGetalIndienGeboortejaarNul() {
        Speler speler = new Speler("Speler1", 0);
        assertEquals(-1, speler.getLeeftijd());
    }

    @Test
    public void testGetLeeftijdGeeftCorrecteWaarde() {
        int achtJaarGeleden = LocalDate.now().minusYears(8).getYear();
        Speler speler = new Speler("Speler1", achtJaarGeleden);
        assertEquals(8, speler.getLeeftijd());
    }
}
