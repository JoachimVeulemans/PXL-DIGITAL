package vraag1;

public class Bestelling implements Berekenbaar {
	Product[] bestelling = new Product[100];
	private static int productnummer = 1000;

	public Bestelling() {

	}

	public void voegProductToe(Product product) {
		int count = 0;
		for (int i = 0; i < bestelling.length; i++) {
			if (bestelling[i] != null && bestelling[i].equals(product)) {
				count++;
			}
		}

		if (count != 0) {
			System.out.println("Het product is reeds toegevoegd.");
		} else {
			for (int i = 0; i < bestelling.length; i++) {
				if (bestelling[i] == null) {
					bestelling[i] = product;
					bestelling[i].setProductNummer(productnummer);
					productnummer++;
					i = bestelling.length;
				}
			}
		}
	}

	public void verwijderProduct(int productNummer) {
		int count = 0;
		for (int i = 0; i < bestelling.length; i++) {
			if (bestelling[i] != null && bestelling[i].getProductNummer() == productNummer) {
				bestelling[i] = null;
				count++;
			}
		}

		if (count == 0) {
			System.out.println("Product met productnummer " + productNummer + " is niet gevonden in de bestelling.");
		} else {
			System.out.println("Product met productnummer " + productNummer + " werd verwijderd.");
		}
	}

	public void toonLijst() {
		for (int i = 0; i < bestelling.length; i++) {
			if (bestelling[i] != null) {
				System.out.println(bestelling[i].toString());
			}
		}
	}

	public void toonPerMerk(String merk) {
		for (int i = 0; i < bestelling.length; i++) {
			if (bestelling[i] != null && bestelling[i].getMerk().equals(merk)) {
				System.out.println(bestelling[i].toString());
			}
		}
	}

	public void toonParfums() {
		for (int i = 0; i < bestelling.length; i++) {
			if (bestelling[i] != null && bestelling[i] instanceof Parfum) {
				System.out.println(bestelling[i].toString());
			}
		}
	}

	public double getAantalProducten() {
		int count = 0;
		for (int i = 0; i < bestelling.length; i++) {
			if (bestelling[i] != null) {
				count++;
			}
		}
		return count;
	}

	@Override
	public double totalePrijs() {
		double totaal = 0;
		for (int i = 0; i < bestelling.length; i++) {
			if (bestelling[i] != null) {
				totaal += bestelling[i].getPrijs();
			}
		}
		return totaal;
	}
}
