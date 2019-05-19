package oefening1;

public abstract class Acteur extends WereldObject implements Beweegbaar {

	public Acteur(int x, int y) {
		super(x, y);
	}

	public abstract String interageer(WereldObject wo);

	@Override
	public void stapBoven() {
		super.positie.setY(super.positie.getY() + 1);
	}

	@Override
	public void stapLinks() {
		super.positie.setX(super.positie.getX() - 1);
	}

	@Override
	public void stapOnder() {
		super.positie.setY(super.positie.getY() - 1);
	}

	@Override
	public void stapRechts() {
		super.positie.setX(super.positie.getX() + 1);
	}
}
