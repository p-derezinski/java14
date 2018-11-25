package pl.sdacademy.java14poz.listopad17.zadanie5;

public class Mag extends Character {

    private String kostur;
    private String ksiega;

    public Mag(String imie, int wiek, int wzrost, int sila, int obrona, int moc, String kostur, String ksiega) {
        super(imie, wiek, wzrost, sila, obrona, moc);
        this.kostur = kostur;
        this.ksiega = ksiega;
    }

    @Override
    public void walcz() throws MagKosturException{
        if (kostur == null) {
            throw new MagKosturException("Mag " + getImie() + " zgubił kostur!");
        } else {
            System.out.println("Mag " + getImie() + " walczy za pomocą '" + kostur + "' oraz rzuca zaklęcia z '" + ksiega + "'.");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                " - Mag{" +
                "kostur='" + kostur + '\'' +
                ", ksiega='" + ksiega + '\'' +
                '}';
    }
}
