package ppt;

public class RectangleApp {

	public static void main(String[] args) {
		System.out.println("This program uses a rectangle");
		Rectangle rect = new Rectangle();
		rect.width = 10;
		rect.height = 5;
		rect.x = 2;
		rect.y = 6;
		System.out.println(rect.width);
		System.out.println(rect.height);
		System.out.println(rect.x + ":" + rect.y);

		Rectangle rect2 = new Rectangle();
		rect2.width = 10;
		rect2.height = 5;
		rect2.x = 2;
		rect2.y = 6;
		System.out.println(rect2.width);
		System.out.println(rect2.height);
		System.out.println(rect2.x + ":" + rect2.y);

		rect.getArea();
		rect.getPerimeter();

		rect.grow(-100, -100);
		rect.getArea();
		rect.grow(100);

	}

}
