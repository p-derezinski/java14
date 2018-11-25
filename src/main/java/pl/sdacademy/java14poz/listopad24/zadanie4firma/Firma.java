package pl.sdacademy.java14poz.listopad24.zadanie4firma;

import java.util.Arrays;

public class Firma {

    private String name;
    private Pracownik[] pracownicy;
    private static final int MAX_EMPLOYEES_COUNT = 2;
    private int aktualnaIlosc = 0;

    public Firma(String name) {
        this.name = name;
        this.pracownicy = new Pracownik[MAX_EMPLOYEES_COUNT];
        //this.aktualnaIlosc = 0;
    }

    public boolean dodajPracownika(Pracownik pracownik) {

        // można ewentualnie dodać wyjątek - w sytuacji, gdyby ktoś chciał dodać pracownika, który jest nullem
//        if (pracownik == null) {
//            throw new IllegalArgumentException("Pracownik nie może być nullem");
//        }

        if (aktualnaIlosc == MAX_EMPLOYEES_COUNT) {
            return false;
        }
        pracownicy[aktualnaIlosc++] = pracownik;
        return true;

//        // zapis poniżej robi to samo, ale w zasadzie jest troszkę mniej czytelny
//        if (aktualnaIlosc < MAX_EMPLOYEES_COUNT) {
//            pracownicy[aktualnaIlosc++] = pracownik;
//            return true;
//        }
//        return false;
    }

    public boolean usunPracownika(Pracownik pracownik) {
        return false;
    }

    public boolean usunPracownika(int id) {
        return false;
    }

    // z tej metody nie będę jednak korzystać
    public String wyswietlPracownikow() {
        if (aktualnaIlosc == 0) {
            return "Firma " + getName() + " nie posiada aktualnie żadnego pracownika.";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Lista pracowników firmy " + getName() + ":");
        int licznik = 1;
        for (int i = 0; i < pracownicy.length; i++) {
            if (pracownicy[i] != null) {
                sb.append("\n\t" + licznik + ". " + pracownicy[i].toString());
                licznik++;
            }
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // taką  metodę używałem w case 1 (wersja 2), ale jednak zrobimy inaczej (inna metoda getPracownicy() )
//    public Pracownik[] getPracownicy() {
//        return pracownicy;
//    }
    public Pracownik[] getPracownicy() {
        return Arrays.copyOf(pracownicy, aktualnaIlosc);
    }

    public void setPracownicy(Pracownik[] pracownicy) {
        this.pracownicy = pracownicy;
    }

    public int getAktualnaIlosc() {
        return aktualnaIlosc;
    }
}
