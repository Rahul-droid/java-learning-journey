package org.example;

import java.util.Scanner;

public class GradeCalculator
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sub1, sub2, sub3;

        sub1 = sc.nextInt();
        System.out.println("enter the first subject number= " +sub1);

        sub2 = sc.nextInt();
        System.out.println("enter the second subject number= " +sub2);

        sub3 = sc.nextInt();
        System.out.println("enter the third subject number= " +sub3);

        float grade = (sub1 + sub2 + sub3)/3;
        System.out.println("the grade of three number= "+grade);


    }

}
