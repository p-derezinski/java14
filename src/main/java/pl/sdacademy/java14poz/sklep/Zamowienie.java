package pl.sdacademy.java14poz.sklep;

public class Zamowienie {

    int numer;
    float cena;

    public Zamowienie(int numer, float cena) {
        this.numer = numer;
        this.cena = cena;
    }

    public Zamowienie(int numer, Double cena) {
        this.numer = numer;
        this.cena = cena.floatValue();
    }

    public float pobierzCena() {
        return cena;
    }

    public String toString() {
        return "Zamównienie o numerze " + numer + " - cena: " + cena + " zł.";
    }

    public void pobierzCena2() {
        System.out.println("Zamównienie o numerze " + numer + " - cena: " + cena + " zł.");
    }
}
