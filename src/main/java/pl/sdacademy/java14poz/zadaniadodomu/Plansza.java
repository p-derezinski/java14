package pl.sdacademy.java14poz.zadaniadodomu;

public class Plansza {

    public static void main(String[] args) {

        Punkt punktA = new Punkt(5, 12);
        Punkt punktB = new Punkt(7, 12);
        Punkt punktC = new Punkt(3, 8);

        System.out.println(punktA);
        System.out.println(punktB);
        System.out.println(punktC);

        System.out.println(obliczOdleglosc(punktA, punktB));
        System.out.println(obliczOdleglosc(punktA, punktC));
        System.out.println(obliczOdleglosc(punktB, punktC));
    }

    public static double obliczOdleglosc(Punkt punkt1, Punkt punkt2) {
        int odlegloscX = punkt1.getX() - punkt2.getX();
        int odlegloscY = punkt1.getY() - punkt2.getY();
        return Math.sqrt((odlegloscX * odlegloscX) + (odlegloscY * odlegloscY));
    }

}
