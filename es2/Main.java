package es2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int num = Integer.parseInt(scanner.nextLine());

        switch (num) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;

            default:
                System.out.println("ERRORE: il numero inserito non è compreso tre 0 e 3.");
        }

        scanner.close();

    }

}
