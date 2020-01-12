package ppt;

import java.math.BigInteger;

public class Opdracht3 {

	public static void main(String[] args) {
		
		int getal = 5;
		int totaal = 1;
		for (int i = 1; i <= getal; i++) {
			totaal *= i;
		}
		System.out.println(totaal);
		
		getal = 5;
		BigInteger bigTotaal = new BigInteger("1");
		BigInteger maal;
		
		for (int i = getal; i > 0; i--) {
			maal = new BigInteger(Integer.toString(i));
			bigTotaal = bigTotaal.multiply(maal);
		}
		
		System.out.println(bigTotaal);
		
	}

}
