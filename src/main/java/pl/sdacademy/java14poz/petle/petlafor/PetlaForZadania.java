package pl.sdacademy.java14poz.petle.petlafor;

import pl.sdacademy.java14poz.sklep.User;

import java.util.ArrayList;
import java.util.List;

public class PetlaForZadania {

    public static void main(String[] args) {

        String[] names = {"Dawid", "Daniel", "Krzysztof", "Patryk", "Radek"};
        // wypisanie w petli for imion z tablicy imion
        for (String elementZTablicyImion : names) {
            System.out.print(elementZTablicyImion + ", ");
        }
        System.out.println();
        System.out.println("\n---------------------------------\n");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }

        System.out.println("\n---------------------------------\n");

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
        //System.out.println("Rozmiar listy wynosi: " + listaUzytkownikow.size());

        for (int i = 0; i < listaUzytkownikow.size(); i++) {
            System.out.println((i + 1) + ". " + listaUzytkownikow.get(i).getImie() + " " + listaUzytkownikow.get(i).getNazwisko());
        }
        System.out.println("\n---------------------------------\n");
        for (User user : listaUzytkownikow) {
            System.out.println("\tLp. " + (listaUzytkownikow.indexOf(user) + 1) + ". " + user.getImie() + " " + user.getNazwisko());
        }

    }

}
