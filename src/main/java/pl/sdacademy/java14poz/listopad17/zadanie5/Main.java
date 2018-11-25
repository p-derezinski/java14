package pl.sdacademy.java14poz.listopad17.zadanie5;

public class Main {

    public static void main(String[] args) {

//        Mag mag1 = new Mag("Merlin", 100, 165, 2, 7, 9, "kostur Merlina", "księga zaklęć");
//        Wojownik wojownik1 = new Wojownik("Król Artur", 40, 175, 6, 6, 7, "Excalibur");
//        Paladyn paladyn1 = new Paladyn("Mieszko", 38, 180, 9, 8, 3, "topór Mieszka", "tarcza Mieszka");
//
//        System.out.println(mag1);
//        System.out.println(wojownik1);
//        System.out.println(paladyn1);
//        mag1.walcz();
//        wojownik1.walcz();
//        paladyn1.walcz();

        System.out.println();

        Character character = new Mag("Merlin", 100, 165, 2, 7, 9, "kostur Merlina", "księga zaklęć");
        System.out.println(character);
        try {
            character.walcz();
        } catch (MagKosturException magKosturE) {
            System.out.println(magKosturE.getMessage());
        } catch (Exception ex) {
            System.out.println("Nieznany błąd " + ex.getMessage());
        }

        System.out.println();

        character = new Wojownik("Król Artur", 40, 175, 6, 6, 7, "Excalibur");
        System.out.println(character);
        try {
            character.walcz();
        } catch (WojownikMieczException wojMieczE) {
            System.out.println(wojMieczE.getMessage());
        } catch (Exception ex) {
            System.out.println("Nieznany błąd " + ex.getMessage());
        }

        System.out.println();

        character = new Paladyn("Mieszko", 38, 180, 9, 8, 3, "topór Mieszka", "tarcza Mieszka");
        System.out.println(character);
        try {
            character.walcz();
        } catch (PaladynTarczaException palTarczaE) {
            System.out.println(palTarczaE.getMessage());
        } catch (Exception ex) {
            System.out.println("Nieznany błąd " + ex.getMessage());
        }

    }

}
