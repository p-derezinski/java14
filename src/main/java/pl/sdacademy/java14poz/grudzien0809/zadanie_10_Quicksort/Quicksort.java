package pl.sdacademy.java14poz.grudzien0809.zadanie_10_Quicksort;

import java.util.Random;

import static pl.sdacademy.java14poz.grudzien0809.zadanie_8_SortowaniePrzezZliczanie.ClassWithPrintMethod.printTable;

public class Quicksort {

    public static void main(String[] args) {

        int[] tab = new int[100_000];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100);
        }

        printTable(tab);
        quicksort(tab, 0, tab.length - 1);
        printTable(tab);
    }

    public static void quicksort(int[] tablica, int l, int r) {
        if (l < r) {
            int i = podzielTablice(tablica, l, r);           // 9  // 2     // 6   // 5
                quicksort(tablica, l, i - 1);
                quicksort(tablica, i + 1, r);
        }
    }

    public static void quicksort(int[] tablica) {
        quicksort(tablica, 0, tablica.length - 1);
    }

    private static int podzielTablice(int[] tablica, int l, int r) {
        int indeksPodzialu = wybierzPunktPodzialu(l, r);
        int wartoscPodzialu = tablica[indeksPodzialu];
        zamien(tablica, indeksPodzialu, r);
        int aktualnaPozycja = l;                             // 5
        for (int i = l; i <= r - 1; i++) {                   // i = 4        r - 1 = 4
            if (tablica[i] < wartoscPodzialu) {              //
                zamien(tablica, i, aktualnaPozycja);         //
                aktualnaPozycja++;                           //
            }
        }
        zamien(tablica, aktualnaPozycja, r);
        return aktualnaPozycja;
    }

    private static int wybierzPunktPodzialu(int l, int r) {
        return l + (r - l) / 2;
    }

    private static void zamien(int[] tablica, int i1, int i2) {
        int temp = tablica[i1];
        tablica[i1] = tablica[i2];
        tablica[i2] = temp;
    }

}
