package oefening3;

import java.time.LocalDate;

public class HuwelijkApp {

	public static void main(String[] args) {

		LocalDate datum1 = LocalDate.now();
		System.out.println(datum1.getDayOfMonth());
		LocalDate datum2 = LocalDate.of(datum1.getYear(), datum1.getMonth(), datum1.getDayOfMonth());

		Gemeente gem = new Gemeente(555555, "hE78rk-7dE-Stad");
		System.out.println(gem.toString());

		Adres adres = new Adres("kerkstraat", "12b", 3290, "Diest");
		adres.getGemeente().setGemNaam("Sharphill");
		System.out.println(adres.toString());

		Persoon persoon1 = new Persoon();
		Persoon persoon2 = new Persoon();
		persoon1.getAdres().getGemeente().setGemNaam("Leuven");

		System.out.println(persoon1.toString());
		System.out.println(persoon2.toString());

		Huwelijk huwelijk1 = new Huwelijk(persoon1, persoon2, 17, 5, 2015);
		huwelijk1.getHuwelijksdatum().getYear();
		System.out.println(huwelijk1.getPersoon1().toString());
		huwelijk1.adresWijziging("straatje", "22", 3270, "Bekkevoort");
		huwelijk1.print();
	}

}
