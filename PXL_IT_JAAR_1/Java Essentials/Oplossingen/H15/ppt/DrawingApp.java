package ppt;

public class DrawingApp {

	public static void main(String[] args) {
		Drawing draw = new Drawing(5);
		Rectangle rect = new Rectangle(1,1,2,2);
		draw.add(rect);
		draw.add(new Rectangle(2,1,2,2));
		draw.add(new Rectangle(3,1,2,2));
		draw.add(new Rectangle(4,1,2,2));
		draw.add(rect);
		draw.add(new Rectangle(5,1,2,2));
		draw.add(new Rectangle(6,1,2,2));
		
		System.out.println("eerste afdruk");
		draw.print();
		
		draw.remove(rect);
		System.out.println("tweede afdruk");
		draw.print();
		
		draw.add(new Circle(10,20,30));
		System.out.println("derde afdruk");
		draw.print();

	}

}
