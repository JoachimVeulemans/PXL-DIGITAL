package ppt;

public class Opdracht2 {

	public static void main(String[] args) {
		System.out.println("min.value = " + Integer.MIN_VALUE);
		System.out.println("max.value = " + Integer.MAX_VALUE);

		Integer iObj = new Integer("1234567");
		Integer jObj = new Integer(1234567);

		System.out.println("waarden van de integer objecten vergeleken : " + iObj.equals(jObj));

		System.out.println("referenties vergeleken : " + (iObj == jObj));

		System.out.println("int-waarden vergeleken met constante: " + (iObj.intValue() == 1234567));
		// Vergelijkt de waarde in een int van Integer met een int.

		System.out.println("int-waarden vd objecten vergeleken : " + (iObj.intValue() == jObj.intValue()));
		// Vergelijkt de waarde in een int van Integer met de waarde in een int van Integer.

		int k = -45;
		Integer kObj = new Integer(k);
		System.out.println(k);
		System.out.println(kObj.toString());
		// Geeft de waarde van de int in de Integer terug.
		System.out.println(Integer.toString(k));
		// Geeft de waarde van de int in de Integer k terug.
		System.out.println(Integer.toString(k, 2));

		System.out.println(Integer.toBinaryString(k));
		// Geeft de waarde van de int in de Integer k terug in binair formaat.
		System.out.println(Integer.toHexString(k));
		// Geeft de waarde van de int in de Integer k terug in hexadecimaal formaat.
		System.out.println(Integer.toString(k, 16));
	}

}
