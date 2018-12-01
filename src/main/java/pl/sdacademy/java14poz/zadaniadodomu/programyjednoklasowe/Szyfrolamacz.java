package pl.sdacademy.java14poz.zadaniadodomu.programyjednoklasowe;

import java.util.Scanner;

public class Szyfrolamacz {

    public static void main(String[] args) {

        int haslo = 2947;
        Scanner scanner = new Scanner(System.in);
        int zycie = 5;
        boolean czyPonownie = true;
        Integer hasloInteger = haslo;
        String hasloString;
        if (haslo > 999) {
            hasloString = hasloInteger.toString();
        } else if (haslo > 99) {
            hasloString = "0" + hasloInteger.toString();
        } else if (haslo > 9) {
            hasloString = "00" + hasloInteger.toString();
        } else {
            hasloString = "000" + hasloInteger.toString();
        }
        //System.out.println(hasloString);

        System.out.println("============================");
        System.out.println("======= SZYFROŁAMACZ =======");
        System.out.println("============================");

        while (czyPonownie) {
            boolean czyMaszJeszczePodpowiedz = true;
            System.out.println("Zadanie: odgadnąć 4-cyfrowe hasło. Ilość żyć: " + zycie);
            for (int i = 1; i < zycie + 1; i++) {
                System.out.print("Wybierz działanie: 1 - ZGADYWANIE HASŁA, 2 - PODPOWIEDŹ. Twój wybór: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                if (choice == 1) {
                    System.out.print("Podaj hasło: ");
                    int strzal = scanner.nextInt();
                    scanner.nextLine();
                    if (strzal == haslo) {
                        System.out.println("Kod złamany! Wygrana!");
                        czyPonownie = false;
                        break;
                    } else if (strzal < haslo) {
                        System.out.println("Podany kod jest mniejszy od hasła. Tracisz jedno życie. Pozostała ilość żyć: " + (zycie - i));
                    } else {
                        System.out.println("Podany kod jest większy od hasła. Tracisz jedno życie. Pozostała ilość żyć: " + (zycie - i));
                    }
                } else if (choice == 2) {
                    if (czyMaszJeszczePodpowiedz) {
                        System.out.print("Podaj, którą cyfrę w kodzie chcesz odsłonić: ");
                        int pozycja = scanner.nextInt();
                        scanner.nextLine();
                        podpowiedz(hasloString, pozycja);
                        czyMaszJeszczePodpowiedz = false;
                        i--;
                    } else {
                        System.out.println("Podpowiedź została już wykorzystana");
                        i--;
                    }
                }
                if ((zycie - i) == 0) {
                    System.out.println("Kod nie został złamany. Przegrana!");
                    System.out.print("Czy chcesz spróbować ponownie? 1 - TAK, 2 - NIE. Twój wybór: ");
                    int wybor = scanner.nextInt();
                    scanner.nextLine();
                    if (wybor == 1) {
                        System.out.println("Zacznijmy od nowa!");
                    } else if (wybor == 2) {
                        czyPonownie = false;
                    }
                }
            }
        }

    }

    public static void podpowiedz(String hasloString, int pozycja) {
        char odslonietaCyfra = hasloString.charAt(pozycja - 1);
        System.out.println("Na pozycji numer " + pozycja + " jest cyfra " + odslonietaCyfra);
    }

}
