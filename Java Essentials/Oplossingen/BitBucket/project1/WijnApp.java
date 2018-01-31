package project1;

public class WijnApp {
	public static void main(String[] args) {
		Wijn[] wijnkelder = new Wijn[4];

		wijnkelder[0] = new Wijn("Parra", "Wit", "Spanje", 2001, 11.5);
		wijnkelder[0].setDruivenras("Sauvignon Blanc");
		wijnkelder[0].setOmschrijving("Licht, fris en strak");
		wijnkelder[0].setRegio("La Mancha");
		wijnkelder[0].setServeerTip("Visgerechten");

		wijnkelder[1] = new Wijn("Domaine de la Jardine", "Rood", "Frankrijk", 2016, 14);
		wijnkelder[1].setDruivenras("Merlot");
		wijnkelder[1].setOmschrijving("Licht, soepel en fruitig");
		wijnkelder[1].setRegio("Pays d'Oc");
		wijnkelder[1].setServeerTip("Gevogelte");

		wijnkelder[2] = new Wijn("Montebello Grande Bellezza", "Rood", "Italië", 2012, 13);
		wijnkelder[2].setDruivenras("Negroamaro");
		wijnkelder[2].setOmschrijving("Licht, soepel en fruitig");
		wijnkelder[2].setRegio("Puglia");
		wijnkelder[2].setServeerTip("Gegrild vlees");

		wijnkelder[3] = new Wijn("Château Palmer 3eme Grand Cru", "Rood", "Frankrijk", 2002, 13.5);
		wijnkelder[3].setDruivenras("Bordeaux");
		wijnkelder[3].setOmschrijving("Complex, krachtig en vol");
		wijnkelder[3].setRegio("Bordeaux");

		System.out.println("** Duurste fles:");
		double hoogste = 0;
		int positie = 0;
		for (int i = 0; i < wijnkelder.length; i++) {
			if (wijnkelder[i].getAdviesPrijs() > hoogste) {
				hoogste = wijnkelder[i].getAdviesPrijs();
				positie = i;
			}
		}
		System.out.println(wijnkelder[positie].getLabel());

		System.out.println("** Goedkoopste fles:");
		double laagste = 1000;
		positie = 0;
		for (int i = 0; i < wijnkelder.length; i++) {
			if (wijnkelder[i].getAdviesPrijs() < laagste) {
				laagste = wijnkelder[i].getAdviesPrijs();
				positie = i;
			}
		}
		System.out.println(wijnkelder[positie].getLabel());

		System.out.print("** Aantal flessen rode wijn: ");
		int count = 0;
		for (int i = 0; i < wijnkelder.length; i++) {
			if (wijnkelder[i].getKleur().equals("Rood")) {
				count++;
			}
		}
		System.out.println(count);

		System.out.println("** Suggestie(s) bij gevogelte:");

		for (int i = 0; i < wijnkelder.length; i++) {
			if (wijnkelder[i].getServeerTip() != null) {
				if (wijnkelder[i].getServeerTip().equals("Gevogelte")) {
					System.out.println(wijnkelder[i].getLabel());
				}
			}
		}

	}
}
