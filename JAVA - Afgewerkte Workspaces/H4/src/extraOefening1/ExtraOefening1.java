package extraOefening1;

import java.util.Scanner;

public class ExtraOefening1 {

	public static void main(String[] args) {
		int getal1, getal2, kleinstegetal, kwadraat;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een getal in:");
		getal1 = keyboard.nextInt();
		
		System.out.println("Geef een tweede getal in:");
		getal2 = keyboard.nextInt();
		
		if (getal1 < getal2) {
			kleinstegetal = getal1;				
		} else {
			kleinstegetal = getal2;
		}
		kwadraat = (kleinstegetal * kleinstegetal);	
		
		System.out.println("Het kleinste getal is " + kleinstegetal + ".");
		System.out.println("Het kwadraat van het kleinste getal is " + kwadraat + ".");
		
		keyboard.close();
	}

}