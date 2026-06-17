package org.example;

import java.util.Scanner;

public class IncDec
{

    public void inc()
    {
        Scanner sc = new Scanner(System.in);

        int x,y,z;
        System.out.println("enter the value of X and Y");
        x = sc.nextInt();
        y = sc.nextInt();
        z = 2 * x++ + 3*--y;

        System.out.println("the value of z= " +z);
        System.out.println("New value of x= "+x);

    }
    public static void main(String[] args) {

        IncDec obj = new IncDec();
        obj.inc();

    }
}
