package projectEuler;

public class Problem3 {

	public static void main(String[] args) {
		long getal = 600851475143L;
		long grootstePriem = 0;
		int[] priemGetallen = new int[10000000];
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
			}
		}
		System.out.println(grootstePriem);
		for (int i = 0; i < priemGetallen.length; i++) {
			if (priemGetallen[i] != 0) {
			System.out.println(priemGetallen[i]);
			}
		}

	}

}
