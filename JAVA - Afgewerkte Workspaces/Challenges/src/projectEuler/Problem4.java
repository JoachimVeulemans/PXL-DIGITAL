package projectEuler;

public class Problem4 {

	public static void main(String[] args) {
		int uitkomst;
		int groot = 0;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				uitkomst = j * i;
				StringBuilder tekst = new StringBuilder(Integer.toString(uitkomst));
				StringBuilder tekst2 = new StringBuilder(Integer.toString(uitkomst));
				if (tekst.reverse().toString().equals(tekst2.toString())) {
					if (uitkomst > groot) {
					System.out.println(groot);
					groot = uitkomst;
					}
				}
			}
		}
		System.out.println(groot);
	}

}
