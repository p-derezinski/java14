package pl.sdacademy.java14poz.listopad17.zadanie6wyjatki;

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {

        int dzielnik = 0;
        int dzielna = 0;
        System.out.println("Podaj 1 liczbę do dzielenia: ");
        Scanner scanner = new Scanner(System.in);
        dzielna = scanner.nextInt();
        System.out.println("Podaj 2 liczbę do dzielenia: ");
        scanner = new Scanner(System.in);
        dzielnik = scanner.nextInt();

        int dzielenieWynik = 0;
        try {
            dzielenieWynik = podziel(dzielna, dzielnik);
        } catch (WyjatekDzieleniaPrzezZeroException e) {
            System.out.println(e.getMessage());
        } catch (Exception ex) {
            System.out.println("Nieznany błąd " + ex.getMessage());
        }
        System.out.println(dzielenieWynik);     // to można jeszcze objąć w blok finally

    }

    public static int podziel(int a, int b) throws WyjatekDzieleniaPrzezZeroException {
        if (b == 0) {
            throw new WyjatekDzieleniaPrzezZeroException("Ooo nieeeeee!!! dzielisz przez zero!");
        } else {
            return a / b;
        }
    }

}
