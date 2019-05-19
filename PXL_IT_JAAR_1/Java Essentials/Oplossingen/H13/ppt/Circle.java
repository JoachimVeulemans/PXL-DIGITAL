package ppt;

import java.awt.Graphics;

public class Circle extends Shape implements Drawable{
	
	private int straal;
	
	public Circle (int x, int y, int straal) {
		super(x,y);
		this.straal = straal;
	}

	public int getStraal() {
		return straal;
	}

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
	
	
	//opdracht9: voer hoofdprogramma 1 keer uit met deze code en 1 keer zonder deze code
	@Override
	public String toString() {
		return "Circle [straal=" + straal + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}
	
	//opdracht10 punt3: voer hoofdprogramma 1 keer uit met deze code en 1 keer zonder deze code
	//o == null mag je niet weglaten want als o dan een referentie heeft naar null, dan wordt er een methode uitgevoerd op null en krijg je nullpointerexecption
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

	@Override
	public void scale(int s) {
		this.straal = this.straal * s;
		
	}

	@Override
	public void draw(Graphics g) {
		g.drawOval(this.getX(), this.getY(), straal, straal);
		
	}
	
	

}
