package extraOefening2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExtraOefening2Uitbreiding {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		StringBuilder totaal = new StringBuilder("");

		System.out.println("Geef een datum in volgens formaat MM/DD (meerdere datums scheiden door een spatie - mag op meerdere regels):");
		String input = keyboard.nextLine();
		
		while (!input.toLowerCase().equals("einde")) {
			totaal.append(input).append(" ");
			input = keyboard.nextLine();
		}
		
		int aantalPlaatsen = 0;
		for (int i = 0; i < totaal.toString().length(); i++) {
			if (totaal.charAt(i) == ' ') {
				aantalPlaatsen++;
			}
		}
		
		String[] rawDatums = new String[aantalPlaatsen];
		int beginPos = 0;
		int eindPos = 6;
		for (int i = 0; i < rawDatums.length; i++) {
			rawDatums[i] = totaal.substring(beginPos, eindPos);
			beginPos += 6;
			eindPos += 6;
		}
		
		LocalDate[] datums = new LocalDate[aantalPlaatsen];
		for (int i = 0; i < rawDatums.length; i++) {
			datums[i] = LocalDate.of(LocalDate.now().getYear(),  Integer.parseInt(rawDatums[i].substring(0, 2)), Integer.parseInt(rawDatums[i].substring(3, 5)));
		}

		for (int i = 0; i < datums.length; i++) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		System.out.println(datums[i].format(formatter) + ". Dit is dagnr " + datums[i].getDayOfYear() + ".");
		}
		
		keyboard.close();

	}

}
