package pl.sdacademy.java14poz.grudzien0809;

public class Zadanie_1_Silnia {

    public static void main(String[] args) {

        System.out.println(silnia(0));
        System.out.println(silnia(1));
        System.out.println(silnia(5));
        System.out.println(silnia(30));

        int n = 4;
        System.out.printf("Silnia od %d: %d", n, silnia(n));

    }

    public static int silnia(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * silnia(n - 1);
    }

}
