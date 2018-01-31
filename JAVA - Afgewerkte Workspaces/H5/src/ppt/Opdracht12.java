package ppt;

public class Opdracht12 {
	public static void main(String[] args) {
		
	
	byte x = 3;

	switch(x) {
	case 1:
		System.out.println("Het getal is 1");
		break;
	case 2:
	case 3:
		System.out.println("Het getal is 2 of 3");
		break;
		default:
			System.out.println("Het getal is niet 1, 2 of 3");
	}
}
}
