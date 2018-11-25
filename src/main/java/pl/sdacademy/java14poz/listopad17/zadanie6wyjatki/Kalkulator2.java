package pl.sdacademy.java14poz.listopad17.zadanie6wyjatki;

import java.util.Scanner;

public class Kalkulator2 {

    public static void main(String[] args) {

        int dzielnik = 0;
        int dzielna = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dzielną z zakresu od 20 do 50: ");
        dzielna = scanner.nextInt();
        try {
            zakresDzielnej(dzielna);
        } catch (WyjatekZakresuDzielnejException edzielna) {
            System.out.println(edzielna.getMessage());
        }


        System.out.println("Podaj dzielnik z zakresu od 0 do 5: ");
        scanner = new Scanner(System.in);
        dzielnik = scanner.nextInt();
        try {
            zakresDzielnika(dzielnik);
        } catch (WyjatekZakresuDzielnikaException edzielnik) {
            System.out.println(edzielnik.getMessage());
        }

        int dzielenieWynik = 0;
        try {
            dzielenieWynik = podziel(dzielna, dzielnik);
        } catch (WyjatekDzieleniaPrzezZeroException e) {
            System.out.println(e.getMessage());
        } catch (Exception ex) {
            System.out.println("Nieznany błąd " + ex.getMessage());
        } finally {
            System.out.println(dzielenieWynik);
        }

    }

    public static int podziel(int a, int b) throws WyjatekDzieleniaPrzezZeroException {
        if (b == 0) {
            throw new WyjatekDzieleniaPrzezZeroException("Ooo nieeeeee!!! dzielisz przez zero!");
        } else {
            return a / b;
        }
    }

    public static void zakresDzielnej(int dzielna) throws WyjatekZakresuDzielnejException {
        if (dzielna < 20 || dzielna > 50) {
            throw new WyjatekZakresuDzielnejException("Dzielna spoza zakresu od 20 do 50!");
        }
    }

    public static void zakresDzielnika(int dzielnik) throws WyjatekZakresuDzielnikaException {
        if (dzielnik < 0 || dzielnik > 5) {
            throw new WyjatekZakresuDzielnikaException("Dzielnik spoza zakresu od 0 do 5!");
        }
    }

}
