package project2_Uitbreiding_JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.junit.Test;

import project2_Uitbreiding.Uitgever;

public class UitgeverTest {

    private static final String WEBSITE = "www.spelletjes.be";
	private static final LocalDate DATUM_OPRICHTING = LocalDate.of(2015, 1, 1);
	private static final String HOOFDKANTOOR = "UITGEVER_HOOFDKANTOOR";
	private static final String NAAM = "UITGEVER_NAAM";
   

	@Test
    public void testConstructor() {
        Uitgever uitgever = new Uitgever(NAAM, HOOFDKANTOOR, DATUM_OPRICHTING);
        assertNotNull(uitgever);
        assertEquals(NAAM, uitgever.getNaam());
        assertEquals(HOOFDKANTOOR, uitgever.getHoofdkantoor());
        assertEquals(DATUM_OPRICHTING, uitgever.getDatumOprichting());
    }

	@Test
	public void testSetNaam() {
		 Uitgever uitgever = new Uitgever(NAAM, HOOFDKANTOOR, DATUM_OPRICHTING);
		 uitgever.setNaam("Nieuwe naam");
		 assertEquals("Nieuwe naam", uitgever.getNaam());
	}
	
    @Test
    public void testConstructorMetDatumOprichtingInToekomstKrijgtEersteDagVanHuidigeMaand() {
    	LocalDate futureDate = LocalDate.now().plusMonths(2);
        Uitgever uitgever = new Uitgever(NAAM, HOOFDKANTOOR, futureDate);
        LocalDate now = LocalDate.now();
        assertEquals(LocalDate.of(now.getYear(), now.getMonth(), 1), uitgever.getDatumOprichting());
    }
    
    @Test
    public void testConstructorMetDatumOprichtingInToekomstNietHuidigJaarKrijgtEersteDagHuidigMaandEnJaar() {
    	LocalDate futureDate = LocalDate.now().plusMonths(2).plusYears(2);
        Uitgever uitgever = new Uitgever(NAAM, HOOFDKANTOOR, futureDate);
        LocalDate now = LocalDate.now();
        assertEquals(LocalDate.of(now.getYear(), now.getMonth(), 1), uitgever.getDatumOprichting());
    }

    @Test
    public void testSetWebsite() {
        Uitgever uitgever = new Uitgever(NAAM, HOOFDKANTOOR, DATUM_OPRICHTING);
        uitgever.setWebsite(WEBSITE);
        assertEquals(WEBSITE, uitgever.getWebsite());
    }
    
    @Test
    public void testSetHoofdkantoor() {
    	Uitgever uitgever = new Uitgever(NAAM, HOOFDKANTOOR, DATUM_OPRICHTING);
        uitgever.setHoofdkantoor("Nieuw hoofdkantoor");
        assertEquals("Nieuw hoofdkantoor", uitgever.getHoofdkantoor());
    }
    
    
    @Test
    public void testGetMaandenSindsOprichtingGeeftNulIndienVandaagOpgericht() {
       	Uitgever uitgever = new Uitgever(NAAM, HOOFDKANTOOR, LocalDate.now());
    	assertEquals(0, uitgever.getMaandenSindsOprichting());
    }
    
    @Test
    public void testGetMaandenSindsOprichting() {
       	Uitgever uitgever = new Uitgever(NAAM, HOOFDKANTOOR, LocalDate.now().minusMonths(2));
    	assertEquals(2, uitgever.getMaandenSindsOprichting());
    }
    
    
    
    @Test
    public void testToStringBevatAlleRelevanteInformatie() {
    	 Uitgever uitgever = new Uitgever(NAAM, HOOFDKANTOOR, DATUM_OPRICHTING);
    	 uitgever.setWebsite(WEBSITE);
    	 String result = uitgever.toString();
    	 assertTrue(result.contains(NAAM));
    	 assertTrue(result.contains(HOOFDKANTOOR));
    	 assertTrue(result.contains(WEBSITE));
    	 assertTrue(result.contains(String.valueOf(DATUM_OPRICHTING)));
    }
}
