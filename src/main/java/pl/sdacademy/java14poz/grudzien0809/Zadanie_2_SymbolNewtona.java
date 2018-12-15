package pl.sdacademy.java14poz.grudzien0809;

public class Zadanie_2_SymbolNewtona {

    public static void main(String[] args) {

        System.out.println(sNewton(7, 5));

    }

    public static int sNewton(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        }
        return sNewton(n - 1, k - 1) + sNewton(n - 1, k);
    }

}
