package be.pxl.vraag1;

/*
    Daan Vankerkom
    1 TIN J
 */
public final class Soldaat extends Karakter {

    private int aanvalspunten;

    public Soldaat(int levenspunten,  int aanvalspunten, Land land) {
        super(levenspunten, land);

        if (aanvalspunten > 0) {
            this.aanvalspunten = aanvalspunten;
        }else{
            this.aanvalspunten = 0;
        }
    }

    @Override
    public void interageer(WereldObject o) {
        if (o instanceof Landmijn) {
            interageerLandmijn((Landmijn)o);
        }else if (o instanceof Soldaat) {
            interageerSoldaat((Soldaat)o);
        }
    }

    private void interageerLandmijn(Landmijn mijn) {
        if (mijn.isActief()) {

            int ownLife = this.getLevenspunten() - mijn.getSchade();

            this.setLevenspunten(ownLife); // Apply damage.
            mijn.ontplof(); // Disable mine.
        }
    }

    private void interageerSoldaat(Soldaat soldaat) {
        // Leven check
        if (this.isLevend() && soldaat.isLevend()) {
            // Land check
            if (this.getLand() != soldaat.getLand()) {
                // Behoort tot een ander land.

                int ownLife = this.getLevenspunten() - soldaat.aanvalspunten;
                int otherLife = soldaat.getLevenspunten() - this.aanvalspunten;

                this.setLevenspunten(ownLife); // Apply damage to me
                soldaat.setLevenspunten(otherLife); // Apply damage to the other soldier.
            }
        }
    }

    @Override
    public String toString() {
        if (this.isLevend()) {
            return "Soldaat levend " + getLand() + " " + getLevenspunten() + " levenspunten " + aanvalspunten + " aanvalspunten";
        }else{
            return "Dode soldaat " + getLand();
        }
    }
}
