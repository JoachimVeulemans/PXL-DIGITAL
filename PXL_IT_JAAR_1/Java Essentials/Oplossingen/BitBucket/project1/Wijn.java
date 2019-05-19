package project1;

import java.time.LocalDate;

public class Wijn {
	private String naam;
	private String omschrijving;
	private String druivenras;
	private String kleur;
	private String land;
	private String regio;
	private int jaargang;
	private double alcoholpercentage;
	private String serveertip;
	private String[] landen = { "frankrijk", "chili", "italië", "spanje" };
	private String[] kleuren = { "wit", "rood", "rosé" };
	private double[] adviesprijzen = { 7.5, 8.25, 9.30, 6.45 };

	public Wijn(String naam, String kleur, String land) {
		this.naam = naam;
		this.setKleur(kleur);
		this.setLand(land);
		this.setAlcoholpercentage(12.5);
		this.setJaargang(LocalDate.now().getYear() - 1);
	}

	public Wijn() {
		this(null, null, null, 2016, 12.5);
	}

	public Wijn(String naam, String kleur, String land, int jaargang, double alcperc) {
		this.naam = naam;
		this.setLand(land);
		this.setKleur(kleur);
		this.setJaargang(jaargang);
		this.setAlcoholpercentage(alcperc);
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public String getDruivenras() {
		return druivenras;
	}

	public void setDruivenras(String druivenras) {
		this.druivenras = druivenras;
	}

	public String getKleur() {
		return kleur;
	}

	public void setKleur(String kleur) {
		this.kleur = kleur;
		String temp = this.kleur.toLowerCase();
		int count = 0;
		for (int i = 0; i < kleuren.length; i++) {
			if (temp.equals(kleuren[i])) {
				count++;

			}
		}
		if (count == 0) {
			this.kleur = "Rood";
		}
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
		String temp = this.land.toLowerCase();
		int count = 0;
		for (int i = 0; i < landen.length; i++) {
			if (temp.equals(landen[i])) {
				count++;
			}
		}
		if (count == 0) {
			this.land = "Onbekend";
		}
	}

	public String getRegio() {
		return regio;
	}

	public void setRegio(String regio) {
		this.regio = regio;
	}

	public int getJaargang() {
		return jaargang;
	}

	public void setJaargang(int jaargang) {
		this.jaargang = jaargang;
		if (this.jaargang > LocalDate.now().getYear()) {
			this.jaargang = LocalDate.now().getYear();
		} else {
			if (this.jaargang < 1950) {
				this.jaargang = 1950;
			}
		}
	}

	public double getAlcoholpercentage() {
		return alcoholpercentage;
	}

	public void setAlcoholpercentage(double alcoholpercentage) {
		this.alcoholpercentage = alcoholpercentage;
		if (this.alcoholpercentage < 0) {
			this.alcoholpercentage = 0;
		} else {
			if (this.alcoholpercentage > 17) {
				this.alcoholpercentage = 17;
			}
		}
	}

	public String getServeerTip() {
		return serveertip;
	}

	public void setServeerTip(String serveertip) {
		this.serveertip = serveertip;
	}

	public double getAdviesPrijs() {
		double Prijs = -1;
		String temp1 = this.land.toLowerCase();
		for (int i = 0; i < landen.length; i++) {
			if (temp1.equals(landen[i])) {
				Prijs = adviesprijzen[i];
			}
		}
		if (Prijs == -1) {
			for (int i = 0; i < adviesprijzen.length; i++) {
				if (adviesprijzen[i] > Prijs) {
					Prijs = adviesprijzen[i];
				}
			}
		}
		String temp = Integer.toString(this.jaargang);
		temp = temp.substring(temp.length() - 1);
		System.out.println(temp);
		if (temp.equals("7")) {
			return Prijs;
		}
		double extra = (LocalDate.now().getYear() - this.jaargang) * 0.10;
		Prijs += extra;
		return Prijs;
	}

	public String getLabel() {
		StringBuilder label = new StringBuilder("");
		label.append(this.naam).append("\n").append(this.druivenras).append("\n").append(this.regio).append("\n")
				.append(this.jaargang);
		return label.toString();
	}

	@Override
	public String toString() {
		StringBuilder label = new StringBuilder("");
		label.append("Naam: ").append(this.naam).append("\n");
		label.append("Kleur: ").append(this.kleur).append("\n");
		label.append("Land: ").append(this.land).append("\n");
		label.append("Alchoholpercentage: ").append(this.alcoholpercentage).append("\n");
		label.append("Regio: ").append(this.regio).append("\n");
		label.append("Druivenras: ").append(this.druivenras).append("\n");
		label.append("Serveertip: ").append(this.serveertip).append("\n");
		label.append("Jaargang: ").append(this.jaargang).append("\n");
		label.append("Omschrijving: ").append(this.omschrijving).append("\n");
		return label.toString();
	}
}
