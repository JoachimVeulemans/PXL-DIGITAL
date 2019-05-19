package extraOefening2;

import java.util.Scanner;

public class BankrekeningApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Bankrekening[] rekeningen = new Bankrekening[3];

		for (int i = 0; i < rekeningen.length; i++) {
			try {
				rekeningen[i] = new Bankrekening();
			} catch (NegatiefGetalException e) {
				System.out.println("Undefined Error!");
			}
			System.out.println("Geef een bankrekeningnummer in:");
			rekeningen[i].setRekeningNummer(keyboard.nextLine());

			System.out.println("Geef een naam in:");
			rekeningen[i].setNaam(keyboard.nextLine());

			setSaldo(rekeningen[i]);

			setRent(rekeningen[i]);

		}

		for (int i = 0; i < rekeningen.length; i++) {
			System.out.println(rekeningen[i].print());
		}

		keyboard.close();

	}

	public static void setSaldo(Bankrekening rekening) {
		Scanner keyboard = new Scanner(System.in);
		try {
			System.out.println("Geef een saldo in:");
			rekening.setSaldo(keyboard.nextDouble());
		} catch (NegatiefGetalException ex) {
			System.out.println(ex.getMessage());
			setSaldo(rekening);
		}
	}

	public static void setRent(Bankrekening rekening) {
		Scanner keyboard = new Scanner(System.in);
		try {
			System.out.println("Geef een rentpercentage in:");
			rekening.setRentpercentage(keyboard.nextDouble());
		} catch (NegatiefGetalException ex) {
			System.out.println(ex.getMessage());
			setRent(rekening);
		}
	}

}
