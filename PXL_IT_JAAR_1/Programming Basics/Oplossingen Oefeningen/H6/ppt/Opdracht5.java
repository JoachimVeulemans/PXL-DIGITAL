package ppt;

public class Opdracht5 {

	public static void main(String[] args) {
		System.out.printf("%10s %10s\n", "m", "voet");
		for (double m = 1; m <= 20; m = m + 0.5) {
			double voet = m * 3.2808399;
			System.out.printf("%10.2f %10.2f\n", m, voet);
		}
	}

}
