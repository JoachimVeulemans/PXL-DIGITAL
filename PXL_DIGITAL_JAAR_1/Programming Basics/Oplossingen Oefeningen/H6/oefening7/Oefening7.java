package oefening7;

import java.awt.Point;

public class Oefening7 {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setLocation(5, 8);
		Point p2 = new Point(p1);

		System.out.println("De inhoud van p1 en p2 zijn hetzelfde: " + p1.equals(p2));
		System.out.print("Het object p1 en p2 zijn hetzelde: ");
		System.out.println(p1 == p2);

		p2.translate(2, 3);

		System.out.println("De x en y voor p1 zijn: " + p1.getX() + "_" + p1.getY());
		System.out.println("De x en y voor p2 zijn: " + p2.getX() + "_" + p2.getY());

	}

}
