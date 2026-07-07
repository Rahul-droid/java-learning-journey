package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Odd_Even
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //System.out.println("enter the number = ");
        // int num = sc.nextInt(); // this will break when the user provide the invalid input data and it throws exception

        //int num;

        System.out.println("enter the number = ");

        if(sc.hasNextInt())
        {
            int num = sc.nextInt();
            check(num);
        }
        else {
            System.out.println("you entered the invalid data");
        }
    }

    public static void check(int num){

        if (num % 2 ==0)
        {
            System.out.println("the number is an even");
        }
        else
            System.out.println("the number is an odd");
    }

}
