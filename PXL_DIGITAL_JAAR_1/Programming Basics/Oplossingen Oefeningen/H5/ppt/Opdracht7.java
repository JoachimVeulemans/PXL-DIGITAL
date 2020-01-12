package ppt;

public class Opdracht7 {

	public static void main(String[] args) {
		int a = 4;
		int b = 7;

		boolean voorwaardeA = a > 2;
		boolean voorwaardeB = b < 10;

		if (!voorwaardeA || voorwaardeB) {
			System.out.println("Het is waar");
		} else {
			System.out.println("Onwaar");
		}

		System.out.println(!voorwaardeA);

		// opdracht B
		a += b;
		System.out.println("a is nu " + a);
		a = +b;
		System.out.println("a is nu " + a);
		a = 2;
		a *= b;
		System.out.println("a is nu " + a);

	}

}
