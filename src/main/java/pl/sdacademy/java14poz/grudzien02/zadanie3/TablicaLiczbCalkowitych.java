package pl.sdacademy.java14poz.grudzien02.zadanie3;

public class TablicaLiczbCalkowitych {

    public static void main(String[] args) {

        int[] array = {7, 3, 5, 12, 1, 19, 20, 15, 2, 4, 6, 17, 18, 14, 13, 8, 9, 11, 10, 16};
        System.out.print("Cała tablica: ");
        printArray(array);
        System.out.print("Cała tablica w odwrotnej kolejności: ");
        printArrayInReversedOrder(array);
        System.out.print("Liczby podzielne przez 3: ");
        printNumbersDividedBy3(array);
        System.out.print("Liczby na nieparzystych pozycjach: ");
        printNumbersWithUnevenPosition(array);
        System.out.println("Suma liczb: " + sum(array));
        System.out.println("Suma pierwszych czterech liczb: " + sumOfFourNumbers(array));
        System.out.println("Suma ostatnich pięciu liczb większych od 2: " + sumOfLastFiveGreaterThan2(array));
        System.out.println("Ilość liczb, które trzeba zsumować, żeby suma przekroczyła 10: " + howManyNumbersUntilSumGreaterThan10(array));

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArrayInReversedOrder(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printNumbersDividedBy3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void printNumbersWithUnevenPosition(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int sumOfFourNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (i == 3) {
                break;
            }
        }
        return sum;
    }

    public static int sumOfLastFiveGreaterThan2(int[] array) {
        int sum = 0;
        for (int i = array.length - 1; i >=0; i--) {
            if (array[i] > 2) {
                sum += array[i];
            }
            if (i == array.length - 5) {
                break;
            }
        }
        return sum;
    }

    public static int howManyNumbersUntilSumGreaterThan10(int[] array) {
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            counter++;
            if (sum > 10) {
                break;
            }
        }
        return counter;
    }

}
