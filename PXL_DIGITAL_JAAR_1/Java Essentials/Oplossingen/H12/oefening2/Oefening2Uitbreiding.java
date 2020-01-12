package oefening2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class Oefening2Uitbreiding {

	public static void main(String[] args) {
		Random rand = new Random();

		double aantalGetallen = 10;
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

		BigInteger[] tabel = new BigInteger[(int) aantalGetallen];
		for (int i = 0; i < aantalGetallen; i++) {
			tabel[i] = new BigInteger(Integer.toString(rand.nextInt((maximumWaarde - minimumWaarde + 1) + minimumWaarde)));
			tabel[i] = tabel[i].multiply(new BigInteger("999999999999"));
		}

		BigInteger totaal = new BigInteger("0");
		for (int i = 0; i < aantalGetallen; i++) {
			System.out.println(tabel[i]);
			totaal = totaal.add(tabel[i]);
		}

		BigDecimal gemiddelde = new BigDecimal(totaal).divide(new BigDecimal(Integer.toString((int) aantalGetallen)));
		System.out.println("Het gemiddelde is " + gemiddelde);
	}
}
