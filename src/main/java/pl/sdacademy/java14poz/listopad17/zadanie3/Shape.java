package pl.sdacademy.java14poz.listopad17.zadanie3;

public abstract class Shape {

    protected double pole = 0;
    protected double obwod = 0;


    public abstract void obliczPole(int a);
    public abstract void obliczObwod(int a);


    @Override
    public String toString() {
        return "Shape{" +
                "pole=" + pole +
                ", obwod=" + obwod +
                '}';
    }

    public double getPole() {
        return pole;
    }

    public void setPole(double pole) {
        this.pole = pole;
    }

    public double getObwod() {
        return obwod;
    }

    public void setObwod(double obwod) {
        this.obwod = obwod;
    }

    public double obliczCokolwiek() {
        return 12d;
    }

    public double zwieksz(double number) {
        return number++;
    }

}
