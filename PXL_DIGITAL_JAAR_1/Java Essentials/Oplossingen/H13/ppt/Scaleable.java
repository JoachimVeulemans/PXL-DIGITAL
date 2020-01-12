package ppt;

public interface Scaleable {
	int QUARTER = 25;
	int HALF = 50;
	int DOUBLE = 200;
	
	public void scale(int s);
	public default void scaleDouble() {
		scale(DOUBLE);
	}
	public default void scaleHalf() {
		scale(HALF);
	}
}
