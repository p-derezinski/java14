package pl.sdacademy.java14poz.operatory;

public class OperatoryLogiczne {

    public static void main(String[] args) {

        boolean czyDzieckoMozeJechac;

        boolean zgodaMamy;
        boolean zgodaTaty;
        zgodaMamy = true;
        zgodaTaty = false;

        czyDzieckoMozeJechac = zgodaMamy && zgodaTaty;
        System.out.print("Czy dziecko może jechac? - ");
        System.out.println(czyDzieckoMozeJechac);

        boolean czyDzieckoMozeNocowacUKolegi;
        czyDzieckoMozeNocowacUKolegi = zgodaMamy || zgodaTaty;
        System.out.print("Czy dziecko może nocowac u kolegi? - ");
        System.out.println(czyDzieckoMozeNocowacUKolegi);

        boolean czyDzieckoMozeGracNaKonsoli;
        boolean czyDzieckoMakAre = true;
        czyDzieckoMozeGracNaKonsoli = !czyDzieckoMakAre;
        System.out.print("Czy dziecko moze grac na konsoli? - ");
        System.out.println(czyDzieckoMozeGracNaKonsoli);

    }

}
