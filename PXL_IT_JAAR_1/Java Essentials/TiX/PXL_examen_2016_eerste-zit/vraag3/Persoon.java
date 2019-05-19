package be.pxl.vraag3;

import java.time.LocalDate;
import java.time.Period;

/*
    Daan Vankerkom
    1 TIN J
 */
public class Persoon {

    private String naam;
    private LocalDate geboorteDatum;

    public Persoon(String naam, int geboortedag, int geboortemaand, int geboortejaar) {
        this.naam = naam;
        this.geboorteDatum = LocalDate.of(geboortejaar, geboortemaand, geboortedag);
    }

    public String getNaam() {
        return naam;
    }

    public int aantalDagenTotVerjaardag() {
        LocalDate now = LocalDate.now();
        LocalDate volgendeVerjaardag = LocalDate.of(LocalDate.now().getYear(), geboorteDatum.getMonth(), geboorteDatum.getDayOfMonth());

        if (volgendeVerjaardag.isBefore(now)) {
            // Voeg een jaar toe want de datum is al gepaseerd!
            volgendeVerjaardag = volgendeVerjaardag.plusYears(1); // 1 jaar extra.
        }

        Period period = Period.between(now, volgendeVerjaardag);
        return  period.getDays();
    }

    @Override
    public String toString() {
        return this.naam + " " + geboorteDatum.getDayOfMonth() + " " + geboorteDatum.getMonthValue() + " " + geboorteDatum.getYear();
    }
}
