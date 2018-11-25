package pl.sdacademy.java14poz.listopad17.zadanie3;

public class Square extends Shape {

    @Override
    public void obliczPole(int a) {
        super.setPole(a * a);
    }

    @Override
    public void obliczObwod(int a) {
        super.setObwod(4 * a);
    }
}
