package oefening4;

public class Gemeente {
	private int postcode;
	private String gemNaam;

	public Gemeente() {

	}

	public Gemeente(int postcode, String gemNaam) {
		this.setPostcode(postcode);
		this.setGemNaam(gemNaam);
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
		postcodeControle();
	}

	public String getGemNaam() {
		return gemNaam;
	}

	public void setGemNaam(String gemNaam) {
		this.gemNaam = gemNaam;
		this.gemNaamControle();
	}

	public void postcodeControle() {
		String code = Integer.toString(this.postcode);
		code = code.concat("0000");
		code = code.substring(0, 4);
		this.postcode = Integer.parseInt(code);
	}

	public void gemNaamControle() {
		String tekst = this.gemNaam;
		String nieuwTekst = "";
		int count = 0;
		for (int begin = 0; begin < tekst.length(); begin++) {
			String temp = tekst.substring(begin, begin + 1);

			for (int guess = 0; guess < 9; guess++) {
				if (temp.equals(Integer.toString(guess))) {
					count++;
				}
			}

			if (count == 0) {
				if (begin == 0) {
					temp = temp.toUpperCase();
					nieuwTekst = nieuwTekst.concat(temp);
				} else {
					if ((tekst.substring(begin - 1, begin).equals("-")
							|| tekst.substring(begin - 1, begin).equals(" "))) {
						nieuwTekst = nieuwTekst.concat(temp);
					} else {
						temp = temp.toLowerCase();
						nieuwTekst = nieuwTekst.concat(temp);
					}

				}
			}
			count = 0;

		}
		this.gemNaam = nieuwTekst;

	}

	public String toString() {
		return this.postcode + " " + this.gemNaam;
	}
}
