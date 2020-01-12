package oefening2;

public class TreinReis extends Reis {
	private boolean nationaal;
	private String specificatie;
	private String[] specificatiesBinnenland = { "IC", "IR", "L", "P" };

	public TreinReis(String bestemming) {
		this(bestemming, 0, true, "IC");
	}

	public TreinReis(String bestemming, double prijs, boolean nationaal, String spec) {
		super(bestemming, prijs);
		this.nationaal = nationaal;
		this.specificatie = spec;
	}

	public String getSpecificatie() {
		return specificatie;
	}

	public void setSpecificatie(String specificatie) {
		this.specificatie = specificatie;
		if (this.nationaal) {
			int count = 0;
			for (int i = 0; i < specificatiesBinnenland.length; i++) {
				if (this.specificatie.equals(specificatiesBinnenland[i])) {
					count++;
					i = 10000000;
				}
			}
			if (count == 0) {
				this.specificatie = specificatiesBinnenland[0];
			}
		}
	}

	public void print() {
		String nat;
		super.print();
		if (nationaal) {
			nat = "nationale";
		} else {
			nat = "internationale";
		}
		System.out.println(nat + " treinreis (" + this.specificatie + ")");
	}

}
