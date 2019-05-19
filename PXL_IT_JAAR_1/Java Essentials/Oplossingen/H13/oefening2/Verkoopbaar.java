package oefening2;

import java.time.LocalDate;

public interface Verkoopbaar {
	int minPrijsM2 = 83;

	public void wijsEenNotarisToe(String notaris, LocalDate datum);

	public void doeEenBod(double bod, LocalDate datum);
}
