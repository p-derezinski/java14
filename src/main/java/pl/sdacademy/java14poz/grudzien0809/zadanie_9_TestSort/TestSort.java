package pl.sdacademy.java14poz.grudzien0809.zadanie_9_TestSort;

import pl.sdacademy.java14poz.grudzien0809.zadanie_10_Quicksort.Quicksort;
import pl.sdacademy.java14poz.grudzien0809.zadanie_7_SortowanieBabelkowe.Main;
import pl.sdacademy.java14poz.grudzien0809.zadanie_8_SortowaniePrzezZliczanie.CounterSort;

import java.util.Random;

public class TestSort {

    public static void main(String[] args) {

        int[] tab = new int[10_000];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(1_000);
        }

        int[] tab2 = tab.clone();
        int[] tab3 = tab.clone();

        long startTime = System.nanoTime();
        Main.bubbleSort(tab);
        long stopTime = System.nanoTime();
        System.out.printf("BubbleSort time: %d \n",
                (stopTime - startTime) / 1_000_000
        );

        startTime = System.nanoTime();
        CounterSort.countSort(tab2);
        stopTime = System.nanoTime();
        System.out.printf("CounterSort time: %d \n",
                (stopTime - startTime) / 1_000_000
        );

        startTime = System.nanoTime();
        Quicksort.quicksort(tab3);
        stopTime = System.nanoTime();
        System.out.printf("Quicksort time: %d \n",
                (stopTime - startTime) / 1_000_000
        );
    }

}
