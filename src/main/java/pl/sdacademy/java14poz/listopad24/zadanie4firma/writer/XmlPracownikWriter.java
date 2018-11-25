package pl.sdacademy.java14poz.listopad24.zadanie4firma.writer;

import pl.sdacademy.java14poz.listopad24.zadanie4firma.Pracownik;

public class XmlPracownikWriter implements PracownikWriter {

    private String path;

    public XmlPracownikWriter(String path) {
        this.path = path;
    }

    @Override
    public void write(Pracownik[] pracownicy) {
        System.out.println("Test - tutaj zapis do xml");
    }
}
