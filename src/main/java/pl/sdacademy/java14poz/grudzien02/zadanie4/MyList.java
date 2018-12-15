package pl.sdacademy.java14poz.grudzien02.zadanie4;

import java.util.Arrays;

public class MyList {

    int[] myList = new int[1000000];
    int counter = 0;

    public double sortBinFindTime = 0.0d;
    public double insertElementTime = 0.0d;
    public double sortFindTime = 0.0d;

    public int getLength() {
        return counter;
    }

    public int getElement(int index) {
        return myList[index];
    }

    public void insertElement(int index, int element) {
        long startTime = System.nanoTime();
        int myListIdx = counter + 1;
        int[] temp = new int[counter - index];
        int tempIndex = 0;
        for (int i = index; i < counter; i++) {
            temp[tempIndex] = myList[i];
            tempIndex++;
        }
        myList[index] = element;
        counter++;
        tempIndex = 0;
        for (int i = index + 1; i < counter; i++) {
            myList[i] = temp[tempIndex];
            tempIndex++;
        }
        long stopTime = System.nanoTime();
        insertElementTime += (stopTime - startTime)/1_000_000.0d;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < counter; i++) {
            result += i + ":" + myList[i] + "\n";
        }
        result += "\nCounter: " + counter + "\n";
        return result;
    }

    public int findIndex(int value) throws Exception{
        for (int i = 0; i < counter; i++) {
                if (value == myList[i]) {
                    return i;
                }
        }
        //return -1;
        throw new Exception("Brak elementu o wartości: " + value);
    }

//    A := [...]      { n-elementowa tablica uporządkowana }
//    lewo := 1       { indeks początku przedziału }
//    prawo := n    { indeks końca przedziału - początkowo cała tablica A }
//
//    y := poszukiwana wartość
//    indeks := pusty
//
//while lewo < prawo do
//    begin
//    środek := (lewo + prawo) div 2; { dzielenie całkowitoliczbowe }
//
//      if A[środek] < y then
//    lewo := środek + 1
//            else
//    prawo := środek;
//    end;
//
//if A[lewo] = y then
//    indeks := lewo
//else
//    indeks := brak;

    public int sortBinFindIndex(int value) {  // throws Exception
        long startTime = System.nanoTime();
        int left = 0;
        int right = counter;
        while (left < right) {
            int center = (left + right) / 2;
            if (myList[center] < value) {
                left = center + 1;
            } else {
                right = center;
            }
        }
        long stopTime = System.nanoTime();
        sortBinFindTime += (stopTime - startTime)/1_000_000.0d;
        return left;
//        if (myList[left] == value) {
//            return left;
//        }
//        throw new Exception("Brak wartości");
    }

    public int sortFindIndex(int value) throws Exception {
        long startTime = System.nanoTime();
        for (int i = 0; i < counter; i++) {
            if (value == myList[i]) {
                return i;
            }
            if (myList[i] > value) {
                return i;
            }
        }
        //return -1;
        long stopTime = System.nanoTime();
        sortFindTime += (stopTime - startTime)/1_000_000.0d;
        throw new Exception("Tablica jest pusta lub brak większej wartości.");
    }

    public int sortFindIndex2(int value) {
        for (int i = 0; i < counter; i++) {
            while (value <= myList[i]) {
                if (value == myList[i]) {
                    return i;
                }
            }
            return i + 1;
        }
        return -1;
    }

    public int sortFindIndex3(int value) {
        for (int i = 0; i < counter; i++) {
            while (value <= myList[i]) {
                if (value == myList[i]) {
                    return i;
                }
            }
            return i + 1;
        }
        return -1;
    }

    public void insertElementAndSort (int element) {
        int index;
        try {
            //index = sortFindIndex(element);
            index = sortBinFindIndex(element);
        } catch (Exception e) {
            index = counter;
        }
        insertElement(index, element);
    }

}
