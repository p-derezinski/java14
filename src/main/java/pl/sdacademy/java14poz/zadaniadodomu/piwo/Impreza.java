package pl.sdacademy.java14poz.zadaniadodomu.piwo;

import java.util.Random;

public class Impreza {

    private static GatunekPiwa[] tablica = new GatunekPiwa[2];

    public Impreza() {
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = losujPiwo();
            if (tablica[0].equals(tablica[1])) {
                i--;
            }
        }
    }

    public static GatunekPiwa losujPiwo() {
        Random random = new Random();
        return GatunekPiwa.values()[random.nextInt(GatunekPiwa.values().length)];
    }

    public static void wyswietlPiwa() {
//        for (int i = 0; i < tablica.length; i++) {
//            System.out.println(GatunekPiwa.opiszPiwo(tablica[i]));
//        }
        System.out.println("Dostępne piwa to: " + GatunekPiwa.opiszPiwo(tablica[0]) + " oraz " + GatunekPiwa.opiszPiwo(tablica[1]) + ".");
    }

    public static void main(String[] args) {
        Impreza impreza = new Impreza();
        wyswietlPiwa();
    }
}
