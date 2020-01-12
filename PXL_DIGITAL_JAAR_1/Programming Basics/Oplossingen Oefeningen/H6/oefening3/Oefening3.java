package oefening3;

import java.util.Scanner;

public class Oefening3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een string in:");
		String tekst = keyboard.nextLine();
		
		StringBuilder tekstBuilder = new StringBuilder(tekst);
		tekstBuilder.reverse();
		
		System.out.println(tekstBuilder);
		
		keyboard.close();
	}

}
