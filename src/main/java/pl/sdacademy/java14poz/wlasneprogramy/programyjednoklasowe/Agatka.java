package pl.sdacademy.java14poz.wlasneprogramy.programyjednoklasowe;

import java.util.Scanner;

public class Agatka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean correct = false;
        while (!correct) {
            System.out.println("\nKtóra koleżanka jest najfajniejsza?");
            String imie = scanner.nextLine();
            if (imie.equals("Agatka")) {
                StringBuilder sb = new StringBuilder();
                sb.append("   _    _\n").append(" /   \\/   \\\n").append("|          |\n");
                sb.append(" \\ AGATKA /\n").append("  \\      /\n").append("   \\    /\n");
                sb.append("    \\  /\n").append("     \\/\n");
                System.out.println(sb);
                correct = true;
            } else {
                System.out.println("No chyba żartujesz... Facepalm...");
            }
        }
    }
}
