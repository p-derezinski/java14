package pl.sdacademy.java14poz.zadaniadodomu;

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        double liczba1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Wybierz działanie:\n\t- dodawanie - wciśnij +\n\t- odejmowanie - wciśnij -" +
                "\n\t- mnożenie - wciśnij *\n\t- dzielenie - wciśnij /\n\t- reszta z dzielenia - wciśnij %" +
                "\nWybrane działanie to: ");

        String dzialanie = scanner.nextLine();

        System.out.print("Podaj drugą liczbę: ");
        double liczba2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Obliczenia gotowe: ");

        switch (dzialanie) {
            case "+":
                System.out.println((int)liczba1 + " + " + (int)liczba2 + " = " + (int)(liczba1 + liczba2));
                break;
            case "-":
                System.out.println((int)liczba1 + " - " + (int)liczba2 + " = " + (int)(liczba1 - liczba2));
                break;
            case "*":
                System.out.println((int)liczba1 + " * " + (int)liczba2 + " = " + (int)(liczba1 * liczba2));
                break;
            case "/":
                if (liczba2 == 0) {
                    System.out.println("Błąd! Nie można dzielić przez 0.");
                } else {
                    System.out.println((int)liczba1 + " / " + (int)liczba2 + " = " + (liczba1 / liczba2));
                }
                break;
            case "%":
                System.out.println((int)liczba1 + " % " + (int)liczba2 + " = " + (int)(liczba1 % liczba2));
                break;
            default:
                System.out.println("Błąd! Wybrano nieprawidłowe działanie.");
                break;
        }

    }

}
