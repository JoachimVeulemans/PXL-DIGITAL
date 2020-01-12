package h13_Interfaces;

public class Wall implements Measurable{
	private int height;
	private int length;
	
	public Wall(int height, int length) {
		this.height = height;
		this.length = length;
	}
	
	@Override
	public int measure() {
		return height * length;
	}

}
