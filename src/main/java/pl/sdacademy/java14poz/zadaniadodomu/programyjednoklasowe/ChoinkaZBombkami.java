package pl.sdacademy.java14poz.zadaniadodomu.programyjednoklasowe;

import java.util.Random;
import java.util.Scanner;

public class ChoinkaZBombkami {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] tablica = new String[10];
        String spacja = " ";
        System.out.print("Podaj znak: ");
        String znak = scanner.nextLine();
        System.out.print("Podaj znak bombki: ");
        String bombka = scanner.nextLine();
        for (int i = 1; i < tablica.length; i++) {
            tablica[i] = znak;
        }
        tablica[0] = bombka;

        System.out.print("Podaj ilość poziomów: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int count1 = n;
        int count2 = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < count1; j++) {
                System.out.print(spacja);
            }
            for (int j = 1; j <= count2; j++) {
                System.out.print(tablica[random.nextInt(tablica.length)]);
            }
            count1--;
            count2 += 2;
            System.out.println();
        }

        if (n < 5) {
            for (int i = 1; i < n; i++) {
                System.out.print(spacja);
            }
            System.out.print(znak);
        } else if (n < 8) {
            for (int i = 1; i < 3; i++) {
                for (int j = 1; j < n; j++) {
                    System.out.print(spacja);
                }
                System.out.println(znak);
            }
        } else {
            for (int i = 1; i < 3; i++) {
                for (int j = 1; j < n - 1; j++) {
                    System.out.print(spacja);
                }
                for (int j = 1; j < 4; j++) {
                    System.out.print(znak);
                }
                System.out.println();
            }
        }
    }

}
