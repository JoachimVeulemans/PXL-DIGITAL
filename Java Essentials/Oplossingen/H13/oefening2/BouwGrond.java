package oefening2;

public abstract class BouwGrond implements Verkoopbaar {
	private String perceelNr;
	private float perceelGrootte;
	private String bouwVoorschrift;

	public BouwGrond(String perceelNr, float perceelGrootte) {
		this.perceelNr = perceelNr;
		this.perceelGrootte = perceelGrootte;
	}

	public String getPerceelNr() {
		return perceelNr;
	}

	public void setPerceelNr(String perceelNr) {
		this.perceelNr = perceelNr;
	}

	public float getPerceelGrootte() {
		return perceelGrootte;
	}

	public void setPerceelGrootte(float perceelGrootte) {
		this.perceelGrootte = perceelGrootte;
	}

	public String getBouwVoorschrift() {
		return bouwVoorschrift;
	}

	public void setBouwVoorschrift(String bouwVoorschrift) {
		this.bouwVoorschrift = bouwVoorschrift;
	}

}
