package be.pxl.vraag3;

import java.util.Scanner;

/*
    Daan Vankerkom
    1 TIN J
 */
public class VriendenApp {

    public static void main(String[] args) {

        VriendenGroep groep = new VriendenGroep();
        Scanner input = new Scanner(System.in);
        String inputNaam = "";
        int geboortedag, geboortemaand, geboortejaar;

        while (!inputNaam.equals("stop")) {
            System.out.println("Naam: ");
            inputNaam = input.next();

            if (inputNaam.equals("stop")) {
                break;// Jump out
            }

            System.out.println("Geboortedag: ");
            geboortedag = input.nextInt();

            System.out.println("Geboortemaand: ");
            geboortemaand = input.nextInt();

            System.out.println("Geboortejaar: ");
            geboortejaar = input.nextInt();

            Persoon nieuwPersoon = new Persoon(inputNaam, geboortedag, geboortemaand, geboortejaar);
            groep.voegVriendToe(nieuwPersoon);

        }

        input.close();

        System.out.println(groep);
    }

}
