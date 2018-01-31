package oefening2;

public class GeboekteReis {
	private String naam;
	private static int aantalReizen;
	private Reis[] reizen;
	private static int count = 0;

	public GeboekteReis(String naam, int aantal) {
		this.naam = naam;
		GeboekteReis.aantalReizen = aantal;
		reizen = new Reis[aantalReizen];
	}

	public void voegReisToe(Reis reis) {
		if (GeboekteReis.count < GeboekteReis.aantalReizen) {
			reizen[GeboekteReis.count] = reis;
			GeboekteReis.count++;
		}
	}

	public void print() {
		System.out.println("Reis van " + this.naam);
		for (int i = 0; i < reizen.length; i++) {
			if (reizen[i] != null) {
				System.out.println("==> reis " + (i + 1) + " ");
				reizen[i].print();
			}
		}
		System.out.println("Deze persoon moet " + (GeboekteReis.aantalReizen - 1) + " keer overstappen");

	}
}
