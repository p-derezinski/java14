package pl.sdacademy.java14poz.zadaniadodomu.obslugazamowien;

public class Zamowienie {

    // W tej klasie wykorzystuje:
    // - formatowanie ceny do dwoch miejsc po przecinku - String.format
    // - StringBuilder
    // - dodawanie elementu do tablicy, sprawdzajac najpierw czy tablica ma jeszcze wolne miejsce na kolejny element;
    //   jesli ma jeszcze miejsce, to nastepuje znalezienie pierwszego wolnego miejsca (null) z uzyciem petli for,
    //   w to miejsce zostaje wstawiony nowy element, a nastepnie nasstepuje wyjscie z petli for komenda break
    // - obliczanie wartosci zamowienia, do momentu kiedy nie natrafi sie na pusta pozycje

    private Pozycja[] pozycje;
    private int maxRozmiar;

    public Zamowienie(int maxRozmiar) {
        this.maxRozmiar = maxRozmiar;
        this.pozycje = new Pozycja[maxRozmiar];
    }

    public Zamowienie() {
        this.maxRozmiar = 10;
        this.pozycje = new Pozycja[maxRozmiar];
    }

    public void dodajPozycje(Pozycja pozycja) {
        if (pozycje[maxRozmiar - 1] == null) {
            for (int i = 0; i < maxRozmiar; i++) {
                if (pozycje[i] == null) {
                    pozycje[i] = pozycja;
                    System.out.println(pozycja.getNazwaTowaru() + " --> dodano do zamówienia");
                    break;
                }
            }
        } else {
            System.out.println("Osiągnięto maksymalny rozmiar zamówienia, nie można dodać kolejnych pozycji - " +
                    pozycja.getNazwaTowaru() + " --> nie dodano do zamówienia");
        }
    }

    public double obliczWartosc() {
        double suma = 0;
        for (int i = 0; i < maxRozmiar; i++) {
            if (pozycje[i] != null) {
                suma += pozycje[i].obliczWartosc();
            } else {
                break;
            }
        }
        return suma;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=================================================================================\n");
        sb.append("Zamówienie:\n");
        for (int i = 0; i < maxRozmiar; i++) {
            if (pozycje[i] != null) {
                sb.append(pozycje[i].toString()).append("\n");
            } else {
                break;
            }
        }
        sb.append("Razem: ").append(String.format("%.2f", obliczWartosc())).append(" zł\n");
        sb.append("=================================================================================");
        return sb.toString();
    }
}
