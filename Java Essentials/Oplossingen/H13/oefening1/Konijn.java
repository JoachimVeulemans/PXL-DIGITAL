package oefening1;

public class Konijn extends Acteur {

	public Konijn(int x, int y) {
		super(x, y);
	}

	@Override
	public String interageer(WereldObject wo) {
		return null;
	}

	@Override
	public void beschrijf() {
		System.out.println("Ik ben een konijn op positie x = " + this.positie.getX() + " , y = " + this.positie.getY());
	}

}
