package pl.sdacademy.java14poz.zadaniadodomu.wyscigikoni;

public class Trasa {

    private String name;
    private int dlugosc;
    private int trudnosc;

    public Trasa(String name, int dlugosc, int trudnosc) {
        this.name = name;
        this.dlugosc = dlugosc;
        this.trudnosc = trudnosc;
    }

    public String getName() {
        return name;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public int getTrudnosc() {
        return trudnosc;
    }
}
