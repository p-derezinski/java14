package pl.sdacademy.java14poz.instrukcjawarunkowa;

public class InstrWarunkowa {

    public static void main(String[] args) {

        int temperatura = 10;
        boolean jestZimno = temperatura < 0;

        if (jestZimno) {
            System.out.println("Jest zimno");
        } else {
            System.out.println("Nie jest zimno");
        }

        // nie jest zimno, wylacz ogrzewanie
        if (!jestZimno) {
            System.out.println("Ogrzewanie wylaczone");
        }

    }

}
