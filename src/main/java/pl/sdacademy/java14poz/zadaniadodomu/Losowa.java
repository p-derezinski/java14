package pl.sdacademy.java14poz.zadaniadodomu;

public class Losowa {

    public static void main(String[] args) {

        System.out.println("=================================================");

        int liczbaMaks = 10;
        double losowaRandom = Math.random();
        int losowa = (int)(losowaRandom * (liczbaMaks + 1));
        System.out.println("Wylosowana liczba z zakresu od 0 do " + liczbaMaks + " to: " + losowa);

        System.out.println("=================================================");

        int liczbaMin2 = 5;
        int liczbaMaks2 = 15;
        boolean test = true;
        while (test) {
            double losowaRandom2 = Math.random();
            int losowa2 = (int)(losowaRandom2 * (liczbaMaks2 + 1));
            if (losowa2 < liczbaMin2) {
                continue;
            } else {
                System.out.println("Wylosowana liczba z zakresu od " +
                        liczbaMin2 + " do " + liczbaMaks2 + " to: " + losowa2);
                test = false;
            }
        }

        System.out.println("=================================================");

        int liczbaMin3 = 1;
        int liczbaMaks3 = 3;
        if (liczbaMin3 < 0) {
            int liczbaMaks3zm = liczbaMaks3 - liczbaMin3;
            double losowaRandom3 = Math.random();
            int losowa3 = (int)(losowaRandom3 * (liczbaMaks3zm + 1)) + liczbaMin3;
            System.out.println("Wylosowana liczba z zakresu od " + liczbaMin3 + " do " + liczbaMaks3 + " to: " + losowa3);
        } else {
            boolean test3 = true;
            while (test3) {
                double losowaRandom3 = Math.random();
                int losowa3 = (int)(losowaRandom3 * (liczbaMaks3 + 1));
                if (losowa3 < liczbaMin3) {
                    continue;
                } else {
                    System.out.println("Wylosowana liczba z zakresu od " +
                            liczbaMin3 + " do " + liczbaMaks3 + " to: " + losowa3);
                    test3 = false;
                }
            }
        }

        System.out.println("=================================================");

    }

}
