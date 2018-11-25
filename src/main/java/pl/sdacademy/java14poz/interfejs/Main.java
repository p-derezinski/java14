package pl.sdacademy.java14poz.interfejs;

public class Main {

    public static void main(String[] args) {

        Samochod hyundai = new HyundaiSamochod();
        hyundai.wlaczSilnik();

        Samochod nissan = new NissanSamochod();
        nissan.wlaczSilnik();
        nissan.otworzSamochod("hehedewbdwe");

    }

}
