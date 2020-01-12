package oefening1;

import java.util.Scanner;

public class Oefening1 {

	public static void main(String[] args) {
		int bedragBEF;
		double bedragEURO;
		
		Scanner keyboard = new Scanner(System.in);
				
		System.out.println("Geef een bedrag in BEF in:");
		bedragBEF = keyboard.nextInt();
		
		bedragEURO = (bedragBEF / 40.3399);
		
		System.out.println(bedragBEF + " BEF = € " + bedragEURO + ".");
		
		keyboard.close();	
		
	}

}
