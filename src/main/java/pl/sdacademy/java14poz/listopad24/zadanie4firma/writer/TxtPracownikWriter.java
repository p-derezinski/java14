package pl.sdacademy.java14poz.listopad24.zadanie4firma.writer;

import pl.sdacademy.java14poz.listopad24.zadanie4firma.Pracownik;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;           // nio - new input-output
import java.nio.file.Paths;

public class TxtPracownikWriter implements PracownikWriter {

    private String path;

    public TxtPracownikWriter(String path) {
        this.path = path;
    }

    @Override
    public void write(Pracownik[] pracownicy) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(path))) {
            for (Pracownik p : pracownicy) {
                writer.write(p.toString() + "\n");

//                writer.write(
//                        String.format(
//                                "%d, %s, %s, %f, %s\n",
//                                p.getId(),
//                                p.getImie(),
//                                p.getNazwisko(),
//                                p.getPensja(),
//                                p.getEmail()
//                        )
//                );

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
