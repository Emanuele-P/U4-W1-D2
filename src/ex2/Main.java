package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world2!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number: ");
        int input = Integer.parseInt(scanner.nextLine());

        switchEx(input);

        scanner.close();
    }

    public static void switchEx(int num) {
        switch (num) {
            case 0: {
                System.out.println("zero");
                break;
            }
            case 1: {
                System.out.println("one");
                break;
            }
            case 2: {
                System.out.println("two");
                break;
            }
            case 3: {
                System.out.println("three");
                break;
            }
            default: {
                System.out.println("Error");
            }
        }
    }
}
