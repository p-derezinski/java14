package pl.sdacademy.java14poz.zadaniadodomu;

public class Ksiazka {

    private String tytul;
    private String autor;
    private int rokWydania;

    public Ksiazka(String tytul, String autor, int rokWydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }

    public String toString() {
        return "\"" + this.tytul + "\", " + this.autor + ", " + this.rokWydania;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }
}
