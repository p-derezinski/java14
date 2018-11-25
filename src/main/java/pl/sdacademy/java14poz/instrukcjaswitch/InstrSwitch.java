package pl.sdacademy.java14poz.instrukcjaswitch;

import pl.sdacademy.java14poz.sklep.User;
import pl.sdacademy.java14poz.sklep.UserUtils;

public class InstrSwitch {

    public static void main(String[] args) {

        User uzytkownik = new User("Jan", "Kowalski", 28);
        uzytkownik.setStatus(User.TypStatus.AKTYWNY);

//        User.TypStatus statusUzytkownika = uzytkownik.getStatus();

//        switch (statusUzytkownika) {
//            case AKTYWNY:
//                System.out.println("Użytkownik jest aktywny");
//                break;
//            case NIEAKTYWNY:
//                System.out.println("Użytkownik jest nieaktywny");
//                break;
//            case ZALOGOWANY:
//                System.out.println("Użytkownik jest zalogowany");
//                break;
//        }

        czyJestDostepny(uzytkownik);

        User uzytkownik2 = new User("Zosia", "Nowak", 88);
        uzytkownik2.setStatus(User.TypStatus.ZALOGOWANY);
        czyJestDostepny(uzytkownik2);

        System.out.println("*******************************");

        System.out.println("\nTest użycia metody statycznej z UserUtils");
        String napisStatusUzytkownika = UserUtils.poberzStatus(uzytkownik);
        System.out.println(napisStatusUzytkownika);

        System.out.println(UserUtils.poberzStatus(uzytkownik2));

    }

    public static void czyJestDostepny(User user) {
        User.TypStatus statusUzytkownika = user.getStatus();
        switch (statusUzytkownika) {
            case AKTYWNY:
                System.out.println("Użytkownik " + user.getImie() + " jest aktywny");
                break;
            case NIEAKTYWNY:
                System.out.println("Użytkownik " + user.getImie() + " jest nieaktywny");
                break;
            case ZALOGOWANY:
                System.out.println("Użytkownik " + user.getImie() + " jest zalogowany");
                break;
        }
    }

}
