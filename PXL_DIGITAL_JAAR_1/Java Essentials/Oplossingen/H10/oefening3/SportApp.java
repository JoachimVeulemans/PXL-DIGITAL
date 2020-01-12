package oefening3;

public class SportApp {

	public static void main(String[] args) {
		Sporter[] sporters = new Sporter[10];

		sporters[0] = new Sporter("Bex", "An", "zwemmen");
		sporters[1] = new Sporter("Nilis", "Els", "volleybal");
		sporters[2] = new Sporter("Baerts", "Sofie", "zwemmen");
		sporters[3] = new Sporter("Adams", "Leen", "atletiek");
		sporters[4] = new Sporter("Loos", "Miet", "zwemmen");
		sporters[5] = new Voetballer("Vos", "Niels", "KSKHasselt", "aanvaller");
		sporters[6] = new Voetballer("Vos", "Joren", "KSKHasselt", "verdediger");
		sporters[7] = new Voetballer("Dirix", "Joni", "KSKHasselt", "aanvaller");
		sporters[8] = new Voetballer("Maes", "Jelle", "KSKHasselt", "middenvelder");
		sporters[9] = new Voetballer("Hox", "Martijn", "KSKHasselt", "dit_is_niet_goed");

		System.out.println("Overzicht sporters (behalve voetbal)");
		for (int i = 0; i < sporters.length; i++) {
			if (!sporters[i].getOmschrijving().equals("voetbal")) {
				System.out.print("naam: ");
				sporters[i].print();
			}
		}

		System.out.println("\noverzicht voetballers volgens opstelling");
		for (int j = 0; j < Voetballer.getArray().length; j++) {
			for (int i = 0; i < sporters.length; i++) {
				if (sporters[i] instanceof Voetballer) {
					if (Voetballer.getArray()[j].equals(((Voetballer) sporters[i]).getOpstelling())) {
						if (sporters[i].getOmschrijving().equals("voetbal")) {
							sporters[i].print();
						}
					}
				}
			}
		}
	}

}
