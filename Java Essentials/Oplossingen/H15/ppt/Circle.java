package ppt;

/** Deze klasse is een Circle klasse om Circle-objecten aan te maken
* <pre>
* Circle circ= new Circle(10,5,4);
* </pre>
* @author Joachim
* @version 1.0
* @see ppt.Shape
*/
public class Circle extends Shape {
	
	private int straal;
	
	/**
	 * @param x De x-positie van de cirkel
	 * @param y De y-positie van de cirkel
	 * @param straal De straal van de cirkel
	 */
	public Circle (int x, int y, int straal) {
		super(x,y);
		this.straal = straal;
	}

	public int getStraal() {
		return straal;
	}

	/**
	 * @param straal Straal meegegeven wordt de straal van het cirkel-object
	 */
	public void setStraal(int straal) {
		this.straal = straal;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(straal, 2);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * straal;
	}
	//opdracht9
	@Override
	public String toString() {
		return "Circle [straal=" + straal + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}
	
	//opdracht10
	public boolean equals (Object o) {
		if (o == null) {
			return false;
		} else {
			if (o.getClass() != this.getClass()) {
				return false;
			} else {
				Circle oCircle = (Circle) o;
				if (oCircle.getX() == this.getX() && oCircle.getY() == this.getY()
					&& oCircle.getStraal() == this.getStraal()) {
						return true;
					} else {
						return false;
					}
				
			}
		}
	}

}
