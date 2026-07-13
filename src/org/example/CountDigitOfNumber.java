package org.example;

import java.util.Scanner;

public class CountDigitOfNumber {

    public static void count()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int count =0;

        if(num < 0)
        {
            //System.out.println("the number is negative");
            num = num * (-1);
        } else if (num == 0) {
            System.out.println(1);
            return;

        }
        while(num > 0)
        {

            //int rem = num % 10;
            num = num/ 10;
            count++;
        }
        System.out.println(count);



    }

    public static void main(String[] args) {
        count();
    }

}
