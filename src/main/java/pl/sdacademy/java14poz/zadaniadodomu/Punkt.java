package pl.sdacademy.java14poz.zadaniadodomu;

public class Punkt {

    int x;
    int y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Współrzędne punktu: (" + this.x + ", " + this.y + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
