package extraOefening1;

import java.util.Scanner;

public class TshirtApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Tshirt[] shirts = new Tshirt[TShirtSize.values().length * Kleur.values().length];
		
		int count = 0;

		for (Kleur kleur : Kleur.values()) {
			for (TShirtSize shirt : TShirtSize.values()) {
				shirts[count] = new Tshirt(shirt, kleur);
				count++;
			}
		}
		
		int meest = 0;
		Kleur meestKleur = Kleur.WIT;
		int minst = 0;
		TShirtSize minstMaat = TShirtSize.EXTRA_EXTRA_EXTRA_LARGE;

		System.out.println("Geef de naam van de persoon in:");
		String naam = keyboard.nextLine();
		while (!(naam.equals("stop") || naam.equals("Stop"))) {
			System.out.println("Geef de borstomtrek van " + naam + " in:");
			int borstomtrek = keyboard.nextInt();
			keyboard.nextLine();

			TShirtSize Tsize = TShirtSize.EXTRA_EXTRA_EXTRA_LARGE;
			count = 0;
			for (TShirtSize shirt : TShirtSize.values()) {
				if (count == 0 && borstomtrek <= shirt.getBorstomtrek()) {
					System.out.println("Jouw maat is: " + shirt.getMaat());
					Tsize = shirt;
					count++;
				}
			}

			System.out.println("Geef uw gewenste kleur in:");
			String kleur = keyboard.nextLine().toUpperCase();
			Kleur Tkleur = Kleur.WIT;
			Tkleur = Kleur.valueOf(kleur);

			System.out.println("Geef uw gewenst aantal in:");
			int aantal = keyboard.nextInt();
			keyboard.nextLine();

			Tshirt temp = new Tshirt(Tsize, Tkleur);

			for (int i = 0; i < shirts.length; i++) {
				if (shirts[i].equals(temp)) {
					shirts[i].setAantalBesteld(shirts[i].getAantalBesteld() + aantal);
				}
			}
			
			if (aantal >= meest) {
				meestKleur = Tkleur;
			}
			if (aantal <= minst) {
				minstMaat = Tsize;
			}

			System.out.println("Geef de naam van de persoon in:");
			naam = keyboard.nextLine();
		}

		System.out.printf("     ");
		for (TShirtSize headers : TShirtSize.values()) {
			System.out.printf("%5s", headers.getMaat());
		}
		
		count = 0;
		for (Kleur rijen : Kleur.values()) {
			System.out.printf("\n%5s", rijen.name());
			for (TShirtSize headers : TShirtSize.values()) {
				System.out.printf("%5d", shirts[count].getAantalBesteld());
				count++;
			}
		}
		
		System.out.println("\n\nMeest bestelde kleur: " + meestKleur.name().toLowerCase());
		System.out.println("Minst bestelde maat: " + minstMaat.getMaat());

		keyboard.close();
	}

}
