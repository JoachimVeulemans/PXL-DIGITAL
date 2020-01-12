package extraOefening1;

public class Huis extends Structuur {

	private String eigenaar;

	public Huis(String eigenaar, Huisnummer h) {
		super(h);
		this.eigenaar = eigenaar;
	}

	@Override
	public void beschrijf() {
		System.out.println(this.eigenaar + " woont op nummer " + super.getNummer().getHuisnummer());
	}
	
	public boolean equals(Huis h) {
		return this.nummer.equals(h.nummer);
	}

}
