package pl.sdacademy.java14poz.zadaniadodomu.wyscigikoni;

public class Kon {

    private String name;
    private int szybkosc;
    private int wytrzymalosc;
    private int odwaga;

    public Kon(String name, int szybkosc, int wytrzymalosc, int odwaga) {
        this.name = name;
        this.szybkosc = szybkosc;
        this.wytrzymalosc = wytrzymalosc;
        this.odwaga = odwaga;
    }

    public String getName() {
        return name;
    }

    public int getSzybkosc() {
        return szybkosc;
    }

    public int getWytrzymalosc() {
        return wytrzymalosc;
    }

    public int getOdwaga() {
        return odwaga;
    }
}
