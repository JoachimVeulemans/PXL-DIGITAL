package oefening1;

public class Egel extends Acteur {

	public Egel(int x, int y) {
		super(x, y);
	}

	@Override
	public String interageer(WereldObject wo) {
		if (wo instanceof Egel && this.positie.berekenAfstand(wo.positie) <= 20) {
			return "Dag egel";
		} else {
			if (wo instanceof Konijn && this.positie.berekenAfstand(wo.positie) <= 10) {
				return "Dag konijn";
			} else {
				return null;
			}
		}
	}

	@Override
	public void beschrijf() {
		System.out.println("Ik ben een egel op positie x = " + this.positie.getX() + " , y = " + this.positie.getY());
	}

}
