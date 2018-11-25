package pl.sdacademy.java14poz.zadaniadodomu.obslugazamowien;

public class ObslugaZamowien {

    public static void main(String[] args) {

        Zamowienie zamowienie1 = new Zamowienie(4);
        Pozycja pozycja1 = new Pozycja("Chleb", 2, 2);
        Pozycja pozycja2 = new Pozycja("Banany", 1, 6);
        Pozycja pozycja3 = new Pozycja("Płatki owsiane", 3, 4.50);
        Pozycja pozycja4 = new Pozycja("Miód", 1, 25);
        Pozycja pozycja5 = new Pozycja("Woda", 2, 1.50);
        zamowienie1.dodajPozycje(pozycja1);
        zamowienie1.dodajPozycje(pozycja2);
        zamowienie1.dodajPozycje(pozycja3);
        zamowienie1.dodajPozycje(pozycja4);
        zamowienie1.dodajPozycje(pozycja5);
        System.out.println(zamowienie1.toString());

    }

}
