package opdracht1;

import opdracht1.Pet;
import opdracht1.Owner;

public class Opdracht1 {

	public static void main(String[] args) {

		Owner owner1 = new Owner("Guido");
		Pet pet1 = new Pet("Blacky");
		owner1.setPet(pet1);

		System.out.println(owner1.pet1.getName());

		Owner owner2 = new Owner();
		owner2.setPet(pet1);

		owner2.pet1.setName("Jan");
		System.out.println(owner2.pet1.getName());

	}
}
