package ppt;

public class Opdracht3 {

	public static void main(String[] args) {
		String tekst = "Wij zijn de fantastische studenten van 1TINA";

		int lengte = tekst.length();
		System.out.println("De tekst is " + tekst);
		System.out.println("De lengte is " + lengte);

		tekst = tekst.toUpperCase();
		System.out.println(tekst);

		tekst = tekst.toLowerCase();
		System.out.println(tekst);

		tekst = tekst.replace('a', 'o');
		System.out.println(tekst);

		// Aantal 'e's in de tekst
		int tel = 0;
		for (int i = 0; i < tekst.length(); i++) {
			if (tekst.charAt(i) == 'e') {
				tel++;
			}
		}
		System.out.println(tel);

		tekst = "Zoë";
		String tekst2 = "Annemarie";

		if (tekst == tekst2) { // KIJKT ALLEEN OF DE GEHEUGENPLAATS HETZELFDE IS!!
			System.out.println("Gelijk");
		} else {
			System.out.println("Niet gelijk");
		}

		if (tekst.equals(tekst2)) { // CORRECT!
			System.out.println("Gelijk");
		} else {
			System.out.println("Niet gelijk");
		}

		if (tekst.compareTo(tekst2) < 0) { // Is tekst kleiner dan tekst2? -> Negatief getal!
			System.out.println(tekst + " < " + tekst2);
		} else {
			System.out.println(tekst2 + " < " + tekst);
		}

		tekst = "          nu de tekst          ";
		tekst = tekst.trim();
		System.out.println(tekst + "!");

		// naam samenvoegen
		String voornaam = "jEf";
		String familienaam = "VaN den BoSSChe";

		String naam = voornaam.charAt(0) + ""; // + "" toevoegen zorgt ervoor dat het een string wordt
		naam = naam.toUpperCase() + ". ";
		naam = naam + familienaam.substring(0, 1).toUpperCase();
		naam = naam + familienaam.substring(1).toLowerCase();
		System.out.println(naam);

		tekst = "java";
		String midden;
		if (tekst.length() % 2 == 1) { // Oneven aantal tekens
			midden = tekst.charAt(tekst.length() / 2) + "";
		} else {
			midden = tekst.substring((tekst.length() / 2) - 1, tekst.length() / 2 + 1);
		}
		System.out.println(midden);
	}

}
