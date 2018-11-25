package pl.sdacademy.java14poz.listopad17.zadanie4;

public class Student extends Person {

    private int indexNumber;
    private String university;
    private String faculty;

    public Student(String name, String lastName, int age, int indexNumber, String university, String faculty) {
        super(name, lastName, age);
        this.indexNumber = indexNumber;
        this.university = university;
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Student{" +
                "indexNumber=" + indexNumber +
                ", university='" + university + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
