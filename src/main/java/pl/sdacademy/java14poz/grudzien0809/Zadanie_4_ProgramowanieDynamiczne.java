package pl.sdacademy.java14poz.grudzien0809;

import java.util.Scanner;

public class Zadanie_4_ProgramowanieDynamiczne {

    public static int[][] storage = new int[512][512];

    public static void main(String[] args) {

        pascalTree();

    }

    public static int sNewton(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        }
        if (storage[n][k] != 0) {
            return storage[n][k];
        }
        return storage[n][k] = sNewton(n - 1, k - 1) + sNewton(n - 1, k);
    }

    public static void pascalTree() {
        System.out.print("Podaj ilość poziomów: ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("\t");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(sNewton(i, k) + "\t\t");
            }
            System.out.println();
        }
    }

}
