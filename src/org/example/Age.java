package org.example;

import java.util.*;
public class Age {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age: ");
        int age = sc.nextInt();

        if (age >= 14 && age <= 55)
        {
            System.out.println("the person is young");
        }
        else System.out.println("person is not young");


    }

}
