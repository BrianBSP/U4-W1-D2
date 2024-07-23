package es1;

public class Main {
    public static void main(String[] args) {
        System.out.println(stringaPariDispari("ciao"));
        System.out.println(stringaPariDispari("cane"));
        System.out.println(stringaPariDispari("gatto"));
        System.out.println(stringaPariDispari("topo"));
    }

    public static boolean stringaPariDispari(String stringa) {
        return stringa.length() % 2 == 0;
    }
}
