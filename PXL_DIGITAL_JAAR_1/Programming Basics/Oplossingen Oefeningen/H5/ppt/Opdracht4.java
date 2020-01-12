package ppt;

public class Opdracht4 {
	public static void main(String[] args) {
		int getal1 = 7;
		int getal2 = 2;

		int res;

		res = (getal1 + getal2);
		System.out.println("De som is: " + res);

		res = (getal1 * 4);
		System.out.println("De vermenigvuldiging is: " + res);

		res = (getal1 / getal2);
		System.out.println("De deling is: " + res);

		res = (getal1 % getal2);
		System.out.println("De modulus is: " + res);

		res = (int) (getal2 * 2.3);
		System.out.println("De vermenigvuldiging met 2.3 is: " + res);

		// rekenen met char!
		char teken = 'a';
		teken++;
		System.out.println("Het teken is: " + teken);
		teken = (char) (teken + 8);
		System.out.println("Het teken is: " + teken);
		teken += 3; // cast niet nodig!
		System.out.println("Het teken is: " + teken);
		teken -= 6;
		System.out.println("Het teken is: " + teken);

	}
}
