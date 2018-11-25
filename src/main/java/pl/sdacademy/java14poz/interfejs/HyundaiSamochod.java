package pl.sdacademy.java14poz.interfejs;

// HyundaiSamochod implementuje metody z interfejsu Samochod

public class HyundaiSamochod implements Samochod {

    private String klucz;

    @Override
    public void wlaczSilnik() {
        System.out.println("Hyundai Car System");
        System.out.println("Wcisnij przycisk start");
    }

    @Override
    public void wylaczSilnik() {
        System.out.println("Hyundai Car System");
        System.out.println("Przytrzymaj przycisk start przez 3 sekundy");
    }

    @Override
    public void otworzSamochod(String podanyKlucz) {
        klucz = podanyKlucz;
    }
}
