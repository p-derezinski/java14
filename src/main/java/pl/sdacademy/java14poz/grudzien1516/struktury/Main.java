package pl.sdacademy.java14poz.grudzien1516.struktury;

public class Main {

    public static void main(String[] args) {

        MyList list = new ArrayList(2);

        System.out.println("Czy lista jest pusta? - " + list.isEmpty());
        printArrayList(list);
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        printArrayList(list);
        System.out.println("Czy lista zawiera element bbb? - " + list.contains("bbb"));
        System.out.println("Czy lista zawiera element eee? - " + list.contains("eee"));
        System.out.println("Jaki jest indeks elementu ddd? - " + list.indexOf("ddd"));
        System.out.println("Jaki jest indeks elementu eee? - " + list.indexOf("eee"));
        System.out.println("Jaki jest indeks elementu aaa? - " + list.indexOf("aaa"));
        System.out.println("Czy lista jest pusta? - " + list.isEmpty());
        list.clear();
        System.out.println("Czy lista jest pusta? - " + list.isEmpty());
        System.out.println("Czy do listy poprawnie dodano element aaa? - " + list.add("aaa"));
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        printArrayList(list);
        System.out.println("Czy z listy poprawnie usunięto element ccc? - " + list.remove("ccc"));
        printArrayList(list);
        System.out.println("Czy z listy poprawnie usunięto element eee? - " + list.remove("eee"));
        System.out.println("Usuń element o indeksie 1");
        list.remove(1);
        printArrayList(list);
        System.out.println("Usuń ostatni element");
        list.removeLast();
        printArrayList(list);
        System.out.println("Usuń ostatni element");
        list.removeLast();
        printArrayList(list);
        System.out.println("Usuń ostatni element");
        list.removeLast();
        printArrayList(list);
        System.out.println("Czy do listy poprawnie dodano element aaa? - " + list.add("aaa"));
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        printArrayList(list);
        System.out.println("Usuń element o indeksie 15");
        list.remove(15);
        printArrayList(list);
        System.out.println("Usuń element o indeksie 0");
        list.remove(0);
        printArrayList(list);
        System.out.println("Usuń pierwszy element");
        list.removeFirst();
        printArrayList(list);

    }

    public static void printArrayList(MyList list) {
        for (int i = 0; i < list.getIndex(); i++) {
            System.out.println(list.getElements()[i]);
        }
    }

}
