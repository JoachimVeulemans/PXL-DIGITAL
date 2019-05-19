package ppt;

public enum Dag {
	MAANDAG, DINSDAG, WOENSDAG, DONDERDAG, VRIJDAG, ZATERDAG, ZONDAG;
	private boolean weekdag;
	
	{
		if (this.ordinal() < 5) {
			weekdag = true;
		} else {
			weekdag = false;
		}
	}
	
	@Override
	public String toString() {
		String tekst  = "";
		tekst = (this.name() + " " + this.ordinal() + " ");
		if (weekdag) {
			tekst = tekst.concat("weekdag");
		} else {
			tekst = tekst.concat("weekend");
		}
		return tekst;
	}
}
