package pl.sdacademy.java14poz.grudzien0809.zadanie_7_SortowanieBabelkowe;

import java.util.Random;

public class Main {

    public static void bubbleSort(int[] tab) {
        boolean isSwapped;
        do {
            isSwapped = false;
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    isSwapped = true;
                    int temp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                }
            }
        } while (isSwapped);

    }

    public static void main(String[] args) {

        int[] tab = new int[100_000];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100);
        }

        printTable(tab);

        long startTime = System.nanoTime();
        bubbleSort(tab);
        long stopTime = System.nanoTime();

        printTable(tab);

        System.out.printf("BubbleSort time: %d \n", (stopTime - startTime) / 1_000_000);

    }

    private static void printTable(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");

        }
        System.out.println();
    }

}
