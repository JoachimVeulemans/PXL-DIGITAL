package oefening2;

public class TijdstipApp {

	public static void main(String[] args) {
		Tijdstip tijd = new Tijdstip(121);
		Tijdstip tijd1 = new Tijdstip(20,30,40);
		System.out.print(tijd1.getUren());
		System.out.print(":" + tijd1.getMinuten());
		System.out.println(":" + tijd1.getSeconden());
		tijd1.voegSecondenToe(60);
		System.out.print(tijd1.getUren());
		System.out.print(":" + tijd1.getMinuten());
		System.out.println(":" + tijd1.getSeconden());
		System.out.println("****************");
		
		Tijdstip[] tijdstipArray = new Tijdstip[2];

		tijdstipArray[0] = tijd;
		tijdstipArray[1] = tijd1;

		System.out.println(tijd.getSeconden());
		System.out.println(tijd.getMinuten());
		System.out.println(tijd.getUren());
		System.out.println(tijd.toStringTijd(true));
		System.out.println(tijd.toStringTechnisch());

		tijd1.setSeconden(18121);

		System.out.println(tijd1.getSeconden());
		System.out.println(tijd1.getMinuten());
		System.out.println(tijd1.getUren());
		System.out.println(tijd1.toStringTijd(true));

		tijd.voegSecondenToe(86399);

		System.out.println(tijd.getSeconden());
		System.out.println(tijd.getMinuten());
		System.out.println(tijd.getUren());
		System.out.println(tijd.toStringTijd(false));
		System.out.println(tijd.toStringTijd(true));
		System.out.println(tijd.toStringTechnisch());

		for (int i = 0; i < tijdstipArray.length; i++) {
			System.out.println(tijdstipArray[i].toStringTechnisch());
		}

	}

}
