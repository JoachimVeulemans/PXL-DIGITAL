package oefening3;

public class BankrekeningApp {

	public static void main(String[] args) {
		Bankrekening rekening1 = new Bankrekening();
		rekening1.stort(50);
		rekening1.setRekeningNummer("100-156161-215");
		rekening1.stort(50);
		rekening1.stort(50);
		rekening1.neemOp(10);
		rekening1.schrijfRenteBij();

		Bankrekening rekening2 = new Bankrekening("100-156461-515", "Jan Koekenpan", 100, 1.8);
		rekening1.stort(rekening2.getSaldo());
		rekening2.neemOp(rekening2.getSaldo());

	}

}
