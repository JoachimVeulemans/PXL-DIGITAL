package oefening2;

import java.util.Scanner;

public class Oefening2 {
	public static void main(String[] args) {
		int aantal;
		float prijs, prijsBTW;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hoeveel artikel wilt u bestellen?");
		aantal = keyboard.nextInt();
		
		prijs = (11.5F * aantal);
		prijsBTW = ((0.21F * prijs) + prijs);
		
		System.out.println("De prijs zonder BTW bedraagt €" + prijs);
		System.out.println("De BTW bedraagt 21%");
		System.out.println("De prijs met BTW bedraagt €" + prijsBTW);
						
		
		keyboard.close();
	}
}
