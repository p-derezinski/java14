package pl.sdacademy.java14poz.listopad17;

public class Zadanie2 {

    static int zwieksz(int liczba) {
        liczba++;
        return liczba;
    }

}

class Main {

    public static void main(String[] args) {

        int a = 5;
        a = Zadanie2.zwieksz(a);
        System.out.println(a);

    }

}
