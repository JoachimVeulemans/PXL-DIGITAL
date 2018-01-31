package projectEuler;

public class Problem14 {

	public static void main(String[] args) {
		int[] reeks = new int[100000];
		int count = 0;
		int grootste = 0;

		for (int i = 1; i < 1000000; i++) {
			System.out.println("Testcase: " + i);
			for (int clear = 0; clear < reeks.length; clear++) {
				if (reeks[clear] != 0) {
				reeks[clear] = 0;
				} else {
					clear = reeks.length;
				}
			}
			reeks[0] = i;
			count = 0;
			for (int k = 0; k < reeks.length; k++) {
				//if (reeks[k] != 0) {
					if (reeks[k] != 1) {
						if (reeks[k] % 2 == 0) {
							reeks[k + 1] = reeks[k] / 2;
						} else {
							reeks[k + 1] = (3 * reeks[k]) + 1;
						}
					} else {
						k = reeks.length;
					}
				//} else {
					//k = reeks.length;
			//	}

			}
			for (int k = 0; k < reeks.length; k++) {
				if (reeks[k] != 0) {
					count++;
				} else {
					k = reeks.length;
				}
			}
			System.out.println(count);
			if (count > grootste) {
				
				grootste = count;
			}
		}
		System.out.println(grootste);
	}
}
