package ppt;

import java.awt.Graphics;

public class Drawing implements Drawable {

	private Shape[] shapes;

	// opdracht12 punt2
	public Drawing(int grootte) {
		shapes = new Shape[grootte];
	}

	// opdracht12 punt3
	public void add(Shape s) {
		if (!isPresent(s)) {
			if (getFreeLocation() != -1) {
				shapes[getFreeLocation()] = s;
			} else {
				System.out.println("de array is vol");
			}
		}
	}

	// opdracht12 punt3 // als return statement ==> method wordt afgebroken
	private int getFreeLocation() {
		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i] == null) {
				return i;
			}
		}
		return -1;
	}

	// opdracht12 punt3 // shapes[i].equals(s): kan niet omdat je geen enkele
	// methode kan toepassen op null en shape[i] is wel gedeclareerd maar kan
	// mogelijks geen waarde hebben
	// hetgeen voor de equals staat moet bestaan dus mag geen referentie hebben naar
	// null; Shape kan in dit geval leeg zijn
	private boolean isPresent(Shape s) {
		for (int i = 0; i < shapes.length; i++) {
			if (s.equals(shapes[i])) {
				return true;
			}
		}
		return false;
	}

	// opdracht12 punt4
	public void remove(Shape s) {
		for (int i = 0; i < shapes.length; i++) {
			if (s.equals(shapes[i])) {
				shapes[i] = null;
				i = shapes.length;
			}
		}
	}

	// opdracht12 punt5
	public void clear() {
		int grootte = shapes.length;
		shapes = new Shape[grootte];
	}

	// opdracht12 punt6
	public void print() {
		for (Shape s : shapes) {
			if (s != null)
				System.out.println(s.toString());
		}
	}

	@Override
	public void scale(int s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub

	}

	public int getSize() {
		return shapes.length;
	}

}