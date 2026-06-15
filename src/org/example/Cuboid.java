package org.example;
import java.util.Scanner;

public class Cuboid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length, width, height;
        System.out.println("enter the length, width and height= ");
        length = sc.nextInt();
        width = sc.nextInt();
        height = sc.nextInt();

        int volume = length * width * height;
        System.out.println("the volume of cuboid is = "+ volume);

        int totalSurfaceArea = 2 * (length* width + width*height + height*length);
        System.out.println("total surface area of the cuboid is = " + totalSurfaceArea);

        int perimeter = 4 * (length + width + height);
        System.out.println("perimeter of the cuboid is = " + perimeter);
    }

}
