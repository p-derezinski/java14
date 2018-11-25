package pl.sdacademy.java14poz.sklep;

public class User {

    String imie;
    String nazwisko;
    int wiek;
    public enum TypStatus {AKTYWNY, NIEAKTYWNY, ZALOGOWANY, NIEZALOGOWANY, LOCAL}; // tutaj "TypStatus" to nie zmienna, tylko typ wyliczeniowy
    TypStatus status;
    Miasto miastoZamieszkania;
    enum TypPlec {MEZCZYZNA, KOBIETA, NIEOKRESLONA}
    TypPlec plec;

//    public User() {
//        imie = "anonim";
//        nazwisko = "nieznane";
//        wiek = 0;
//        plec = TypPlec.NIEOKRESLONA;
//        status = TypStatus.NIEAKTYWNY;
//    }

    public User(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public User(String imie, String nazwisko, int wiek, TypPlec plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.plec = plec;
    }

//    public String toString() {
//        return "Imię i nazwisko użytkownika: " + imie + " " + nazwisko + ", wiek użytkownika: " + wiek
//                + ", status użytkownika: " + status + ", płeć: " + plec.toString().toLowerCase();
//    }

    public String toString() {
        return "Imię i nazwisko użytkownika: " + imie + " " + nazwisko + ", wiek użytkownika: " + wiek
                + ", status użytkownika: " + status + ", płeć: " + plec;
    }

    public TypStatus getStatus() {
        return status;
    }

    public void setStatus(TypStatus status) {
        this.status = status;
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

    public Miasto getMiasto() {
        return miastoZamieszkania;
    }

    public void setMiasto(Miasto miasto) {
        this.miastoZamieszkania = miasto;
    }

    public TypPlec getPlec() {
        return plec;
    }
}
