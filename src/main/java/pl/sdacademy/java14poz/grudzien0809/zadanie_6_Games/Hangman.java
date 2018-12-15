package pl.sdacademy.java14poz.grudzien0809.zadanie_6_Games;

import java.io.*;
import java.util.Random;

public class Hangman {

    final static String UNKNOWN_LETTER = "*";
    private int healthPoints = 20;
    private String password;
    private String userInput = "";

    private static final String PATH_TO_FILE = "D:\\Programowanie\\Java Masterclass - Tim\\JavaPrograms\\java14poz\\wisielec_hasla.txt";
    private int lineCounter = 0;
    Random random = new Random();

    public Hangman(String password) {
        this.password = password.toLowerCase();
    }

    public Hangman() {
        // todo - read password from file
        try {
            System.out.println("Wczytano listę haseł z pliku: " + PATH_TO_FILE);
            BufferedReader reader = new BufferedReader(new FileReader(PATH_TO_FILE));
            //BufferedReader reader2 = new BufferedReader(new FileReader(PATH_TO_FILE));
            String line;
            while ((line = reader.readLine()) != null) {
                lineCounter++;
            }
            String[] passTable = new String[lineCounter];
            reader = new BufferedReader(new FileReader(PATH_TO_FILE));
            for(int i = 0; i < lineCounter; i++){
                passTable[i] = reader.readLine();
            }
            password = passTable[random.nextInt(lineCounter)].toLowerCase();
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku... buuu...");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Nastąpił błąd odczytu pliku... O nie....");
            e.printStackTrace();
        }

    }

    public boolean checkLetter(char letter) {
        userInput += Character.toLowerCase(letter);
        if (isPasswordContainsChar(letter)) {
        //if (password.contains(String.valueOf(Character.toLowerCase(letter)))) {
            if (isWin()) {
                System.out.println("GRATULACJE! Wygrałeś :)");
            } else {
                System.out.println("Trafiłeś!");
            }
            return true;
        } else {
            System.out.println("Pudło!");
            healthPoints--;
            if (isGameOver()) {
                System.out.println("Przegrałeś :(");
            }
            return false;
        }
    }

    private boolean isPasswordContainsChar(char letter) {
        return password.contains(String.valueOf(letter).toLowerCase());
    }

    public String getBlurryPassword() {
        char[] letters = password.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < letters.length; i++) {
            if (userInput.contains(String.valueOf(letters[i]))) {
                sb.append(letters[i]);
            } else {
                sb.append(UNKNOWN_LETTER);
            }
        }
        return sb.toString();
    }

    public boolean isGameOver() {
        return healthPoints == 0 || isWin();            //getBlurryPassword().equals(password);
    }

    private boolean isWin() {
        return getBlurryPassword().equals(password);
    }

    public String getPassword() {
        return password;
    }

    public static void addPasswordToFile(String newWord) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH_TO_FILE, true))){
            writer.newLine();
            writer.write(newWord);
            System.out.println("Pomyślnie dodano nowe hasło do bazy.");
        } catch (IOException e) {
            System.out.println("Nie udało się zapisać do pliku.");
        }
    }
}
