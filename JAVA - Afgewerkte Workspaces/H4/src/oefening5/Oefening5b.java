package oefening5;

import java.util.Scanner;

public class Oefening5b {
	public static void main(String[] args) {
		int gewicht, gewichtprintln, count;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef het gewicht in:");
		gewicht = keyboard.nextInt();
		
		System.out.println("Aantal appels:\tGewicht:");
		count = 1;
		while (count < 101) {
			gewichtprintln = (count * gewicht);
			System.out.println(count + "\t\t" + gewichtprintln);
			count++;
		}
		keyboard.close();
	}
}
