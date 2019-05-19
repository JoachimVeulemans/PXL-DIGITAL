package project2_JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.junit.Test;

import project2.Uitgever;

public class UitgeverTest {

    private static final String WEBSITE = "www.spelletjes.be";
	private static final int JAAR_OPRICHTING = 2015;
	private static final String HOOFDKANTOOR = "UITGEVER_HOOFDKANTOOR";
	private static final String NAAM = "UITGEVER_NAAM";
   

	@Test
    public void testConstructor() {
        Uitgever uitgever = new Uitgever(NAAM, HOOFDKANTOOR, JAAR_OPRICHTING);
        assertNotNull(uitgever);
        assertEquals(NAAM, uitgever.getNaam());
        assertEquals(HOOFDKANTOOR, uitgever.getHoofdkantoor());
        assertEquals(JAAR_OPRICHTING, uitgever.getJaarOprichting());
    }

	@Test
	public void testSetNaam() {
		 Uitgever uitgever = new Uitgever(NAAM, HOOFDKANTOOR, JAAR_OPRICHTING);
		 uitgever.setNaam("Nieuwe naam");
		 assertEquals("Nieuwe naam", uitgever.getNaam());
	}
	
    @Test
    public void testSetJaarOprichtingGeeft0IndienGroterDanHuidigJaar() {
        Uitgever uitgever = new Uitgever(NAAM, HOOFDKANTOOR, JAAR_OPRICHTING);
        uitgever.setJaarOprichting(LocalDate.now().getYear() + 1);
        assertEquals(0, uitgever.getJaarOprichting());
    }

    @Test
    public void testSetWebsite() {
        Uitgever uitgever = new Uitgever(NAAM, HOOFDKANTOOR, JAAR_OPRICHTING);
        uitgever.setWebsite(WEBSITE);
        assertEquals(WEBSITE, uitgever.getWebsite());
    }
    
    @Test
    public void testSetHoofdkantoor() {
    	Uitgever uitgever = new Uitgever(NAAM, HOOFDKANTOOR, JAAR_OPRICHTING);
        uitgever.setHoofdkantoor("Nieuw hoofdkantoor");
        assertEquals("Nieuw hoofdkantoor", uitgever.getHoofdkantoor());
    }
    
    @Test
    public void testToStringBevatAlleRelevanteInformatie() {
    	 Uitgever uitgever = new Uitgever(NAAM, HOOFDKANTOOR, JAAR_OPRICHTING);
    	 uitgever.setWebsite(WEBSITE);
    	 String result = uitgever.toString();
    	 assertTrue(result.contains(NAAM));
    	 assertTrue(result.contains(HOOFDKANTOOR));
    	 assertTrue(result.contains(WEBSITE));
    	 assertTrue(result.contains(String.valueOf(JAAR_OPRICHTING)));
    }
}
