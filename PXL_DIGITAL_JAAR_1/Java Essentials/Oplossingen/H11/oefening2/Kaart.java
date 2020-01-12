package oefening2;

public class Kaart {
	
	private Ranking ranking;
	private Soort soort;

	public Kaart(Ranking ranking, Soort soort) {
		this.ranking = ranking;
		this.soort = soort;
	}

	public Ranking getRanking() {
		return ranking;
	}

	public void setRanking(Ranking ranking) {
		this.ranking = ranking;
	}

	public Soort getSoort() {
		return soort;
	}

	public void setSoort(Soort soort) {
		this.soort = soort;
	}
	
	
	
}
