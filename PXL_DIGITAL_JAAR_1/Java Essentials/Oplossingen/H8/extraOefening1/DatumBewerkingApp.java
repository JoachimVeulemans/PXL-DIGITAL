package extraOefening1;

public class DatumBewerkingApp {

	public static void main(String[] args) {
		DatumBewerkingen datum1 = new DatumBewerkingen();
		datum1.setDag(31);
		datum1.setMaand(12);
		datum1.setJaar(2017);
		datum1.printDatum(datum1.getDag(), datum1.getMaand(), datum1.getJaar());
		datum1.dagVanHetJaar(datum1.getDag(), datum1.getMaand(), datum1.getJaar());
		datum1.rangschikData(5, 4, 1998, 3, 4, 1956);
		datum1.rangschikData(5, 4, 1950, 3, 4, 1956);
		datum1.rangschikData(5, 4, 2000, 3, 4, 2000);
		datum1.rangschikData(5, 5, 2000, 3, 4, 2000);
		datum1.rangschikData(5, 4, 2000, 3, 3, 2000);
		datum1.rangschikData(1, 4, 2000, 3, 4, 2000);

	}

}
