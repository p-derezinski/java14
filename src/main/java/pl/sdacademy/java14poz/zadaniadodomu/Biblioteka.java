package pl.sdacademy.java14poz.zadaniadodomu;

import java.util.ArrayList;

public class Biblioteka {

    public static void main(String[] args) {

        ArrayList<Ksiazka> dostepneKsiazki = new ArrayList<Ksiazka>();
        ArrayList<Ksiazka> wypozyczoneneKsiazki = new ArrayList<Ksiazka>();

        Ksiazka ksiazka1 = new Ksiazka("Krzyżacy", "Henryk Sienkiewicz", 2004);
        Ksiazka ksiazka2 = new Ksiazka("Pan Tadeusz", "Adam Mickiewicz", 1995);
        Ksiazka ksiazka3 = new Ksiazka("Makbet", "Szekspir", 2010);
        Ksiazka ksiazka4 = new Ksiazka("Jądro ciemności", "Joseph Conrad", 2003);
        Ksiazka ksiazka5 = new Ksiazka("Zbrodnia i kara", "Fiodor Dostojewski", 1992);
        Ksiazka ksiazka6 = new Ksiazka("Historia pszczoł", "Maja Lunde", 2016);
        dostepneKsiazki.add(ksiazka1);
        dostepneKsiazki.add(ksiazka2);
        dostepneKsiazki.add(ksiazka3);
        dostepneKsiazki.add(ksiazka4);
        dostepneKsiazki.add(ksiazka5);
        dostepneKsiazki.add(ksiazka6);

        System.out.println("Testowanie metody .toString()");
        System.out.println(ksiazka1);
        System.out.println();

//        System.out.println(czyKsiazkaDostepna("Makbet", dostepneKsiazki));

        System.out.print("Czy książka \"Lalka\" jest dostepna? - ");
        System.out.println(czyKsiazkaDostepna("Lalka", dostepneKsiazki));
        System.out.print("Czy książka \"Pan Tadeusz\" jest dostepna? - ");
        System.out.println(czyKsiazkaDostepna("Pan Tadeusz", dostepneKsiazki));
        wyswietlDostepneKsiazki(dostepneKsiazki);
        wyswietlWypozyczoneKsiazki(wypozyczoneneKsiazki);
        wypozyczKsiazke("Pan Tadeusz", dostepneKsiazki, wypozyczoneneKsiazki);
        System.out.print("Czy książka \"Pan Tadeusz\" jest dostepna? - ");
        System.out.println(czyKsiazkaDostepna("Pan Tadeusz", dostepneKsiazki));
        wyswietlDostepneKsiazki(dostepneKsiazki);
        wyswietlWypozyczoneKsiazki(wypozyczoneneKsiazki);

    }

    public static boolean czyKsiazkaDostepna(String tytulKsiazki, ArrayList<Ksiazka> listaKsiazek) {
        for (int i = 0; i < listaKsiazek.size(); i++) {
            Ksiazka sprawdzanaKsiazka = listaKsiazek.get(i);
            String sprawdzanyTytul = sprawdzanaKsiazka.getTytul();
            if (tytulKsiazki == sprawdzanyTytul) {
                return true;
            }
        }
        return false;
    }

    public static Ksiazka wypozyczKsiazke(String tytulKsiazki, ArrayList<Ksiazka> listaKsiazekDost, ArrayList<Ksiazka> listaKsiazekWyp) {
        for (int i = 0; i < listaKsiazekDost.size(); i++) {
            Ksiazka wypozyczanaKsiazka = listaKsiazekDost.get(i);
            String sprawdzanyTytul = wypozyczanaKsiazka.getTytul();
            if (tytulKsiazki == sprawdzanyTytul) {
                listaKsiazekDost.remove(i);
                listaKsiazekWyp.add(wypozyczanaKsiazka);
                System.out.println("\"" + tytulKsiazki + "\" został wypożyczony");
                return wypozyczanaKsiazka;
            }
        }
        return null;
    }

    public static void wyswietlDostepneKsiazki(ArrayList<Ksiazka> listaKsiazekDost) {
        System.out.println("Lista dostepnych książek:");
        if (listaKsiazekDost.isEmpty()) {
            System.out.println("\tBrak dostępnych książek");
        } else {
            for (int i = 0; i < listaKsiazekDost.size(); i++) {
                String tytul = listaKsiazekDost.get(i).getTytul();
                System.out.println("\t" + (i + 1) + ". \"" + tytul + "\"");
            }
        }
    }

    public static void wyswietlWypozyczoneKsiazki(ArrayList<Ksiazka> listaKsiazekWyp) {
        System.out.println("Lista wypożyczonych książek:");
        if (listaKsiazekWyp.isEmpty()) {
            System.out.println("\tŻadna książka nie jest obecnie wypożyczona");
        } else {
            for (int i = 0; i < listaKsiazekWyp.size(); i++) {
                String tytul = listaKsiazekWyp.get(i).getTytul();
                System.out.println("\t" + (i + 1) + ". \"" + tytul + "\"");
            }
        }
    }

}
