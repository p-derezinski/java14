package pl.sdacademy.java14poz.interfejs;

public class NissanSamochod implements Samochod {

    private String klucz;

    @Override
    public void wlaczSilnik() {
        System.out.println("Nissan Car System");
        System.out.println("Wcisnij przycisk startowy");
    }

    @Override
    public void wylaczSilnik() {
        System.out.println("Nissan Car System");
        System.out.println("Przytrzymaj przycisk startuj przez 1 sekunde");
    }

    @Override
    public void otworzSamochod(String podanyKlucz) {
        klucz = podanyKlucz;
    }
}
