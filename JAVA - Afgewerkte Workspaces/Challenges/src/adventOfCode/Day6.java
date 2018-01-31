package adventOfCode;

public class Day6 {
	public static void main(String[] args) {
		int[] input = { 0, 5, 10, 0, 11, 14, 13, 4, 11, 8, 8, 7, 1, 4, 12, 11 };
		int grootste = 0;
		int positieGrootste = 0;
		int positieOpgeslagenListen = 0;
		int tempStack = 0;
		int[][] opgeslagenListen = new int[999999][16];
		int cycle = 0;
		int count = 0;
		int eersteStaat = 0;
		int tweedeStaat = 0;

		for (int i = 0; i < input.length; i++) {
			opgeslagenListen[positieOpgeslagenListen][i] = input[i];
		}
		positieOpgeslagenListen++;

		for (int aantal = 0; aantal < 100000; aantal++) {

			grootste = 0;
			for (int i = input.length - 1; i >= 0; i--) {
				if (input[i] >= grootste) {
					grootste = input[i];
					positieGrootste = i;
				}
			}
			tempStack = grootste;
			input[positieGrootste] = 0;

			for (int i = 1; i < 20; i++) {
				if (tempStack > 0) {
					if (positieGrootste + i > input.length - 1) {
						positieGrootste = 0;
						i = 0;
					}
					input[positieGrootste + i]++;
					tempStack--;
				}
			}

			tweedeStaat++;
			for (int i = 0; i < positieOpgeslagenListen; i++) {
				count = 0;
				for (int d2 = 0; d2 < opgeslagenListen[i].length; d2++) {
					if (opgeslagenListen[i][d2] == input[d2]) {
						count++;
					}
				}
				if (count == 16) {
					cycle = aantal;
					eersteStaat = i;
					aantal = 1000000000;
				}
			}

			for (int i = 0; i < input.length; i++) {
				opgeslagenListen[positieOpgeslagenListen][i] = input[i];
			}
			positieOpgeslagenListen++;

		}
		System.out.println("*** Deel 1 ***");
		System.out.println(cycle + 1);
		System.out.println("*** Deel 2 ***");
		System.out.println(tweedeStaat - eersteStaat);

	}
}
