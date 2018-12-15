package pl.sdacademy.java14poz.grudzien0809.zadanie_5_ProblemPlecakowy;

import java.util.Scanner;

public class BagProblemAprox {

    private static int elementCount;
    private static Element[] elements;
    private static Bag bag;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź pojemność plecaka: ");
        bag = new Bag(scanner.nextInt());
        System.out.print("Wprowadź ilość elementów plecaka: ");
        elementCount = scanner.nextInt();
        elements = new Element[elementCount];

        for (int i = 0; i < elementCount; i++) {
            System.out.printf("Wprowadź wartość i wagę %d elementu: ", i + 1);
            elements[i] = new Element(scanner.nextInt(), scanner.nextInt());
            //elements[i].price = scanner.nextInt();
            //elements[i].weight = scanner.nextInt();
        }

        while (true) {
            try {
                bag.put(elements[findMostProfitable(bag)]);
            } catch (Exception e) {
                break;
                //e.printStackTrace();
            }
        }

        System.out.println(bag);
    }

    private static int findMostProfitable(Bag bag) {
        int topPrice = 0;

        for (int i = 0; i < elementCount; i++) {
            if (bag.isContains(elements[i])) {
                continue;
            }
            topPrice = i;
            break;
        }

        for (int i = 0; i < elementCount; i++) {
            if (bag.isContains(elements[i])) {
                continue;
            }
            if (isMoreProfitable(elements[topPrice], elements[i])) {
                topPrice = i;
            }
        }
        return topPrice;

    }

    private static boolean isMoreProfitable(Element first, Element second){
        return first.price / first.weight < second.price / second.weight;
    }

}
