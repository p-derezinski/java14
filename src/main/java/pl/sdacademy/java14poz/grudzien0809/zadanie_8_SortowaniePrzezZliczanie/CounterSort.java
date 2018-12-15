package pl.sdacademy.java14poz.grudzien0809.zadanie_8_SortowaniePrzezZliczanie;

import java.util.Random;

public class CounterSort {

    public static void countSort(int[] tab) {
        int maxValue = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > maxValue) {
                maxValue = tab[i];
            }
        }

        int[] temp = new int[maxValue + 1];
        for (int i = 0; i < tab.length; i++) {
            temp[tab[i]]++;
        }
        int n = 0;
        for (int i = 0; i < temp.length; i++) {
            for (int x = 0; x < temp[i]; x++) {
                tab[n] = i;
                n++;
            }
        }
    }

    public static void main(String[] args) {

        int[] tab = new int[100_000];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100);
        }

        ClassWithPrintMethod.printTable(tab);

        long startTime = System.nanoTime();
        countSort(tab);
        long stopTime = System.nanoTime();

        ClassWithPrintMethod.printTable(tab);

        System.out.printf("CounterSort time: %d \n", (stopTime - startTime) / 1_000_000);

    }

}
