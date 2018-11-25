package pl.sdacademy.java14poz.listopad24.zadanie3writetofile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFileExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst i zapiszę go do pliku");
        String text = scanner.nextLine();

        System.out.println("Podaj ścieżkę do zapisu:");
        String path = scanner.nextLine();

        // zapis do pliku
        //  try with resources
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))){
                         // true zapewnia dopisanie czegoś do już istniejącego pliku (append, na końcu pliku); domyślnie jest false
            writer.write(text);
        } catch (IOException e) {
            System.out.println("Nie udało się zapisać do pliku... buuuuuu.....");
        }
    }
}
