package extraOefening11;

public class ExtraOefening11 {

	public static void main(String[] args) {
		double celsius, fahrenheit;

		System.out.println("Graden Celsius \t Graden Fahrenheit");

		for (celsius = -40; celsius < 101; celsius += 10) {
			fahrenheit = ((((double) 9 / 5) * celsius) + 32);
			System.out.println("\t" + (int) celsius + "\t\t" + (int) fahrenheit);
		}
	}

}
