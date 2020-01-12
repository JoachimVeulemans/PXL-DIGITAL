package oefening2;

import java.util.Random;

public class Oefening2 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int aantalGetallen = 10;
		int minimumWaarde = 5;
		int maximumWaarde = -9;
		
		System.out.println("aantal getallen: " + aantalGetallen);
		if (minimumWaarde > maximumWaarde) {
			int temp = minimumWaarde;
			minimumWaarde = maximumWaarde;
			maximumWaarde = temp;
			System.out.println("kleinste getal (na wisseling) : " + minimumWaarde);
			System.out.println("grootste getal (na wisseling) : " + maximumWaarde);
		} else {
			System.out.println("kleinste getal : " + minimumWaarde);
			System.out.println("grootste getal : " + maximumWaarde);
		}
		
		Integer[] tabel = new Integer[aantalGetallen];
		for (int i = 0; i < aantalGetallen; i++) {
			tabel[i] = rand.nextInt(maximumWaarde - minimumWaarde + 1) + minimumWaarde;
		}
		
		double gemiddelde = 0;
		for (int i = 0; i < aantalGetallen; i++) {
			System.out.println(tabel[i]);
			gemiddelde += tabel[i];
		}
		
		gemiddelde = (gemiddelde / (double)aantalGetallen);
		System.out.printf("Het gemiddelde is %.2f", gemiddelde);
	}

}
