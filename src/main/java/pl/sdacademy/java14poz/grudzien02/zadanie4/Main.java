package pl.sdacademy.java14poz.grudzien02.zadanie4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        MyList list = new MyList();

        System.out.println(list);

        list.insertElement(0, 3);
        list.insertElement(1, 5);
        list.insertElement(2, 7);
        list.insertElement(3, 8);

        System.out.println(list);

        System.out.println(list.getElement(1));
        System.out.println(list.getLength());

        System.out.println("*******************************");

//        System.out.println(list.findIndex(5));
//        System.out.println(list.findIndex(77));
//        System.out.println(list.sortFindIndex(6));
//        System.out.println(list.sortFindIndex(22));
//        System.out.println(list.sortFindIndex(6));
//        System.out.println(list.sortFindIndex(22));
//
//        System.out.println("*******************************");


        list.insertElementAndSort(54);
        list.insertElementAndSort(3);
        list.insertElementAndSort(2);
        list.insertElementAndSort(555);
        list.insertElementAndSort(2);

        System.out.println(list);
        try {
            System.out.println(list.sortFindIndex(2));
            System.out.println(list.findIndex(7777));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        list.insertElementAndSort(0);
        System.out.println(list);

        System.out.println("*******************************");

        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            list.insertElementAndSort(random.nextInt(1000));
        }
        long stopTime = System.nanoTime();
        double elapsedTime = (stopTime - startTime) / 1_000_000.0;
        System.out.println(list);
        System.out.println(elapsedTime);

        System.out.println("insertElementTime: " + list.insertElementTime);
        System.out.println("sortFindTime: " + list.sortFindTime);
        System.out.println("sortBinFindTime: " + list.sortBinFindTime);


//        List<Integer> arrayList = new ArrayList<Integer>(1_000_000);
//        System.out.println(arrayList.size());
//        arrayList.add(4);
//        System.out.println(arrayList.size());

    }

}
