package pl.sdacademy.java14poz.listopad17.zadanie4;

public class Employee extends Person {

    private double salary;
    private String position;

    public Employee(String name, String lastName, int age, double salary, String position) {
        super(name, lastName, age);
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Employee{" +
                "salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
