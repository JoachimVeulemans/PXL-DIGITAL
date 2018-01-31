package ppt;

public class Opdracht14c {

	public static void main(String[] args) {
		// 14C
		System.out.println("Opdracht 14c");
		for (int i = 400; i >= 350; i--) {
			System.out.println(i);
		}

		// 14D
		System.out.println("Opdracht 14d");
		for (int i = 7; i < 200; i += 7) {
			System.out.println(i);
		}

		// 14E
		System.out.println("Opdracht 14e");
		for (char i = 'z'; i >= 'a'; i--) {
			System.out.println(i);
		}

		// 14F
		System.out.println("Opdracht 14f");
		for (int i = -10; i <= 10; i++) {
			if (i > 0) {
				System.out.print("+");
			}
			System.out.println(i);
		}

		// 14G
		System.out.println("Opdracht 14g");
		for (int i = 0; i <= 10000; i++) {
			if (i % 6 == 0 && i % 28 == 0) {
				System.out.println(i);
			}
		}
	}

}
