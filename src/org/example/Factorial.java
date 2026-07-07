package org.example;

import java.util.Scanner;

public class Factorial {

    public void Factor()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of which you want to find the factorial= ");
        int num = sc.nextInt();
        int factorial=1;
        for (int i =1; i <=num; i++)
        {
            factorial = factorial * i;

        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        Factorial fr = new Factorial();
        fr.Factor();
    }

}
