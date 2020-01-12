package ppt;

public class ShapeApp {

	public static void main(String[] args) {
		Circle c1 = new Circle(5, 8, 9);
		
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		
		System.out.println(c1);
		System.out.println(c1.toString());
		
		Circle c2 = new Circle(5, 8, 9);
		System.out.println(c1.equals(c2));
		
		System.out.println("*******************");
		
		Shape[] shapes = new Shape[5];
		shapes[0] = new Rectangle(7, 5);
		shapes[1] = new Rectangle(8, 5);
		shapes[2] = new Circle(8, 6, 2);
		shapes[3] = new Triangle();
		shapes[4] = new Triangle(5, 6, 1);
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.printf("omtrek: %8.0f\toppervlakte: %8.0f\t%s\n", shapes[i].getPerimeter(), shapes[i].getArea(), shapes[i].getNaam());
		}
		
	}

}
