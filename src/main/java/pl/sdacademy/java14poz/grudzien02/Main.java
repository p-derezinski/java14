package pl.sdacademy.java14poz.grudzien02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter your age: ");
        int age = scanner.nextInt();
        if (isAnAdult(age)) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are still just a child.");
        }

    }

    public static boolean isAnAdult(int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }

}
