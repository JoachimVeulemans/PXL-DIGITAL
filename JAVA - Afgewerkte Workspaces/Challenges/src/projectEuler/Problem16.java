package projectEuler;

import java.math.BigInteger;

public class Problem16 {

	public static void main(String[] args) {

		int uitkomst = 0;
		
		BigInteger bigInt = new BigInteger("2");
		BigInteger bigInt2 = new BigInteger("2");
		BigInteger bigIn = new BigInteger("1000");
		BigInteger bigI = new BigInteger("0");
		
		while (!bigI.equals(bigIn)) {
			bigInt = bigInt.multiply(bigInt2);
			bigI = bigI.add(BigInteger.ONE);
			System.out.println(bigI);
		}
		
		System.out.println(bigInt);
		String test = bigInt.toString();
		
		for (int i = 0; i < test.length(); i++) {
			uitkomst += Integer.parseInt(test.substring(i, i + 1));
		}
		
		System.out.println(uitkomst);
		
	}

}
