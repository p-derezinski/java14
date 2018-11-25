package pl.sdacademy.java14poz.petle.petlawhile;

public class PetlaWhile {

    public static void main(String[] args) {

        boolean czyDzieckoPlacze = true;
        int iloscKolysanek = 0;

        while (czyDzieckoPlacze) {
            System.out.println("Dziecko placze...");
            if (iloscKolysanek == 5) {
                czyDzieckoPlacze = false;
            }
            iloscKolysanek++;
        }

        if (!czyDzieckoPlacze) {
            System.out.println("Dziecko już nie płacze.");
        }

    }

}
