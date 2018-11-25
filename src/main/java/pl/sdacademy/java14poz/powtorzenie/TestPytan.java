package pl.sdacademy.java14poz.powtorzenie;

public class TestPytan {

    public static void main(String[] args) {

        int wiekPelnoletnosci = 18;
        String miastoPoznan = "Poznań";

        Pytania Pawel = new ImiePytaniaImp(33, "Rokietnica");
        System.out.println(Pawel.czyJestPelnoletni(33));
        System.out.println(Pawel.jestZPoznania("Rokietnica"));
        System.out.println(Pawel.mozeGlosowacWPoznaniu("Rokietnica", 33));

        System.out.println("****************************");

//        Pytania Kazio = new ImiePytaniaImp();
//        System.out.println(Kazio.czyJestPelnoletni(19));
//        System.out.println(Kazio.jestZPoznania("Poznań"));
//        System.out.println(Kazio.mozeGlosowacWPoznaniu("Poznań", 19));

    }

}
