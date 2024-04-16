package Loops;

import java.util.Scanner;

public class GuessingNumbers {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100) + 1; // when get 0 >> 1 and when get 99 >> 100
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100: ");
        int input = scan.nextInt();

        while (input != randomNumber) {
            if (input > randomNumber) {
                System.out.println("Your number is greater than the Number we have, try another time...");
            }
            else {
                System.out.println("Your number is less than than the Number we have, try another time...");
            }
            input = scan.nextInt();
        }
        System.out.printf("Yes!! , you won ! Your number is equal to (%d), the Number we have.", randomNumber);
    }
}
