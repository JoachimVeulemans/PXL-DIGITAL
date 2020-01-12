package oefening2;

public class Leraar {
	private String naam;
	private String voornaam;
	private int aanstellingsPerc;
	private int aantalVakken = 0;
	private static final int MAXAANTALVAKKEN = 5;
	Vak[] vakken = new Vak[Leraar.MAXAANTALVAKKEN];

	public Leraar(String naam, String voornaam, int aanstellingsPerc) {
		this.naam = naam;
		this.voornaam = voornaam;
		this.setAanstelling(aanstellingsPerc);
	}

	public String getNaam() {
		return this.naam;
	}

	public void setNaam(String n) {
		this.naam = n;
	}

	public void setVoornaam(String vn) {
		this.voornaam = vn;
	}

	public void voegVakToe(Vak v) {
		if (this.aantalVakken < Leraar.MAXAANTALVAKKEN) {
			this.vakken[aantalVakken] = v;
			this.aantalVakken++;
		}

	}

	public Vak getVak(int i) {
		return vakken[i];
	}

	public int getAanstelling() {
		return this.aanstellingsPerc;
	}

	public void setAanstelling(int a) {
		this.aanstellingsPerc = a;
		if (this.aanstellingsPerc > 100) {
			this.aanstellingsPerc = 100;
			System.out.println("Aanstellingpercentage te groot, afgerond op 100!");
		}
		int temp = (int) ((this.aanstellingsPerc / 10.0) + 0.5);
		this.aanstellingsPerc = temp * 10;
	}

	public int getAantalVakken() {
		return this.aantalVakken;
	}

	public static int getMAX() {
		return Leraar.MAXAANTALVAKKEN;
	}

	public void print() {
		System.out.println(
				"Leraar " + this.naam + " " + this.voornaam + " is aangesteld voor " + this.aanstellingsPerc + "%");
		System.out.println("Volgende vakken behoren tot het takenpakket:");
		StringBuilder uitprintJaar1 = new StringBuilder("");
		StringBuilder uitprintJaar2 = new StringBuilder("");
		StringBuilder uitprintJaar3 = new StringBuilder("");
		for (int i = 0; i < vakken.length; i++) {
			if (vakken[i] != null) {
				if (vakken[i].getJaar().equals("1")) {
					uitprintJaar1.append("\t").append(vakken[i].getCode()).append("\t").append(vakken[i].getNaam())
							.append("\t").append(vakken[i].getAantalSTP()).append("\n");
				} else {
					if (vakken[i].getJaar().equals("2")) {
						uitprintJaar2.append("\t").append(vakken[i].getCode()).append("\t").append(vakken[i].getNaam())
								.append("\t").append(vakken[i].getAantalSTP()).append("\n");
					} else {
						uitprintJaar3.append("\t").append(vakken[i].getCode()).append("\t").append(vakken[i].getNaam())
								.append("\t").append(vakken[i].getAantalSTP()).append("\n");
					}
				}
			}
		}
		if (!uitprintJaar1.toString().equals("")) {
			System.out.println("Vakken van jaar 1:");
			System.out.print(uitprintJaar1);
		}
		if (!uitprintJaar2.toString().equals("")) {
			System.out.println("Vakken van jaar 2:");
			System.out.print(uitprintJaar2);
		}
		if (!uitprintJaar3.toString().equals("")) {
			System.out.println("Vakken van jaar 3:");
			System.out.print(uitprintJaar3);
		}
	}

}
