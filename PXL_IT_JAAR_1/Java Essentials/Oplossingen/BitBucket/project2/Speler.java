package project2;

import java.time.LocalDate;

public class Speler {
	private String naam;
	private int geboortejaar;

	public Speler(String naam, int geboortejaar) {
		this.naam = naam;
		this.setGeboortejaar(geboortejaar);
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getGeboortejaar() {
		return geboortejaar;
	}

	public void setGeboortejaar(int geboortejaar) {
		this.geboortejaar = geboortejaar;
		if (this.geboortejaar < 1900 || this.geboortejaar > LocalDate.now().getYear()) {
			this.geboortejaar = 0;
		}
	}

	public int getLeeftijd() {
		if (this.geboortejaar == 0) {
			return -1;
		} else {
			return (LocalDate.now().getYear() - this.geboortejaar);
		}
	}
}
