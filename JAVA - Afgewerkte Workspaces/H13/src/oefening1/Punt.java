package oefening1;

public class Punt {
	private int x;
	private int y;
	private static final int MAXIMUMGROOTTE = 99;

	public Punt(int x, int y) {
		this.setX(x);;
		this.setY(y);;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
		this.controleer();
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
		this.controleer();
	}

	public double berekenAfstand(Punt p) {
		return Math.sqrt(Math.pow((this.getX() - p.getX()), 2) + Math.pow((this.getY() - p.getY()), 2));
	}

	private void controleer() {
		if (this.x < 0) {
			this.x = 0;
		} else {
			if (this.x > Punt.MAXIMUMGROOTTE) {
				this.x = Punt.MAXIMUMGROOTTE;
			}
		}

		if (this.y < 0) {
			this.y = 0;
		} else {
			if (this.y > Punt.MAXIMUMGROOTTE) {
				this.y = Punt.MAXIMUMGROOTTE;
			}
		}
	}

	public void drukAf() {
		System.out.println("x = " + this.getX() + ", y = " + this.getY());
	}

	public static int getMaximumgrootte() {
		return MAXIMUMGROOTTE;
	}
	
	
}
