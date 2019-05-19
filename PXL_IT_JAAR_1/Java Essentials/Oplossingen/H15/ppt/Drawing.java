package ppt;

public class Drawing {

	private Shape[] shapes;

	public Drawing(int grootte) {
		shapes = new Shape[grootte];
	}

	public void add(Shape s) {
		if (!isPresent(s)) {
			if (getFreeLocation() != -1) {
				shapes[getFreeLocation()] = s;
			} else {
				System.out.println("de array is vol");
			}
		}
	}

	private int getFreeLocation() {
		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i] == null) {
				return i;
			}
		}
		return -1;
	}

	private boolean isPresent(Shape s) {
		for (int i = 0; i < shapes.length; i++) {
			if (s.equals(shapes[i])) {
				return true;
			}
		}
		return false;
	}

	public void remove(Shape s) {
		for (int i = 0; i < shapes.length; i++) {
			if (s.equals(shapes[i])) {
				shapes[i] = null;
				i = shapes.length;
			}
		}
	}

	public void clear() {
		int grootte = shapes.length;
		shapes = new Shape[grootte];
	}

	public void print() {
		for (Shape s : shapes) {
			if (s != null)
				System.out.println(s.toString());
		}
	}
}
