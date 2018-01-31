package projectEuler;

public class Problem5 {
	public static void main(String[] args) {
		int uitkomst = 0;
		int count = 0;
		for (int i = 1; i < 1000000000; i++) {
			count = 0;
			for (int j = 1; j < 21; j++) {
				if (i % j == 0) {
					count++;
				}
				if (count == 20) {
					uitkomst = i;
					i = 1000000000;
				}
			}
		}
		System.out.println(uitkomst);
	}
}
