package pl.sdacademy.java14poz.grudzien1516.struktury;

// interfejs opisujący operacje dla listy typu String

public interface MyList {

    // operacja dodawania elementu typu String do listy
    boolean add(String element);

    // operacja usuwania elementu po nazwie ("usuń Kowalskiego z listy")
    // będziemy najpierw musieli tego Kowalskiego znaleźć
    boolean remove(String element);

    // operacja usuwania po pozycji ("usuń trzeci element")
    String remove(int index);

    String removeFirst();

    // złożoność - O(1)
    String removeLast();

    // odpowiada na pytanie, czy lista jest pusta
    boolean isEmpty();

    // zwraca pozycję szukanego elementu,
    // jeśli elementu nie ma na liście, to zwracamy -1
    int indexOf(String element);

    // odpowiada na pytanie, czy element jest obecny na liście
    boolean contains(String element);

    // usuwa wszystkie elementy z listy
    void clear();

    int getIndex();

    String[] getElements();
}
