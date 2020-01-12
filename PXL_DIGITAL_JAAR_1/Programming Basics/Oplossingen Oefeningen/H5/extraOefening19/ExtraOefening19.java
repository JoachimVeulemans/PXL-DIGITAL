package extraOefening19;

public class ExtraOefening19 {

	public static void main(String[] args) {

		long uitkomst = 0;
		int grondtal = 1;
		int exponent = 2;
		long tussenUitkomst;
		System.out.print("De uitkomst van ");

		for (int count = 1; count < 13; count++) {

			tussenUitkomst = grondtal;

			for (int count2 = 1; count2 < exponent; count2++) {
				tussenUitkomst = tussenUitkomst * grondtal;
			}
			uitkomst = tussenUitkomst;

			if (count == 12) {
				System.out.print(grondtal + "^" + exponent);
			} else {
				System.out.print(grondtal + "^" + exponent + " + ");
			}

			grondtal += 2;
			exponent++;
		}
		System.out.println(" = " + uitkomst + ".");
		System.out.println("De uitkomst is eigenlijk 5,11510735 .10^17, dit is niet hetzelde door overflow.");
	}

}
