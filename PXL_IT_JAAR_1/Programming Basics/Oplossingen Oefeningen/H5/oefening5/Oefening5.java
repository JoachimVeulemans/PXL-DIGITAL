package oefening5;

import java.util.Scanner;

public class Oefening5 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int aantalEuro, aantal20;
		float rest;
		
		System.out.println("Geef een bedrag in euro's in:");
		aantalEuro = keyboard.nextInt();
		
		aantal20 = (aantalEuro / 20);
		rest = aantalEuro % 20; //rest = (aantalEuro - (20 * aantal20));
		if (aantal20 == 1) {
			System.out.println("Het bedrag kan opgedeeld worden in " + aantal20 + " briefje van 20 en €" + rest);		
		} else {	
			System.out.println("Het bedrag kan opgedeeld worden in " + aantal20 + " briefjes van 20 en €" + rest);
		}
		keyboard.close();
	}
}
