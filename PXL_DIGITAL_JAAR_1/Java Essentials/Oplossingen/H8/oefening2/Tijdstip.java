package oefening2;

public class Tijdstip {
	private int uren;
	private int minuten;
	private int seconden;

	public void controle() {
		if (this.seconden > 59) {
			this.minuten = this.minuten + ((int) ((this.seconden / 60.0)));
			this.seconden = (this.seconden % 60);
		}
		if (this.minuten > 59) {
			this.uren = this.uren + (int) ((this.minuten / 60.0));
			this.minuten = (this.minuten - (int) ((this.minuten / 60.0)) * 60);
		}
		if (this.uren % 24 == 0) {
			this.uren = 0;
		} 
		
		if (this.uren > 23) {
			this.uren = this.uren - ((int) ((this.uren / 24.0))) * 24;
		}
	}

	public int getUren() {
		return uren;
	}

	public void setUren(int uren) {
		this.uren = uren;
		this.controle();
	}

	public int getMinuten() {
		return minuten;
	}

	public void setMinuten(int minuten) {
		this.minuten = minuten;
		this.controle();
	}

	public int getSeconden() {
		return seconden;
	}

	public void setSeconden(int seconden) {
		this.seconden = seconden;
		this.controle();
	}

	public Tijdstip(int uren, int minuten, int seconden) {
		this.uren = uren;
		this.minuten = minuten;
		this.seconden = seconden;
		this.controle();
	}

	public Tijdstip(int seconden) {
		this.seconden = seconden;
		this.controle();
	}

	public Tijdstip(Tijdstip t) {
		this(t.getUren(), t.getMinuten(), t.getSeconden());
		this.controle();
	}

	public void voegUrenToe(int uren) {
		this.setUren(this.getUren() + uren);
		this.controle();
	}

	public void voegMinutenToe(int minuten) {
		this.setMinuten(this.getMinuten() + minuten);
		this.controle();
	}

	public void voegSecondenToe(int seconden) {
		this.setSeconden(this.getSeconden() + seconden);
		this.controle();
	}

	public void voegUrenToe() {
		this.voegUrenToe(1);
	}

	public String toStringTijd(boolean engels) {
		StringBuilder tijd = new StringBuilder("");
		if (!engels) {
			tijd.append(this.getUren()).append(":");
			if (this.getMinuten() < 10) {
				tijd.append("0");
			}
			tijd.append(this.getMinuten()).append(" u");
		} else {
			int tempUren;
			if (this.getUren() - 12 > 0) {
				tempUren = this.getUren() - 12;
			} else {
				tempUren = this.getUren();
			}
			if (tempUren < 10) {
				tijd.append("0");
			}
			tijd.append(tempUren).append(":");
			if (this.getMinuten() < 10) {
				tijd.append("0");
			}
			tijd.append(this.getMinuten());
			if (this.getUren() < 13) {
				tijd.append(" AM");
			} else {
				tijd.append(" PM");
			}
			if (tijd.toString().equals("00:00 AM")) {
				return "12:00 AM (midnight)";
			}
			if (tijd.toString().equals("12:00 AM")) {
				return "12:00 PM (noon)";
			}
		}
		return tijd.toString();
	}

	public String toStringTechnisch() {
		StringBuilder tijd = new StringBuilder("");

		if (this.getUren() < 10) {
			tijd.append("0");
		}
		tijd.append(this.getUren()).append(":");
		if (this.getMinuten() < 10) {
			tijd.append("0");
		}
		tijd.append(this.getMinuten()).append(":");
		if (this.getSeconden() < 10) {
			tijd.append("0");
		}
		tijd.append(this.getSeconden());

		return tijd.toString();
	}

}
