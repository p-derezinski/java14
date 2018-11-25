package pl.sdacademy.java14poz.zadaniadodomu.firma;

public class Pracownik {

    private String imie;
    private String nazwisko;
    private double wynagrodzenieMies;

    public Pracownik(String imie, String nazwisko, double wynagrodzenieMies) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wynagrodzenieMies = wynagrodzenieMies;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getWynagrodzenieMies() {
        return wynagrodzenieMies;
    }
}
