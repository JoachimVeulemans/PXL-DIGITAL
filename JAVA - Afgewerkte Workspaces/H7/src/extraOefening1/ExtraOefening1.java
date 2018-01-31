package extraOefening1;

import java.util.Scanner;

public class ExtraOefening1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef in hoeveel getallen je wilt ingeven:");
		int aantal = keyboard.nextInt();
		int j;
		int temp;

		int[] getallen = new int[aantal];

		for (int i = 0; i < getallen.length; i++) {
			j = i + 1;
			System.out.println("Geef getal " + j + " in:");
			getallen[i] = keyboard.nextInt();
		}

		System.out.println("Originele array:");
		for (int k = 0; k < getallen.length; k++) {
			System.out.println(getallen[k]);
		}

		temp = getallen[0];
		for (int v = 0; v < getallen.length - 1; v++) {
			getallen[v] = getallen[v + 1];
		}
		getallen[getallen.length - 1] = temp;

		System.out.println("Nieuwe array:");
		for (int k = 0; k < getallen.length; k++) {
			System.out.println(getallen[k]);
		}

		keyboard.close();
	}

}
