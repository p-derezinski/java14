package pl.sdacademy.java14poz.zadaniadodomu;

import java.util.Scanner;

public class StatystykiSlow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz tekst:");
        String tekst = scanner.nextLine();
        statystykiSlow(tekst);
        //wypiszElementyTablicy(tablica);
    }

    public static void wypiszElementyTablicy(String[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
    }

    public static void statystykiSlow(String tekst) {
        System.out.println("-->  Statystyki użytych słów  <--");
        String[] tablica = tekst.split("\\s");
        System.out.println("Ilość użytych słów: " + iloscSlow(tablica));
        System.out.println("Srednia długość słowa (średnia ilość liter): " + String.format("%.3f", sredniaDlugosc(tablica)));
        System.out.println("Najczęstsze słowo: " + najczestszeSlowo(tablica));
        System.out.println("Narzadsze słowo: " + najrzadszeSlowo(tablica));
    }

    public static int iloscSlow(String[] tablica) {
        return tablica.length;
    }

    public static double sredniaDlugosc(String[] tablica) {
        int sumaZnakow = 0;
        for (int i = 0; i < tablica.length; i++) {
            sumaZnakow += tablica[i].length();
        }
        return (double) sumaZnakow / iloscSlow(tablica);
    }

    public static String najczestszeSlowo(String[] tablica) {
        String najczestszeSlowo = tablica[0];
        int iloscWystapien = 1;
        for (int i = 0; i < tablica.length; i++) {
            int counter = 0;
            for (int j = 0; j < tablica.length; j++) {
                if (tablica[i].equals(tablica[j])) {
                    counter++;
                }
            }
            if (counter > iloscWystapien) {
                najczestszeSlowo = tablica[i];
                iloscWystapien = counter;
            }
        }
        return najczestszeSlowo;
    }

    public static String najrzadszeSlowo(String[] tablica) {
        String najrzadszeSlowo = tablica[0];
        int iloscWystapien = 1;
        for (int i = 1; i < tablica.length; i++) {
            if (tablica[i].equals(najrzadszeSlowo)) {
                iloscWystapien++;
            }
        }
        for (int i = 1; i < tablica.length; i++) {
            int counter = 0;
            for (int j = 1; j < tablica.length; j++) {
                if (tablica[i].equals(tablica[j])) {
                    counter++;
                }
            }
            if (counter < iloscWystapien) {
                najrzadszeSlowo = tablica[i];
                iloscWystapien = counter;
            }
        }
        return najrzadszeSlowo;
    }

}
