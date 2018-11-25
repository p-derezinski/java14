package pl.sdacademy.java14poz.listopad17;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz tekst:");
        String tekst = scanner.nextLine();
        char[] tablica = tekst.toCharArray();
        char ostatni = tablica[tablica.length - 1];
        int licznik = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == ostatni) {
                licznik++;
            }
        }
        System.out.println("Ostatni znak z wprowadzonego tekstu to '" + ostatni + "' i powtarza się " + licznik + " razy.");

    }

}
