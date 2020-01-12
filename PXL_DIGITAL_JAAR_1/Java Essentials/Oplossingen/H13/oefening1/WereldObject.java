package oefening1;

public abstract class WereldObject {

	Punt positie;

	public WereldObject(int x, int y) {
		positie = new Punt(x, y);
	}

	public void setX(int x) {
		positie.setX(x);
	}

	public void setY(int y) {
		positie.setY(y);
	}

	public int getX() {
		return positie.getX();
	}

	public int getY() {
		return positie.getY();
	}

	public double berekenAfstand(WereldObject wo) {
		return positie.berekenAfstand(wo.positie);
	}

	public abstract void beschrijf();

}
