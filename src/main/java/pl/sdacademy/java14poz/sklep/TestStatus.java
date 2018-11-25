package pl.sdacademy.java14poz.sklep;

import javax.jws.soap.SOAPBinding;

public class TestStatus {

    public static void main(String[] args) {

        User uzytkownik = new User("Kazio", "Nowak", 25);
        // 1. System.out.println(uzytkownik);


        // to ponizej dotyczy sytuacji, kiedy jeszcze nie uzylismy enuma i "Aktywny" było Stringiem
//        uzytkownik.setStatus("Aktywny");
//        System.out.println(uzytkownik);
//
//        // jezeli uzytkownik jest aktywny, wypisz "imie nazwisko jest aktywny"
//        if (uzytkownik.getStatus() == "Aktywny") {
//            System.out.println(uzytkownik.getImie() + " " + uzytkownik.getNazwisko() + " jest aktywny");
//        }
//        // a tu wykorzystalismy metode equalsIgnoreCase, ktora nie zwraca uwagi na wielkosc liter
//        if (uzytkownik.getStatus().equalsIgnoreCase("aktywny")) {
//            System.out.println(uzytkownik.getImie() + " " + uzytkownik.getNazwisko() + " jest aktywny");
//        }

        uzytkownik.setStatus(User.TypStatus.AKTYWNY);
        // 2. System.out.println(uzytkownik);

        // jezeli uzytkownik jest aktywny, wypisz "imie nazwisko jest aktywny"
        if (uzytkownik.getStatus() == User.TypStatus.AKTYWNY) {
            System.out.println(uzytkownik.getImie() + " " + uzytkownik.getNazwisko() + " jest aktywny");
        }

        uzytkownik.setMiasto(Miasto.POZNAN);
        if (uzytkownik.getMiasto() == Miasto.POZNAN) {
            System.out.println("Użytkownik lokalny");
            uzytkownik.setStatus(User.TypStatus.LOCAL);
            // 3. System.out.println(uzytkownik);
        }

        User uzytkownik2 = new User("Alex", "Tomczak", 35, User.TypPlec.MEZCZYZNA);
        System.out.println(uzytkownik2);
        if (uzytkownik2.getPlec() == User.TypPlec.MEZCZYZNA) {
            System.out.println(uzytkownik2.getImie() + " jest mężczyzną");
        }

    }

}
