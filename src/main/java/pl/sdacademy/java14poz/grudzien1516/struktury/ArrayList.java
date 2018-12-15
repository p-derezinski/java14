package pl.sdacademy.java14poz.grudzien1516.struktury;

// własna implementacja listy z wykorzystaniem tablicy ("ArrayList")
// implementujemy interfejs MyList
// zakładamy, że jest to lista na elementy typu String

import java.util.Arrays;

public class ArrayList implements MyList{

    private static int DEFAULT_CAPACITY = 10;

    // tablica z elementami - w tej implementacji chcemy "opakować" tablicę tak, by wyglądała jak lista
    private String[] elements;

    // zmienna przechowująca informację o pozycji, na którą wstawić element;
    // wskaźnik na pierwsze wolne miejsce;
    // pierwszym wolnym miejscem w tablicy jest index 0
    private int index = 0;

    public ArrayList() {
        // konstruktor bezparametrowy utworzy listę z początkową wielkością 10
        this.elements = new String[DEFAULT_CAPACITY];
    }

    public ArrayList(int initialSize) {
        // drugi konstruktor z opcją ustawienia startowej wielkości listy;
        // efektywne rozwiązanie, gdy znamy liczbę elementów z góry;
        // korzystamy z argumentu konstruktora, a nie ze stałej DEFAULT_CAPACITY
        this.elements = new String[initialSize];
    }

    @Override
    public boolean add(String element) {
        // na jaką pozycję wstawić? na pozycję index
        // zwiększ index o 1;
        // obsługa sytuacji, gdzie tablica jest pełna - jeśli tablica jest pełna, to chcemy skopiować obecną tablicę
        //     do nowej, dwa razy większej (funkcja Arrays.copyOf()
        if (elements.length == index) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[index] = element;
        index++;
        return true;
    }

    @Override
    public boolean remove(String element) {
        int indexOfElement = indexOf(element);
        if (indexOfElement == -1) {
            return false;
        }
        elements[indexOfElement] = null;
        //String[] temp = new String[index - indexOf(element)];
        for (int i = indexOfElement + 1; i < index; i++) {
            elements[i - 1] = elements[i];
        }
        index--;
        return true;
    }

    @Override
    public String remove(int index) {
        if (this.index - 1 < index) {
            return null;
        }
        String removedElement = elements[index];
        elements[index] = null;
        for (int i = index + 1; i < this.index; i++) {
            elements[i - 1] = elements[i];
        }
        //elements[this.index - 1] = null;
        this.index--;
        return removedElement;
    }

    @Override
    public String removeFirst() {
        if (isEmpty()) {
            return null;
        }
        String removedElement = elements[0];
        elements[0] = null;
        for (int i = 1; i < this.index; i++) {
            elements[i - 1] = elements[i];
        }
        index--;
        return removedElement;
    }

    @Override
    public String removeLast() {
        if (isEmpty()) {
            return null;
        }
        String removedElement = elements[index - 1];
        elements[index - 1] = null;
        index--;
        return removedElement;
    }

    @Override
    public boolean isEmpty() {
        boolean czyListaJestPusta = index == 0;
        return czyListaJestPusta;
//        if (index == 0) {
//            return true;
//        }
//        return false;
    }

    @Override
    public int indexOf(String element) {
        for (int i = 0; i < index; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(String element) {
        return indexOf(element) >= 0;
//        for (int i = 0; i < index; i++) {
//            if (elements[i].equals(element)) {
//                return true;
//            }
//        }
//        return false;
    }

    @Override
    public void clear() {
        elements = new String[index];
        index = 0;
    }

    public int getIndex() {
        return index;
    }

    public String[] getElements() {
        return elements;
    }
}
