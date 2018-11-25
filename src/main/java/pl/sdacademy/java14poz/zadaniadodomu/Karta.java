package pl.sdacademy.java14poz.zadaniadodomu;

public class Karta {

    public enum Kolor {KIER, KARO, TREFL, PIK}
    Kolor kolor;
    public enum Figura {DWOJKA, TROJKA, CZWORKA, PIATKA, SZOSTKA, SIODEMKA, OSEMKA, DZIEWIATKA,
                        DZIESIATKA, WALET, KROLOWA, KROL, AS}
    Figura figura;

    public Karta(Kolor kolor, Figura figura) {
        this.kolor = kolor;
        this.figura = figura;
    }

    public String toString() {
        return this.figura.toString().toLowerCase() + " " + this.kolor.toString();
    }

    public static void main(String[] args) {

        int counter = 1;
        for (int i = 0; i < Kolor.values().length; i++) {
            for (int j = 0; j < Figura.values().length; j++) {
                Karta karta = new Karta(Kolor.values()[i], Figura.values()[j]);
                System.out.println(counter + " - " + karta);
                counter++;
            }
        }

    }
}
