package pl.sdacademy.java14poz.petle.petlafor;

import java.util.ArrayList;
import java.util.List;

public class PetlaForZadanie2 {

    public static void main(String[] args) {

        String[] names = {"Dawid", "Daniel", "Krzysztof", "Patryk", "Radek"};

        System.out.println("\n---------------------------------\n");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }

        System.out.println("\n---------------------------------\n");
        String litera = "d";
        System.out.println("Lista imion zawierających literę '" + litera + "':");
        for (int i = 0; i < names.length; i++) {
            if (names[i].toLowerCase().contains(litera)) {
                System.out.println("\t " + names[i]);
            }
        }

        System.out.println("\n---------------------------------\n");

        List<String> imiona = new ArrayList<>();
        imiona.add("Janusz");
        imiona.add("Julia");
        imiona.add("Małgosia");
        String litera2 = "j";
        System.out.println("Lista imion zawierających literę '" + litera2 + "':");
        for (int i = 0; i < imiona.size(); i++) {
            if (imiona.get(i).toLowerCase().contains(litera2)) {
                System.out.println("\t " + imiona.get(i));
            }
        }

        System.out.println("\n---------------------------------\n");
        String litera3 = "ł";
        System.out.println("Lista imion zawierających literę '" + litera3 + "':");
        for (String imie : imiona) {
            if (imie.toLowerCase().contains(litera3)) {
                System.out.println("\t " + imie);
            }
        }

        System.out.println("\n---------------------------------\n");
        String litera4 = "J";
        String litera5 = "a";
        System.out.println("Lista imion zaczynających się na literę '" + litera4 + "' i kończących się na literę '" + litera5 + "':");
        for (String imie : imiona) {
            if (imie.startsWith(litera4) && imie.endsWith(litera5)) {
                System.out.println("\t " + imie);
            }
        }


    }

}
