package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Countdown starting from: ");
        int input = scanner.nextInt();

        countdown(input);
        scanner.close();

    }

    public static void countdown(int num) {
        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }
}

