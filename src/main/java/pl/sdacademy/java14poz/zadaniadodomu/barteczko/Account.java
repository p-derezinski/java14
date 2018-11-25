package pl.sdacademy.java14poz.zadaniadodomu.barteczko;

public class Account {

    private double stan;
    private double wplaty;
    private double wyplaty;
    private double oprocentowanie;

    public Account(double stan, double wplaty, double wyplaty, double oprocentowanie) {
        this.stan = stan;
        this.wplaty = wplaty;
        this.wyplaty = wyplaty;
        this.oprocentowanie = oprocentowanie;
    }

    public void getMonthsToBalance(double docelowaWartosc) {
        double aktualnaWartosc = getStan();
        int iloscMiesiecy = 0;
        while (aktualnaWartosc < docelowaWartosc) {
            aktualnaWartosc = (aktualnaWartosc + getWplaty() - getWyplaty()) * (((getOprocentowanie() / 12) / 100) + 1);
            iloscMiesiecy++;
        }
        System.out.println("Suma na koncie osiągnie wartość " + docelowaWartosc + " po liczbie miesięcy wynoszącej " + iloscMiesiecy);
    }

    public double getStan() {
        return stan;
    }

    public double getWplaty() {
        return wplaty;
    }

    public double getWyplaty() {
        return wyplaty;
    }

    public double getOprocentowanie() {
        return oprocentowanie;
    }
}
