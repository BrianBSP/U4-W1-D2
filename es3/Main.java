package es3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Inserisci una stringa: ");
            input = scanner.nextLine();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                result.append(input.charAt(i));
                if (i < input.length() - 1) {
                    result.append(", ");
                }
            }
            System.out.println("Stringa suddivisa: " + result.toString());

            if (input.equals(":q")) {
                System.out.println("Esci dal programma");
                break;
            }
        }
        scanner.close();


    }
}
