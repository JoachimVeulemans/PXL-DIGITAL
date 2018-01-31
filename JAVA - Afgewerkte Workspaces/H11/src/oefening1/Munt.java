package oefening1;

public enum Munt {
	_2EURO(200), 
	_1EURO(100),
	_50CENT(50),
	_20CENT(20),
	_10CENT(10),
	_5CENT(5),
	_2CENT(2),
	_1CENT(1);
	
	private int waarde;
	
	private Munt(int waarde) {
		this.waarde = waarde;
	}

	public int getWaarde() {
		return waarde;
	}
}
