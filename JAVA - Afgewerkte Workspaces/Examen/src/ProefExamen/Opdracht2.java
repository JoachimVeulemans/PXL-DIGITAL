package ProefExamen;

import java.time.LocalDate;
import java.util.Scanner;

public class Opdracht2 {

	public static void main(String[] args) {
		int[] teruggeef = new int[6];
		int j = 0;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Naam kandidaat koper:");
		String naam1 = keyboard.nextLine();

		String[][] gegevens = new String[100][3];

		for (int i = 0; (!(naam1.toLowerCase().equals("stop"))); i++) {

			while (!controleNaam(naam1)) {
				System.out.println("Naam kandidaat koper:");
				naam1 = keyboard.nextLine();
			}

			System.out.println("Inkomen kandidaat koper:");
			int inkomen1 = keyboard.nextInt();
			keyboard.nextLine();

			System.out.println("Naam partner:");
			String naam2 = keyboard.nextLine();

			while (!(controleNaam(naam2) || naam2.equals("xx"))) {
				System.out.println("Naam partner:");
				naam2 = keyboard.nextLine();
			}

			int inkomen2 = 0;
			if (!(naam2.equals("xx"))) {
				System.out.println("Inkomen partner:");
				inkomen2 = keyboard.nextInt();
				keyboard.nextLine();
			}

			System.out.println("Heeft de kandidaat koper een sociale woning?");
			String socialeWoning = keyboard.nextLine();

			int jaartalSocialeWoning = 0;
			if (socialeWoning.equals("J")) {
				System.out.println("Sinds wanneer?");
				jaartalSocialeWoning = keyboard.nextInt();
			}

			System.out.println("Aantal kinderen ten laste:");
			int kinderen = keyboard.nextInt();
			keyboard.nextLine();

			gegevens[i][0] = berekeningNaam(naam1, naam2);
			int inkomen = inkomen1 + inkomen2;
			teruggeef = berekeningPrioriteit(inkomen, kinderen, socialeWoning, jaartalSocialeWoning, teruggeef);
			gegevens[i][1] = Integer.toString(teruggeef[0]);
			gegevens[i][2] = berekeningBouwpremie(kinderen, naam2, inkomen1);

			System.out.println("Naam kandidaat koper:");
			naam1 = keyboard.nextLine();
			j = i;
		}

		double rechtOpLening = 0;
		double totaal = 0;
		for (int i = 0; i <= j; i++) {
			String prior = "";
			for (int k = 0; k < Integer.parseInt(gegevens[i][1]); k++) {
				prior = prior.concat("*");
			}
			System.out.printf("Aanvraag%2d: %-30s%-5s%3s\n", (i + 1), gegevens[i][0], prior, gegevens[i][2]);
			if (gegevens[i][2].equals("J")) {
				rechtOpLening++;
			}
			totaal++;
		}

		for (int teller = 0; teller < 5; teller++) {
			System.out.println("Aantal aanvragen prioriteit " + (teller + 1) + ": " + teruggeef[teller + 1]);
		}
		
		rechtOpLening = ((int)((rechtOpLening / totaal) * 10)) * 10;
		System.out.println(rechtOpLening + "% van de aanvragen hebben recht op een goedkope lening.");

		keyboard.close();
	}

	public static boolean controleNaam(String naam) {
		String[] delen = naam.split("_");
		return delen.length == 2;
	}

	public static String berekeningNaam(String naam1, String naam2) {
		String totaal = "";

		String[] deel1 = naam1.split("_");

		if (naam2.equals("xx")) {
			totaal = totaal.concat(deel1[1].substring(0, 1)).concat(". ").concat(deel1[0]);
		} else {
			String[] deel2 = naam2.split("_");
			totaal = totaal.concat(deel1[1].substring(0, 1)).concat(". ").concat(deel1[0]).concat(" en ")
					.concat(deel1[1].substring(0, 1)).concat(". ").concat(deel2[0]);
		}

		return totaal;
	}

	public static int[] berekeningPrioriteit(int inkomen, int kinderen, String socialeWoning, int jaartalSocialeWoning, int[] teruggeef) {

		if (socialeWoning.equals("J") && (LocalDate.now().getYear() - jaartalSocialeWoning < 5)) {
			teruggeef[0] = 5;
			teruggeef[5]++; 
		} else {
			if (inkomen < 2000 && kinderen > 2) {
				teruggeef[0] = 1;
				teruggeef[1]++; 
			} else {
				if (kinderen < 3) {
					teruggeef[0] = 2;
					teruggeef[2]++; 
				} else {
					if (inkomen < 2500) {
						teruggeef[0] = 3;
						teruggeef[3]++; 
					} else {
						teruggeef[0] = 4;
						teruggeef[4]++; 
					}
				}
			}
		}
		return teruggeef;
	}

	public static String berekeningBouwpremie(int kinderen, String naam, int inkomen) {
		String bouwpremie = "";

		if (naam.equals("xx")) {
			if (kinderen > 0 || inkomen < 1500) {
				bouwpremie = "J";
			}
		}

		return bouwpremie;
	}
}
