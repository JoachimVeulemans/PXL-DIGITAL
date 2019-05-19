package ppt;

import java.time.LocalDate;
import java.time.Period;

public class Opdracht8 {

	public static void main(String[] args) {

		LocalDate geboorte = LocalDate.of(1999, 02, 17);
		LocalDate now = LocalDate.now();
		Period periode = Period.between(geboorte, now);

		System.out.println("Aantal dagen: " + periode.getDays());
		System.out.println("Aantal maanden: " + periode.getMonths());
		System.out.println("Aantal jaren: " + periode.getYears());

		int aantalMaanden = periode.getMonths() + periode.getYears() * 12;
		System.out.println("Leeftijd in maanden: " + aantalMaanden);
	}

}
