package oefening3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Huwelijk {
	private Persoon persoon1 = new Persoon();
	private Persoon persoon2 = new Persoon();
	private LocalDate huwDatum;

	{
		persoon2.getAdres().setStraat(persoon1.getAdres().getStraat());
		persoon2.getAdres().setHuisnr(persoon1.getAdres().getHuisnr());
		persoon2.getAdres().getGemeente().setGemNaam(persoon1.getAdres().getGemeente().getGemNaam());
		persoon2.getAdres().getGemeente().setPostcode(persoon1.getAdres().getGemeente().getPostcode());
	}

	public Huwelijk(Persoon man, Persoon vrouw, int dag, int maand, int jaar) {
		persoon1 = man;
		persoon2 = vrouw;
		huwDatum = LocalDate.of(jaar, maand, dag);
		System.out.println(persoon1.getVoornaam() + " " + persoon1.getNaam() + " en " + persoon2.getVoornaam() + " "
				+ persoon2.getNaam() + " zijn gehuwd op " + huwDatum.getDayOfMonth() + " " + huwDatum.getMonthValue()
				+ " " + huwDatum.getYear() + ". Proficiat!");
	}

	public Persoon getPersoon1() {
		return persoon1;
	}

	public Persoon getPersoon2() {
		return persoon2;
	}

	public LocalDate getHuwelijksdatum() {
		return huwDatum;
	}

	public void adresWijziging(String straat, String huisnummer, int postcode, String gemeente) {
		persoon1.getAdres().setStraat(straat);
		persoon1.getAdres().setHuisnr(huisnummer);
		persoon1.getAdres().getGemeente().setGemNaam(gemeente);
		persoon1.getAdres().getGemeente().setPostcode(postcode);
		persoon2.getAdres().setStraat(straat);
		persoon2.getAdres().setHuisnr(huisnummer);
		persoon2.getAdres().getGemeente().setGemNaam(gemeente);
		persoon2.getAdres().getGemeente().setPostcode(postcode);
	}

	public void print() {
		System.out.println(persoon1.toString());
		System.out.println("Geboren op " + persoon1.getGeboortedatum().getDayOfMonth() + " "
				+ persoon1.getGeboortedatum().getMonthValue() + " " + persoon1.getGeboortedatum().getYear() + "\n");
		System.out.println(persoon2.toString());
		System.out.println("Geboren op " + persoon2.getGeboortedatum().getDayOfMonth() + " "
				+ persoon2.getGeboortedatum().getMonthValue() + " " + persoon2.getGeboortedatum().getYear() + "\n");
		System.out.println("het huwelijk vond plaats op " + huwDatum.getDayOfMonth() + " " + huwDatum.getMonthValue()
				+ " " + huwDatum.getYear());
	}

	public String printDatum(LocalDate datum) {
		StringBuilder tekst = new StringBuilder("");
		switch (datum.getDayOfWeek().toString()) {
		case "MONDAY":
			tekst.append("maandag ");
			break;
		case "TUESDAY":
			tekst.append("dinsdag ");
			break;
		case "WEDNESDAY":
			tekst.append("woensdag ");
			break;
		case "THURSDAY":
			tekst.append("donderdag ");
			break;
		case "FRIDAY":
			tekst.append("vrijdag ");
			break;
		case "SATURDAY":
			tekst.append("zaterdag ");
			break;
		case "SUNDAY":
			tekst.append("zondag ");
			break;
		default:
			tekst.append("Error ");
		}

		tekst.append(Integer.toString(datum.getDayOfMonth())).append(" ");

		switch (datum.getMonthValue()) {
		case 1:
			tekst.append("januari");
			break;
		case 2:
			tekst.append("februari");
			break;
		case 3:
			tekst.append("maart");
			break;
		case 4:
			tekst.append("april");
			break;
		case 5:
			tekst.append("mei");
			break;
		case 6:
			tekst.append("juni");
			break;
		case 7:
			tekst.append("juli");
			break;
		case 8:
			tekst.append("augustus");
			break;
		case 9:
			tekst.append("september");
			break;
		case 10:
			tekst.append("oktober");
			break;
		case 11:
			tekst.append("november");
			break;
		case 12:
			tekst.append("december");
			break;
		default:
			tekst.append("error");
		}

		tekst.append(" ").append(datum.getYear());
		return tekst.toString();
	}

	public String printFeest() {
		StringBuilder tekst = new StringBuilder("Op ");
		tekst.append(this.printDatum(this.huwDatum).substring(0, this.printDatum(this.huwDatum).length() - 4));

		int jaar;
		if (this.huwDatum.getMonthValue() > LocalDate.now().getMonthValue()) {
			jaar = LocalDate.now().getYear();
		} else {
			if (this.huwDatum.getMonthValue() == LocalDate.now().getMonthValue()) {
				if (this.huwDatum.getDayOfMonth() >= LocalDate.now().getDayOfMonth()) {
					jaar = LocalDate.now().getYear();
				} else {
					jaar = LocalDate.now().getYear() + 1;
				}
			} else {
				jaar = LocalDate.now().getYear() + 1;
			}
		}
		tekst.append(jaar);

		tekst.append(" vieren ze hun ");

		LocalDate feest = LocalDate.of(jaar, this.huwDatum.getMonthValue(), this.huwDatum.getDayOfMonth());
		switch (Period.between(this.huwDatum, feest).getYears()) {
		case 10:
			tekst.append("TIN ");
			break;
		case 20:
			tekst.append("PORSELEIN ");
			break;
		case 30:
			tekst.append("PAREL ");
			break;
		case 40:
			tekst.append("SMAGARD ");
			break;
		case 50:
			tekst.append("GOUD ");
			break;
		case 60:
			tekst.append("DIAMANT ");
			break;
		case 70:
			tekst.append("PLATINA ");
			break;
		case 80:
			tekst.append("EIK ");
			break;
		case 90:
			tekst.append("GRANIET ");
			break;
		}

		tekst.append("bruiloft.\nDit zijn nog ");

		Period tussen = Period.between(LocalDate.now(), feest);
		long aantalDagen = ChronoUnit.DAYS.between(LocalDate.now(), feest);
		tekst.append(aantalDagen);

		tekst.append(" dagen te gaan. Of nog ");
		tekst.append(tussen.getYears());
		tekst.append(" jaar en ");
		tekst.append(tussen.getMonths());
		tekst.append(" maanden en ");
		tekst.append(tussen.getDays());
		tekst.append(" dagen.");

		return tekst.toString();
	}

}
