package oefening2;

class Oefening2 {
	public static void main(String args[]) {
		try {
			int getal1 = 0, getal2 = 0;
			char bewerking = '+';
			boolean fout = false;
			int result = 0;

			getal1 = Integer.parseInt(args[0]);
			getal2 = Integer.parseInt(args[1]);
			bewerking = args[2].charAt(0);
			switch (bewerking) {
			case '+':
				result = getal1 + getal2;
				break;
			case '-':
				result = getal1 - getal2;
				break;
			case '/':
				result = getal1 / getal2;
				break;
			case 'x':
				result = getal1 * getal2;
				break;
			default:
				fout = true;
			}
			if (!fout)
				System.out.println(getal1 + " " + bewerking + " " + getal2 + " = " + result);
			else
				System.out.println("Foute bewerking!");
		} catch (NumberFormatException ex) {
			System.out.println("Geen getal meegegeven!");
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Te weinig argumenten meegegeven!");
		} catch (ArithmeticException ex) {
			System.out.println("Deling door 0 niet mogelijk!");
		}

	}
}