package ppt;

import java.awt.Graphics;

public class Rectangle extends Shape implements Drawable {

	private int width;
	private int height;
	public static final int ANGLES;
	private static int count;

	static {
		count = 0;
		ANGLES = 4;
	}

	{
		count++;
	}

	public Rectangle() {
		this(0, 0, 0, 0);
	}

	public Rectangle(int width, int height) {
		this(width, height, 0, 0);
	}

	public Rectangle(int width, int height, int x, int y) {
		super(x, y);
		setWidth(width);
		setHeight(height);
	}

	public Rectangle(Rectangle rect) {
		this(rect.width, rect.height, rect.getX(), rect.getY());
	}

	public void setWidth(int width) {
	   if (width < 0) {
			this.width = -width;
		} else {
			this.width = width;
		}
   }


	public int getWidth() {
		return width;
	}

	public void setHeight(int height) {
		if (height < 0) {
			this.height = -height;
		} else {
			this.height = height;
		}
	}

	public int getHeight() {
		return height;
	}

	public void grow(int dw, int dh) {
		width += dw;
		height += dh;
		if (width < 0)
			width = 0;
		if (height < 0)
			height = 0;
	}

	public void grow(int d) {
		grow(d, d);
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return (width + height) * 2;
	}

	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return String.format("Rectangle [width=%s, height=%s, x=%s, y=%s]", width, height, getX(), getY());
	}

	
	@Override
	public boolean equals(Object obj) {
		if (obj != null && this.getClass() == obj.getClass() && ((Rectangle) obj).getX() == this.getX()
				&& ((Rectangle) obj).getY() == this.getY() && ((Rectangle) obj).getHeight() == this.getHeight()
				&& ((Rectangle) obj).getWidth() == this.getWidth()) {
			return true;
		} else {
			return false;
		}

	}
	
	@Override
	public void scale(int s) {
		this.height = this.height * (s);
		
	}

	@Override
	public void draw(Graphics g) {
		g.drawRect(this.getX(), this.getY(), width, height);;
		
	}
}
