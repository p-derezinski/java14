package pl.sdacademy.java14poz.zadaniadodomu.firma;

public class ProwadzenieFirmy {

    // W tej klasie wykorzystuje:
    // - dodawanie Pracownika do Firmy (do ArrayList przechowującej pracowników) na trzy sposoby:
    //     > przez wywołanie na obiekcie Firma metody getPracownicy() (z klasy Firma) i nastepnie metody add(pracownik)
    //     > przez wywołanie na obiekcie Firma metody dodajPracownika(pracownik) (z klasy Firma), która dodaje pracownika do ArrayList
    //     > przez wywołanie na obiekcie Firma metody dodajPracownkaInteraktywnie(imie, nazw, wynagr) (z klasy Firma)

    public static void main(String[] args) {

        Firma uniwersytet = new Firma();
        Pracownik kierownik = new Pracownik("Jan", "Matysiak", 4000);
        Pracownik adiunkt1 = new Pracownik("Paweł", "Dereziński", 3500);
        Pracownik adiunkt2 = new Pracownik("Agnieszka", "Klupczyńska", 3500);
        Pracownik asystent1 = new Pracownik("Szymon", "Plewa", 3000);
        Pracownik asystent2 = new Pracownik("Agata", "Swiatły", 3000);
        Pracownik asystent3 = new Pracownik("Eliza", "Matuszewska", 2800);
        Pracownik technik1 = new Pracownik("Renata", "Marczewska", 2000);
        //Pracownik sekretarka = new Pracownik("Monika", "Nowak", 2500);
        Pracownik starszyWykl1 = new Pracownik("Barbara", "Cwiertnia", 3600);
        Pracownik starszyWykl2 = new Pracownik("Anna", "Lutka", 3600);
        uniwersytet.getPracownicy().add(kierownik);
        uniwersytet.getPracownicy().add(adiunkt1);
        uniwersytet.getPracownicy().add(adiunkt2);
        uniwersytet.getPracownicy().add(asystent1);
        uniwersytet.getPracownicy().add(asystent2);
        uniwersytet.getPracownicy().add(asystent3);
        uniwersytet.getPracownicy().add(technik1);
        //uniwersytet.getPracownicy().add(sekretarka);
        uniwersytet.dodajPracownikaInteraktywnie("Monika", "Nowak", 2500);
        uniwersytet.dodajPracownika(starszyWykl1);
        uniwersytet.dodajPracownika(starszyWykl2);
        System.out.println("Miesięczny koszt firmy: " + uniwersytet.obliczMiesiecznyKosztFirmy());
        System.out.println("Roczny koszt firmy: " + uniwersytet.obliczRocznyKosztFirmy());
        System.out.println("5-dniowy koszt firmy: " + uniwersytet.obliczKosztFirmy(Firma.Czas.DZIEN, 5));
        System.out.println("4-miesięczny koszt firmy: " + uniwersytet.obliczKosztFirmy(Firma.Czas.MIESIAC, 4));
        System.out.println("3-letni koszt firmy: " + uniwersytet.obliczKosztFirmy(Firma.Czas.ROK, 3));
        System.out.println("Srednie wynagrodzenie w firmie: " + uniwersytet.srednieWynagrodzenie());

    }

}
