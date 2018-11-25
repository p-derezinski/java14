package pl.sdacademy.java14poz.operatory;

public class OperatoryPrzypisania {

    public static void main(String[] args) {

        int liczbaA = 500;

        // zwiekszamy liczbaA o 50
        liczbaA = liczbaA + 50;
        System.out.println(liczbaA); // 550

        liczbaA += 50; // znak += można traktowac jako "zwieksz o"
        System.out.println(liczbaA); // 600

        liczbaA = liczbaA - 50;
        System.out.println(liczbaA); // 550

        liczbaA -= 50;
        System.out.println(liczbaA); // 500

        int liczbaB = 5;

        liczbaB = liczbaB * 5;
        System.out.println(liczbaB); // 25

        liczbaB *= 5;
        System.out.println(liczbaB); // 125

        int liczbaC = 81;

        liczbaC = liczbaC / 9;
        System.out.println(liczbaC); // 9

        liczbaC /= 9;
        System.out.println(liczbaC); // 1

    }

}
