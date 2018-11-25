package pl.sdacademy.java14poz.zadaniadodomu.barteczko;

public class Main {

    public static void main(String[] args) {

        Account ac = new Account(2000, 2400, 1800, 10);

        ac.getMonthsToBalance(2000);
        ac.getMonthsToBalance(2001);
        ac.getMonthsToBalance(2621);
        ac.getMonthsToBalance(2622);
        ac.getMonthsToBalance(10000);

    }

}
