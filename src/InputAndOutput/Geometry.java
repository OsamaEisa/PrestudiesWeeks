package InputAndOutput;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {

        // calculating area and perimeter of a rectangle & a right triangle
        System.out.println("**** Calculating a few geometric results **** ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the value of the first side: ");
        double a = Math.abs(sc.nextDouble());
        System.out.print("Please enter the value of the second side: ");
        double b = Math.abs(sc.nextDouble());

        double rectangleArea = a * b;
        double rectanglePerimeter = 2 * (a + b);

        double rightTriangleArea = (a + b) / 2;
        double rightTrianglePerimeter = a + b + Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.printf("The Rectangle Area is : %.2f\n", rectangleArea);
        System.out.printf("The Rectangle Perimeter is : %.2f\n", rectanglePerimeter);
        System.out.println("**** **** **** **** ");
        System.out.printf("The Right Triangle Area is : %.2f\n", rightTriangleArea);
        System.out.printf("The Right Triangle Perimeter is : %.2f\n", rightTrianglePerimeter);

    }
}
