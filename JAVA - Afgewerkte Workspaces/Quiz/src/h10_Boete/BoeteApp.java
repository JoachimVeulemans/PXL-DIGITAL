package h10_Boete;

public class BoeteApp {
	public static void main(String[] args) {
		Verkeersboete snelheidsboete = new Snelheidsboete("1-KNF-333", 50, 70);

		Boete[] boetes = new Boete[3];
		boetes[0] = snelheidsboete;
		boetes[1] = new RijdenZonderGordel("1-PNT-258", 3);
		boetes[2] = new GasBoete("John", "Grafiti tekening", 520);

		GasBoete gasBoete = new GasBoete("onbekend", "wildplassen", 300);
		
		
	}
}
