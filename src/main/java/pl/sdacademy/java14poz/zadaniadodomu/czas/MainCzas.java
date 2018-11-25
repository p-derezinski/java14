package pl.sdacademy.java14poz.zadaniadodomu.czas;

public class MainCzas {

    public static void main(String[] args) {

        Czas czas1 = new Czas(2, 15);
        Czas czas2 = new Czas(0, 0);
        Czas czas3 = new Czas(1, 7);
        Czas czas4 = new Czas(1, 60);
        Czas czas5 = new Czas(0, 85);
        Czas czas6 = new Czas(2, 90);
        System.out.println(czas1);
        System.out.println(czas2);
        System.out.println(czas3);
        System.out.println(czas4);
        System.out.println(czas5);
        System.out.println(czas6);

        Czas czas7 = czas1.dodaj(czas3);
        Czas czas8 = czas4.dodaj(czas6);
        System.out.println(czas7);
        System.out.println(czas8);

        Czas czas9 = czas4.odejmij(czas3);
        Czas czas10 = czas1.odejmij(czas5);
        Czas czas11 = czas3.odejmij(czas6);
        System.out.println(czas9);
        System.out.println(czas10);
        System.out.println(czas11);

        Czas czas12 = czas3.pomnoz(3);
        Czas czas13 = czas5.pomnoz(2);
        System.out.println(czas12);
        System.out.println(czas13);

    }

}
