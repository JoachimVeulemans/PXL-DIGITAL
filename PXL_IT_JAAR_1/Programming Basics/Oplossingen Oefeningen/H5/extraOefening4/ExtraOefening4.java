package extraOefening4;

import java.util.Scanner;

public class ExtraOefening4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double a, b, c, wisselVariabele;

		System.out.println("Geef een getal a in:");
		a = keyboard.nextDouble();

		System.out.println("Geef een getal b in:");
		b = keyboard.nextDouble();

		System.out.println("Geef een getal c in:");
		c = keyboard.nextDouble();

		wisselVariabele = b;
		b = a;
		a = c;
		c = wisselVariabele;

		System.out.println("a is " + a + ", b is " + b + " en c is " + c + ".");

		keyboard.close();
	}
}