package org.example;

import java.util.Scanner;

public class LeapYear {

    public static void checkLeapYear()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the year");
        int year = sc.nextInt();

        if (year % 400 ==0)
        {
            System.out.println("the given year is leap year");
        } else if (year % 100 ==0) {
            System.out.println("the given number is not leap year");
        } else if (year % 4 ==0) {
            System.out.println("the given number is leap year");
        }

        else
        {
            System.out.println("not leap year");
        }


    }

    public static void main(String[] args) {
        checkLeapYear();

    }

}
