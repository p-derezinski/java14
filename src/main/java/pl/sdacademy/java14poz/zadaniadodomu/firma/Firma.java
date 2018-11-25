package pl.sdacademy.java14poz.zadaniadodomu.firma;

import java.util.ArrayList;
import java.util.List;

public class Firma {

    private List<Pracownik> pracownicy;
    public enum Czas {DZIEN, MIESIAC, ROK}
    public Czas czas;

    public Firma() {
        this.pracownicy = new ArrayList<Pracownik>();
    }

    public double obliczMiesiecznyKosztFirmy() {
        double miesiecznyKosztFirmy = 0;
        for (int i = 0; i < this.pracownicy.size(); i++) {
            miesiecznyKosztFirmy += this.pracownicy.get(i).getWynagrodzenieMies();
        }
        return miesiecznyKosztFirmy;
    }

    public double obliczRocznyKosztFirmy() {
        double miesiecznyKosztFirmy = 0;
        for (int i = 0; i < this.pracownicy.size(); i++) {
            miesiecznyKosztFirmy += this.pracownicy.get(i).getWynagrodzenieMies();
        }
        return miesiecznyKosztFirmy * 12;
    }

    public double obliczKosztFirmy(Czas czas, int jednostka) {
        double kosztFirmy = 0;
        for (int i = 0; i < this.pracownicy.size(); i++) {
            kosztFirmy += this.pracownicy.get(i).getWynagrodzenieMies();
        }
        switch (czas) {
            case DZIEN:
                kosztFirmy = kosztFirmy / 30 * jednostka;
                break;
            case MIESIAC:
                kosztFirmy *= jednostka;
                break;
            case ROK:
                kosztFirmy = kosztFirmy * 12 * jednostka;
                break;
        }
        return kosztFirmy;
    }

    public double srednieWynagrodzenie() {
        return obliczMiesiecznyKosztFirmy() / this.pracownicy.size();
    }

    public void dodajPracownika(Pracownik pracownik) {
        this.pracownicy.add(pracownik);
        System.out.println("Dodano pracownika - " + pracownik.getImie() + " " + pracownik.getNazwisko());
    }

    public void dodajPracownikaInteraktywnie(String imie, String nazwisko, double wynagrodzenieMies) {
        Pracownik pracownik = new Pracownik(imie, nazwisko, wynagrodzenieMies);
        this.pracownicy.add(pracownik);
        System.out.println("Dodano pracownika - " + pracownik.getImie() + " " + pracownik.getNazwisko());
    }

    public List<Pracownik> getPracownicy() {
        return pracownicy;
    }
}
