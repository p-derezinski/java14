package pl.sdacademy.java14poz.zadaniadodomu.ofertylokatbankowych;

import static pl.sdacademy.java14poz.zadaniadodomu.ofertylokatbankowych.Kapitalizacja.KWARTALNA;
import static pl.sdacademy.java14poz.zadaniadodomu.ofertylokatbankowych.Kapitalizacja.MIESIECZNA;

public class OfertaSpecjalna extends OfertaPodstawowa {

    private double oprocentowaniePoczatkowe;

    public OfertaSpecjalna(double oprocentowanie, Kapitalizacja kapitalizacja) {
        super(oprocentowanie, kapitalizacja);
        oprocentowaniePoczatkowe = oprocentowanie;
    }

    @Override
    public double obliczSaldo(double depozyt, int czasLokaty) {
        double saldo = depozyt;
        int iloscUplynietychMiesiecy = 0;
        if (kapitalizacja == MIESIECZNA) {
            while (iloscUplynietychMiesiecy < czasLokaty) {
                iloscUplynietychMiesiecy++;
                saldo = saldo * (((oprocentowanie / 12) / 100) + 1);
                oprocentowanie = obliczOprocentowanie(iloscUplynietychMiesiecy);
            }
        } else if (kapitalizacja == KWARTALNA) {
            while (iloscUplynietychMiesiecy < czasLokaty) {
                iloscUplynietychMiesiecy++;
                if (iloscUplynietychMiesiecy % 3 == 0) {
                    saldo = saldo * (((oprocentowanie / 4) / 100) + 1);
                }
                oprocentowanie = obliczOprocentowanie(iloscUplynietychMiesiecy);
            }
        } else {
            while (iloscUplynietychMiesiecy < czasLokaty) {
                iloscUplynietychMiesiecy++;
                if (iloscUplynietychMiesiecy % 12 == 0) {
                    saldo = saldo * ((oprocentowanie / 100) + 1);
                }
                oprocentowanie = obliczOprocentowanie(iloscUplynietychMiesiecy);
            }
        }
        return saldo;
    }

    private double obliczOprocentowanie(int iloscUplynietychMiesiecy) {
        if (iloscUplynietychMiesiecy % 12 == 0) {
            oprocentowanie += 1;
        }
        if (oprocentowanie > 10) {
            oprocentowanie = 10;
        }
        return oprocentowanie;
    }

    @Override
    public String toString() {
        return "Oferta specjalna: lokata z rosnącym oprocentowaniem w początkowej wysokości " + oprocentowaniePoczatkowe
                + " % z kapitalizacją odsetek typu " + kapitalizacja + ".";
    }

    //    public OfertaSpecjalna(double oprocentowanie, Kapitalizacja kapitalizacja, int miesiace) {
//        super(oprocentowanie, kapitalizacja);
//        this.miesiace = miesiace;
//        for (int i = 11; oprocentowanie < 10 || i < miesiace; i += 12) {
//            oprocentowanie += 1;
//        }
//    }
}
