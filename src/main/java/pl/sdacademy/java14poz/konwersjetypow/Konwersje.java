package pl.sdacademy.java14poz.konwersjetypow;

public class Konwersje {

    public static void main(String[] args) {

        char znak = 'a';
        byte bajt = 123;
        int calkowity = 12345678;
        short malaLiczba = 1234;
        double zmiennoprzecinkowaDuza = 12.123456789876543;
        float zmiennoprzecinkowaMala = 1.123456789f;

        System.out.println(bajt);
        char znakZBajta = (char)bajt;
        System.out.println(znakZBajta);

        // utrata danych
        System.out.println("\nkonwersja int na short");
        System.out.println(calkowity);
        short malaLiczbaZInta = (short)calkowity;
        System.out.println(malaLiczbaZInta);

        // bez utraty danych
        System.out.println("\nkonwersja short na int");
        System.out.println(malaLiczba);
        int calkowityZMalejLiczby = (int)malaLiczba;
        System.out.println(calkowityZMalejLiczby);

        System.out.println("\nkonwersja niejawna");
        int a = 5;
        double b = 3.5;
        double c = b/a;
        System.out.println(c);

        System.out.println("\nkonwersja jawna");
        int a2 = 5;
        double b2 = 3.5;
        double c2 = b2 / (double)a2;
        System.out.println(c2);

        System.out.println("\nkonwersja jawna");
        int a3 = 5;
        double b3 = 3.5;
        int c3 = (int) b3 / a3;
        System.out.println(c3);


    }

}
