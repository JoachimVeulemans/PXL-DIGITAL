package opdracht1;

import opdracht1.Pet;

public class Owner {

	private String name;
	Pet pet1;

	public Owner() {
		this(null);
	}

	public Owner(String naam) {
		this.name = naam;
	}

	public Pet getPet() {
		return pet1;
	}

	public void setPet(Pet p) {
		pet1 = p;
	}

	public String getName() {
		return this.name;
	}
}
