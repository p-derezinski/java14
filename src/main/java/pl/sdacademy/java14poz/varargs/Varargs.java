package pl.sdacademy.java14poz.varargs;

import pl.sdacademy.java14poz.sklep.Zamowienie;

public class Varargs {

    public static void main(String[] args) {

        Zamowienie zamowienie1 = new Zamowienie(1, 12.99);
        Zamowienie zamowienie2 = new Zamowienie(2, 2.99);
        Zamowienie zamowienie3 = new Zamowienie(3, 0.99);

        double suma1 = sumaZamowien(zamowienie1, zamowienie2, zamowienie3);
        double suma2 = sumaZamowien2(zamowienie1, zamowienie2);
        double suma3 = sumaZamowien3(zamowienie1, zamowienie2, zamowienie3);

        System.out.print("Wyswietlanie - suma2: ");
        System.out.println(suma2);

        System.out.print("Wyswietlanie - suma1: ");
        System.out.println(suma1);

        System.out.print("Wyswietlanie - suma3: ");
        System.out.println(suma3);

    }

    // metoda zawierajaca w argumencie "..." - wiele elementów
    public static double sumaZamowien(Zamowienie... zamowienia) {
        double suma = 0;
        for (int i = 0; i < zamowienia.length; i++) {
            suma += zamowienia[i].pobierzCena();
        }
        return suma;
    }

    // metoda jak wyzej (wiele argumentow), tylko inna wersja petli for
    public static double sumaZamowien3(Zamowienie... zamowienia) {
        double suma = 0;
        for (Zamowienie zamowienie: zamowienia) {
            suma += zamowienie.pobierzCena();
        }
        return suma;
    }

    // metoda zawierajaca dokładnie 2 argumenty
    public static double sumaZamowien2(Zamowienie zamowienie1, Zamowienie zamowienie2) {
        return zamowienie1.pobierzCena() + zamowienie2.pobierzCena();
    }

}
