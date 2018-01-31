package projectEuler;

public class Problem6 {

	public static void main(String[] args) {
		int som1 = 0;
		int som2 = 0;
		int verschil;
		
		for (int grondtal = 1; grondtal < 101; grondtal++) {
			som1 += grondtal * grondtal;
			som2 += grondtal;
		}
		som2 *= som2;
		verschil = som2 - som1;
		
		System.out.println(verschil);
	}

}
