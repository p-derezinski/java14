package pl.sdacademy.java14poz.metody;
//generate test
//alt + enter

import pl.sdacademy.java14poz.obiekty.Kanapka;

/**
 * App
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 14.10.2018 10:00
 **/
public class App {
    //code format
    //ctrl+alt+L

    // alt + insert + enter
    // generate code

    //psvm + tab
    public static void main(String[] args) {
        //sout + tab
        System.out.println("Hello World!");
        System.out.println("Witaj hej hej hej");

        int liczba = 5;
        System.out.println(liczba);
        System.out.println(Math.PI);

        System.out.println("Co na obiad?");
        System.out.println(coNaObiad());

        String coBędęZjadał = "Co na obiad?";
        System.out.println(coBędęZjadał);
        String obiad = coNaObiad();
        System.out.println(obiad);

        System.out.println(poproszeFrytki(20));

        int suma = sumaLiczb(2, 6, 3);
        System.out.println(suma);
        System.out.println(sumaLiczb(22, 4, -6));
        System.out.println(sumaLiczb(34343, 77777, 12345));

        System.out.println(informacjeOPrzedmiocie("Frytki", 5));

        Kanapka kanapkaZSerem = new Kanapka();
        String składKanapkiZSerem = kanapkaZSerem.podajSkład();
        System.out.println("Konstruktor przykład");
        System.out.println(składKanapkiZSerem);

        Kanapka kanapka2 = new Kanapka("szynka");
        Kanapka kanapka3 = new Kanapka(3);
        Kanapka kanapka4 = new Kanapka("salami", 4);
        System.out.println(kanapka2.podajSkład() + ", " + kanapka2.podajIlośćSkładników());
        System.out.println(kanapka3.podajSkład() + ", " + kanapka3.podajIlośćSkładników());
        System.out.println(kanapka4.podajSkład() + ", " + kanapka4.podajIlośćSkładników());

    }

    public static String coNaObiad() {
        return "pomidorowa";
    }

    public static int poproszeFrytki(int kwota) {
        return kwota - 5;
    }

    public static int sumaLiczb(int a, int b, int c) {
        return a + b + c;
    }

    public static String informacjeOPrzedmiocie(String przedmiot, int cena) {
        return przedmiot + ": " + cena + " zł";
    }

}
