package pl.sdacademy.java14poz.typydanych;

public class Main {

    public static void main(String[] args) {
        // typ danych prymitywny / prosty
        int liczbaA;
        liczbaA = 5;

        // typ danych obiektowy
        Integer liczbaB;
        liczbaB = 3;
        liczbaB = new Integer(3);
        liczbaB.compareTo(7);

        boolean czyAWieksza = liczbaA > liczbaB;
        boolean czyAWieksza2 = liczbaB.compareTo(liczbaA) > 0;

        System.out.println(czyAWieksza);
        System.out.println(czyAWieksza2);

        String napis = "napis";
        String znak = "b";
        System.out.println("Czy w napisie '" + napis + "' jest znak: " + znak);
        boolean czyZawiera = napis.contains(znak);
        System.out.println(czyZawiera);


        System.out.println("******************");

        System.out.println(czyNapisZawieraZnak("Java", "v"));
    }

    public static boolean czyNapisZawieraZnak(String napis, CharSequence znak) {
        return napis.contains(znak);
    }
}
