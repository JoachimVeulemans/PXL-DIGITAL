package ppt;

public class Circle extends Shape {
	private double straal;

	public double getStraal() {
		return straal;
	}

	public void setStraal(double straal) {
		this.straal = straal;
	}

	public Circle(int x, int y, double straal) {
		super(x, y);
		this.straal = straal;
	}

	@Override
	public double getArea() {
		return ((int) (((2 * Math.PI * this.straal) + 0.5) * 100)) / 100.0;
	}

	@Override
	public double getPerimeter() {
		return ((int) ((Math.PI * Math.pow(this.straal, 2) * 100))) / 100.0;
	}

	@Override
	public String toString() {
		super.toString();
		return "Straal: " + this.straal;
	}

	public boolean equals(Object object2) {
		if (object2 != null && this.getClass() == object2.getClass() && this.straal == ((Circle) object2).straal && this.getX() == ((Circle) object2).getX()
				&& this.getY() == ((Circle) object2).getY()) {
			return true;
		} else {
			return false;
		}
	}

	public String getNaam() {
		return "Circle";
	}
}
