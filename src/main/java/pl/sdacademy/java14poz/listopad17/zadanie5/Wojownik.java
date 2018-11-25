package pl.sdacademy.java14poz.listopad17.zadanie5;

public class Wojownik extends Character {

    private String miecz;

    public Wojownik(String imie, int wiek, int wzrost, int sila, int obrona, int moc, String miecz) {
        super(imie, wiek, wzrost, sila, obrona, moc);
        this.miecz = miecz;
    }

    @Override
    public void walcz() throws WojownikMieczException {
        if (miecz == null) {
            throw new WojownikMieczException("Wojownik " + getImie() + " zgubił miecz!");
        } else {
            System.out.println("Wojownik " + getImie() + " walczy za pomocą '" + miecz + "'.");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                " - Wojownik{" +
                "miecz='" + miecz + '\'' +
                '}';
    }
}
