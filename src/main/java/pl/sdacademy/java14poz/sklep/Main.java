package pl.sdacademy.java14poz.sklep;

import pl.sdacademy.java14poz.obiekty.Kanapka;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Jan", "Kowalski", 25);
        Kanapka kanapka5 = new Kanapka("szynka, ser, jalapeno", 3);
        System.out.println(kanapka5);  // to jest rownowazne z zapisem System.out.println(kanapka5.toString());
        System.out.println(user1.toString());
        System.out.println(user1);


        Zamowienie zamowienie1 = new Zamowienie(1, 22.95);
        Zamowienie zamowienie2 = new Zamowienie(2, 5.20);
        Zamowienie zamowienie3 = new Zamowienie(3, 99.99);
        Zamowienie zamowienie4 = new Zamowienie(4, 35.63);
        Zamowienie zamowienie5 = new Zamowienie(5, 2.55);

        System.out.println(zamowienie1.toString());
        System.out.println(zamowienie2.toString());
        System.out.println(zamowienie3);
        System.out.println(zamowienie4.toString());
        System.out.println(zamowienie5.toString());
        float suma = zamowienie1.pobierzCena() + zamowienie2.pobierzCena() + zamowienie3.pobierzCena() +
                zamowienie4.pobierzCena() + zamowienie5.pobierzCena();
        System.out.println("Suma zamówień wynosi: " + suma + " zł.");
        // System.out.printf(""); - uzupelnic!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.printf("Suma: %.2f zł", suma);
        System.out.println();


        StringBuilder budujNapis = new StringBuilder();
        budujNapis.append("======================\n");
        budujNapis.append("=== Lista Zamówień ===\n");
        budujNapis.append("======================\n");

        //StringBuilder budujListeZamowien = new StringBuilder();
        budujNapis.append('\t').append("-> ").append(zamowienie1.toString()).append('\n');
        budujNapis.append('\t').append("-> ").append(zamowienie2).append('\n');
        budujNapis.append('\t').append("-> ").append(zamowienie3).append('\n').append('\t').append("-> ").append(zamowienie4).append('\n');
        budujNapis.append('\t').append("-> ").append(zamowienie5).append('\n');

        budujNapis.append("======================\n");
        budujNapis.append(String.format("Suma: %.2f zł\n", suma));
        budujNapis.append("======================\n");

        System.out.println(budujNapis.toString());  // albo mozna pominac toString(), bo jest domyslne

        //System.out.println("==============================================");


    }

}
