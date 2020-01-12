package ppt;

public class ShapeApp {

	public static void main(String[] args) {
		Circle cir1 = new Circle(10, 20, 50);
		cir1.setPosition(1, 5);
		System.out.printf("de opp is %.2f%n", cir1.getArea());
		System.out.printf("de omtrek is %.2f%n" , cir1.getPerimeter());

		System.out.println("aantal aangemaakte vormen : " + Shape.getAantal());
		
		System.out.println(cir1);
		System.out.println(cir1.toString());
		
		System.out.println(cir1.getClass());
		
		//opdracht10
		Circle cir2 = new Circle(1, 5, 50);
		System.out.println(cir1.equals(cir2));
		
		//opdracht11
		Shape [] shapes = new Shape[5];
		shapes[0] = cir1;
		shapes[1] = cir2;
		shapes[2] = new Rectangle(10,20,5,9);
		shapes[3] = new Rectangle(100,20,15,9);
		shapes[4] = new Triangle(5,20,30);
		
		for (Shape s : shapes) {
			System.out.printf("omtrek: %8.0f %5s oppervlakte: %8.0f %5s", s.getPerimeter(), " ", s.getArea(), " ");
			if (s instanceof Rectangle) {
				System.out.println("Rechthoek");
			} else {
				if (s instanceof Circle) {
					System.out.println("Cirkel");
				} else {
					System.out.println("Driehoek");
				}
			}
		}
		
	}

}
