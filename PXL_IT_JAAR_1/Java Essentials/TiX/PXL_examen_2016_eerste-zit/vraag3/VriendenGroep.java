package be.pxl.vraag3;

/*
    Daan Vankerkom
    1 TIN J
 */
public class VriendenGroep {

    public final static int MAXXAANTALVRIENDEN = 10;

    private Persoon[] vrienden;

    public VriendenGroep() {
        vrienden = new Persoon[MAXXAANTALVRIENDEN];
    }

    private boolean contains(String naam) {
        naam = naam.toLowerCase(); // 1x lowercase
        for(int i = 0; i < MAXXAANTALVRIENDEN; i++) {
            if (vrienden[i] != null && vrienden[i].getNaam().toLowerCase().equals(naam)) {
                return true;
            }
        }
        return false;
    }

    public void voegVriendToe(Persoon vriend) {
        if (!contains(vriend.getNaam())) {
            for(int i = 0; i < MAXXAANTALVRIENDEN; i++) {
                if (vrienden[i] == null) {
                    vrienden[i] = vriend;
                    break; // Found open slot.
                }
            }
        }
    }

    @Override
    public String toString() {

        StringBuilder output = new StringBuilder();
        Persoon volgendeJarige = vrienden[0];

        for(int i = 0; i < MAXXAANTALVRIENDEN; i++) {
            if (vrienden[i] != null) {
                output.append(vrienden[i]);
                output.append("\n");

                if (volgendeJarige.aantalDagenTotVerjaardag() > vrienden[i].aantalDagenTotVerjaardag()) {
                    volgendeJarige = vrienden[i]; // B-day of this person is closer then the previous one.
                }
            }
        }

        if (volgendeJarige != null) {
            output.append("De volgende jarige is ");
            output.append(volgendeJarige.getNaam());
            output.append(".");
        }

        return output.toString();
    }
}
