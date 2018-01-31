package oefening1;

import java.util.Scanner;

public class Oefening1 {

	public static void main(String[] args) {
		int volwassenen, kinderen, som;

		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef het aantal volwassenen in:");
		volwassenen = keyboard.nextInt();
		
		System.out.println("Geef het aantal kinderen in:");
		kinderen = keyboard.nextInt();
		
		som = (volwassenen * 28) + (kinderen * 15);
		System.out.println("De som is " + som + " euro.");
		
		keyboard.close();
	}

}