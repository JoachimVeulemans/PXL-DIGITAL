package ppt;

import java.util.Scanner;

public class Opdracht2 {

	public static void main(String[] args) {
		String str = "abc";
		str = str.toUpperCase();
		System.out.println(str);

		// TEST MET NEXT
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef je familienaam:");
		String familienaam = keyboard.next();

		System.out.println("Geef je voornaam:");
		String voornaam = keyboard.next();

		System.out.println("De familienaam is " + familienaam);
		System.out.println("De voornaam is " + voornaam);

		// TEST MET NEXTLINE

		System.out.println("Geef je familienaam:");
		String familienaam2 = keyboard.nextLine();

		System.out.println("Geef je voornaam:");
		String voornaam2 = keyboard.nextLine();

		System.out.println("De familienaam is " + familienaam2);
		System.out.println("De voornaam is " + voornaam2);

		keyboard.close();
	}

}
