package be.pxl.h4.exoef3;

public class H4ExOef3 {
	public static void main(String[] args) {
		//Aanmaken van variabelen
		int getal, kwadraat;
		
		//Berekenen van getal, kwadraat en 100 maal printen.
		for (int i = 0; i < 100; i++) {
			getal = i + 1;
			kwadraat = getal * getal; //Normaal maken we gebruik van de math klasse
			System.out.println("Getal : " + getal + " | Kwadraat : " + kwadraat);
		}
	}

}
