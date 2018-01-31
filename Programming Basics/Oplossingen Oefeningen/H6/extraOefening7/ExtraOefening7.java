package extraOefening7;

import java.util.Scanner;

public class ExtraOefening7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String code, naamMan, naamVrouw;
		int inkomenMan, inkomenVrouw, kinderen;
		String[][] gegevens = new String[100][3];
		int telnummer = -1;

		// CODE VRAGEN
		System.out.println("Geef uw code in:");
		code = keyboard.nextLine();

		// CONTROLE CODE
		while (!(code.equals("stop") || code.equals("STOP"))) {

			// GEGEVENS OPVRAGEN
			System.out.println("Geef de naam van de man in (achternaam_voornaam):");
			naamMan = keyboard.nextLine();
			System.out.println("Geef de naam van de vrouw in (achternaam_voornaam):");
			naamVrouw = keyboard.nextLine();
			System.out.println("Geef het inkomen van de man in:");
			inkomenMan = keyboard.nextInt();
			System.out.println("Geef het inkomen van de vrouw in:");
			inkomenVrouw = keyboard.nextInt();
			System.out.println("Geef het aantal kinderen in:");
			kinderen = keyboard.nextInt();
			keyboard.nextLine();

			// BEREKENINGEN MAKEN
			String bewerkteNaam = berekeningNaam(naamMan, naamVrouw, inkomenMan, inkomenVrouw);
			String prioriteit = berekeningPrioriteit(inkomenMan, inkomenVrouw, kinderen, code);
			String bouwlening = berekeningBouwlening(naamMan, naamVrouw, inkomenMan, inkomenVrouw, code, kinderen);

			// BEREKENINGEN OPSLAAN IN ARRAY VOOR LATERE AFDRUK
			telnummer++;
			gegevens[telnummer][0] = bewerkteNaam;
			gegevens[telnummer][1] = prioriteit;
			gegevens[telnummer][2] = bouwlening;

			// CODE VRAGEN
			System.out.println("Geef uw code in:");
			code = keyboard.nextLine();

		}
		
		// UITPRINTEN
		System.out.printf("%-10s %-40s %-12s %-5s\n", "aanvraagnr", "familienaam", "prioriteit", "bouwlening stad");
		for (int i = 0; i <= telnummer; i++) {
			String lijstNummer = Integer.toString(i + 1).concat(".");
			System.out.printf("%-10s %-40s %-12s %-5s\n", lijstNummer, gegevens[i][0], gegevens[i][1], gegevens[i][2]);
		}

		keyboard.close();
	}

	public static String berekeningNaam(String naamMan, String naamVrouw, int inkomenMan, int inkomenVrouw) {
		String bewerkteNaam = "";
		String subNaam;
		
		if ((naamMan.equals("xx") && inkomenMan == 0)) {
			subNaam = berekeningSubNaam(naamVrouw);
			bewerkteNaam = "Mevrouw ".concat(subNaam);
		} else {
			if ((naamVrouw.equals("xx") && inkomenVrouw == 0)) {
				subNaam = berekeningSubNaam(naamMan);
				bewerkteNaam = "Meneer ".concat(subNaam);
			} else {
				subNaam = berekeningSubNaam(naamMan);
				bewerkteNaam = "De Heer en Mevrouw ".concat(subNaam).concat("-");
				subNaam = berekeningSubNaam(naamVrouw);
				bewerkteNaam = bewerkteNaam.concat(subNaam.substring(3));
			}
		}

		return bewerkteNaam;
	}
	
	public static String berekeningSubNaam(String naam) {
		String subNaam = "";
		int positie = 0;
		// POSITIE _ VINDEN
		for (int i = 0; i < naam.length() && positie == 0; i++) {
			if (naam.charAt(i) == '_') {
				positie = i;
			}
		}
		
		// NAAM SAMENSTELLEN
		subNaam = naam.substring(positie + 1, positie + 2).concat(". ").concat(naam.substring(0, positie));
		
		return subNaam;
	}

	public static String berekeningPrioriteit(int inkomenMan, int inkomenVrouw, int kinderen, String code) {
		String prioriteit = "";
		int gezinsInkomen = (inkomenMan + inkomenVrouw);
		code = code.concat("0000");
		int jaar = Integer.parseInt(code.substring(1, 5));
		
		// BEPALING PRIORITEIT
		if (code.substring(0, 1).equals("J") && jaar > 2013) {
			prioriteit = "*****";
		} else {
			if (gezinsInkomen < 2000 && kinderen > 2) {
				prioriteit = "*";
			} else {
				if (gezinsInkomen < 2000 && kinderen < 3) {
					prioriteit = "**";
				} else {
					if (gezinsInkomen < 2500) {
						prioriteit = "***";
					} else {
						prioriteit = "****";
					}
				}
			}
		}

		return prioriteit;
	}

	public static String berekeningBouwlening(String naamMan, String naamVrouw, int inkomenMan, int inkomenVrouw, String code, int kinderen) {
		String bouwlening = "";
		int inkomen = inkomenMan + inkomenVrouw;
		
		if ((naamMan.equals("xx") && inkomenMan == 0) || (naamVrouw.equals("xx") && inkomenVrouw == 0)) {
			if (kinderen >= 1 || inkomen < 1500) {
				if (code.substring(0, 1).equals("N")) {
					bouwlening = "J";
				}
			}
		}

		return bouwlening;
	}
}
