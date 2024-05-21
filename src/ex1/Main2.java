package ex1;

import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a year: ");
        int year = (scanner.nextInt());

        boolean result = leapYear(year);
        System.out.println("The year " + year + " is a leap year: " + result);

        scanner.close();
    }

    public static boolean leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}

