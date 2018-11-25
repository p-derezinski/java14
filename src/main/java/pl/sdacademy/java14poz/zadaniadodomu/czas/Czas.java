package pl.sdacademy.java14poz.zadaniadodomu.czas;

public class Czas {

    private int godziny;
    private int minuty;

    public Czas(int godziny, int minuty) {
        this.godziny = godziny;
        this.minuty = minuty;
    }

    // metoda toString(), która wyświetla null w przypadku braku obiektu Czas
    @Override
    public String toString() {
        if (minuty > 59) {
            godziny = godziny + (minuty / 60);
            minuty = minuty % 60;
        }
        return "Czas:  " + godziny + " h  " + minuty + " min";
    }

    // metoda toString(), która też wyświetla null w przypadku braku obiektu Czas, mimo że myślałem że wyświetli mój komunikat (?)
//    @Override
//    public String toString() {
//        if (minuty > 59) {
//            godziny = godziny + (minuty / 60);
//            minuty = minuty % 60;
//            return "Czas:  " + godziny + " h  " + minuty + " min";
//        } else if (minuty <= 59) {
//            return "Czas:  " + godziny + " h  " + minuty + " min";
//        } else {
//            return "Błąd! Czas nie istnieje.";
//        }
//    }

    public Czas dodaj(Czas t) {
        int h = this.godziny + t.getGodziny();
        int min = this.minuty + t.getMinuty();
        Czas czas = new Czas(h, min);
        return czas;
    }

    public Czas odejmij(Czas t) {
        int hCzas1 = (this.godziny * 60) + this.minuty;
        int hCzas2 = (t.getGodziny() * 60) + t.getMinuty();
        if (hCzas1 < hCzas2) {
            System.out.println("Błąd! Próba odjęcia dłuższego czasu od krótszego.");
            return null;
        } else {
            Czas czas = new Czas(0, hCzas1 - hCzas2);
            return czas;
        }
    }

    public Czas pomnoz(int krotnosc) {
        Czas czas = new Czas(this.godziny * krotnosc, this.minuty * krotnosc);
        return czas;
    }

    public int getGodziny() {
        return godziny;
    }

    public int getMinuty() {
        return minuty;
    }
}
