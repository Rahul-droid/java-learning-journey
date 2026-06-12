package org.example;

import java.util.Scanner;

public class AreaOfTriangleByS
{

    public void areaOfTriangle()
    {
        Scanner sc = new Scanner(System.in);

        double side1, side2, side3, s, area;

        System.out.println("enter the dimension of first line = ");
        side1 = sc.nextFloat();

        System.out.println("enter the dimension of second line = ");
        side2 = sc.nextFloat();

        System.out.println("enter the third dimension");
        side3 = sc.nextFloat();

        s =(side1 + side2 + side3)/2;

        System.out.println("the value of s is = "+s);
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

        System.out.println("the area of the triangle= "+area);

    }

    public static void main(String[] args) {
        AreaOfTriangleByS obj = new AreaOfTriangleByS();
        obj.areaOfTriangle();

    }
}
