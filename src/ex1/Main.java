package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a word: ");
        String input = (scanner.nextLine());

        boolean result = evenOdd(input);
        System.out.println("The length of the word is even: " + result);

        scanner.close();
    }

    public static boolean evenOdd(String str) {
        return str.length() % 2 == 0;
    }
}