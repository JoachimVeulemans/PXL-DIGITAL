package oefening2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TeVerkopenGrond extends BouwGrond {

	private String notaris;
	private LocalDate datumTeKoop;
	private double hoogsteBod;
	private LocalDate datumHoogsteBod;

	public TeVerkopenGrond(String perceelNr, float perceelGrootte, String bouwVoorschrift) {
		super(perceelNr, perceelGrootte);
		super.setBouwVoorschrift(bouwVoorschrift);
	}

	public String getNotaris() {
		return notaris;
	}

	public LocalDate getDatumTeKoop() {
		return datumTeKoop;
	}

	public double getHoogsteBod() {
		return hoogsteBod;
	}

	public LocalDate getDatumHoogsteBod() {
		return datumHoogsteBod;
	}

	@Override
	public void wijsEenNotarisToe(String notaris, LocalDate datum) {
		if (this.notaris == null && this.datumTeKoop == null) {
			this.notaris = notaris;
			this.datumTeKoop = datum;
		}
	}

	@Override
	public void doeEenBod(double bod, LocalDate datum) {
		if (this.notaris != null && ChronoUnit.DAYS.between(this.datumTeKoop, LocalDate.now()) >= 10) {
			DateTimeFormatter formatterLang = DateTimeFormatter.ofPattern("dd MMMM yyyy");
			DateTimeFormatter formatterKort = DateTimeFormatter.ofPattern("dd/MM/yy");

			System.out.println("Perceelnr: " + super.getPerceelNr());
			System.out.println("Perceelgrootte: " + super.getPerceelGrootte());
			System.out.println("Bouwvoorschrift: " + super.getBouwVoorschrift());
			System.out.println("Te koop gesteld op " + this.datumTeKoop.format(formatterLang) + " bij notaris " + this.notaris);

			if (bod > this.hoogsteBod && bod >= (BouwGrond.minPrijsM2 * super.getPerceelGrootte() * 100)) {
				if (this.hoogsteBod != 0) {
					System.out.println("Vorig hoogste bod " + this.hoogsteBod + " geregistreerd op " + this.datumHoogsteBod.format(formatterKort));
				}
				this.hoogsteBod = bod;
				this.datumHoogsteBod = datum;
				System.out.println("Nieuw hoogste bod " + bod + " geregistreerd op " + datum.format(formatterKort));
			}
		}
	}

}
