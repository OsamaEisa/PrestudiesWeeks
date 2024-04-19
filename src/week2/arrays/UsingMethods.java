package week2.arrays;

import java.util.Arrays;

public class UsingMethods {
  public static void main(String[] args) {

    int[] numbers = new int[] {2, 2, 10, 11, 10};
    int multiplier = 2;

    System.out.println(Arrays.toString(numbers)); // array before changing it
    printMultipliedArray(numbers, multiplier); // the array we got after multiplication
    System.out.println(Arrays.toString(numbers)); // array after changing it
    System.out.printf("The multiplier in the main method : %d ", multiplier);
  }

  // return te input array multiplied by the input multiplier
  static void printMultipliedArray(int[] numbers, int multiplier) {
    multiplier++; // increment the multiplier before using it

    for (int i =0; i < numbers.length; i++) {
      numbers[i] = numbers[i] * multiplier;
    }

    System.out.println(Arrays.toString(numbers));
    System.out.printf("The multiplier in the method : %d\n", multiplier);

    // the same as, but this will return a new array without changing the original one

    // Arrays.stream(numbers).map(number -> number * multiplier).forEach( number -> System.out.print(number + " "));
    // System.out.printf("The multiplier in the method : %d\n", multiplier);
  }

}
