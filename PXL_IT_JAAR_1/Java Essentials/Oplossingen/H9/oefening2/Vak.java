package oefening2;

public class Vak {
	private String code;
	private String naam;
	private int aantalSTP;

	public Vak(String code, String naam, int aantalSTP) {
		this.setCode(code);
		this.naam = naam;
		this.setAantalSTP(aantalSTP);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String c) {
		this.code = c;
		if (!(code.substring(1, 2).equals("2") || code.substring(1, 2).equals("3"))) {
			this.code = this.code.substring(0, 1).concat("1").concat(this.code.substring(2));
		}
	}

	public String getJaar() {
		if (code.substring(1, 2).equals("1")) {
			return "1";
		} else {
			if (code.substring(1, 2).equals("2")) {
				return "2";
			} else {
				return "3";
			}
		}
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String n) {
		this.naam = n;
	}

	public int getAantalSTP() {
		return aantalSTP;
	}

	public void setAantalSTP(int a) {
		this.aantalSTP = a;
		if (this.aantalSTP >= 18) {
			this.aantalSTP = 18;
		}
		int temp = (int) ((this.aantalSTP / 3.0) + 0.5);
		this.aantalSTP = temp * 3;
	}

}
