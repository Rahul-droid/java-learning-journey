package org.example;

import java.util.Scanner;

public class SumOfNumbers {

    public static void addition()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number upto which you want to find the addition= ");
        int num = sc.nextInt();

        int sum = 0;

        for(int i =1; i <= num; i++)
        {
            sum = sum+i;
        }

        System.out.println("the sum of N number is = "+sum);

    }

    public static void main(String[] args) {
        addition();
    }

}
