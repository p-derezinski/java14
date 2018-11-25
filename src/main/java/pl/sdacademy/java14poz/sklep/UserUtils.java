package pl.sdacademy.java14poz.sklep;

import pl.sdacademy.java14poz.sklep.User.*;

public class UserUtils {

    public static String poberzStatus(User uzytkownik) {
        User.TypStatus statusUzytkownika = uzytkownik.getStatus();
        StringBuilder sb = new StringBuilder();
        sb.append(uzytkownik.getImie()).append(" ").append(uzytkownik.getNazwisko());
        sb.append(" jest ");
        switch (statusUzytkownika) {
            case AKTYWNY:
                sb.append("aktywny");
                break;
            case NIEAKTYWNY:
                sb.append("nieaktywny");
                break;
            case ZALOGOWANY:
                sb.append("zalogowany");
                break;
        }
        return sb.toString();
    }

    public static String pobierzPlec(User uzytkownik) {
        TypPlec plecUzytkownika = uzytkownik.getPlec(); // byl import Usera, wiec nie trzeba pisac "User.TypPlec"
        return "";
    }

}
