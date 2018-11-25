package pl.sdacademy.java14poz.kolekcje.listy;

import pl.sdacademy.java14poz.sklep.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListyZadania {

    public static void main(String[] args) {

        List listaLiczb = new ArrayList();
        // uwaga! - domyslnie powstaje takie cos: List<Object> lista = new ArrayList<Object>();
        listaLiczb.add(5);
        listaLiczb.add(4);
        listaLiczb.remove(0);
        listaLiczb.size();
        System.out.println("Rozmiar listy wynosi: " + listaLiczb.size());
        System.out.println(listaLiczb.get(0));

        // interfejs jest taki sam (List), ale sa dwie rozne implementacje
        List zamowieniaArray = new ArrayList();
        List zamowieniaLinked = new LinkedList();

        zamowieniaArray.size();
        zamowieniaLinked.size();

        System.out.println("\n-----------------------------");

        List<User> listaUzytkownikow = new ArrayList<User>();
        User user1 = new User("Jola", "Wesola", 50);
        User user2 = new User("Jan", "Kowalski", 23);
        User user3 = new User("Adam", "Nowak", 30);
        User user4 = new User("Jacek", "Nowak", 30);
        User user5 = new User("Dawid", "Smith", 35);
        listaUzytkownikow.add(user1);
        listaUzytkownikow.add(user2);
        listaUzytkownikow.add(user3);
        listaUzytkownikow.add(user4);
        listaUzytkownikow.add(user5);
        listaUzytkownikow.add(new User("Tomek", "Obama", 45));
        System.out.println("Rozmiar listy wynosi: " + listaUzytkownikow.size());

    }

}
