package pl.sdacademy.java14poz.operatory;

public class OperatoryArytmetyczne {

    public static void main(String[] args) {

        //  % - modulo (mod, reszta z dzielenia)
        int liczbaA = 81;
        int liczbaB = 81 % 10;
        System.out.println(liczbaB); // 1

        int liczbaC = liczbaA % 7;
        System.out.println(liczbaC); // 4

        int liczbaD = 100;
        liczbaD = liczbaD + 1;
        System.out.println(liczbaD); // 101
        liczbaD++;
        System.out.println(liczbaD); // 102

        liczbaD--;
        liczbaD--;
        liczbaD--;
        System.out.println(liczbaD); // 99
    }

}
