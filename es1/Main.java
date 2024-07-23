package es1;

public class Main {
    public static void main(String[] args) {
        System.out.println("------ STRINGA PARI DISPARI ------");
        System.out.println(stringaPariDispari("ciao"));
        System.out.println(stringaPariDispari("cane"));
        System.out.println(stringaPariDispari("gatto"));
        System.out.println(stringaPariDispari("topo"));
        System.out.println("------ ANNO BISESTILE ------");
        System.out.println(annoBisestile(1600));
        System.out.println(annoBisestile(1800));
        System.out.println(annoBisestile(1900));
        System.out.println(annoBisestile(2000));
        System.out.println(annoBisestile(2004));
        System.out.println(annoBisestile(2024));
    }

    public static boolean stringaPariDispari(String stringa) {
        if (stringa.length() % 2 == 0) return true;
        else return false;
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                return anno % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
