package oefening1;

public class Manager extends Werknemer {
	private double bonus;
	private static int count = 0;

	{
		count++;
	}

	public Manager(String naam, String voornaam, String functie, double salaris) {
		this(naam, voornaam, functie, salaris, 50);
	}

	public Manager(String naam, String voornaam, String functie, double salaris, double bonus) {
		super(naam, voornaam, functie, salaris);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double getSalaris() {
		return super.getSalaris() + this.bonus;
	}

	public static int getAantal() {
		return count;
	}

	public double getProcAandeelManagers() {
		double procent = (double) Manager.getAantal() / Werknemer.getAantal();
		procent = ((int) (procent * 10000)) / 100.0;
		return procent;
	}
}
