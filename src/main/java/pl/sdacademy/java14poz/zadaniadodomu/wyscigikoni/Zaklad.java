package pl.sdacademy.java14poz.zadaniadodomu.wyscigikoni;

import java.util.ArrayList;
import java.util.List;

import static pl.sdacademy.java14poz.zadaniadodomu.wyscigikoni.Wyscigi.*;

public class Zaklad {

    private List<Kon> listaDoLosowania;
    private Trasa trasaWylosowana;

    public Zaklad() {
        this.listaDoLosowania = new ArrayList<Kon>();
    }

    public void zapelnijListeDoLosowania() {
        for (int i = 0; i < listaKoni.size(); i++) {
            if (trasaWylosowana.getDlugosc() < 11) {
                for (int j = 1; j <= listaKoni.get(i).getSzybkosc(); j++) {
                    this.listaDoLosowania.add(listaKoni.get(i));
                }
            } else if (trasaWylosowana.getDlugosc() < 21) {
                for (int j = 5; j <= listaKoni.get(i).getSzybkosc(); j++) {
                    this.listaDoLosowania.add(listaKoni.get(i));
                }
            }
            if (trasaWylosowana.getDlugosc() > 30) {
                for (int j = 1; j <= listaKoni.get(i).getWytrzymalosc(); j++) {
                    this.listaDoLosowania.add(listaKoni.get(i));
                }
            } else if (trasaWylosowana.getDlugosc() > 12) {
                for (int j = 5; j <= listaKoni.get(i).getWytrzymalosc(); j++) {
                    this.listaDoLosowania.add(listaKoni.get(i));
                }
            }
            if (trasaWylosowana.getTrudnosc() > 6) {
                for (int j = 1; j <= listaKoni.get(i).getOdwaga(); j++) {
                    this.listaDoLosowania.add(listaKoni.get(i));
                }
            } else if (trasaWylosowana.getTrudnosc() > 4) {
                for (int j = 5; j <= listaKoni.get(i).getOdwaga(); j++) {
                    this.listaDoLosowania.add(listaKoni.get(i));
                }
            }
        }
    }

    public List<Kon> getListaDoLosowania() {
        return listaDoLosowania;
    }

    public void setTrasaWylosowana(Trasa trasaWylosowana) {
        this.trasaWylosowana = trasaWylosowana;
    }
}
