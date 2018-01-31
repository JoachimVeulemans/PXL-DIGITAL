package projectEuler;

public class Problem7 {

	public static void main(String[] args) {
		int getal = 1000000;
		int[] priemGetallen = new int[10001];
		priemGetallen[0] = 2;
		int count = 1;
		int priem = 0;

		for (int k = 3; k < getal; k = k + 2) {
			priem = 0;
			for (int i = 1; i < priemGetallen.length; i++) {
				if (priemGetallen[i] != 0) {
					if (k % priemGetallen[i] == 0) {
						priem++;
					}
				} else {
					i = priemGetallen.length;
				}
			}
			if (priem == 0) {
				priemGetallen[count] = k;
				count++;
				System.out.println("Nieuwe priem!: " + k);
				if (count == priemGetallen.length) {
					k = 1000000;
				}

			}
		}


	}


}
