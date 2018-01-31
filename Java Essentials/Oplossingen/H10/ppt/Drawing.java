package ppt;

public class Drawing {
	private Shape[] shapes;

	public Drawing(int aantal) {
		shapes = new Shape[aantal];
	}

	public void add(Shape s) {
		if (this.getFreeLocation() >= 0) {
			shapes[this.getFreeLocation()] = s;
		}
	}

	public boolean isPresent(Shape s) {
		for (int i = 0; i < shapes.length; i++) {
			if (s != null) {
				if (shapes[i].equals(s)) {
					return true;
				}
			}
		}
		return false;
	}

	private int getFreeLocation() {
		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i] == null) {
				return i;
			}
		}
		return -1;
	}

	public void remove(Shape s) {
		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i].equals(s)) {
				shapes[i] = null;
				 break;
			}
		}
	}

	public void clear() {
		for (int i = 0; i < shapes.length; i++) {
			shapes[i] = null;
		}
	}

	public void print() {
		for (int i = 0; i < shapes.length; i++) {
			if (this.isPresent(shapes[i])) {
				System.out.println(shapes[i].toString());
			}
		}
	}

}
