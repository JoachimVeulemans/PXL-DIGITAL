package ppt;

public class KlasApp {

	public static void main(String[] args) {
		System.out.println(Klas.getAantalObjecten());

		System.out.println("Aantal klassen:" + Klas.getAantalObjecten());
		Klas klas1 = new Klas("Test", 60);
		System.out.println("Aantal klassen:" + Klas.getAantalObjecten());
		Klas klas2 = new Klas();
		System.out.println("Aantal klassen:" + Klas.getAantalObjecten());
		Klas klas3 = new Klas();
		System.out.println("Aantal klassen:" + Klas.getAantalObjecten());
		Klas klas4 = new Klas();
		System.out.println("Aantal klassen:" + Klas.getAantalObjecten());

		Klas[] klassen = new Klas[4];
		klassen[0] = klas1;
		klassen[1] = klas2;
		klassen[2] = klas3;
		klassen[3] = klas4;

		for (int i = 0; i < klassen.length; i++) {
			System.out.println("Klas " + (i + 1) + " heeft de naam " + klassen[i].getNaam());
			System.out.println("Klas " + (i + 1) + " heeft het aantal studenten " + klassen[i].getAantalStudenten());
		}
		System.out.println(Klas.getTotaalStudenten());
		klas1.setAantalStudenten(1);
		System.out.println(Klas.getTotaalStudenten());

		double gemiddelde = ((int) (Klas.getTotaalStudenten() / (double) Klas.getAantalObjecten() * 100)) / 100.0;
		System.out.println(gemiddelde);
	}

}
