package week1.inputAndOutput;

import java.util.Scanner;

public class TextInputAndOutput {
    public static void main(String[] args) {

        // using class "Scanner" to read a username and print it back with a welcome msg
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        System.out.printf("Hello %s, Welcome to the training!", name);

        /* Expected Output:
            Please enter your name: Osama Shehata
            Hello Osama Shehata, Welcome to the training!
         */
    }
}