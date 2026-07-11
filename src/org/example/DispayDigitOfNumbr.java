package org.example;

import java.util.Scanner;

public class DispayDigitOfNumbr {

    public static void number()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");

        int num = sc.nextInt();

        while(num > 0)
        {
            int reminder = num % 10;
            System.out.println(reminder);

            num = num/10;
        }

    }

    public static void main(String[] args) {
        number();
    }

}
