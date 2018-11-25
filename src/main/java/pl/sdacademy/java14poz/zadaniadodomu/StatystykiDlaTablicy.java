package pl.sdacademy.java14poz.zadaniadodomu;

public class StatystykiDlaTablicy {

    public static void main(String[] args) {

        int[] tablica1 = new int[]{2, 5, 1, -3, 5, 22, 21, 66, 21, 54};
        int[] tablica2 = new int[]{0, 2, -4, 7, -5};
        int[] tablica3 = new int[]{5};
        int[] tablica4 = new int[]{-2, 2, 2, 22};
        drukujOpisTablicy(tablica4);
    }

    public static void drukujOpisTablicy(int[] tablicaArg) {

        int min = tablicaArg[0];
        for (int i = 1; i < tablicaArg.length; i++) {
            if (tablicaArg[i] < min) {
                min = tablicaArg[i];
            }
        }

        int max = tablicaArg[0];
        for (int i = 1; i < tablicaArg.length; i++) {
            if (tablicaArg[i] > max) {
                max = tablicaArg[i];
            }
        }

        double suma = 0;
        for (int i = 0; i < tablicaArg.length; i++) {
            suma += tablicaArg[i];
        }
        double srednia = suma / tablicaArg.length;

        System.out.println("Minimalna wartość w tablicy to: " + min);
        System.out.println("Maksymalna wartość w tablicy to: " + max);
        System.out.println("Srednia wartość tablicy to: " + srednia);
        System.out.println("Ilość elementów w tablicy to: " + tablicaArg.length);
    }

}
