package opdracht3;

public class Boek {
	private String isbn;
	private String titel;
	private int bladzijden;
	private Auteur auteur;

	public Boek() {
		this("000-000000-000", "onbekend", 0, new Auteur());
	}

	public Boek(String isbn, String titel, int bladzijden, Auteur auteur) {
		this.isbn = isbn;
		this.titel = titel;
		this.bladzijden = bladzijden;
		this.auteur = auteur;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public int getBladzijden() {
		return bladzijden;
	}

	public void setBladzijden(int bladzijden) {
		this.bladzijden = bladzijden;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	public void toonBoekGegevens() {
		System.out.printf("%-15s %-20s %15s %4d bladzijden\n", this.titel, this.auteur, this.isbn, this.bladzijden);
	}

}
