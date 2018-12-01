package pl.sdacademy.java14poz.zadaniadodomu.ofertylokatbankowych;

import java.util.ArrayList;
import java.util.List;

public class SymulatorZysku {

    public static void main(String[] args) {

        List<OfertaPodstawowa> listaOfert = new ArrayList<OfertaPodstawowa>();

        //OfertaPodstawowa oferta1 = new OfertaPodstawowa(3, Kapitalizacja.MIESIECZNA);
        //OfertaPodstawowa oferta3 = new OfertaSpecjalna(3, Kapitalizacja.MIESIECZNA);

        double oprocentowanie = 2;

        listaOfert.add(new OfertaPodstawowa(oprocentowanie, Kapitalizacja.MIESIECZNA));
        listaOfert.add(new OfertaPodstawowa(oprocentowanie, Kapitalizacja.KWARTALNA));
        listaOfert.add(new OfertaPodstawowa(oprocentowanie, Kapitalizacja.ROCZNA));
        listaOfert.add(new OfertaSpecjalna(oprocentowanie, Kapitalizacja.MIESIECZNA));
        listaOfert.add(new OfertaSpecjalna(oprocentowanie, Kapitalizacja.KWARTALNA));
        listaOfert.add(new OfertaSpecjalna(oprocentowanie, Kapitalizacja.ROCZNA));

        double depozyt = 1000;
        int czasLokaty = 60;

        for (OfertaPodstawowa oferta : listaOfert) {
            obliczZysk(oferta, depozyt, czasLokaty);
        }

    }

    public static void obliczZysk(OfertaPodstawowa oferta, double depozyt, int czasLokaty) {
        double zysk = oferta.obliczSaldo(depozyt, czasLokaty) - depozyt;
        System.out.println("\n" + oferta + "\n\t--> Założenie lokaty na okres " + czasLokaty + " miesięcy z depozytem w wysokości " +
                depozyt + " zł przyniesie zysk w wysokości " + zysk + " zł.");

    }

}
