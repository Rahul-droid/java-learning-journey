package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class If_Else
{

    public void largeNumber()
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the three numbers = ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3)
        {
            System.out.println("num1 is greater number");
        }

        else if (num2 > num3)
        {
            System.out.println("num2 is greater number");
        }

        else
            System.out.println("num3 is greater number");

    }

    public static void main(String[] args) {
        If_Else obj = new If_Else();
        obj.largeNumber();

    }

}
