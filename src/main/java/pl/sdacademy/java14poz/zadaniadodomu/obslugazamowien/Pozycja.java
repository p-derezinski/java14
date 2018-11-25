package pl.sdacademy.java14poz.zadaniadodomu.obslugazamowien;

public class Pozycja {

    // W tej klasie wykorzystuje:
    // - formatowanie ceny do dwoch miejsc po przecinku - String.format
    // - StringBuilder
    // - wyrownywanie tekstu z uzyciem tabulatorow i petli for dodajacej spacje w zaleznosci od dlugosci slowa
    //   (im dluzsze slowo, tym mniej dodanych spacji, i dzieki temu kolejne kolumny tekstu sa wyswietlone rowno)

    private String nazwaTowaru;
    private int iloscSztuk;
    private double cenaSztuki;

    public Pozycja(String nazwaTowaru, int iloscSztuk, double cenaSztuki) {
        this.nazwaTowaru = nazwaTowaru;
        this.iloscSztuk = iloscSztuk;
        this.cenaSztuki = cenaSztuki;
    }

    public double obliczWartosc() {
        return this.iloscSztuk * this.cenaSztuki;
    }

    public String toString() {
        int dlugoscSlowa = this.nazwaTowaru.length();
        int dlugoscCeny = String.format("%.2f", this.cenaSztuki).length();
        StringBuilder sb = new StringBuilder();
        sb.append("\t").append(this.nazwaTowaru);
        for (int i = 1; i < (20 - dlugoscSlowa); i++) {
            sb.append(" ");
        }
        sb.append("\t\t\t").append(String.format("%.2f", this.cenaSztuki)).append(" zł");
        for (int i = 1; i < (10 - dlugoscCeny); i++) {
            sb.append(" ");
        }
        sb.append("\t").append(this.iloscSztuk).append(" szt.\t\t").append(String.format("%.2f", obliczWartosc())).append(" zł");
        return sb.toString();
    }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    public int getIloscSztuk() {
        return iloscSztuk;
    }

    public double getCenaSztuki() {
        return cenaSztuki;
    }
}
