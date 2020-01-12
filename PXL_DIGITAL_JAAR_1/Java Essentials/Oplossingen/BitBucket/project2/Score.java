package project2;

public class Score {
	public static final int MAX_SCORE = 5;
	private int waarde;

	public Score(int score) {
		this.setWaarde(score);
	}

	public Score(Score[] sterren) {
		double totaal = 0;
		for (int i = 0; i < sterren.length; i++) {
			totaal += sterren[i].waarde;
		}
		totaal = totaal / sterren.length;
		this.setWaarde((int) totaal);
	}

	private void setWaarde(int waarde) {
		this.waarde = waarde;
		if (this.waarde < 0) {
			this.waarde = 0;
		}
		if (this.waarde > Score.MAX_SCORE) {
			this.waarde = Score.MAX_SCORE;
		}
	}

	public String getStars() {
		StringBuilder sterren = new StringBuilder("");

		for (int i = 0; i < this.waarde; i++) {
			sterren.append("*");
		}

		return sterren.toString();
	}

	public boolean equals(Score score2) {
		if (score2 == null) {
			return false;
		}
		if (this.waarde == score2.waarde) {
			return true;
		} else {
			return false;
		}
	}
}
