package be.pxl.h4.exoef2;

/*Extra oefening 2
 * 
 * Er worden 3 getallen ingelezen a, b en c. Als a+b kleiner 
 * is dan 20, moet c bij deze som geteld worden en moet dit resultaat
 * afgedrukt worden. Als a en b samen groter dan of gelijk zijn aan 20,
 * dan moet de tekst "te groot" afgedrukt worden.
 */
import java.util.Scanner;

public class H4ExOef2 {

	public static void main(String[] args) {
		//Aanmaken van Scanner en variabelen
		Scanner keyboard = new Scanner(System.in);
		int a, b, c, sum;
		
		//Input vragen aan de gebruiker
		System.out.println("Getal a: ");
		a = keyboard.nextInt();
		
		System.out.println("Getal b: ");
		b = keyboard.nextInt();
		
		System.out.println("Getal c: ");
		c = keyboard.nextInt();
		
		//optellen van a en b -> nodig voor de if test
		sum = a + b;
		
		
		if (sum < 20) {
			sum += c;
			System.out.println(sum);
		} else { //Moeten geen if test meer schrijven. Als de som niet groter is dan 20, kunnen we aannemen dat die ofwel gelijk is aan 20 of minder dan 20.
			System.out.println("Te groot");
		}
		
		keyboard.close();
	}
}
