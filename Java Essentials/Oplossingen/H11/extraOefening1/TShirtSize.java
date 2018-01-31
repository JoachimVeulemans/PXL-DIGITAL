package extraOefening1;

public enum TShirtSize {
	EXTRA_SMAL("XS", 86),
	SMAL("S", 94),
	MEDIUM("M",102),
	LARGE("L", 110),
	EXTRA_LARGE("XL", 118),
	EXTRA_EXTRA_LARGE("XXL", 128),
	EXTRA_EXTRA_EXTRA_LARGE("3XL", 140);
	
	private int borstomtrek;
	private String maat;
	
	private TShirtSize(String maat, int borstomtrek) {
		this.maat = maat;
		this.borstomtrek = borstomtrek;
	}

	public int getBorstomtrek() {
		return borstomtrek;
	}

	public void setBorstomtrek(int borstomtrek) {
		this.borstomtrek = borstomtrek;
	}

	public String getMaat() {
		return maat;
	}

	public void setMaat(String maat) {
		this.maat = maat;
	}
	
	
}
