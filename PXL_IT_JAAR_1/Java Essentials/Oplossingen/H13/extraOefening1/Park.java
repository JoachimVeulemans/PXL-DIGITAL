package extraOefening1;

public class Park extends Structuur {

	public Park(Huisnummer h) {
		super(h);
	}

	@Override
	public void beschrijf() {
		System.out.println("Park gelegen op nummer " + this.getNummer().getHuisnummer());
	}

}
