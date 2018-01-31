package oefening5;

public class Oefening5 {

	public static void main(String[] args) {
		StringBuilder getalSB = new StringBuilder("");
		String getalS;
		double getalD;

		System.out.printf("%20s %-20s %20s %20s\n", "1. gewoon", "2. links", "3. rechts (met nul)", "4. rechts met 3 dec");

		for (int count = 1; count < 10; count++) {
			getalSB.append(count);

			getalS = getalSB.toString();
			getalD = Double.parseDouble(getalS);

			System.out.printf("%20.6f %-20f %020.6f %20.3f\n", getalD, getalD, getalD, getalD);
		}

	}

}
