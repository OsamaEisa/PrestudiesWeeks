package Loops;

import java.util.Scanner;

public class ChristmasTreeBonusExercise {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("How high would you like the tree to be? ");
    int high = sc.nextInt();

    for (int i = 0; i < high; i++) {
      System.out.print(" ".repeat(high - i)); // make the spaces
      System.out.println("*".repeat((i * 2) + 1 ));
    }
    System.out.print(" ".repeat(high) + "I"); // Der Stamm xD
  }
}
