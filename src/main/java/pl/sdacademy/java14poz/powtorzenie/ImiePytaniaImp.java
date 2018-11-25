package pl.sdacademy.java14poz.powtorzenie;

public class ImiePytaniaImp implements Pytania {

    private int wiek;
    int wiekPelnoletnosci;
    private String miasto;

//    public ImiePytaniaImp(int wiek, String miasto) {
//        this.wiek = wiek;
//        this.miasto = miasto;
//    }


    public ImiePytaniaImp(int wiek, String miasto) {
        this.wiek = wiek;
        this.miasto = miasto;
        this.wiekPelnoletnosci = 18;
    }

    @Override
    public boolean czyJestPelnoletni(int wiek) {
        //this.wiek = wiek;
        return wiek >= 18; //wiekPelnoletnosci;
    }

    @Override
    public boolean jestZPoznania(String miasto) {
        return miasto == "Poznań"; //miastoPoznan;
    }

    @Override
    public boolean mozeGlosowacWPoznaniu(String miasto, int wiek) {
        return wiek >= 18 && miasto == "Poznań"; //miastoPoznan;
    }
}
