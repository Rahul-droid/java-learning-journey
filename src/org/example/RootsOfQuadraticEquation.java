package org.example;

import java.util.Scanner;

public class RootsOfQuadraticEquation
{
    public static void roots()
    {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        double r1, r2;
        System.out.println("enter the value of a= ");
        a = sc.nextDouble();
        System.out.println("enter the value of b= ");
        b = sc.nextDouble();
        System.out.println("enter the value of c= ");
        c = sc.nextDouble();

        r1 = (-b + Math.sqrt(b*b - 4 * a * c))/(2 *a);

        r2 = (-b - Math.sqrt(b*b - 4 * a * c))/(2 *a);

        System.out.println("value of root1= "+ r1);
        System.out.println("value of root2= "+r2);

        int valX ;
    }

    public static void main(String[] args) {
        roots();
    }

}
