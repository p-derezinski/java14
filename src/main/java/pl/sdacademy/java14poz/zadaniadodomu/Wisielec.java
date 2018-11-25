package pl.sdacademy.java14poz.zadaniadodomu;

import java.util.Scanner;

public class Wisielec {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String haslo = "ciacho";
        int dlugosc = haslo.length();
        char[] chars = new char[dlugosc];
        for (int i = 0; i < dlugosc; i++) {
            chars[i] = haslo.charAt(i);
        }
        char[] zgadywane = new char[dlugosc];
        for (int i = 0; i < dlugosc; i++) {
            zgadywane[i] = '_';
        }
        int zycie = 5;
        System.out.println("Masz 5 żyć. Ilość liter w haśle: " + dlugosc);
        drukujObecneHaslo(zgadywane);
        for (int i = 1; i <= zycie; i++) {
            System.out.print("Wybierz działanie (1 - podawanie litery, 2 - zgadywanie hasła): ");
            int wybor = scanner.nextInt();
            scanner.nextLine();
            switch (wybor) {
                case 1:
                    System.out.print("Podaj literę: ");
                    CharSequence litera = scanner.nextLine();
                    if (litera.length() > 1) {
                        System.out.println("Podałeś więcej niż jedną literę. Przegrywasz.");
                        i = zycie + 1;
                        break;
                    } else {
                        char charek = litera.charAt(0);
                        if (czyHasloZawieraZnak(haslo, litera)) {
                            System.out.println("Litera '" + litera + "' jest w haśle.");
                            for (int j = 0; j < dlugosc; j++) {
                                if (charek == chars[j]) {
                                    zgadywane[j] = charek;
                                }
                            }
                            drukujObecneHaslo(zgadywane);
//                            for (int j = 0; j < dlugosc; j++) {
//                                if (charek == chars[j]) {
//                                    System.out.print(litera + " ");
//                                } else {
//                                    System.out.print("_ ");
//                                }
//                            }
//                            System.out.println();
                            i--;
                        } else {
                            System.out.print("Litery '" + litera + "' nie ma w haśle. ");
                            switch (i) {
                                case 1:
                                    System.out.println("Pozostała ilość żyć: 4.");
                                    break;
                                case 2:
                                    System.out.println("Pozostała ilość żyć: 3.");
                                    break;
                                case 3:
                                    System.out.println("Pozostała ilość żyć: 2.");
                                    break;
                                case 4:
                                    System.out.println("Pozostała ilość żyć: 1.");
                                    break;
                                case 5:
                                    System.out.println("Koniec żyć. Przegrywasz.");
                                    System.out.println(" ______\n|      |\n|      O\n|     \\ /\n|      |\n|     / \\\n|\n|___________");
                                    break;
                            }
                        }
                        break;
                    }
                case 2:
                    System.out.print("Podaj hasło: ");
                    String zgadywaneHaslo = scanner.nextLine();
                    if (zgadywaneHaslo.equals(haslo)) {
                        System.out.println("Brawo! Wygrałeś!");
                        i = zycie + 1;
                    } else {
                        System.out.println("Nieprawidłowe hasło.");
                        i--;
                    }
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja.");
                    i--;
                    break;
            }

        }
        System.out.println("GAME OVER");

    }

    public static boolean czyHasloZawieraZnak(String napis, CharSequence znak) {
        return napis.contains(znak);
    }

    public static void drukujObecneHaslo(char[] tablica) {
        System.out.print("  -->  ");
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println(" <--");
    }
}
