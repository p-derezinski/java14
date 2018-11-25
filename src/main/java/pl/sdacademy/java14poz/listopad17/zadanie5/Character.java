package pl.sdacademy.java14poz.listopad17.zadanie5;

public abstract class Character implements Walka{

    private String imie;
    private int wiek;
    private int wzrost;
    private int sila;
    private int obrona;
    private int moc;

    public Character(String imie, int wiek, int wzrost, int sila, int obrona, int moc) {
        this.imie = imie;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.sila = sila;
        this.obrona = obrona;
        this.moc = moc;
    }

    @Override
    public String toString() {
        return "Character{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", wzrost=" + wzrost +
                ", sila=" + sila +
                ", obrona=" + obrona +
                ", moc=" + moc +
                '}';
    }

    public String getImie() {
        return imie;
    }
}
