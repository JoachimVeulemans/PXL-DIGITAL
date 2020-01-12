package oefening4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoPeriod;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Vlucht {
	private String regio;
	private String stad;
	private int duurUur;
	private int duurMin;

	public Vlucht(String regio, String stad, int duurUur, int duurMin) {
		this.regio = regio;
		this.stad = stad;
		this.duurUur = duurUur;
		this.duurMin = duurMin;
	}

	public String getRegio() {
		return regio;
	}

	public void setRegio(String regio) {
		this.regio = regio;
	}

	public String getStad() {
		return stad;
	}

	public void setStad(String stad) {
		this.stad = stad;
	}

	public int getDuurUur() {
		return duurUur;
	}

	public void setDuurUur(int duurUur) {
		this.duurUur = duurUur;
	}

	public int getDuurMin() {
		return duurMin;
	}

	public void setDuurMin(int duurMin) {
		this.duurMin = duurMin;
	}

	public String getAankomst(LocalDate vertrekDatum, LocalTime vertrekUur) {
		StringBuilder tekst = new StringBuilder("");
		
		LocalDateTime vertrek = LocalDateTime.of(vertrekDatum, vertrekUur);
		LocalDateTime aankomst = vertrek.plusHours((long)this.duurUur);
		aankomst = aankomst.plusMinutes((long)this.duurMin);
		
		tekst.append("Vertrek vanuit Zavemtem naar ");
		tekst.append(this.stad).append(" (").append(this.regio);
		
		tekst.append(")\nVertrek: ");
		ZoneId zoneIdVertrek = ZoneId.of("Europe/Brussels");
		ZonedDateTime zonedDateTimeVertrek = ZonedDateTime.of(vertrek, zoneIdVertrek);
		tekst.append(zonedDateTimeVertrek.toString());
		
		tekst.append("\nAankomst (onze tijd): ");
		ZoneId zoneIdAankomstOnzeTijd = ZoneId.of("Europe/Brussels");
		ZonedDateTime zonedDateTimeAankomstOnzeTijd = ZonedDateTime.of(aankomst, zoneIdAankomstOnzeTijd);
		tekst.append(zonedDateTimeAankomstOnzeTijd.toString());
		
		tekst.append("\nAankomst (lokale tijd): ");
		ZoneId zoneIdAankomstLokaleTijd = ZoneId.of(this.regio.concat("/").concat((this.stad.replace(' ', '_'))));
		zonedDateTimeAankomstOnzeTijd = zonedDateTimeAankomstOnzeTijd.withZoneSameInstant(zoneIdAankomstLokaleTijd);
		tekst.append(zonedDateTimeAankomstOnzeTijd.toString());
		
		return tekst.toString();
	}
	
	public String getAankomstFormatted(LocalDate vertrekDatum, LocalTime vertrekUur) {
		StringBuilder tekst = new StringBuilder("");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
		
		LocalDateTime vertrek = LocalDateTime.of(vertrekDatum, vertrekUur);
		LocalDateTime aankomst = vertrek.plusHours((long)this.duurUur);
		aankomst = aankomst.plusMinutes((long)this.duurMin);
		
		tekst.append("Vertrek vanuit Zavemtem naar ");
		tekst.append(this.stad).append(" (").append(this.regio);
		
		tekst.append(")\nVertrek: ");
		ZoneId zoneIdVertrek = ZoneId.of("Europe/Brussels");
		ZonedDateTime zonedDateTimeVertrek = ZonedDateTime.of(vertrek, zoneIdVertrek);
		tekst.append(zonedDateTimeVertrek.format(formatter));
		
		tekst.append("\nAankomst (onze tijd): ");
		ZoneId zoneIdAankomstOnzeTijd = ZoneId.of("Europe/Brussels");
		ZonedDateTime zonedDateTimeAankomstOnzeTijd = ZonedDateTime.of(aankomst, zoneIdAankomstOnzeTijd);
		tekst.append(zonedDateTimeAankomstOnzeTijd.format(formatter));
		
		tekst.append("\nAankomst (lokale tijd): ");
		ZoneId zoneIdAankomstLokaleTijd = ZoneId.of(this.regio.concat("/").concat((this.stad.replace(' ', '_'))));
		zonedDateTimeAankomstOnzeTijd = zonedDateTimeAankomstOnzeTijd.withZoneSameInstant(zoneIdAankomstLokaleTijd);
		tekst.append(zonedDateTimeAankomstOnzeTijd.format(formatter));
		
		return tekst.toString();
	}
	
	public String getAankomstFormatted(LocalDateTime vertrek) {
		LocalDate vertrekDatum = vertrek.toLocalDate();
		LocalTime vertrekUur = vertrek.toLocalTime();
		return this.getAankomstFormatted(vertrekDatum, vertrekUur);
	}
	
	public String getAankomst(LocalDateTime vertrek) {
		LocalDate vertrekDatum = vertrek.toLocalDate();
		LocalTime vertrekUur = vertrek.toLocalTime();
		return this.getAankomst(vertrekDatum, vertrekUur);
	}
	
}
