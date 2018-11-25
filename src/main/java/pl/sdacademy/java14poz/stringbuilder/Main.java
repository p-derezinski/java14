package pl.sdacademy.java14poz.stringbuilder;

public class Main {

    public static void main(String[] args) {

        String napisCudzyslow = "";
        String napisZKonstruktora = new String("");
        String napisNull = null;
        String napisBezInicjalizacji;
        String napis = "Liczba %d \n";  //   \n  to znak Entera (new line, nowa linijka);  d - skrót od double
        System.out.print(napis);
        System.out.printf(napis,12);
        System.out.println("Napis");
        System.out.print(napisZKonstruktora);
        System.out.println(napisNull);
        //System.out.println(napisBezInicjalizacji);

        System.out.println("*************************8");
        String wierszyk = "Były %d świnki, pierwsza miała na imię %s \n\n";
        System.out.printf(wierszyk, 3, "Pepe");

        // formatowanie liczby
        float suma = 5.1200000123f;
        System.out.printf("Suma: %f zł", suma);
        System.out.println("");
        System.out.printf("Suma: %.2f zł", suma);

    }

}
