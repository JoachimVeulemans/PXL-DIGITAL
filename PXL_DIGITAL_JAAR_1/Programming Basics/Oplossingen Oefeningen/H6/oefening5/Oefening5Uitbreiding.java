package oefening5;

public class Oefening5Uitbreiding {

	public static void main(String[] args) {
		StringBuilder getalSB = new StringBuilder("");
		String getalS;
		double getalD = 0;
		double deler = 1.0;

		System.out.printf("%20s %-20s %20s %20s\n", "1. gewoon", "2. links", "3. rechts (met nul)", "4. rechts met 3 dec");

		for (int count = 1; count < 10; count++) {
			if (count >= 6) {
				deler = deler * 10;
				getalD = getalD + (count / deler);
			} else {
				getalSB.append(count);
				getalS = getalSB.toString();
				getalD = Double.parseDouble(getalS);
			}

			System.out.printf("%20.6f %-20f %020.6f %20.3f\n", getalD, getalD, getalD, getalD);
		}

	}

}
