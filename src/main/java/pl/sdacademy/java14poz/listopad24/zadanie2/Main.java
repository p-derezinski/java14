package pl.sdacademy.java14poz.listopad24.zadanie2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    private static final String PATH_TO_FILE = "D:\\Programowanie\\Java Masterclass - Tim\\JavaPrograms\\java14poz\\mojplik.txt";
    //private static final String PATH_TO_FILE = "D:\\Programodsfdfdssd\\JavaPrograms\\java14poz\\mojplik.txt";

    public static void main(String[] args) {

        try {
            // decorator pattern (wzorzec projektowy)
            BufferedReader reader = new BufferedReader(new FileReader(PATH_TO_FILE));
            String line;

            System.out.println();

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // ciekawostka - pętla poniżej robi to samo, co pętla powyżej
//            for(;;) {
//                line = reader.readLine();
//                if (line == null) {
//                    break;
//                }
//                System.out.println(line);
//            }

        } catch (FileNotFoundException e) {                // plik nie istnieje
            //System.out.println("Wyjątek! (getLocalizedMessage) " + e.getLocalizedMessage());
            //System.out.println("Wyjątek! (getMessage) " + e.getMessage());
            e.printStackTrace();       // lub np. sout("Nie znaleziono pliku!")
        } catch (IOException e) {                          // plik istnieje, ale nie udało się z niego czytać
            e.printStackTrace();       // lub np. sout("Nastąpił błąd odczytu błędu")

                                             // mozna zostawić tylko ten drugi catch, bo on jest bardziej ogólny
                                             // i obsługuje też ten wyjątek zz pierwszego catch (bardziej szczegołowy)
                                             //  - to wynika z dziedziczenia (IOException jest nadklasą dla FileNotFoundException)
        }
    }
}
