package Loops;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {

        // draw a triangle number of times
        Scanner sc = new Scanner(System.in);
        System.out.println("How large should the triangles be? ");
        int triLarge = sc.nextInt();
        System.out.println("How many triangles would you like? ");
        int numOfTimes = sc.nextInt();

        for (int j = 1; j <= numOfTimes; j++) {
            for (int i = 1; i <= triLarge; i++) {
                System.out.println("*".repeat(i));
            }
            System.out.println();
        }
    }
}
