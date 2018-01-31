package oefening4;

import java.util.Scanner;

public class Oefening4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String nieuweString1, nieuweString2;
		String temp = "++++";

		System.out.println("Geef een string in:");
		String tekst1 = keyboard.nextLine();

		System.out.println("Geef een andere string in:");
		String tekst2 = keyboard.nextLine();

		nieuweString1 = tekst1.toUpperCase().concat("****").substring(0, 4);
		nieuweString2 = temp.concat(tekst2.toLowerCase());
		nieuweString2 = nieuweString2.substring((nieuweString2.length() - 4), nieuweString2.length());
		System.out.println("De nieuwe string is: " + nieuweString1 + nieuweString2);

		keyboard.close();
	}

}
