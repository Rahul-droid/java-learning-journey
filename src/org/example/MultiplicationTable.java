package org.example;

import java.util.Scanner;

public class MultiplicationTable {

    public static void multiply()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of which you want to find the table= ");
        int num = sc.nextInt();

        for (int i = 1; i <=10; i++)
        {
            int table = num * i;
            System.out.println(num + "*" + i + " =" + table);

        }

    }

    public static void main(String[] args) {
        multiply();
    }
}
