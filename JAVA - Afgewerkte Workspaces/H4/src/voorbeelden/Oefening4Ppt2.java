package voorbeelden;

public class Oefening4Ppt2 {

	public static void main(String[] args) {
		
		for (int count = 1; count < 5; count++) {
			System.out.println(count);
		}
		
		System.out.println("-----");
		
		int count1 = 1;
		while (count1 < 5) {
			System.out.println(count1);
			count1++;
		}
		
		System.out.println("-----");
		
		int count2 = 1;
		do {
			System.out.println(count2);
			count2++;
		} while (count2 < 5);
	}

}
