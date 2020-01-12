package ppt;

public abstract class Shape {

	private int x, y;
	private static int aantal;

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
		aantal++;
	}

	public void setPosition(int x, int y) {
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

	public static int getAantal() {
		return aantal;
	}

}
