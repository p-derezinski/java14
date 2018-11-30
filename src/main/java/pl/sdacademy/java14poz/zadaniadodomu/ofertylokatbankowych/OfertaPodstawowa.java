package pl.sdacademy.java14poz.zadaniadodomu.ofertylokatbankowych;

import static pl.sdacademy.java14poz.zadaniadodomu.ofertylokatbankowych.Kapitalizacja.KWARTALNA;
import static pl.sdacademy.java14poz.zadaniadodomu.ofertylokatbankowych.Kapitalizacja.MIESIECZNA;

public class OfertaPodstawowa {

    protected double oprocentowanie;
    protected Kapitalizacja kapitalizacja;

    public OfertaPodstawowa(double oprocentowanie, Kapitalizacja kapitalizacja) {
        this.oprocentowanie = oprocentowanie;
        this.kapitalizacja = kapitalizacja;
    }

    public double obliczSaldo(double depozyt, int czasLokaty) {
        double saldo = depozyt;
        int iloscUplynietychMiesiecy = 0;
        if (kapitalizacja == MIESIECZNA) {
            while (iloscUplynietychMiesiecy < czasLokaty) {
                iloscUplynietychMiesiecy++;
                saldo = saldo * (((oprocentowanie / 12) / 100) + 1);
            }
        } else if (kapitalizacja == KWARTALNA) {
            while (iloscUplynietychMiesiecy < czasLokaty) {
                iloscUplynietychMiesiecy++;
                if (iloscUplynietychMiesiecy % 3 == 0) {
                    saldo = saldo * (((oprocentowanie / 4) / 100) + 1);
                }
            }
        } else {
            while (iloscUplynietychMiesiecy < czasLokaty) {
                iloscUplynietychMiesiecy++;
                if (iloscUplynietychMiesiecy % 12 == 0) {
                    saldo = saldo * ((oprocentowanie / 100) + 1);
                }
            }
        }
        return saldo;
    }

    public String toString() {
        return "Oferta podstawowa: lokata ze stałym oprocentowaniem w wysokości " + oprocentowanie
                + " % z kapitalizacją odsetek typu " + kapitalizacja + ".";
    }
}
