package extraOefening18;

public class ExtraOefening18 {

	public static void main(String[] args) {
		int getal1 = 1;
		int getal2 = 1;

		System.out.print(getal1 + " ");
		System.out.print(getal2 + " ");
		
		while ((getal1 + getal2) < 1501) {
			getal1 = (getal2 + getal1);
			System.out.print(getal1 + " ");
			getal2 = (getal1 + getal2);
			System.out.print(getal2 + " ");
		}
	}
}