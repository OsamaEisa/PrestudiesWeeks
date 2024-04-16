package Operators;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {

        // calculate the volume of a can
        Scanner sc = new Scanner(System.in);
        System.out.print("Circumference (c): ");
        double circumference = sc.nextDouble();
        System.out.print("Height (h): ");
        double height = sc.nextDouble();

        // calc the diameter of the lid
        double pi = 3.14;
        double d = circumference / pi;

        // Calc the radius of the lid
        double r = d / 2;

        // Calc the area of the lid
        double al = pi * (d / 2) * (d / 2);

        // Calc the area of the casing
        double ac = circumference * height;

        // Calc the total sheet area
        double at = 2 * al + ac;

        // Calc the volume of the can
        double volume = pi * r * r * height;

        System.out.println("Circumference (c): " + circumference);
        System.out.println("Height (h): " + height);
        System.out.println(" ************************** ");
        System.out.printf("Sheet metal area: %f\n", at);
        System.out.printf("Volume: %f", volume);

    }
}
