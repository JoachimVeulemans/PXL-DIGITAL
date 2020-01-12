package ppt;

import java.util.Scanner;

public class Opdracht1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een getal in:");
		String waarde = keyboard.nextLine();
		
		Integer waardeInt = Integer.parseInt(waarde);
		
		waardeInt += 5;
		
		System.out.println(waardeInt);
		System.out.println("Bits: " + Integer.BYTES);
		System.out.println("Bytes: " + Integer.BYTES * 8);
		
		keyboard.close();
	}

}
