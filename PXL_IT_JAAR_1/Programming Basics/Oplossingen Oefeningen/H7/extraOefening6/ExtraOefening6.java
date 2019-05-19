package extraOefening6;

public class ExtraOefening6 {

	public static void main(String[] args) {
		String[][] titelEnAuteur = { { "De Chninkel", "Vanhamme" }, { "Kuifje in Tibet", "Herge" },
				{ "Maus", "Spiegelmann" }, { "Kuifje en de blauwe lotus", "Herge" },
				{ "Largo Winch: de erfgenamen", "Vanhamme" } };
		
		int [] [] stemmen = {{105,35,5}, {66,21,12},{44,36,56},{56,12,12},{29,10,9}};
		int totaal = 0;
		int hoogsteStemmen = 0;
		String hoogsteAuteur = "";
		String hoogsteTitel = "";
		
		for (int rij = 0; rij < 5; rij++) {
			System.out.print(titelEnAuteur[rij] [1] + " met '" + titelEnAuteur[rij] [0] + "' had ");
			for (int optelling = 0; optelling < 3; optelling++) {
				totaal = totaal + stemmen[rij] [optelling];
			}
			System.out.println(totaal + " stemmen.");
			if (totaal > hoogsteStemmen) {
				hoogsteStemmen = totaal;
				hoogsteAuteur = titelEnAuteur [rij] [1];
				hoogsteTitel = titelEnAuteur [rij] [0];
			}
			totaal = 0;
		}
		
		String tekst = "de strip met het hoogst aantal stemmen is ".concat(hoogsteTitel).concat(" van auteur ").concat(hoogsteAuteur);	
		System.out.println(tekst);
		
	}

}
