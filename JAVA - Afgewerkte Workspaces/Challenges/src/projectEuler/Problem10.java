package projectEuler;

public class Problem10 {
	public static void main(String[] args) {
		int getal = 99000000;
		int[] priemGetallen = new int[2000000];
		priemGetallen[0] = 2;
		int count = 1;
		int priem = 0;
		int totaal = 0;
		
		for (int k = 3; k < 100; k = k + 2) {
			priem = 0;
			for (int i = 1; i < priemGetallen.length; i++) {
				if (!(priemGetallen[i] == 0 || priemGetallen[i] > k / 2.0)) {
					
					if (k % priemGetallen[i] == 0) {
						priem++;
						System.out.println(priem);
					}
				} else {
					i = priemGetallen.length;
				}
			}
			if (priem == 0) {
				priemGetallen[count] = k;
				count++;
				if (count % 10000 == 0) {
				System.out.println(count + "/2.000.000");
				}
				if (count == priemGetallen.length) {
					k = 9000000;
				}

			}
		}
		for (int i = 0; i < priemGetallen.length; i++) {
			totaal += priemGetallen[i];
		}
		System.out.println(totaal);

	}
}
