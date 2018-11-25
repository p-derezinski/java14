package pl.sdacademy.java14poz.timbuchalka.innerclasses;

import java.util.Scanner;

public class Main2 {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

        // zakomentowane poniżej to przykład "local class"

//        class ClickListener implements Button.OnClickListener {
//
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());


        // sześć linii kodu poniżej to przykład "annonymous class" - działanie programu praktycznie takie samo,
        // jak w przypadku "local class", ale tu nie tworzymy nazwy nowej klasy

        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });



        listen();

    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }

}
