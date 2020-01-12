package be.pxl.vraag1;

/*
    Daan Vankerkom
    1 TIN J
 */
public final class Landmijn extends WereldObject {

    public final static int MINSCHADE = 10;
    public final static int MAXSCHADE = 100;

    private int schade;
    private boolean actief;

    public Landmijn(int schade) {
        if (schade < MINSCHADE) {
            this.schade = MINSCHADE;
        } else if (schade > MAXSCHADE) {
            this.schade = MAXSCHADE;
        } else {
            this.schade = schade;
        }
        this.actief = true;
    }

    public int getSchade() {
        return schade;
    }

    public boolean isActief() {
        return actief;
    }

    public void ontplof() {
        actief = false;
    }

    @Override
    public String toString() {
        if (actief) {
            return "Actieve landmijn " + schade + " schade";
        }else{
            return "Ontplofte landmijn";
        }
    }
}
