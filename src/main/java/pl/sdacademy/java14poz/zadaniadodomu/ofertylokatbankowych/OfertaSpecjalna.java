package pl.sdacademy.java14poz.zadaniadodomu.ofertylokatbankowych;

public class OfertaSpecjalna extends OfertaPodstawowa {

    private int miesiace;

    public OfertaSpecjalna(double oprocentowanie, Kapitalizacja kapitalizacja, int miesiace) {
        super(oprocentowanie, kapitalizacja);
        this.miesiace = miesiace;
        for (int i = 11; oprocentowanie < 10 || i < miesiace; i += 12) {
            oprocentowanie *= 1.01;
        }
    }
}
