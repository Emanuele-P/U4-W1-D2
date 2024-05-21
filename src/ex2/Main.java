package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world2!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number: ");
        int input = Integer.parseInt(scanner.nextLine());

        String result = switchEx(input);
        System.out.println(result);

        scanner.close();
    }

    public static String switchEx(int num) {
        switch (num) {
            case 0: {
                return "zero";
            }
            case 1: {
                return "one";
            }
            case 2: {
                return "two";
            }
            case 3: {
                return "three";
            }
            default: {
                return "Error";
            }
        }
    }
}
