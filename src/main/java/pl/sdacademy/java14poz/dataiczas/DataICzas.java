package pl.sdacademy.java14poz.dataiczas;

import javax.swing.text.DateFormatter;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;

public class DataICzas {

    public static void main(String[] args) {

        // data w formie napisu
        String dataString = "2016-03-04 11:30";
        // ustalamy format daty na podstawie daty wyżej
        String formatDaty = "yyyy-MM-dd HH:mm";
        LocalDateTime dateTime = utworzDateZeStringa(dataString, formatDaty);

        String dataDzisiejsza = "2018-10-28 09:30";
        LocalDateTime dateTime2 = utworzDateZeStringa(dataDzisiejsza, formatDaty);

        System.out.println("\nLocalDateTime:");
        System.out.println(dateTime);

        System.out.println("\nLocalDateTime - dzisiejsze:");
        System.out.println(dateTime2);

        System.out.print("\nCzy data dateTime jest wczesniejsza niz dateTime2? - ");
        System.out.println(dateTime.isBefore(dateTime2));
        System.out.print("\nCzy data dateTime jest pozniejsza niz dateTime2? - ");
        System.out.println(dateTime.isAfter(dateTime2));

        boolean jestWczesniejsza = dateTime.isBefore(dateTime2);
        if (jestWczesniejsza) {
            System.out.println("\nData dateTime jest wczesniejsza niz dateTime2");
            System.out.printf("Data %s jest wczesniejsza niz data %s", dateTime, dateTime2);
        } else {
            System.out.println("\nData dateTime jest pozniejsza niz dateTime2");
        }

        System.out.println("\n--------------------------------------------\n");

        // Teraz zajmiemy sie przeksztalceniem daty na Stringa wg naszego formatu
        LocalDateTime obecnaData = LocalDateTime.now();
        String formatDatyBiurowej = "dd.MM.yyyy HH:mm";
        // utworzenie formattera na podstawie wzorca formatDatyBiurowej
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(formatDatyBiurowej);
        // formatter2 powyzej jest uzyty do sformatowania obecnej daty
        String formatDatyBiurowejNapis = obecnaData.format(formatter2);
        System.out.printf("\nData dzisiejsza w formacie daty biurowej:\n%s \n", formatDatyBiurowejNapis);
        System.out.printf("\nData dzisiejsza bez formatu:\n%s \n", obecnaData);

        System.out.println("\n--------------------------------------------\n");

//        String dateString = "2016-03-04";
//        String formatDate = "yyyy-MM-dd";
//        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern(formatDate);
//        LocalDateTime dataTime = LocalDateTime.parse(dateString, formatter3);
//        System.out.println("\nLocalDateTime:");
//        System.out.println(dataTime);
//        System.out.printf("Nasza data to: %s", dataTime);

        String dateString = "2016-03-04";
        String formatDate = "yyyy-MM-dd";
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern(formatDate);
        LocalDate dataTime = LocalDate.parse(dateString, formatter3);
        System.out.println("\nLocalDateTime:");
        System.out.println(dataTime);
        System.out.printf("Nasza data to: %s", dataTime);


//        // zmienna tekstowa z data
//        String dateString1 = "2018-07-01";
//
//        // format wprowadzonej daty
//        String formatDaty = "yyyy-MM-dd";
//
//        // obiekt który pozwala formatowac date wg formatu
//        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern(formatDaty);
//
//        // parsowanie daty napisu na LocalDateTime
//        LocalDateTime formatDateTime1 = LocalDateTime.parse(dateString1, formatter1);
//
//        // instant time potrzebujemy do utworzenia Date (daty)
//        Instant instantTime = formatDateTime1.atZone(ZoneId.systemDefault()).toInstant();
//        System.out.println(instantTime);
//
//        // zmienna date1 typu Date (data)
//        // date1 zawiera metody deprecated czyli nalezy uzywac LocalDateTime
//        Date date1 = java.util.Date.from(instantTime);
//        System.out.println(date1);


        System.out.println("\n--------------------------------------------\n");

        // moje własne ćwiczenia

        System.out.println(dateTime.minusDays(3));
        System.out.println(dateTime);
        System.out.println(LocalDateTime.now());

        long daysBetween = DAYS.between(dateTime, dateTime2);
        System.out.println(daysBetween);
        LocalDateTime jakasData = LocalDateTime.of(2018, 12, 24, 0, 0);
        long daysBetween2 = DAYS.between(LocalDateTime.now(), jakasData);
        System.out.println("Dni do świąt: " + daysBetween2);
    }

    // metoda zamienia date w postaci napisu na LocalDateTime - zrobiona automatycznie przez Refactor
    private static LocalDateTime utworzDateZeStringa(String dataZPostaciNapisu, String formatDaty) {
        // tworzymy formatter ktory przyjmuje argument "formatDaty" ktory jest wzorcem daty
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatDaty);

        // parsowanie (przeksztalcenie) napisu daty z uzyciem formattera w obiekt typu LocalDateTime
        return LocalDateTime.parse(dataZPostaciNapisu, formatter);
    }

    // metoda taka sama jak powyzej, ale zrobilem ją wczesniej, sam
    public static LocalDateTime nazwa(String dataString, String formatDaty) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatDaty);
        return LocalDateTime.parse(dataString, formatter);
    }

}
