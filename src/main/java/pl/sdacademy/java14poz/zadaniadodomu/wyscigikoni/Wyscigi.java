package pl.sdacademy.java14poz.zadaniadodomu.wyscigikoni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Wyscigi {

    static Kon kon1 = new Kon("Klara", 7, 4, 2);
    static Kon kon2 = new Kon("Loki", 2, 10, 5);
    static Kon kon3 = new Kon("Thunder", 10, 8, 6);
    static Kon kon4 = new Kon("Bill", 6, 2, 4);
    static Kon kon5 = new Kon("Herkules", 8, 7, 10);
    static List<Kon> listaKoni = new ArrayList<Kon>();
    static Trasa trasa1 = new Trasa("Tor wyścigowy", 10, 2);
    static Trasa trasa2 = new Trasa("Tor z przeszkodami", 15, 7);
    static Trasa trasa3 = new Trasa("Las", 50, 5);
    static Trasa trasa4 = new Trasa("Góry", 40, 10);
    static List<Trasa> listaTras = new ArrayList<Trasa>();

    public static void main(String[] args) {

        listaKoni.add(kon1);
        listaKoni.add(kon2);
        listaKoni.add(kon3);
        listaKoni.add(kon4);
        listaKoni.add(kon5);
        listaTras.add(trasa1);
        listaTras.add(trasa2);
        listaTras.add(trasa3);
        listaTras.add(trasa4);

//        Zaklad zaklad = new Zaklad();
//        zaklad.setTrasaWylosowana(trasa3);
//        zaklad.zapelnijListeDoLosowania();
//        for (int i = 0; i < zaklad.getListaDoLosowania().size(); i++) {
//            System.out.println(zaklad.getListaDoLosowania().get(i).getName());
//        }

        int saldo = 100;
        int counter = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n===  WYŚCIGI KONNE  ===");
        while (saldo > 1) {
            System.out.println("\nWyścig numer --> " + counter + " <--");
            Trasa trasaWylosowana = losujTrase();
            System.out.println("Trasa wyścigu - " + trasaWylosowana.getName());
            System.out.print("Którego konia obstawiasz jako zwycięzcę? - ");
            String imieKonia = scanner.nextLine();
            boolean czyStawkaOK = false;
            int stawka = 0;
            while (!czyStawkaOK) {
                System.out.print("Jaką ilość sztuk złota obstawiasz? - ");
                stawka = scanner.nextInt();
                scanner.nextLine();
                if (stawka > (saldo / 2)) {
                    System.out.println("Nie możesz obstawić więcej niż połowa Twojej ilości złota.");
                } else {
                    czyStawkaOK = true;
                }
            }
            saldo = obstaw(imieKonia, stawka, saldo, trasaWylosowana);
            System.out.println("Posiadana przez Ciebie obecnie ilość sztuk złota to: " + saldo);
            counter++;
        }
        System.out.println("\nZostała Ci ostatnia sztuka złota. Nie możesz już brać udziału w wyścigach.");
    }

    public static int obstaw(String imieKonia, int stawka, int saldo, Trasa trasaWylosowana) {
        Kon konTypowany = new Kon(imieKonia, 1, 1, 1);
        for (int i = 0; i < listaKoni.size(); i++) {
            if (imieKonia == listaKoni.get(i).getName()) {
                konTypowany = listaKoni.get(i);
            }
        }
        Kon konZwyciezca = startWyscigu(trasaWylosowana);
        if (konTypowany.getName().equals(konZwyciezca.getName())) {
            saldo += (stawka * 2);
            System.out.println("Brawo! Koń '" + konTypowany.getName() + "' wygrał wyścig.");
        } else {
            saldo -= stawka;
            System.out.println("Przegrywasz. Typowałeś konia: '" + konTypowany.getName() + "', a wygrał koń: '" + konZwyciezca.getName() + "'.");
        }
        return saldo;
    }

    public static Kon startWyscigu(Trasa trasaWylosowana) {
        Zaklad zaklad = new Zaklad();
        zaklad.setTrasaWylosowana(trasaWylosowana);
        zaklad.zapelnijListeDoLosowania();
        int iloscWirtualnychKoni = zaklad.getListaDoLosowania().size();
        double losowRandom = Math.random();
        int losowa = (int) (losowRandom * iloscWirtualnychKoni);
        Kon konZwyciezca = zaklad.getListaDoLosowania().get(losowa);
        return konZwyciezca;
    }

    public static Trasa losujTrase() {
        int iloscTras = listaTras.size();
        double losowaRandom = Math.random();
        int losowa = (int) (losowaRandom * iloscTras);
        Trasa trasaWylosowana = listaTras.get(losowa);
        return trasaWylosowana;
    }

}
