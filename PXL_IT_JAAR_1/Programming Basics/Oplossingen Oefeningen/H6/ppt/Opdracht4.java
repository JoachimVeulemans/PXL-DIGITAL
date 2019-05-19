package ppt;

public class Opdracht4 {

	public static void main(String[] args) {
		StringBuilder tekst = new StringBuilder("Het is maandag\nde week begint weer!");
		System.out.println(tekst);
		tekst.append("\nmaar volgende week is het vakantie!");
		System.out.println(tekst);
		
		tekst.reverse();
		System.out.println(tekst);
		
		String hulp = tekst.toString().replace(" ", "");
		tekst = new StringBuilder(hulp);
		System.out.println(tekst);
		
		tekst = new StringBuilder(tekst.toString().replace("t", "tt"));
		System.out.println(tekst);
	}

}
