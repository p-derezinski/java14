package pl.sdacademy.java14poz.grudzien0809.zadanie_5_ProblemPlecakowy;

import java.util.Arrays;

public class Bag {

    private int bagCapacity;
    private int currentBagWeight = 0;
    private int currentBagPrice = 0;
    private Element[] bagElements = new Element[512];
    private int elementCount = 0;

    public Bag(int bagCapacity) {
        this.bagCapacity = bagCapacity;
    }

    public void put(Element element) throws Exception{
        if (bagCapacity - currentBagWeight >= element.weight) {
            bagElements[elementCount] = element;
            elementCount++;
            currentBagWeight += element.weight;
            currentBagPrice += element.price;
        } else {
            throw new Exception("No space left.");
        }
    }

    public boolean isContains(Element element) {
        return Arrays.asList(bagElements).contains(element);
    }

    public String toString() {
        String bagSummary = "bagCapacity: " + bagCapacity;
        bagSummary += "\nelementCount: " + elementCount;
        bagSummary += "\ncurrentBagWeight: " + currentBagWeight;
        bagSummary += "\ncurrentBagPrice: " + currentBagPrice;
        return bagSummary;
    }

    public int getCurrentBagPrice() {
        return currentBagPrice;
    }
}
