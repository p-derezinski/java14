package pl.sdacademy.java14poz.tablice;

import pl.sdacademy.java14poz.sklep.User;

public class Tablice {

    public static void main(String[] args) {

        int[] tablicaLiczb = new int[10];
        tablicaLiczb[9] = 123;
        tablicaLiczb[0] = 0;
        //System.out.println(tablicaLiczb[9]);
//        wypiszElementTablicy(tablicaLiczb[9]);
//        System.out.println();
//        wypiszElementTablicy(0);
//        System.out.println();
//        wypiszElementTablicy(tablicaLiczb[0]);

        System.out.printf("Element %s tablicy to %s", 9, tablicaLiczb[9]); // ?????????????????????????????


        User[] tablicaUzytkownikow = new User[5];
        User user1 = new User("Jan", "Kowalski", 23);
        User user2 = new User("Adam", "Nowak", 30);
        User user3 = new User("Jacek", "Nowak", 30);
        tablicaUzytkownikow[0] = user1;
        tablicaUzytkownikow[1] = new User("Dawid", "Lewandowski", 34);
        tablicaUzytkownikow[2] = user2;
        tablicaUzytkownikow[4] = user3;

        System.out.println("\n" + tablicaUzytkownikow[2].getImie() + " " + tablicaUzytkownikow[2].getNazwisko());
        User uzytkownik = tablicaUzytkownikow[4];
        System.out.println(uzytkownik);

        //System.out.println("Imię uzytkownika %s to %s, a jego nazwisko to %s", tablicaUzytkownikow); // ???????

        User[] tablicaUzytkownikow2 = {user1, user2, user3};
        System.out.println(tablicaUzytkownikow2[1].getImie() + " " + tablicaUzytkownikow2[1].getNazwisko());

    }

    private static void wypiszElementTablicy(int indeksElementu) {
        System.out.printf("Element %s tablicy to %s", 9, indeksElementu);
    }

}
