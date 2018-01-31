package oefening5;

import java.util.Scanner;

public class Oefening5 {
	public static void main(String[] args) {
		int gewicht, gewichtprintln;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef het gewicht in:");
		gewicht = keyboard.nextInt();
		
		System.out.println("Aantal appels:\tGewicht:");
		
		for (int count = 1; count < 101; count++) {
			gewichtprintln = (count * gewicht);
			System.out.println(count + "\t\t" + gewichtprintln);
			
		}
		keyboard.close();
	}
}
