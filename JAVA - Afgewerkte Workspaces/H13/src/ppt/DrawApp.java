package ppt;

public class DrawApp {

	public static void main(String[] args) {
		Shape[] shape = new Shape[3];
		
		shape[0] = new Circle(5, 5, 7);
		shape[1] = new Rectangle(4, 2);
		shape[2] = new Triangle(5, 3, 4);
		
		for (int i = 0; i < shape.length; i++) {
			((Scaleable)shape[i]).scale(2);
			System.out.println(shape[i].toString());
		}
		
	}

}
