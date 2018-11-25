package pl.sdacademy.java14poz.listopad17.zadanie3;

public class Circle extends Shape {

    @Override
    public void obliczPole(int a) {
        super.setPole(Math.PI * a * a);
    }

    @Override
    public void obliczObwod(int a) {
        super.setObwod(2 * Math.PI * a);
    }
}
