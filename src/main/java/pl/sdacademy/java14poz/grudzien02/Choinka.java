package pl.sdacademy.java14poz.grudzien02;

import java.util.Scanner;

public class Choinka {   // nie skończone (mialo być inne podejście, niż w moim rozwiązaniu

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String spacja = " ";
        System.out.print("Podaj znak: ");
        String znak = scanner.nextLine();
        System.out.print("Podaj ilość poziomów: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int count1 = n;
        int count2 = 1;

        char[][] tree = new char[n][2 * n - 1];

    }

}
