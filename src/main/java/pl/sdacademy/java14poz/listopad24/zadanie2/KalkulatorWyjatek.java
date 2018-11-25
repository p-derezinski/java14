package pl.sdacademy.java14poz.listopad24.zadanie2;

import java.util.Scanner;

public class KalkulatorWyjatek {

    public static void main(String[] args) {

        int x = 2;
        int y = 10;
        int test = x + y;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();
        int wynik = 0;
        try {
            wynik = a / b;
            System.out.println("Udało się obliczyć");
            System.out.println(wynik);
        } catch (ArithmeticException ex) {
            System.out.println("Nie dziel przez 0!");
        }
        System.out.println("Koniec programu");

    }

}
