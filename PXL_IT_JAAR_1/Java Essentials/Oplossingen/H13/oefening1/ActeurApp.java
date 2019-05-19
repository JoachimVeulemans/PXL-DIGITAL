package oefening1;

import java.util.Random;

public class ActeurApp {

	public static void main(String[] args) {
		Random rand = new Random();
		Punt[] puntenTab = new Punt[100];

		for (int i = 0; i < puntenTab.length; i++) {
			int x = rand.nextInt(100);
			int y = rand.nextInt(100);
			puntenTab[i] = new Punt(x, y);
		}

		for (int i = 0; i < puntenTab.length; i++) {
			puntenTab[i].drukAf();
		}

		double afstandEersteLaatste = puntenTab[puntenTab.length - 1].berekenAfstand(puntenTab[0]);
		System.out.println("Afstand eerste en laatste element: " + afstandEersteLaatste);

		Egel egel = new Egel(30, 60);
		Konijn konijn = new Konijn(30, 50);

		System.out.println(egel.interageer(konijn));
		konijn.beschrijf();
		konijn.stapLinks();
		egel.stapRechts();

		Acteur[] act = new Acteur[2];
		act[0] = konijn;
		act[1] = egel;

		for (int i = 0; i < act.length; i++) {
			act[i].beschrijf();
		}

	}

}
