package pl.sdacademy.java14poz.scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerZadania {

    public static void main(String[] args) {

//        String napis = "Tekst";
//        // System.out - systemowe wyjscie, czyli konsola
//        // System.in - systemowe wejscie, czyli np. klawiatura
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Wpisz imię: ");
//        String imie = scanner.nextLine();
//
//        System.out.printf("Twoje imię to %s", imie);
//        scanner.close();

        Scanner skaner = new Scanner(System.in);
        List<String> listaImion = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Wprowadź imię numer " + (i + 1) + ": ");
            listaImion.add(skaner.nextLine());
            // System.out.printf("Wprowadzono imie %s", imie);       -    ale trzeba by przypisywac wprowadzone imie do zmiennej imie
            // System.out.println();
        }

        System.out.println("Wprowadzono następujące imiona:");
        int lp = 1;
        for (String imie : listaImion) {
            System.out.println(lp + " - " + imie);
            lp++;
        }

    }

}
