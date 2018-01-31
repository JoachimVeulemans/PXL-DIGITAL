package extraOefening;

import java.util.Scanner;

public class ExtraOefening {
	public static void main(String[] args) {
		int input;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welkom bij de PXL Beslissingsboom - studievoortgang!");
		System.out.println("Geef voor ja 1 in, voor nee kan het niemand wat schelen.");

		System.out.println("Studeerde je reeds aan Hogeschool PXL?");
		input = keyboard.nextInt();

		if (input == 1) {
			System.out.println("Had je reeds individueel bindende voorwaarden?");
			input = keyboard.nextInt();
			if (input == 1) {
				System.out.println("Heb je de individueel bindende voorwaarden behaald?");
				input = keyboard.nextInt();
				if (input == 1) {
					System.out.println("CONCLUSIE");
					System.out.println(
							"Je kan je online herinschrijven in Mijn PXL tenzij je een tekort aan leerkrediet hebt. De algemene voorwaarde van 60% studierendement (=minstens 60% van de opgenomen studiepunten geslaagd) zal op jou van toepassing zijn.");
				} else {
					System.out.println(
							"Kreeg je positief advies van de voortgangscommissie? (Dit kan je op je rapport van tweede zittijd aflezen)");
					input = keyboard.nextInt();
					if (input == 1) {
						System.out.println(
								"Behaalde je minstens 60% studierendement (= minstens 60% van de opgenomen studiepunten geslaagd) het afgelopen academiejaar?");
						input = keyboard.nextInt();
						if (input == 1) {
							System.out.println(
									"Je kan je online herinschrijven in Mijn PXL tenzij je een tekort aan leerkrediet hebt. De algemene voorwaarde van 60% studierendement (=minstens 60% van de opgenomen studiepunten geslaagd) zal op jou van toepassing zijn.");
						} else {
							System.out.println("CONCLUSIE");
							System.out.println(
									"Je moet een afspraak maken bij de dienst studievoortgang voor een studievoortgangsonderzoek. Er zal bekeken worden onder welke voorwaarden je nog kan herinschrijven. Je kan online een afspraak maken via http://afspraken.pxl.be en dan dienst studievoortgang selecteren.");
						}
					} else {
						System.out.println("CONCLUSIE");
						System.out.println("Je wordt definitief uitgeschreven uit de opleiding.");
					}
				}
			} else {
				System.out.println(
						"Was je afgelopen academiejaar voor de eerste maal ingeschreven in het hoger onderwijs?");
				input = keyboard.nextInt();
				if (input == 1) {
					System.out.println(
							"Behaalde je minstens 60% studierendement (= minstens 60% van de opgenomen studiepunten geslaagd) het afgelopen academiejaar?");
					input = keyboard.nextInt();
					if (input == 1) {
						System.out.println(
								"Je kan je online herinschrijven in Mijn PXL tenzij je een tekort aan leerkrediet hebt. De algemene voorwaarde van 60% studierendement (=minstens 60% van de opgenomen studiepunten geslaagd) zal op jou van toepassing zijn.");
					} else {
						System.out.println("CONCLUSIE");
						System.out.println(
								"Je moet een afspraak maken bij de dienst studievoortgang voor een studievoortgangsonderzoek. Er zal bekeken worden onder welke voorwaarden je nog kan herinschrijven. Je kan online een afspraak maken via http://afspraken.pxl.be en dan dienst studievoortgang selecteren.");
					}
				} else {
					System.out.println(
							"Behaalde je minstens 60% studierendement (= minstens 60% van de opgenomen studiepunten geslaagd) het afgelopen academiejaar?");
					input = keyboard.nextInt();
					if (input == 1) {
						System.out.println(
								"Je kan je online herinschrijven in Mijn PXL tenzij je een tekort aan leerkrediet hebt. De algemene voorwaarde van 60% studierendement (=minstens 60% van de opgenomen studiepunten geslaagd) zal op jou van toepassing zijn.");
					} else {
						System.out.println("CONCLUSIE");
						System.out.println(
								"Je moet een afspraak maken bij de dienst studievoortgang voor een studievoortgangsonderzoek. Er zal bekeken worden onder welke voorwaarden je nog kan herinschrijven. Je kan online een afspraak maken via http://afspraken.pxl.be en dan dienst studievoortgang selecteren.");
					}
				}
			}
		} else {
			System.out.println("Ga je voor de eerste keer inschrijven in het hoger onderwijs?");
			input = keyboard.nextInt();
			if (input == 1) {
				System.out.println("CONCLUSIE");
				System.out.println(
						"Je kan je inschrijven in gebouw D van Hogeschool PXL (praktische info). De algemene voorwaarde van 60% studierendement (=minstens 60% van de opgenomen studiepunten geslaagd) zal op jou van toepassing zijn.");
			} else {
				System.out.println(
						"Behaalde je, in het laatste academiejaar dat je ingeschreven was in het hoger onderwijs, 60% studierendement (=minstens 60% van de opgenomen studiepunten geslaagd)?");
				input = keyboard.nextInt();
				if (input == 1) {
					System.out.println(
							"Je kan je inschrijven in gebouw D van Hogeschool PXL (praktische info). De algemene voorwaarde van 60% studierendement (=minstens 60% van de opgenomen studiepunten geslaagd) zal op jou van toepassing zijn.");
				} else {
					System.out.println(
							"Je kan je inschrijven in gebouw D van Hogeschool Pxl (pratische info). Je zal ingeschreven worden onder bindende voorwaarden.");
				}
			}
		}
		keyboard.close();
	}
}
