package ppt;

public class DrawingApp {

	public static void main(String[] args) {
		Drawing d1 = new Drawing(2);
		Circle c1 = new Circle(5, 8, 9);
		Rectangle r1 = new Rectangle(8, 5);
		Triangle t1 = new Triangle();
		
		d1.add(c1);
		d1.add(r1);
		d1.add(t1);
		
		d1.print();
		System.out.println(d1.isPresent(c1));
		d1.remove(c1);
		
	}

}
