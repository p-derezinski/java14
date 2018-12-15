package pl.sdacademy.java14poz.grudzien0809.zadanie_6_Games;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean exit = false;
        while (!exit) {
            printMenu();
            String chosenOption = scanner.nextLine();
            //int chosenOption = scanner.nextInt();
            //scanner.nextLine();
            switch (chosenOption) {
                case "1":
                    playHangman();
                    break;
                case "2":
                    System.out.print("Podaj hasło, które chcesz dodać do bazy: ");
                    String newPassword = scanner.nextLine();
                    Hangman.addPasswordToFile(newPassword);
                    break;
                case "3":
                    playTicTacToe();
                    break;
                case "4":
                    exit = true;
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja");
                    break;
            }
        }

    }

    private static void playTicTacToe() {              // nie skończone
        TicTacToe ticTacToe = new TicTacToe();
        String fieldNumber = scanner.nextLine();
        if (fieldNumber.isEmpty()) {
            System.out.println("Proszę wprowadź numer pola:");
        }
        //ticTacToe.playMove(Integer.valueOf(fieldNumber));
    }

    private static void playHangman() {
        Hangman hangman = new Hangman();
        while (!hangman.isGameOver()) {
            System.out.print("Podaj literę: ");
            String letter = scanner.nextLine();
            if (letter.isEmpty()) {
                System.out.println("Proszę wprowadź znak!");
                continue;
            }
            hangman.checkLetter(letter.charAt(0));
            System.out.println(hangman.getBlurryPassword());
//            if (hangman.getBlurryPassword().equals(hangman.getPassword())) {
//                System.out.println("Wygrałeś :)");
//            }
        }
    }

    public static void printMenu() {
        System.out.print("--------------------------------------------------\n" +
                "Available options. Press:\n" +
                //"\t0 - to \n" +
                "\t1 - to start a new Hangman game\n" +
                "\t2 - to add a new password to the list of Hangman passwords\n" +
                "\t3 - to start a new Kółko i krzyżyk game\n" +
                "\t4 - to close the programm\n" +
                "--------------------------------------------------\n" +
                "Chosen option: ");
    }

}
