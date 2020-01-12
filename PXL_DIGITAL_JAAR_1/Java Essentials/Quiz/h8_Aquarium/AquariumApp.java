package h8_Aquarium;

public class AquariumApp {
	public static void main(String[] args) {
		Aquarium kleinAquarium = new Aquarium(5);
		Aquarium grootAquarium = new Aquarium(37);
		
		System.out.println(Aquarium.getAantal());
	}
}
