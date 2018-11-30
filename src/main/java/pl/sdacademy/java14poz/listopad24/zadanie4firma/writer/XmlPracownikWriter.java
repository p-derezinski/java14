package pl.sdacademy.java14poz.listopad24.zadanie4firma.writer;

import pl.sdacademy.java14poz.listopad24.zadanie4firma.Pracownik;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class XmlPracownikWriter implements PracownikWriter {

    private String path;

    public XmlPracownikWriter(String path) {
        this.path = path;
    }

    @Override
    public void write(Pracownik[] pracownicy) {
        //Pracownik pracownik1 = pracownicy[0];
        Pracownik pracownik1 = new Pracownik("Jan", "Kowalski", 3000, "emailtest", 101);
        try {
            JAXBContext context = JAXBContext.newInstance(Pracownik.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(pracownik1, new File(path));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        System.out.println("Test - tutaj zapis do xml");
    }

    // żeby działało w Java 10, to trzeba w Application zrobić "Edit Configurations..." i wpisać w polu "VM options:" :
    //   --add-modules java.xml.bind

}
