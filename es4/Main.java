package es4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero per il Count Down...");
        int input = Integer.parseInt(scanner.nextLine());
        
        for (int i = input; i >= 0; i--) {
            System.out.println("Count Down: " + i);
        }
        scanner.close();
    }
}
