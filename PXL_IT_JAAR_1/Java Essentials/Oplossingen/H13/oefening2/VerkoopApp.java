package oefening2;

import java.time.LocalDate;

public class VerkoopApp {

	public static void main(String[] args) {
		TeVerkopenBouwGrond grond = new TeVerkopenBouwGrond("12ER", 14.2F, "Open Bebouwing");
		grond.wijsEenNotarisToe("Dirk Peeters", LocalDate.of(2016, 12, 07));
		grond.doeEenBod(150000, LocalDate.of(2016, 12, 23));

		System.out.println("--- Output Opgave: ---");
		grond.doeEenBod(175000, LocalDate.of(2017, 01, 04));
	}

}
