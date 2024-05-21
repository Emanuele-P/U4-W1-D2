package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a sentence (type :q to quit): ");
        String input = scanner.nextLine();

        while (!input.equals(":q")) {
            String result = singleCh(input);
            System.out.println(result);

            System.out.println("Write a sentence (type :q to quit): ");
            input = scanner.nextLine();
        }
        scanner.close();
    }

    public static String singleCh(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentCh = str.charAt(i);
            result.append(currentCh);
            if (currentCh != ' ') {
                result.append(",");
            }
        }
        return result.toString();
    }
}
