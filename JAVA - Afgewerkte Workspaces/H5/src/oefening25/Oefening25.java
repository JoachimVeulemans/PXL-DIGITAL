package oefening25;

import java.util.Scanner;

public class Oefening25 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int geslacht;
		double lengte, gewicht;
		double gemLengteVro = 0;
		double KleinsteLengteMan = 5;
		int aantalVro = 0;
		int aantalOvergewicht = 0;
		int aantalPersonen = 0;

		geslacht = invoerControle();

		while (geslacht != 2) {
			System.out.println("Geef je lengte in:");
			lengte = keyboard.nextDouble();

			System.out.println("Geef je gewicht in:");
			gewicht = keyboard.nextDouble();

			if (geslacht == 0) {
				aantalVro++;
				gemLengteVro = gemLengteVro + lengte;
			} else {
				if (lengte < KleinsteLengteMan) {
					KleinsteLengteMan = lengte;
				}
			}

			int BMI = berekeningBMI(lengte, gewicht);
			System.out.println("Jouw BMI is " + BMI + ".");

			if (BMI >= 27) {
				aantalOvergewicht++;
			}

			aantalPersonen++;
			geslacht = invoerControle();
		}

		aantalOvergewicht = (int)(((double)aantalOvergewicht / aantalPersonen) * 100);
		System.out.println("Het aantal procent van de personen die te zwaar zijn is " + aantalOvergewicht + "%.");
		

		if (aantalVro > 0) {
			gemLengteVro = gemLengteVro / aantalVro;
			System.out.println("Gemiddelde lengte van de vrouwen is: " + gemLengteVro + "m.");
		} else {
			System.out.println("Er zijn geen vrouwen ingegeven.");
		}

		if (KleinsteLengteMan < 5) {
			System.out.println("Kleinste lengte van de mannen is: " + KleinsteLengteMan + "m.");
		} else {
			System.out.println("Er zijn geen mannen ingegeven.");
		}

		keyboard.close();
	}

	public static int berekeningBMI(double lengte, double gewicht) {
		int BMI;

		BMI = (int) (gewicht / (lengte * lengte));

		if (BMI < 18) {
			System.out.println("Ondergewicht");
		} else {
			if (BMI < 25) {
				System.out.println("Normaal gewicht");
			} else {
				if (BMI < 27) {
					System.out.println("Neiging tot overgewicht");
				} else {
					if (BMI < 30) {
						System.out.println("Overgewicht");
					} else {
						if (BMI < 40) {
							System.out.println("Zwaarlijvigheid (obesitas)");
						} else {
							System.out.println("Ernstige zwaarlijvigheid");
						}
					}
				}
			}
		}

		return BMI;
	}

	public static int invoerControle() {
		Scanner keyboard2 = new Scanner(System.in);

		System.out.println("Geef je geslacht in, vrouw (0), man (1), STOP (2):");
		int geslacht;
		geslacht = keyboard2.nextInt();
		while (geslacht < 0 || geslacht > 2) {
			System.out.println("Foutief geslacht ingegeven!");
			System.out.println("Geef je geslacht in, vrouw (0), man (1), STOP (2):");
			geslacht = keyboard2.nextInt();
		}
		return geslacht;
		
	}
}
