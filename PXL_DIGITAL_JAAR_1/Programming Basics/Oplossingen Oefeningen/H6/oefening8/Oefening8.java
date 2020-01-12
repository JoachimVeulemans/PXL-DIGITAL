package oefening8;

import java.awt.Point;
import java.awt.Rectangle;

public class Oefening8 {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(1, 2, 20, 30);
		Point punt = new Point(5, 5);

		if (rect.contains(punt)) {
			System.out.println("punt ligt in rect.");
		} else {
			System.out.println("punt ligt niet in rect.");
		}
		
		punt.translate(40, 50);
		
		Rectangle rect2 = new Rectangle(punt);
		rect2.setSize(100, 110);
				
		System.out.println("X: " + rect2.x + " en Y: " + rect2.y);
		
		if (rect2.contains(1, 2, 100, 110)) {
			System.out.println("rect ligt in rect2.");
		} else {
			System.out.println("rect ligt niet in rect2.");
		}
		
		rect.grow(20, 40); // Voegt 20 en 40 toe, boven en onderaan (aka links en rechts)!!
		
		if (rect.getHeight() == rect2.getHeight()) {
			System.out.println("rect heeft dezelfde hoogte als rect2.");
		} else {
			System.out.println("rect heeft niet dezelfde hoogte als rect2.");
		}

	}

}
