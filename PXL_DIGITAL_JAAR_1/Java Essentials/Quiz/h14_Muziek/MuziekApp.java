package h14_Muziek;

public class MuziekApp {
	public static void main(String[] args) {
		JazzLiefhebber ik = new JazzLiefhebber();
		try {
			ik.luister(Muziek.HOUSE);
		} catch (SlechteMuziekException e) {
			System.out.println(e.getMessage());
		}
	}
}