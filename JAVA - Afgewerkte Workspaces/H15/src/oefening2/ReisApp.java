package oefening2;

public class ReisApp {

	public static void main(String[] args) {
		// PRIVATE IS EEN VOORBEELD VAN DATA-HIDING
		TreinReis t1 = new TreinReis("Zavemtem");
		TreinReis t2 = new TreinReis("Rosas"); // TREINREIS HEEFT INHERITANCE REIS
		VliegtuigReis v1 = new VliegtuigReis("Madrid"); // CONSTRUCTOR OVERLOADING
		VliegtuigReis v2 = new VliegtuigReis("Barcelona", 10.75, "100-55815-511");

		t1.setPrijs(5); // METHOD OVERRIDING
		t2.setPrijs(10.75);
		v1.setPrijs(65);
		v2.setPrijs(25);

		Reis poly1 = new VliegtuigReis("Baio"); // POLYMORFISME

		GeboekteReis gbr = new GeboekteReis("Pedro Salopetti", 4);
		gbr.voegReisToe(t1);
		gbr.voegReisToe(v1);
		gbr.voegReisToe(v2);
		gbr.voegReisToe(t2);

		gbr.print();

	}

}
