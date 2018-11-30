package pl.sdacademy.java14poz.listopad24.zadanie4firma;

import pl.sdacademy.java14poz.listopad24.zadanie4firma.writer.PracownikWriter;
import pl.sdacademy.java14poz.listopad24.zadanie4firma.writer.TxtPracownikWriter;
import pl.sdacademy.java14poz.listopad24.zadanie4firma.writer.WriterFactory;
import pl.sdacademy.java14poz.listopad24.zadanie4firma.writer.XmlPracownikWriter;

import java.io.*;
import java.util.Scanner;

public class Application {

    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH_TO_FILE = "D:\\Programowanie\\Java Masterclass - Tim\\JavaPrograms\\java14poz\\listapracownikow.txt";

    public static void main(String[] args) {

        Firma firma = new Firma("SDA");
        System.out.println("\nWitaj w firmie " + firma.getName() + "!");
        boolean czyWyjsc = false;
        while (!czyWyjsc) {
            printMenu();
            System.out.print("Wybór: ");
            int wybor = scanner.nextInt();
            //scanner.nextLine();
            switch (wybor) {
                case 1:
                    //System.out.println(firma.wyswietlPracownikow());      // jednak nie będę korzystać z tej metody z klasy Firma

                    // wersja 2 (ale jednak zrobimy inaczej - wersja 3)
//                    if (firma.getAktualnaIlosc() == 0) {
//                        System.out.println("Firma " + firma.getName() + " nie posiada aktualnie żadnego pracownika.");
//                    } else {
//                        System.out.println("Lista pracowników firmy " + firma.getName() + ":");
//                        int licznik = 1;
//                        for (int i = 0; i < firma.getPracownicy().length; i++) {
//                            if (firma.getPracownicy()[i] != null) {
//                                System.out.println("\t" + licznik + ". " + firma.getPracownicy()[i].toString());
//                                licznik++;
//                            }
//                        }
//                    }

                    // wersja 3
                    wyswietlPracownikowWersja3(firma);
                    break;
                case 2:
                    wstawPracownika(firma);
                    break;
                case 3:
                    usunPracownikaZFirmy(firma);
                    break;
                case 4:
                    wczytajZPliku();
                    break;
                case 5:
                    //zapiszDoPliku(firma);

                    System.out.print("Podaj nazwę pliku do zapisu listy pracowników: ");
                    String fileName = scanner.next();
                    System.out.println("Zapisuje do pliku " + fileName + "...");
                    PracownikWriter writer = WriterFactory.createWriter(fileName);
                    if (writer != null) {
                        writer.write(firma.getPracownicy());
                    } else {
                        System.out.println("Nie obsługiwane rozszerzenie. Obsługiwane to tylko .txt i .xml");
                    }

                    break;
                case 0:
                    czyWyjsc = true;
                    break;
            }
        }
    }

    private static void usunPracownikaZFirmy(Firma firma) {
        System.out.print("Podaj nazwisko pracownika, którego chcesz usunąć: ");
        String nazwisko = scanner.next();
        boolean wynik = firma.usunPracownika(nazwisko);
        String message = wynik ?
                "Pracownik o nazwisku " + nazwisko + " został usunięty."
                : "W firmie " + firma.getName() + " nie pracuje osoba o nazwisku " + nazwisko + ".";
        System.out.println(message);
    }

    private static void wyswietlPracownikowWersja3(Firma firma) {
        Pracownik[] pracownicy = firma.getPracownicy();
        if (pracownicy.length == 0) {
            System.out.println("Firma " + firma.getName() + " nie posiada aktualnie żadnego pracownika.");
        } else {
            System.out.println("Lista pracowników firmy " + firma.getName() + ":");
            int licznik = 1;
            for (Pracownik prac : pracownicy) {
                System.out.println(prac);
                licznik++;
            }
        }
    }

    private static void wstawPracownika(Firma firma) {
        System.out.print("Wprowadź imię pracownika: ");
        String imie = scanner.next();
        System.out.print("Wprowadź nazwisko pracownika: ");
        String nazwisko = scanner.next();
        System.out.print("Wprowadź pensję pracownika: ");
        double pensja = scanner.nextDouble();
        //scanner.nextLine();
        System.out.print("Wprowadź email pracownika: ");
        String email = scanner.next();
        System.out.print("Wprowadź id pracownika: ");
        int id = scanner.nextInt();
        Pracownik pracownik = new Pracownik(imie, nazwisko, pensja, email, id);
        boolean wynik = firma.dodajPracownika(pracownik);
        if (wynik) {
            System.out.println("Nowy pracownik '" + pracownik.getImie() + " " + pracownik.getNazwisko() + "' został dodany do bazy.");
        } else {
            System.out.println("Osiągnięto maksymalną ilość pracowników. '" + pracownik.getImie() + " " + pracownik.getNazwisko() + "' nie został dodany do bazy.");
        }

//                    // operator trójargumentowy
//                    System.out.println(wynik == true
//                                        ? "Nowy pracownik zostal dodany"
//                                        : "Nie udało się dodać pracownika");
//
//                    // albo zapis jak poniżej, wynik działania będzie taki sam
//                    String message = wynik ? "Nowy pracownik został dodany" : "Nie udało się dodać pracownika";
//                    System.out.println(message);
    }

    private static void printMenu() {
        System.out.println("1. Wyświetl pracowników");
        System.out.println("2. Dodaj nowego pracownika");
        System.out.println("3. Usuń pracownika");
        System.out.println("4. Wczytaj z pliku");
        System.out.println("5. Zapisz do pliku");
        System.out.println("0. Wyjście");
    }

    private static void zapiszDoPliku(Firma firma) {
        System.out.print("Podaj nazwę pliku do zapisu listy pracowników: ");
        String fileName = scanner.next();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            writer.write(firma.wyswietlPracownikow());
            System.out.println("Lista pracowników została zapisana w pliku: " + fileName + ".");
        } catch (IOException e) {
            System.out.println("Nie udało się zapisać do pliku... ehhhhh.....");
        }
    }

    private static void wczytajZPliku() {
        try {
            System.out.println("Wczytano listę pracowników z pliku: " + PATH_TO_FILE);
            BufferedReader reader = new BufferedReader(new FileReader(PATH_TO_FILE));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku... buuu...");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Nastąpił błąd odczytu pliku... O nie....");
            e.printStackTrace();
        }
    }

}
