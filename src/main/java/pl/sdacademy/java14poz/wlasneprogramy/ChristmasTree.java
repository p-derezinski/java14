package pl.sdacademy.java14poz.wlasneprogramy;

public class ChristmasTree {

    private String znak;
    private int n;

    public ChristmasTree(String znak, int n) {
        this.znak = znak;
        this.n = n;

        String spacja = " ";
        int count1 = n;
        int count2 = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < count1; j++) {
                System.out.print(spacja);
            }
            for (int j = 1; j <= count2; j++) {
                System.out.print(znak);
            }
            count1--;
            count2 += 2;
            System.out.println();
        }

        if (n < 5) {
            for (int i = 1; i < n; i++) {
                System.out.print(spacja);
            }
            System.out.println(znak);
        } else if (n < 8) {
            for (int i = 1; i < 3; i++) {
                for (int j = 1; j < n; j++) {
                    System.out.print(spacja);
                }
                System.out.println(znak);
            }
        } else {
            for (int i = 1; i < 3; i++) {
                for (int j = 1; j < n - 1; j++) {
                    System.out.print(spacja);
                }
                for (int j = 1; j < 4; j++) {
                    System.out.print(znak);
                }
                System.out.println();
            }
        }
    }
}
