package ppt;

public class Lector extends Persoon{
	private int personeelsnr;
	private double aanstellingspercentage;
	private double salaris;
	private static int count = 0;
	
	{
		count++;
	}

	public static int getAantal() {
		return count;
	}
	
	public Lector(String naam, String voornaam, double aanstelPerc, double salaris, int personeelsnr) {
		super(naam, voornaam);
		this.aanstellingspercentage = aanstelPerc;
		this.salaris = salaris;
		this.personeelsnr = personeelsnr;
	}
	
	public Lector(String naam, String voornaam, double aanstelPerc, double salaris) {
		this(naam, voornaam, aanstelPerc, salaris, 20009999);
	}
	
	public Lector() {
		this("onbekend", "onbekend", 100, 2000);
	}
	
	public int getPersoneelsnr() {
		return personeelsnr;
	}
	public void setPersoneelsnr(int personeelsnr) {
		this.personeelsnr = personeelsnr;
	}
	public double getAanstellingspercentage() {
		return aanstellingspercentage;
	}
	public void setAanstellingspercentage(double aanstellingspercentage) {
		if (this.aanstellingspercentage != 0 && this.salaris != 0) {
			double verschil = (this.aanstellingspercentage - aanstellingspercentage) / 100;
			this.salaris = this.salaris - (verschil * this.salaris);
		}
		this.aanstellingspercentage = aanstellingspercentage;
		if (this.aanstellingspercentage < 0) {
			this.aanstellingspercentage = 0;
		} else {
			if (this.aanstellingspercentage > 100) {
				this.aanstellingspercentage = 100;
			}
		}
	}
	public double getSalaris() {
		return salaris;
	}
	public void setSalaris(double salaris) {
		this.salaris = salaris;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(this.aanstellingspercentage);
		System.out.println(this.personeelsnr);
		System.out.println(this.salaris);
	}
}
