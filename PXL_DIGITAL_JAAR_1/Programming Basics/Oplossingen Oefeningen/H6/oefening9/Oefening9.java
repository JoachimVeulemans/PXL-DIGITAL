package oefening9;

import java.awt.Rectangle;
import java.util.Random;

public class Oefening9 {

	public static void main(String[] args) {
		Random rand = new Random();
		Rectangle rect = new Rectangle();
		Rectangle rectTemplate = new Rectangle(0, 0, 100, 100);
		String geplaatst;
		StringBuilder volgnummers = new StringBuilder();

		int grootsteX = 0;
		int grootsteY = 0;
		int grootsteBreedte = 0;
		int grootsteHoogte = 0;
		int grootsteRechthoek = 0;
		int x = 0;
		int y = 0;
		int hoogte = 0;
		int breedte = 0;
		geplaatst = "";

		System.out.println("Gemaakte rechthoeken:");
		System.out.printf("%20s %20s %20s %20s\n", "x", "y", "breedte", "hoogte");

		for (int count = 0; count < 20; count++) {
			x = rand.nextInt(100);
			y = rand.nextInt(100);
			hoogte = rand.nextInt(70) + 1;
			breedte = rand.nextInt(70) + 1;

			rect.setBounds(x, y, breedte, hoogte);
			if (rectTemplate.contains(rect)) {
				geplaatst = "geplaatst";
				volgnummers = volgnummers.append("rechthoek " + count + " is toegevoegd\n");
			} else {
				geplaatst = "";
			}

			if (hoogte * breedte > grootsteRechthoek) {
				grootsteX = x;
				grootsteY = y;
				grootsteBreedte = breedte;
				grootsteHoogte = hoogte;
				grootsteRechthoek = hoogte * breedte;
			}
			System.out.printf("%20d %20d %20d %20d %s\n", x, y, breedte, hoogte, geplaatst);
		}

		System.out.println(volgnummers);
		System.out.println("De grootste geplaatste rechthoek: xy = " + grootsteX + "-" + grootsteY + " , breedte = " + grootsteBreedte + " , hoogte = " + grootsteHoogte);

	}

}
