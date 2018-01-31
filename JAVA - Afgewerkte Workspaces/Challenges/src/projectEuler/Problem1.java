package projectEuler;

public class Problem1 {

	public static void main(String[] args) {
		int totaal = 0;
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				totaal += i;
			}
		}
		System.out.println(totaal);
	}

}
