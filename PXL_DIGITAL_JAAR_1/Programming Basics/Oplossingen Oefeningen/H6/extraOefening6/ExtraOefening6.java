package extraOefening6;

import java.util.Scanner;

public class ExtraOefening6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een productcode in:");
		String code = keyboard.nextLine();

		while (berekenCode(code) != "") {
			System.out.println(berekenCode(code));
			System.out.println("Geef een andere productcode in:");
			code = keyboard.nextLine();
		}

		System.out.println("De ingevoerde code is correct!");

		keyboard.close();
	}

	public static String berekenCode(String code) {
		String correct = "";

		if (code.length() == 8) {
			correct = correct.concat("De code heeft niet de juiste lengte!\n");
		}
		if (!(code.substring(0, 1).toLowerCase().equals("l") || code.substring(0, 1).toLowerCase().equals("r"))) {
			correct = correct.concat("De code begint niet met een l, L, r of R\n");
		}

		if (!(code.substring(code.length() - 2, code.length()).equals("bo") || code.substring(code.length() - 2, code.length()).equals("on"))) {
			correct = correct.concat("De code eindigt niet correct met 'bo' of 'on'!");
		}

		return correct;
	}

}
