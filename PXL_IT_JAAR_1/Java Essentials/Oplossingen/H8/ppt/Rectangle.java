package ppt;

public class Rectangle {
	protected int width;
	protected int height;
	protected int x;
	protected int y;

	public Rectangle() {
		this(5, 5);
	}

	public Rectangle(int hoogte, int breedte) {
		this(hoogte, breedte, 0, 0);
	}

	public Rectangle(int hoogte, int breedte, int x, int y) {
		this.height = hoogte;
		this.width = breedte;
		this.x = x;
		this.y = y;
		if (this.height < 0) {
			this.height = -this.height;
		}
		if (this.width < 0) {
			this.width = -this.width;
		}
		if (this.x < 0) {
			this.x = -this.x;
		}
		if (this.y < 0) {
			this.y = -this.y;
		}

		System.out.print("hoogte: " + this.height + " breedte: " + this.width);
		System.out.println("x: " + this.x + " y: " + this.y);
	}

	public Rectangle(Rectangle rectangle) {
		this(rectangle.height, rectangle.width, rectangle.x, rectangle.y);
	}

	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setWidth(int width) {
		this.width = width;
		if (this.width < 0) {
			this.width = -this.width;
		}
	}

	public void setHeight(int height) {
		this.height = height;
		if (this.height < 0) {
			this.height = -this.height;
		}
	}

	public void grow(int dw, int dh) {
		this.setHeight((this.height + dh));
		this.setWidth(this.width + dw);
	}

	public void grow(int grow) {
		this.setHeight((this.height + grow));
		this.setWidth(this.width + grow);
	}

	public void getArea() {
		int opp = this.width * this.height;
		System.out.println(opp);
	}

	public void getPerimeter() {
		int per = (this.width * 2) + (this.height * 2);
		System.out.println(per);
	}
}
