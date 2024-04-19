package week2.arrays;

import java.util.Arrays;

public class MaximumAndMinimum {
  public static void main(String[] args) {

    int[] numbers = new int[] {12, -22, 300, 43, 0};
    int max = numbers[0];
    int min = numbers[0];
    // loop through the array to check every number
    for(int number : numbers) {
      if (number > max) {
        max = number; // make this number as a max
      } else if (number < min ) {
        min = number; // make this number as the min
      }
    }
    System.out.println(max);
    System.out.println(min);

    // The same as if we use Arrays.stream

    System.out.println("The max: " + Arrays.stream(numbers).max());
    System.out.println("The min: "+ Arrays.stream(numbers).min());
  }
}
