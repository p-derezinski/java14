package pl.sdacademy.java14poz.zadaniadodomu;

public class Testowanie {

    public static void main(String[] args) {

        double testowy = 5.3332;
        String testowy2 = String.format("%.2f", testowy);
        System.out.println(testowy2);
        System.out.println("\n\n\n\n\n\n\n\n\n");

//        System.out.println(" ______");
//        System.out.println("|      |");
//        System.out.println("|      O");
//        System.out.println("|     \\ /");
//        System.out.println("|      |");
//        System.out.println("|     / \\");
//        System.out.println("|");
//        System.out.println("|___________");
//
//        System.out.println();
//
//        System.out.println(" ______\n|      |\n|      O\n|     \\ /\n|      |\n|     / \\\n|\n|___________");

        String haslo = "Mariusz";

        haslo = haslo.toUpperCase();

        int dlugosc = haslo.length();
        char[] chars = new char[dlugosc];
        for (int i = 0; i < dlugosc; i++) {
            chars[i] = haslo.charAt(i);
        }

        drukujObecneHaslo(chars);
        char[] zgadywane = new char[dlugosc];
        for (int i = 0; i < dlugosc; i++) {
            zgadywane[i] = '_';
        }

        drukujObecneHaslo(zgadywane);

        System.out.println("----------------------------");

        int[] tablicaTestowa = new int[10];
        tablicaTestowa[0] = 5;
        tablicaTestowa[1] = 12;
        for (int i = 0; i < tablicaTestowa.length; i++) {
            System.out.print(tablicaTestowa[i] + " ");
        }
        System.out.println();

        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        String[] tablicaStringow = new String[10];
        tablicaStringow[0] = "slowo 1";
        System.out.println(tablicaStringow[0]);
        for (int i = 0; i < tablicaStringow.length; i++) {
            System.out.print(tablicaStringow[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < tablicaStringow.length; i++) {
            if (tablicaStringow[i] == null) {
                tablicaStringow[i] = "slowo 2";
                break;
            }
        }
        for (int i = 0; i < tablicaStringow.length; i++) {
            System.out.print(tablicaStringow[i] + " ");
        }
        System.out.println();

        String test = "Test";
        System.out.println(test);
        test = "Zmiana";
        System.out.println(test);

        System.out.println('\u23F5');
        System.out.println('\uF3B6');
        System.out.println('\u2669');
        System.out.println('\u266A');
        System.out.println('\u266B');
        System.out.println('\u266C');
        System.out.println('\u2709');

        int liczba = 1247;
        Integer integerZInta = liczba;
        String stringZIntegera = integerZInta.toString();
        System.out.println(liczba);
        System.out.println(integerZInta);
        System.out.println(integerZInta.toString());
        System.out.println(stringZIntegera);

    }

    public static void drukujObecneHaslo(char[] tablica) {
        System.out.print("  -->  ");
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println(" <--");
    }

}
