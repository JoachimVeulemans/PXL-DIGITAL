package extraOefening2;

import java.util.Scanner;

public class ExtraOefening2 {

	public static void main(String[] args) {
		int a, b, c, som;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een getal in:");
		a = keyboard.nextInt();
		
		System.out.println("Geef een tweede getal in:");
		b = keyboard.nextInt();
		
		System.out.println("Geef een derde getal in:");
		c = keyboard.nextInt();
		
		if ((a + b) < 20) {
			som = (a + b + c);
			System.out.println("De som is " + som + ".");
		} else {
			System.out.println("Te groot!");
		}
		
		keyboard.close();
	}

}