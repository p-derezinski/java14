package pl.sdacademy.java14poz.operatory;

public class OperatoryRelacji {

    public static void main(String[] args) {

        int wiekMalgosi = 17;
        int wiekJasia = 19;
        int wiekJanusza = 43;
        int wiekPelnoletnosci = 18;

        boolean czyJestPelnoletni = wiekMalgosi >= wiekPelnoletnosci;
        System.out.println(czyJestPelnoletni); // false
        czyJestPelnoletni = wiekJasia > 17;
        System.out.println(czyJestPelnoletni); // true

        String miastoPoznan = "Poznań";
        String miastoKrakow = "Kraków";
        String miastoWroclaw = "Wrocław";
        String miastoMalgosi = "Łódź";
        String miastoJasia = "Wrocław";
        String miastoJanusza = "Kabul";

        System.out.print("Czy Małgosia mieszka w Poznaniu? - ");
        boolean czyMalgosiaMieszkaWPoznaniu = miastoMalgosi == miastoPoznan;
        System.out.println(czyMalgosiaMieszkaWPoznaniu); // false

        System.out.print("Czy Małgosia mieszka w Poznaniu? - ");
        czyMalgosiaMieszkaWPoznaniu = miastoMalgosi.equals(miastoPoznan);
        System.out.println(czyMalgosiaMieszkaWPoznaniu); // false

        System.out.print("Czy Malgosia jest pelnoletnia? - ");
        czyJestPelnoletni = wiekMalgosi >= wiekPelnoletnosci;
        System.out.println(czyJestPelnoletni); // false

        boolean czyJanuszMieszkaWeWroclawiu = miastoJanusza == miastoWroclaw;
        System.out.println("Czy Janusz jest z Wroclawia? - " + czyJanuszMieszkaWeWroclawiu); // false

        boolean czyMalgosiaMieskaWLodziIJestPelnoletnia = miastoMalgosi == "Łódź" && wiekMalgosi >= wiekPelnoletnosci;
        System.out.println(czyMalgosiaMieskaWLodziIJestPelnoletnia); // false

        boolean czyJanuszJestZWroclawiaIMozeGlosowac = miastoJanusza == miastoWroclaw && wiekJanusza >= wiekPelnoletnosci;
        System.out.println(czyJanuszJestZWroclawiaIMozeGlosowac); // false

    }

}
