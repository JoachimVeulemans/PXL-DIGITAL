package oefening5;

import java.awt.Point;
import java.awt.Rectangle;

public class Oefening5 {

	public static void main(String[] args) {
		int[] x = { 1, 1, 2, 4, 0 };
		int[] y = { 1, 0, 2, 1, 2 };

		Point[] punt = new Point[5];
		for (int i = 0; i < punt.length; i++) {
			punt[i] = new Point(x[i], y[i]);
		}

		Rectangle rect[] = new Rectangle[5];
		for (int i = 0; i < rect.length; i++) {
			rect[i] = new Rectangle(punt[i]);
			rect[i].setSize(1, 3);
		}

		for (int i = 0; i < rect.length; i++) {
			int rectNaam = i + 1;
			System.out.println("Rechthoek nummer " + rectNaam + ": x = " + (int) rect[i].getX() + " y = " + (int) rect[i].getY() + " h = " + (int) rect[i].getHeight() + " b = " + (int) rect[i].getWidth());
		}

		rect[4].setLocation(0, 0);
		rect[4].setSize(3, 2);

		for (int i = 0; i < rect.length; i++) {
			int rectNaam = i + 1;
			System.out.print("Rechthoek nummer " + rectNaam + " bevat:");
			for (int j = 0; j < rect.length; j++) {
				if (rect[i].contains((int) rect[j].getX(), (int) rect[j].getY())) {
					int puntNaam = j + 1;
					System.out.print(" punt nr " + puntNaam);
				}
			}
			System.out.println();
		}

		System.out.print("Rechthoeken die rechthoek nr 5 snijden:");
		for (int i = 0; i < (rect.length - 1); i++) {
			if (rect[i].intersects(rect[4])) {
				System.out.print(" rechthoek nr " + (i + 1));
			}
		}
	}

}
