package pl.sdacademy.java14poz.listopad24.zadanie4firma;

public class Pracownik {

    private String imie;
    private String nazwisko;
    private double pensja;
    private String email;
    private int id;

    public Pracownik(String imie, String nazwisko, double pensja, String email, int id) {
        this(imie, nazwisko, pensja, id);             // wykorzystujemy drugi konstruktor, żeby zrobić inicjalizację; dzięki temu mamy jedno miejsce do modyfikacji; jest to zgodne z zasadą DRY - Don't Repeat Yourself
        this.email = email;
    }

    public Pracownik(String imie, String nazwisko, double pensja, int id) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pensja = pensja;
        this.id = id;
    }

    public String toString() {
        //return imie + " " + nazwisko + ", id: " + id + ", email: " + email + ", pensja: " + pensja + " zł.";

        // albo
        //    return String.format("Pracownik{imie to: %s, nazwisko to: %s", imie, nazwisko);   - itd.
        // można to zrobić automatycznie, klikając Alt+Enter i Replace '+' with String.format

        return String.format("%d, %s, %s, %.2f, %s", id, imie, nazwisko, pensja, email);

    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
