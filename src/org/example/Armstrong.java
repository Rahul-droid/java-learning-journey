package org.example;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number= ");
        int num = sc.nextInt();

        int count =0;
        int sum = 0;

        if (num <0)
        {
            System.out.println("this number is -ve number so this is not Armstrong number");
            return;
        }

        int original = num;

        while(num > 0)
        {
            num = num/10;
            count++;
        }
        System.out.println(count);

        num = original;

        while (num > 0)
        {
            int rem =num % 10;
            System.out.println(rem);
            sum = sum + (int)Math.pow(rem, count);
            num = num /10;

        }

        if(original == sum)
        {
            System.out.println("the given number is Armstrong");
        }
        else
            System.out.println("not a Armstrong");

    }

}
