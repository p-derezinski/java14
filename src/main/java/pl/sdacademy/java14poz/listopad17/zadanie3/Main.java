package pl.sdacademy.java14poz.listopad17.zadanie3;

public class Main {

    public static void main(String[] args) {

        Square square1 = new Square();
        //square1.obliczPole(3);
        //System.out.println(square1.obliczPole(3));
        square1.obliczPole(3);
        System.out.println(square1.getPole());
        System.out.println(square1);
        square1.obliczObwod(3);
        System.out.println(square1);

        Circle circle1 = new Circle();
        //System.out.println(circle1.obliczPole(1));

    }

}
