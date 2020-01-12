package extraOefening3;

public class MuntApp {

	public static void main(String[] args) {
		Munt[] munten = new Munt[10];

		munten[0] = new Munt("Britse pond", 0.742);
		munten[1] = new Munt();
		munten[2] = new Munt("Amerikaanse dollar", 1.136);
		munten[3] = new Munt("Russische roebel", 70.202);
		munten[4] = new Munt("Duitse mark", 5.64554);

		System.out.println("overzicht koersen tov de euro: 1 euro = ");
		for (int i = 0; i < munten.length; i++) {
			if (munten[i] == null) {
				i = munten.length;
			} else {
				System.out.printf("%.3f %s\n", munten[i].getKoers(), munten[i].getNaam());
			}
		}

		System.out.println("\noverzicht koersen tov Britse pond: 1 Britse pond = ");
		for (int i = 1; i < munten.length; i++) {
			if (munten[i] == null) {
				i = munten.length;
			} else {
				System.out.printf("%.3f %s\n", munten[i].getKoers() / 0.742, munten[i].getNaam());
			}
		}

	}

}
