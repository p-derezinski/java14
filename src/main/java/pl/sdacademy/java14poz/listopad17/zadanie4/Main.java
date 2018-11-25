package pl.sdacademy.java14poz.listopad17.zadanie4;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Ola", "Kowalska", 25);
        Student student1 = new Student("Jacek", "Nowak", 20, 23090, "MIT", "physics");
        Employee employee1 = new Employee("John", "Smith", 30, 2500, "developer");

        System.out.println(person1);
        System.out.println(student1);
        System.out.println(employee1);

    }

}
