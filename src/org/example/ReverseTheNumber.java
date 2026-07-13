package org.example;

import java.util.Scanner;

public class ReverseTheNumber {

    public static void reverse()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int rev = 0;

        while(num > 0)
        {
            int rem = num % 10;
            rev = (rev*10) + rem;
            num = num/10;
        }

        System.out.println(rev);

    }

    public static void main(String[] args) {
        reverse();
    }

}
