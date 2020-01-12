package be.pxl.vraag1;

/*
    Daan Vankerkom
    1 TIN J
 */
public class AppUitvoer {

    public static void main(String[] args) {

        Soldaat s = new Soldaat(20, 14, Land.LYONESSE);
        Soldaat s2 = new Soldaat(2, 4, Land.BLALOC);
        Landmijn b = new Landmijn(30);

        System.out.println(s);
        System.out.println(s2);
        s.interageer(s2);
        System.out.println(s);
        System.out.println(s2);


        System.out.println(b);
        s.interageer(b);
        System.out.println(s);
        System.out.println(b);

    }

}
