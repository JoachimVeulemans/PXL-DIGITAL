package oefening5;

public class AutoApp {

	public static void main(String[] args) {
		Auto auto1 = new Auto();
		Auto auto2 = new Auto("Volvo", "V50", 2015, "Blauw", 170);
		Auto auto3 = new Auto();

		auto1.print();
		auto2.print();

		auto2.setMaxSnelheid(200);
		auto2.print();

		Auto[] autos = new Auto[3];
		autos[0] = auto1;
		autos[1] = auto2;
		autos[2] = auto3;
		System.out.println("---------------------");
		double procent = 0;
		double totaal = 0;
		for (int i = 0; i < autos.length; i++) {
			autos[i].print();
			if (autos[i].getMaxSnelheid() < Auto.getMax()) {
				procent += 1;
			}
			totaal += 1;
		}
		procent = (int) ((procent / totaal) * 1000) / 10.0;
		System.out.println(procent + "% behaald de maxsnelheid niet.");
		System.out.println(Auto.getCount() + " Objecten aangemaakt");
	}

}
