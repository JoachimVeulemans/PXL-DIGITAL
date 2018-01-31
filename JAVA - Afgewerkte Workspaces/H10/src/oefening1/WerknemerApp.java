package oefening1;

public class WerknemerApp {

	public static void main(String[] args) {
		Werknemer w1 = new Werknemer("Vanbeest", "Jan");
		Werknemer w2 = new Werknemer("beire", "Camem");
		Manager m1 = new Manager("Poel", "Sisto", "Hoofd", 900, 50);
		System.out.println(m1.getSalaris());

		w1.print();
		w2.print();
		m1.print();
		System.out.println("Deel manager: " + m1.getProcAandeelManagers() + "%");
	}

}
