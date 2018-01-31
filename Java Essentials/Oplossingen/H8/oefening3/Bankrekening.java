package oefening3;

import java.util.Scanner;

public class Bankrekening {

	private String rekeningnummer;
	private String naam;
	private double saldo;
	private double rentpercentage;

	public Bankrekening(String rekeningnummer, String naam, double saldo, double rentpercentage) {
		this.rekeningnummer = rekeningnummer;
		this.naam = naam;
		this.saldo = saldo;
		this.rentpercentage = rentpercentage;
		this.controle();
	}

	public Bankrekening() {
		this("geen", "onbekend", 0, 1.2);
	}

	public void controle() {
		if (this.saldo < 0) {
			this.saldo = 0;
		}
		if (this.rentpercentage < 0) {
			this.rentpercentage = 0;
		}
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void setRekeningNummer(String rekeningnummer) {
		this.rekeningnummer = rekeningnummer;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void stort(double storting) {
		if (this.controleRekening()) {
			this.saldo = this.saldo + storting;
			System.out.println("na storting van " + storting + " euro");
			System.out.println(this.print());
		}
	}

	public void neemOp(double opnemen) {
		if (this.controleRekening()) {
			if (opnemen > this.saldo) {
				this.berichtOpname();
				opnemen = this.saldo;
				this.saldo = 0;
			} else {
				this.saldo = this.saldo - opnemen;
			}
			System.out.println("na opname van " + opnemen + " euro");
			System.out.println(this.print());
		}
	}

	public String berichtOpname() {
		if (this.saldo == 0) {
			return "u kan geen geld opnemen";
		} else {
			StringBuilder bericht = new StringBuilder("u mag enkel ");
			bericht.append(this.saldo).append(" euro opnemen");
			return bericht.toString();
		}
	}

	public void verrichting(double... waardesOpnemen) {
		if (this.controleRekening()) {
			for (int i = 0; i < waardesOpnemen.length; i++) {
				if (waardesOpnemen[i] < 0) {
					this.neemOp(waardesOpnemen[i]);
				} else {
					this.stort(waardesOpnemen[i]);
				}
			}
		}
	}

	public void schrijfRenteBij() {
		if (this.controleRekening()) {
			double toevoegenRente = (this.saldo * this.rentpercentage);
			this.saldo = this.saldo + toevoegenRente;

			System.out.println("rente wordt bijgeschreven voor " + toevoegenRente + " euro");
			System.out.println(this.print());
		}
	}

	public boolean controleRekening() {
		Scanner keyboard = new Scanner(System.in);

		if (this.rekeningnummer.equals("geen")) {
			System.out.println("sorry, geen rekeningnummer");
			return false;
		} else {
			if (this.naam.equals("onbekend")) {
				System.out.println("Voer uw naam in:");
				this.setNaam(keyboard.nextLine());
			}
			return true;
		}
	}

	public String print() {
		StringBuilder tekst = new StringBuilder("Saldo op spaarrekening ");
		tekst.append(this.rekeningnummer).append(" op naam van ").append(this.naam).append(" bedraagt ")
				.append(this.saldo).append(" euro");
		return tekst.toString();
	}

}
