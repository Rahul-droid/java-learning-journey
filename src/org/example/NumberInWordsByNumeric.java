package org.example;

import java.util.Scanner;

public class NumberInWordsByNumeric {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        int original = number;
        int reverse = 0;
        int trailingZeros = 0;

        // Count trailing zeros
        while (number % 10 == 0) {
            trailingZeros++;
            number /= 10;
        }

        // Reverse the remaining number
        while (number > 0) {
            int rem = number % 10;
            reverse = reverse * 10 + rem;
            number /= 10;
        }

        // Display digits in words
        while (reverse > 0) {

            int digit = reverse % 10;

            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            reverse /= 10;
        }

        // Print the trailing zeros
        while (trailingZeros > 0) {
            System.out.println("Zero");
            trailingZeros--;
        }
    }
}