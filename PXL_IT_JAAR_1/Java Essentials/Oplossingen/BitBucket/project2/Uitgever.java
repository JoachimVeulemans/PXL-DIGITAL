package project2;

import java.time.LocalDate;

public class Uitgever {
	private String naam;
	private int jaarOprichting;
	private String hoofdkantoor;
	private String website;
	
	public Uitgever(String naam, String hoofdkantoor, int jaarOprichting) {
		this.naam = naam;
		this.hoofdkantoor = hoofdkantoor;
		this.setJaarOprichting(jaarOprichting);
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getJaarOprichting() {
		return jaarOprichting;
	}

	public void setJaarOprichting(int jaarOprichting) {
		this.jaarOprichting = jaarOprichting;
		if (this.jaarOprichting > LocalDate.now().getYear()) {
			this.jaarOprichting = 0;
		}
	}

	public String getHoofdkantoor() {
		return hoofdkantoor;
	}

	public void setHoofdkantoor(String hoofdkantoor) {
		this.hoofdkantoor = hoofdkantoor;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	
	public String toString() {
		return "Uitgever{naam='" + this.naam + "', jaarOprichting=" + this.jaarOprichting + ", hoofdkantoor='" + this.hoofdkantoor + "', website='" + this.website + "'}";
	}
}
