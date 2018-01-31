package ppt;

public class OpdrachtOverloading {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 2;

		int som = berekenSom(a, b);
		int som2 = berekenSom(a, b, c);

		System.out.println("De eerste som is " + som + ".");
		System.out.println("De tweede som is " + som2 + ".");
		
		getalDruk(9);
		getalDruk(5);
	}

	public static int berekenSom(int a, int b) {
		return a + b;
	}

	public static int berekenSom(int a, int b, int c) {
		return a + b + c;
	}
	
	public static void getalDruk(int getal) {
		for (int i = 1; i <= getal; i++) {
			System.out.print(getal);
		}
		System.out.println("");
	}
}
