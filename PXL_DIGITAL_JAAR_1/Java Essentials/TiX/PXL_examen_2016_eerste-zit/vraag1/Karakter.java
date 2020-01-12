package be.pxl.vraag1;

/*
    Daan Vankerkom
    1 TIN J
 */
public abstract class Karakter extends WereldObject implements Interagerend {

    public final static int MAXLEVENSPUNT = 100;

    private int levenspunten;
    private Land land;

    public Karakter(int levenspunten, Land land) {

        if (levenspunten < 0) {
            this.levenspunten = 0;
        }else if (levenspunten > MAXLEVENSPUNT) {
            this.levenspunten = MAXLEVENSPUNT;
        }else {
            this.levenspunten = levenspunten;
        }

        this.land = land;
    }

    public int getLevenspunten() {
        return levenspunten;
    }

    public Land getLand() {
        return land;
    }

    public boolean isLevend() {
        return this.levenspunten > 0;
    }

    public void setLevenspunten(int levenspunten) {
        if (levenspunten > MAXLEVENSPUNT) {
            this.levenspunten = MAXLEVENSPUNT;
        }else {
            this.levenspunten = levenspunten;
        }
    }
}
