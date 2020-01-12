package extraOefening2;

public class Tekening {
	public void tekenDriehoek(int grootte, char teken) {
		StringBuilder rij = new StringBuilder("");
		for (int i = 1; i <= grootte; i++) {
			rij.append(teken);
			System.out.printf("%" + grootte + "s\n", rij);

		}
	}

	public void tekenRechthoekVol(int breedte, int hoogte) {
		StringBuilder rij = new StringBuilder("");
		for (int i = 0; i < breedte; i++) {
			rij.append("* ");
		}
		for (int j = 0; j < hoogte; j++) {
			System.out.println(rij);
		}
	}

	public void tekenRechthoekLeeg(int breedte, int hoogte) {
		StringBuilder rij = new StringBuilder("");
		for (int j = 0; j < hoogte; j++) {

			if (j == 0 || j + 1 == hoogte) {
				for (int k = 0; k < breedte; k++) {
					rij.append("* ");
				}
			} else {

				for (int i = 0; i < breedte; i++) {

					if (i == 0 || i + 1 == breedte) {
						rij.append("* ");
					} else {
						rij.append("  ");
					}
				}
			}

			System.out.println(rij);
			rij = new StringBuilder("");

		}
	}
}
