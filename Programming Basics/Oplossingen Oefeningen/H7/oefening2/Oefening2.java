package oefening2;

import java.util.Random;

public class Oefening2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] getallen = new int[500];
		long aantalGroter100 = 0;
		
		for (int i = 0; i < getallen.length; i++) {
			getallen[i] = rand.nextInt();
			if (getallen[i] > 100) {
				aantalGroter100 = aantalGroter100 + getallen[i];
			}
		}
		
		System.out.println("De som van de getallen boven de 100 is " + aantalGroter100);
		// Een in is te klein voor alle getallen, een long is wel groot genoeg		
		
	}

}
