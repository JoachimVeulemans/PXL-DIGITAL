package extraOefening4;

public class ExtraOefening4 {

	public static void main(String[] args) {
		StringBuilder tekst = new StringBuilder();
		char teken;

		for (teken = 'a'; teken <= 'z'; teken++) {
			tekst.append(teken);
		}

		System.out.println(tekst);

		teken = 'B';
		for (int count = 1; count <= 25; count += 2) {
			tekst.setCharAt(count, teken);
			teken += 2;
		}
		System.out.println(tekst);

		String tekst2 = tekst.toString().replaceAll("H", "X");
		System.out.println(tekst2);
	}

}
