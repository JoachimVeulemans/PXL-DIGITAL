package oefening4;

public class BerekeningApp {

	public static void main(String[] args) {
		Bewerkingen bewerking = new Bewerkingen();

		bewerking.trekAf(5.64, 8.87);
		bewerking.trekAf(5, 8);
		bewerking.telOp(8556, -544);
		bewerking.telOp(8648.56484, 5645.4, -545, -5487, 8484);
		bewerking.deel(5, 8);
		bewerking.faculteit(-20);

	}

}
