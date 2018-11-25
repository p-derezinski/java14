package pl.sdacademy.java14poz.wlasneprogramy.programyjednoklasowe;

public class ZmianaLiczbyWNapis {

    public static void main(String[] args) {

        int liczba = 1224700392;
        Integer integer = liczba;
        String napis = integer.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(napis).append(" - ");
        for (int i = 0; i < napis.length(); i++) {
            int cyfra = napis.charAt(i);
            switch (cyfra) {
                case '0':
                    sb.append("zero ");
                    break;
                case '1':
                    sb.append("one ");
                    break;
                case '2':
                    sb.append("two ");
                    break;
                case '3':
                    sb.append("three ");
                    break;
                case '4':
                    sb.append("four ");
                    break;
                case '5':
                    sb.append("five ");
                    break;
                case '6':
                    sb.append("six ");
                    break;
                case '7':
                    sb.append("seven ");
                    break;
                case '8':
                    sb.append("eight ");
                    break;
                case '9':
                    sb.append("nine ");
                    break;
            }
        }
        System.out.println(sb.toString());

    }

}
