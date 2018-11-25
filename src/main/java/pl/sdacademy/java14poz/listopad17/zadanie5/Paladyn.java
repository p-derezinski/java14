package pl.sdacademy.java14poz.listopad17.zadanie5;

public class Paladyn extends Character {

    private String topor;
    private String tarcza;

    public Paladyn(String imie, int wiek, int wzrost, int sila, int obrona, int moc, String topor, String tarcza) {
        super(imie, wiek, wzrost, sila, obrona, moc);
        this.topor = topor;
        this.tarcza = tarcza;
    }

    @Override
    public void walcz() throws PaladynTarczaException {
        if (tarcza == null) {
            throw new PaladynTarczaException("Paladyn " + getImie() + " zgubil tarczę!");
        } else {
            System.out.println("Paladyn " + getImie() + " walczy za pomocą '" + topor + "' oraz broni się za pomocą '" + tarcza + "'.");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                " - Paladyn{" +
                "topor='" + topor + '\'' +
                ", tarcza='" + tarcza + '\'' +
                '}';
    }
}
