package project2;

public class SpelEvaluatie {
	private String motivatie;
	private Spel spel;
	private Speler speler;
	private Score score;

	public SpelEvaluatie(Spel spel, Speler speler) {
		this.spel = spel;
		this.speler = speler;
	}

	public Spel getSpel() {
		return this.spel;
	}

	public Speler getSpeler() {
		return this.speler;
	}

	public Score getScore() {
		return this.score;
	}

	public String getMotivatie() {
		return this.motivatie;
	}

	public boolean isGeldig() {
		if (spel != null) {
			if (speler != null) {
				if (score != null) {
					if (speler.getLeeftijd() >= spel.getMinimumLeeftijd()) {
						if (this.motivatie != null) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	public boolean maakBeoordeling(int score, String motivatie) {
		if (this.motivatie == null) {
			this.score = new Score(score);
			this.motivatie = motivatie;
			return true;
		} else {
			return false;
		}
	}
}
