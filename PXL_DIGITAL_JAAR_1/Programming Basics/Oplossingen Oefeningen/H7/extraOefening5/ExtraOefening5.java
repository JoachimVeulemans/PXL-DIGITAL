package extraOefening5;

public class ExtraOefening5 {

	public static void main(String[] args) {
		int[] [] mening = {{25,36,55,46,38},{35,45,54,65,1},{75,66,44,10,5},{23,33,45,50,49}};
		double gemiddelde = 0;
		double hoogst = 0;
		int nummer = 0;
		
		for (int rij = 0; rij < 4; rij++) {
			for (int kolom = 0; kolom < 5; kolom++) {
				gemiddelde = gemiddelde + (mening[rij] [kolom] * (kolom + 1));
			}
			gemiddelde = gemiddelde / 200;
			System.out.printf("Het gemiddelde voor vraag %d is %.2f\n",(rij + 1), gemiddelde);
			if (gemiddelde > hoogst) {
				hoogst = gemiddelde;
				nummer = (rij + 1);
			}
			gemiddelde = 0;
		}
		System.out.println("Het hoogst gewogen gemiddelde ligt bij vraag " + nummer + ".");
	}

}
