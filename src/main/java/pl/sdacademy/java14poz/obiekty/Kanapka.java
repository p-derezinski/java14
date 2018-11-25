package pl.sdacademy.java14poz.obiekty;

public class Kanapka {

    String skład; // deklaracja zmiennej skład
    int ilośćSkładników;


    //konstruktor bezargumentowy domyślny
    public Kanapka() {
        skład = "ser, pomidor"; // inicjalizacja zmiennej skład
        ilośćSkładników = 2;
    }

    public Kanapka(String podanySkładTworzonejKanapki) {
        skład = podanySkładTworzonejKanapki;
    }

    public Kanapka(int podanaIlośćSkładników) {
        ilośćSkładników = podanaIlośćSkładników;
    }

    public Kanapka(String podanySkładTworzonejKanapki, int podanaIlośćSkładników) {
        skład = podanySkładTworzonejKanapki;
        ilośćSkładników = podanaIlośćSkładników;
    }

    public String podajSkład() {
        return skład;
    }

    public int podajIlośćSkładników() {
        return ilośćSkładników;
    }

    public String toString() {
        return "Skład kanapki: " + skład + ", ilość składników: " + ilośćSkładników;
    }

}
