package ppt;

class Opdracht6 {
	private int height;
	private int width;

	public Opdracht6(int width, int height) throws RuntimeException {
		setHeight(height);
		setWidth(width);
	}

	public void setHeight(int height) throws RuntimeException {
		if (height < 0) {
			throw new RuntimeException("negative height");
		}
		this.height = height;
	}

	public void setWidth(int width) throws RuntimeException {
		if (width < 0) {
			throw new RuntimeException("negative width");
		}
		this.width = width;
	}
}