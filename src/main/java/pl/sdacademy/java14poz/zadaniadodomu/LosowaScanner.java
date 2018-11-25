package pl.sdacademy.java14poz.zadaniadodomu;

import java.util.Scanner;

public class LosowaScanner {

    public static void main(String[] args) {

        System.out.println("=================================================");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zakres liczb do losowania:");
        System.out.print("\tLiczba minimalna: ");
        int min = scanner.nextInt();
        scanner.nextLine();
        System.out.print("\tLiczba maksymalna: ");
        int maks = scanner.nextInt();
        scanner.nextLine();
        if (min < 0) {
            int maksZm = maks - min;
            double losowaRandom = Math.random();
            int losowa = (int)(losowaRandom * (maksZm + 1)) + min;
            System.out.println("Wylosowana liczba z zakresu od " + min + " do " + maks + " to: " + losowa);
        } else {
            boolean test = true;
            while (test) {
                double losowaRandom = Math.random();
                int losowa = (int)(losowaRandom * (maks + 1));
                if (losowa < min) {
                    continue;
                } else {
                    System.out.println("Wylosowana liczba z zakresu od " + min + " do " + maks + " to: " + losowa);
                    test = false;
                }
            }
        }

        System.out.println("=================================================");
    }
}
