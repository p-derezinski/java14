package pl.sdacademy.java14poz.zadaniadodomu.programyjednoklasowe;

public class MissingNumber {

    public static void main(String[] args) {

        int[] initialArray = {3, 5, 12, 1, 19, 20, 15, 2, 4, 6, 17, 18, 14, 13, 8, 9, 11, 10, 16};
        System.out.print("Initial array of integers  -->  ");
        printArray(initialArray);
        int[] orderedArray = putNumbersInOrder((initialArray));
        System.out.print("Ordered array of integers  -->  ");
        printArray(orderedArray);
        isThereAMissingNumber(findMissingNumber(orderedArray));
        System.out.println("Pozdrowienia dla Radka! ;)");
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] putNumbersInOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int testedNumber1 = array[i];
                int testedNumber2 = array[j];
                if (testedNumber1 > testedNumber2) {
                    array[i] = testedNumber2;
                    array[j] = testedNumber1;
                }
            }
        }
        return array;
    }

    public static int findMissingNumber(int[] array) {
        int missingNumber = -1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] != 1) {
                missingNumber = array[i] + 1;
            }
        }
        return missingNumber;
    }

    public static void isThereAMissingNumber(int number) {
        if (number == -1) {
            System.out.println("There is no missing number in the array.");
        } else {
            System.out.println("The missing number is " + number + ".");
        }
    }

}
