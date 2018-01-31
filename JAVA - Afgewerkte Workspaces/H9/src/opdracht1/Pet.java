package opdracht1;

public class Pet {

	private String name;

	public Pet(String naam) {
		this.name = naam;
	}

	public Pet() {
		this(null);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String n) {
		this.name = n;
	}
}
