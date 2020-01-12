package ppt;

public abstract class Shape {
	private int x, y;
	private static int count = 0;
	
	{
		count++;
	}
	
	public Shape (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setPosition (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public static int getCount() {
		return count;
	}
	
	public String toString() {
		return "x: " + this.x + " y: " + this.y;
	}
	
	public String getNaam() {
		return "Shape";
	}
}
