package oefening1;

import java.util.Scanner;

public class PersoonApp {

	public static void main(String[] args) {
		Persoon p1 = new Persoon();
		Scanner keyboard = new Scanner(System.in);

		p1.setVoornaam("Hans");
		p1.setNaam("Mystery");
		p1.setGewicht(59.00);
		p1.setLengte(1.20);
		p1.setGeboortejaar(1984);

		System.out.println(p1.toString());
		System.out.println(p1.getLengte());
		p1.groei();
		System.out.println(p1.getLengte());
		p1.groei(10);
		System.out.println(p1.getLengte());

		keyboard.close();
	}

}
