package ppt;

public class Opdracht1 {

	public static void main(String[] args) {
		int[] veelvoud7 = new int[20];

		// Vullen
		for (int i = 0; i < veelvoud7.length; i++) {
			veelvoud7[i] = i * 7;
		}

		// Uitprinten
		for (int v : veelvoud7) {
			System.out.println(v);
		}

		// Array booleans
		boolean boolArray[] = new boolean[6];
		boolArray[3] = true;
		for (boolean bool : boolArray) {
			System.out.println(bool);
		}
		System.out.println(boolArray);

		// Array maken en daarna vullen
		int[] nummers = new int[10];

		for (int i = 0; i < nummers.length; i++) {
			nummers[i] = i * 2 + 1;
		}

		int nummers2[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };

		// Nummers afdrukken via for-each
		for (int nummer : nummers) {
			System.out.println(nummer);
		}

		// NUmmers2 in omgekeerde volgorde
		for (int i = 0; i < nummers2.length; i++) {
			System.out.println(nummers2[nummers2.length-1-i]);
		}
	}

}
