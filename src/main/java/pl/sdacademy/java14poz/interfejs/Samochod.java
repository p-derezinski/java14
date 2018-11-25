package pl.sdacademy.java14poz.interfejs;

// Samochod to interfejs, czyli zbior metod bez implementacji (zbior czynnosci do wykonania)
// Interfejs posiada metody publiczne

public interface Samochod {
    void wlaczSilnik();
    void wylaczSilnik();
    void otworzSamochod(String klucz); //metoda otwuerajaca samochod przy uzyciu klucza autoryzacyjnego
}
