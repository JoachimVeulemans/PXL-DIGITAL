package ppt;

import java.time.LocalDate;

public class Opdracht6 {

	public static void main(String[] args) {
		LocalDate geboorte = LocalDate.of(1999, 02, 17);
		
		System.out.println(geboorte.getDayOfYear());
		System.out.println(geboorte.getDayOfWeek());
		if (geboorte.isLeapYear()) {
			System.out.println("Schrikkeljaar");
		} else {
			System.out.println("Geen schrikkeljaar");
		}
		
	}

}
